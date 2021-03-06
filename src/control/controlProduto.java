/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.daoAtributos;
import dao.daoPessoa;
import dao.daoProduto;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import model.Cor;
import model.Estampa;
import model.Fornecedor;
import model.Produto;
import model.Tamanho;
import view.TelaCadastroProduto;
import view.TelaPesqProduto;

/**
 *
 * @author Matheus Claudino
 */
public class controlProduto {

    daoProduto dao;
    daoAtributos daoAtri;
    daoPessoa daoPess;
    Produto produto;
    //TelaCadastroProduto janelaProduto;
    public controlProduto() {
        this.dao = new daoProduto();
        this.daoAtri = new daoAtributos();
        this.daoPess = new daoPessoa();
        this.produto = null;
    }

    public int inserirProduto(int codigo, String nome, String descricao, BigDecimal preco, int unidade, Date dataEntrada, Object forne,
            Object cate, Object tam, Object c, Object est) {

        Produto pro;
        Fornecedor fornecedor = (Fornecedor) forne;
        Categoria categoria = (Categoria) cate;
        Tamanho tamanho = (Tamanho) tam;
        Cor cor = (Cor) c;
        Estampa estampa = (Estampa) est;
        pro = new Produto(codigo, categoria, cor, estampa, fornecedor, tamanho, nome, descricao, unidade, preco, dataEntrada);

        dao.insert(pro);
        return pro.getCodigo();
    }

    public void alterarProduto(int codigo, String nome, String descricao, BigDecimal preco, int unidade, Date dataEntrada, Object forne,
            Object cate, Object tam, Object c, Object est) {
        Produto pro;
        Fornecedor fornecedor = (Fornecedor) forne;
        Categoria categoria = (Categoria) cate;
        Tamanho tamanho = (Tamanho) tam;
        Cor cor = (Cor) c;
        Estampa estampa = (Estampa) est;
        pro = new Produto(codigo, categoria, cor, estampa, fornecedor, tamanho, nome, descricao, unidade, preco, dataEntrada);

        dao.update(pro);
    }

    public void excluirProduto(int linha, JTable tabela) throws SQLException, Exception {
        Produto pro;
        if ( linha >= 0) {
            pro = (Produto) tabela.getValueAt(linha,1);
            try {
                dao.delete(pro);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERRO ao excluir PESSOA.");
                Logger.getLogger(controlProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma PESSOA.");
        }
        
        ((DefaultTableModel) tabela.getModel()).removeRow(linha);
    }

    public void pesquisarProduto(int tipo, String pesquisa, JTable tabela) {
        List<Produto> lista = null;
        Produto prod = new Produto();
        int id;
        System.out.println(pesquisa);
        try {
            if ((tipo == 0) && (!pesquisa.equals(""))) { //CÓDIGO
                id  = Integer.parseInt(pesquisa);                
                prod = dao.getProduto(id);
                System.out.println();
            } else if (tipo == 1) { //NOME
                lista = dao.getNome(pesquisa);
            }

            ((DefaultTableModel) tabela.getModel()).setRowCount(0);

            if (lista != null) {
               Iterator<Produto> it = lista.iterator();
                while (it.hasNext()) {
                    prod = (Produto) it.next();
                    ((DefaultTableModel) tabela.getModel()).addRow(prod.toArray());
                }
            } else if (prod != null) {
                ((DefaultTableModel) tabela.getModel()).addRow(new Vector());
                int col = 0;
                tabela.setValueAt(prod.getCodigo(), 0, col++);
                tabela.setValueAt(prod, 0, col++);
                tabela.setValueAt(dao.getFornecedor(prod.getFornecedor().getIdPessoa()), 0, col++);
                tabela.setValueAt(dao.getCategoria(prod.getCategoria().getIdCategoria()), 0, col++);
                tabela.setValueAt(dao.getTamanho(prod.getTamanho().getIdTamanho()), 0, col++);
                tabela.setValueAt(dao.getCor(prod.getCor().getIdCor()), 0, col++);
                tabela.setValueAt(dao.getEstampa(prod.getEstampa().getIdEstampa()), 0, col++);
                tabela.setValueAt(prod.getPreco(), 0, col++);
                tabela.setValueAt(prod.getQuantidade(), 0, col++);
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            }
        } catch (Exception ex) {
            //tabela.setModel( null );
            Logger.getLogger(controlProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void getProdutoSelecionado(TelaCadastroProduto telaCad, TelaPesqProduto janelaPesquisa, JTable tabela){
        int linha = tabela.getSelectedRow();

        List<Produto> l = null;
        if ( linha >= 0) {
            produto =  (Produto) tabela.getValueAt(linha,1);
            telaCad.getjTextFieldNome().setText(produto.getNome());
            telaCad.getjTextFieldCodigo().setText(String.valueOf(produto.getCodigo()));
            telaCad.getjTextFieldCodigo().setEnabled(false);
            telaCad.getjTextAreaDescricao().setText(produto.getDescricao());
            telaCad.getjComboBoxFornecedor().setSelectedItem(produto.getFornecedor());
            telaCad.getjComboBoxCategoria().setSelectedItem(produto.getCategoria());
            telaCad.getjComboBoxTamanho().setSelectedItem(produto.getTamanho());
            telaCad.getjComboBoxCor().setSelectedItem(produto.getCor());
            telaCad.getjComboBoxEstampa().setSelectedItem(produto.getEstampa());
            telaCad.getjTextFieldPreco().setText(produto.getPreco().toString());
            telaCad.getjTextFieldUnidade().setText(String.valueOf(produto.getQuantidade()));
            telaCad.getjTextFieldData().setText(produto.getData().toString());
            
            telaCad.getjButtonAlterar().setEnabled(true);
            telaCad.getjButtonExcluir().setEnabled(true);
            janelaPesquisa.setVisible(false);
            
        } else {
            JOptionPane.showMessageDialog(janelaPesquisa, "Selecione um PRODUTO.");
        }   
    }
    
    public void carregarComboProduto(JComboBox produto) {
        List lista;
        try {
            lista = dao.listarProduto();
            produto.setModel(new DefaultComboBoxModel(lista.toArray()));
        } catch (Exception ex) {
            produto.setModel(null);
            Logger.getLogger(controlProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
