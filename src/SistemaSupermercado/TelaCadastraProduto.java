/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SistemaSupermercado;

import java.awt.BorderLayout;
import static java.awt.SystemColor.text;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaCadastraProduto extends javax.swing.JPanel {

    private ArrayList<Produto> listaProdutos;
    private String categoria;
    private int contador = 0;

    public TelaCadastraProduto(ArrayList<Produto> listaProdutos) {
        initComponents();
        if (listaProdutos != null) {
            this.listaProdutos = listaProdutos;
        } else {
            this.listaProdutos = new ArrayList();
        }
        inicializaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTgroup = new javax.swing.ButtonGroup();
        TF_Nome = new javax.swing.JTextField();
        TF_Preco = new javax.swing.JTextField();
        B_Cadastrar = new javax.swing.JButton();
        B_FinalizaCadastro = new javax.swing.JButton();
        QtdProdutos = new javax.swing.JLabel();
        cb_categorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LogoMenor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(632, 470));
        setLayout(null);

        TF_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NomeActionPerformed(evt);
            }
        });
        add(TF_Nome);
        TF_Nome.setBounds(40, 140, 180, 22);

        TF_Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_PrecoActionPerformed(evt);
            }
        });
        TF_Preco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_PrecoKeyTyped(evt);
            }
        });
        add(TF_Preco);
        TF_Preco.setBounds(390, 140, 50, 22);

        B_Cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_Cadastrar.setText("Cadastrar");
        B_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CadastrarMouseClicked(evt);
            }
        });
        add(B_Cadastrar);
        B_Cadastrar.setBounds(470, 130, 110, 30);

        B_FinalizaCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_FinalizaCadastro.setText("Finalizar Cadastro");
        B_FinalizaCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_FinalizaCadastroMouseClicked(evt);
            }
        });
        add(B_FinalizaCadastro);
        B_FinalizaCadastro.setBounds(230, 420, 180, 30);

        QtdProdutos.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        QtdProdutos.setForeground(new java.awt.Color(0, 51, 51));
        QtdProdutos.setText("0");
        add(QtdProdutos);
        QtdProdutos.setBounds(190, 390, 20, 30);

        cb_categorias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cb_categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hortifruti\t", "Padaria", "Grãos", "Higiene", "Frios", "Bebidas" }));
        add(cb_categorias);
        cb_categorias.setBounds(250, 140, 110, 22);

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Categoria", "Preço"
            }
        ));
        jScrollPane1.setViewportView(jTableProdutos);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 170, 560, 170);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Qtd de itens cadastrados:");
        add(jLabel6);
        jLabel6.setBounds(40, 390, 150, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRO DE PRODUTOS");
        add(jLabel2);
        jLabel2.setBounds(170, 80, 290, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Categoria:");
        add(jLabel5);
        jLabel5.setBounds(250, 120, 70, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Preço:");
        add(jLabel3);
        jLabel3.setBounds(390, 120, 43, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nome do produto:");
        add(jLabel4);
        jLabel4.setBounds(40, 120, 126, 20);

        LogoMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoMenor.png"))); // NOI18N
        add(LogoMenor);
        LogoMenor.setBounds(20, 20, 140, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void TF_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NomeActionPerformed
    public void inicializaTabela() {
        String[] colunas = {"Nome", "Categoria", "Preço"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (int i = 0; i < this.listaProdutos.size(); i++) {
            Produto produto = this.listaProdutos.get(i);
            Object[] linha = {produto.getNome(), produto.getCategoria(), produto.getPreco()};
            modelo.addRow(linha);
        }
        QtdProdutos.setText(String.valueOf(listaProdutos.size()));
        this.jTableProdutos.setModel(modelo);
    }

    private void TF_PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_PrecoActionPerformed
    }//GEN-LAST:event_TF_PrecoActionPerformed

    private void ConfirmaCadastro() {
        switch (JOptionPane.showConfirmDialog(this, "Tem certeza disso?")) {
            case 0: //sim
                Janela.TelaAdmin = new TelaAdmin(listaProdutos);
                JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);  //referencia ao Jframe pai
                janela.getContentPane().remove(Janela.TelaCadProduto);   //remove janelap1
                janela.add(Janela.TelaAdmin, BorderLayout.CENTER); //adiciona p2
                janela.pack();
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }

    private void B_FinalizaCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_FinalizaCadastroMouseClicked
        try {
            if (listaProdutos.size() >= 1) { //ALTERAR DPS
                ConfirmaCadastro();
            } else {
                throw new Exception("Você deve cadastrar no mínimo 1 produto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_FinalizaCadastroMouseClicked

    private void B_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CadastrarMouseClicked
        try {
            String nome = TF_Nome.getText();
            String categoria = cb_categorias.getSelectedItem().toString();
            String precoTxt = TF_Preco.getText();

            if (!nome.equals("") && !categoria.equals("") && !precoTxt.equals("")) {
                double preco = Double.valueOf(precoTxt);
                Produto p = new Produto(nome, categoria, preco);
                listaProdutos.add(p);
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                LimpaFormulario();
                aumentarContador();
                inicializaTabela();
            } else {
                throw new Exception("Você deve preencher todos os campos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_CadastrarMouseClicked

    private void TF_PrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PrecoKeyTyped
        char enter = evt.getKeyChar();
        String precoTx = TF_Preco.getText();
        if (!(Character.isDigit(enter)) && enter != KeyEvent.VK_BACK_SPACE && enter != KeyEvent.VK_DELETE) {
            if (enter == '.' && !TF_Preco.getText().isBlank() && !precoTx.contains(".")) {

            } else {
                evt.consume();

            }
        }
    }//GEN-LAST:event_TF_PrecoKeyTyped

    private void aumentarContador() {
        contador = Integer.valueOf(QtdProdutos.getText());
        contador++;
        QtdProdutos.setText(String.valueOf(contador));
    }

    private void LimpaFormulario() {
        TF_Nome.setText("");
        TF_Preco.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BTgroup;
    private javax.swing.JButton B_Cadastrar;
    private javax.swing.JButton B_FinalizaCadastro;
    private javax.swing.JLabel LogoMenor;
    private javax.swing.JLabel QtdProdutos;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_Preco;
    private javax.swing.JComboBox<String> cb_categorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    // End of variables declaration//GEN-END:variables
}
