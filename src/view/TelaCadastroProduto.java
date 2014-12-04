/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.controlAtributos;
import control.controlProduto;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author Paulo
 */
public class TelaCadastroProduto extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastroProduto
     */
    controlProduto control;
    controlAtributos controlAtri;
    public TelaCadastroProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.controlAtri = new controlAtributos();
        this.control = new controlProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jPanelDescricao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabelUnidade = new javax.swing.JLabel();
        jTextFieldUnidade = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelFornecedor = new javax.swing.JLabel();
        jComboBoxFornecedor = new javax.swing.JComboBox();
        jLabelCategoria = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox();
        jLabelTamanho = new javax.swing.JLabel();
        jComboBoxTamanho = new javax.swing.JComboBox();
        jLabelCor = new javax.swing.JLabel();
        jComboBoxCor = new javax.swing.JComboBox();
        jLabelEstampa = new javax.swing.JLabel();
        jComboBoxEstampa = new javax.swing.JComboBox();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jButtonCadastrarProduto = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setTitle("Cadastrar Produto");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabelNome.setText("Nome");

        jPanelDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        javax.swing.GroupLayout jPanelDescricaoLayout = new javax.swing.GroupLayout(jPanelDescricao);
        jPanelDescricao.setLayout(jPanelDescricaoLayout);
        jPanelDescricaoLayout.setHorizontalGroup(
            jPanelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        jPanelDescricaoLayout.setVerticalGroup(
            jPanelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescricaoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelPreco.setText("Preço");

        jLabelUnidade.setText("Und.");

        jLabelData.setText("Data");

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelFornecedor.setText("Fornecedor");

        jLabelCategoria.setText("Categoria");

        jLabelTamanho.setText("Tamanho");

        jLabelCor.setText("Cor");

        jLabelEstampa.setText("Estampa");

        jLabelCodigo.setText("Código");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxFornecedor, 0, 228, Short.MAX_VALUE)
                    .addComponent(jComboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxTamanho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxEstampa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCategoria)
                            .addComponent(jLabelTamanho)
                            .addComponent(jLabelCor)
                            .addComponent(jLabelEstampa)
                            .addComponent(jLabelFornecedor)
                            .addComponent(jLabelCodigo))
                        .addGap(0, 173, Short.MAX_VALUE))
                    .addComponent(jTextFieldCodigo))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabelCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabelTamanho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEstampa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonCadastrarProduto.setText("Cadastrar");
        jButtonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProdutoActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("...");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPreco)
                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUnidade)
                                    .addComponent(jTextFieldUnidade)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 5, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelData)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButtonAlterar)
                .addGap(26, 26, 26)
                .addComponent(jButtonCadastrarProduto)
                .addGap(26, 26, 26)
                .addComponent(jButtonExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jButtonPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jPanelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelUnidade)
                                .addGap(2, 2, 2)
                                .addComponent(jTextFieldUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarProduto)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoActionPerformed
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String data = jTextFieldData.getText();
        Date dataEntrada;
        String preco = jTextFieldPreco.getText();
        BigDecimal bigPreco = new BigDecimal(preco);
        
        try {
            dataEntrada = formatter.parse(data);

            int id;
           id = control.inserirProduto(
                    Integer.parseInt(jTextFieldCodigo.getText()),
                    jTextFieldNome.getText(),
                    jTextAreaDescricao.getText(),
                    bigPreco,
                    Integer.parseInt(jTextFieldUnidade.getText()),
                    dataEntrada,
                    jComboBoxFornecedor.getSelectedItem(),
                    jComboBoxCategoria.getSelectedItem(),
                    jComboBoxTamanho.getSelectedItem(),
                    jComboBoxCor.getSelectedItem(),
                    jComboBoxEstampa.getSelectedItem()
            );
           JOptionPane.showMessageDialog(this, "Produto " + id + " cadastrado");
           cleanFields();
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCadastrarProdutoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         controlAtri.carregarComboFornecedor(jComboBoxFornecedor);
         controlAtri.carregarComboCategoria(jComboBoxCategoria);
         controlAtri.carregarComboTamanho(jComboBoxTamanho);
         controlAtri.carregarComboCor(jComboBoxCor);
         controlAtri.carregarComboEstampa(jComboBoxEstampa);
    }//GEN-LAST:event_formComponentShown

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        TelaPesqProduto pesquisa = new TelaPesqProduto(null, true, this);
        pesquisa.requestFocus();  
        pesquisa.setDefaultCloseOperation(TelaPrincipal.HIDE_ON_CLOSE);
        pesquisa.setLocationRelativeTo(this);
        pesquisa.setVisible(true);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        String data = jTextFieldData.getText();
        Date dataEntrada;
        String preco = jTextFieldPreco.getText();
        BigDecimal bigPreco = new BigDecimal(preco);
        
        try {
            dataEntrada = formatter.parse(data);
       

        control.alterarProduto(Integer.parseInt(jTextFieldCodigo.getText()),
                    jTextFieldNome.getText(),
                    jTextAreaDescricao.getText(),
                    bigPreco,
                    Integer.parseInt(jTextFieldUnidade.getText()),
                    dataEntrada,
                    jComboBoxFornecedor.getSelectedItem(),
                    jComboBoxCategoria.getSelectedItem(),
                    jComboBoxTamanho.getSelectedItem(),
                    jComboBoxCor.getSelectedItem(),
                    jComboBoxEstampa.getSelectedItem());
         JOptionPane.showMessageDialog(this, "Produto " + Integer.parseInt(jTextFieldCodigo.getText()) + " alterado!");
        cleanFields();
        
         } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed
    public void cleanFields(){
                    jTextFieldCodigo.setText("");
                    jTextFieldNome.setText("");
                    jTextAreaDescricao.setText("");
                    jTextFieldPreco.setText("");
                    jTextFieldUnidade.setText("");
                    jTextFieldData.setText("");
                    jComboBoxFornecedor.setSelectedIndex(0);
                    jComboBoxCategoria.setSelectedIndex(0);
                    jComboBoxTamanho.setSelectedIndex(0);
                    jComboBoxCor.setSelectedIndex(0);
                    jComboBoxEstampa.setSelectedIndex(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroProduto dialog = new TelaCadastroProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JButton getjButtonCadastrarProduto() {
        return jButtonCadastrarProduto;
    }

    public void setjButtonCadastrarProduto(JButton jButtonCadastrarProduto) {
        this.jButtonCadastrarProduto = jButtonCadastrarProduto;
    }

    public JButton getjButtonPesquisar() {
        return jButtonPesquisar;
    }

    public void setjButtonPesquisar(JButton jButtonPesquisar) {
        this.jButtonPesquisar = jButtonPesquisar;
    }

    public JButton getjButtonAlterar() {
        return jButtonAlterar;
    }

    public void setjButtonAlterar(JButton jButtonAlterar) {
        this.jButtonAlterar = jButtonAlterar;
    }

    public JButton getjButtonExcluir() {
        return jButtonExcluir;
    }

    public void setjButtonExcluir(JButton jButtonExcluir) {
        this.jButtonExcluir = jButtonExcluir;
    }
    

    public JComboBox getjComboBoxCategoria() {
        return jComboBoxCategoria;
    }

    public void setjComboBoxCategoria(JComboBox jComboBoxCategoria) {
        this.jComboBoxCategoria = jComboBoxCategoria;
    }

    public JComboBox getjComboBoxCor() {
        return jComboBoxCor;
    }

    public void setjComboBoxCor(JComboBox jComboBoxCor) {
        this.jComboBoxCor = jComboBoxCor;
    }

    public JComboBox getjComboBoxEstampa() {
        return jComboBoxEstampa;
    }

    public void setjComboBoxEstampa(JComboBox jComboBoxEstampa) {
        this.jComboBoxEstampa = jComboBoxEstampa;
    }

    public JComboBox getjComboBoxFornecedor() {
        return jComboBoxFornecedor;
    }

    public void setjComboBoxFornecedor(JComboBox jComboBoxFornecedor) {
        this.jComboBoxFornecedor = jComboBoxFornecedor;
    }

    public JComboBox getjComboBoxTamanho() {
        return jComboBoxTamanho;
    }

    public void setjComboBoxTamanho(JComboBox jComboBoxTamanho) {
        this.jComboBoxTamanho = jComboBoxTamanho;
    }

    public JTextArea getjTextAreaDescricao() {
        return jTextAreaDescricao;
    }

    public void setjTextAreaDescricao(JTextArea jTextAreaDescricao) {
        this.jTextAreaDescricao = jTextAreaDescricao;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JTextField getjTextFieldCodigo() {
        return jTextFieldCodigo;
    }

    public void setjTextFieldCodigo(JTextField jTextFieldCodigo) {
        this.jTextFieldCodigo = jTextFieldCodigo;
    }

    public JTextField getjTextFieldData() {
        return jTextFieldData;
    }

    public void setjTextFieldData(JTextField jTextFieldData) {
        this.jTextFieldData = jTextFieldData;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JTextField getjTextFieldPreco() {
        return jTextFieldPreco;
    }

    public void setjTextFieldPreco(JTextField jTextFieldPreco) {
        this.jTextFieldPreco = jTextFieldPreco;
    }

    public JTextField getjTextFieldUnidade() {
        return jTextFieldUnidade;
    }

    public void setjTextFieldUnidade(JTextField jTextFieldUnidade) {
        this.jTextFieldUnidade = jTextFieldUnidade;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrarProduto;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboBoxCategoria;
    private javax.swing.JComboBox jComboBoxCor;
    private javax.swing.JComboBox jComboBoxEstampa;
    private javax.swing.JComboBox jComboBoxFornecedor;
    private javax.swing.JComboBox jComboBoxTamanho;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelEstampa;
    private javax.swing.JLabel jLabelFornecedor;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTamanho;
    private javax.swing.JLabel jLabelUnidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDescricao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldUnidade;
    // End of variables declaration//GEN-END:variables
}
