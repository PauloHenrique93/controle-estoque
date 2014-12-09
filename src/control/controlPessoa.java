/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.daoPessoa;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Endereco;
import model.Fornecedor;
import model.Pessoa;
import model.Pessoafisica;
import model.Vendedor;


import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author Matheus Claudino
 */
public class controlPessoa {

    daoPessoa dao;
    List<Pessoa> lista;

    //PedidoDAO pedDAO;
    public controlPessoa() throws ClassNotFoundException, SQLException, Exception {
        this.dao = new daoPessoa();
        lista = null;
    }

    public int inserirPessoa(String nome, String telefone, String cep, String cidade, String rua, int numero, String bairro,
                String complemento, String referencia, String estado, int tipoPessoa, String cpf, Date dataNascimento,
                String sexo, String cnpj, Double salario, Date dataAdmissao)//os valores especificos podem ser null
            throws SQLException, Exception {
        
        char s = tipoSexo(sexo);
        Pessoa pes;
        Endereco endereco = new Endereco(cep, rua, numero, bairro, cidade, estado);
        dao.inserirEndereco(endereco);
        if (tipoPessoa == 'C') {
            pes = new Pessoafisica(endereco, nome, telefone, cpf, s, dataNascimento);
        } else if (tipoPessoa == 'F') {
            pes = new Fornecedor(endereco, nome, telefone, cnpj);
        } else{
            pes = new Vendedor(endereco, nome, telefone, cpf, s, dataNascimento, salario, dataAdmissao);
        }
        System.out.println(pes.getNome());
        dao.inserir(pes);
        System.out.println(pes.getIdPessoa());
        return pes.getIdPessoa();

    }

    public void alterarPessoa(int idPessoa, String nome, String telefone, String cep, String cidade, String rua, int numero, String bairro,
                String complemento, String referencia, String estado, int tipoPessoa, String cpf, Date dataNascimento,
                String sexo, String cnpj, Double salario, Date dataAdmissao)//os valores especificos podem ser null
            throws SQLException, Exception {
        
        char s = tipoSexo(sexo);
        Pessoa pes = null;
        Endereco endereco = new Endereco(cep, rua, numero, bairro, cidade, estado);
        if (tipoPessoa == 'C') {
            pes = new Pessoafisica(endereco, nome, telefone, cpf, s, dataNascimento);
        } else if (tipoPessoa == 'F') {
            pes = new Fornecedor(endereco, nome, telefone, cnpj);
        } else {
            pes = new Vendedor(endereco, nome, telefone, cpf, s, dataNascimento, salario, dataAdmissao);
        }

        pes.setIdPessoa(idPessoa);

        dao.alterar(pes);

    }

    public void excluirPessoa(Pessoa pes, JTable tabela) throws SQLException, Exception {

        dao.excluir(pes);

        // Remover a linha selecionado
        int linha = tabela.getSelectedRow();
        ((DefaultTableModel) tabela.getModel()).removeRow(linha);
    }

    public void consultaPessoa(JTable tabela, int tipo) {

        lista = dao.consultaPessoa(tipo);

        exibirLista(tabela, tipo);

    }
    
    public void exibirLista(JTable tabela, int tipo) {
        String nomeClasse = null;
        Pessoa pes = null;

        switch (tipo) {
            case 'C': // Pessoa Fisica
                nomeClasse = "modelo.Pessoafisica";
                break;
            case 'F': // Pessoa Fornecedor
                nomeClasse = "modelo.Fornecedor";
                break;
            case 'V': // Pessoa Vendedor
                nomeClasse = "modelo.Vendedor";
                break;
        }

        // Percorrer a LISTA
        if (lista != null) {
            ((DefaultTableModel) tabela.getModel()).setRowCount(0);
            Iterator<Pessoa> it = lista.iterator();
            while (it.hasNext()) {
                pes = it.next();

                if (nomeClasse.equals(pes.getClass().getName())) {//possivelmente desnecessário
                    ((DefaultTableModel) tabela.getModel()).addRow(pes.toArray());
                }
            }
        }

    }

    public char tipoSexo(String sexo){
        char s;
        if(sexo.equalsIgnoreCase("Feminino"))
           s = 'F';
        else
            s = 'M';
        
        return s;
    }
}

