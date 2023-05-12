/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SistemaSupermercado;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class TelaEditaProduto extends javax.swing.JPanel {

    ArrayList<Produto> listaProdutos;
    String selecionado = null;

    public TelaEditaProduto(ArrayList<Produto> listaProdutos) {
        initComponents();
        this.listaProdutos = listaProdutos;
        inicializaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoMenor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        B_Editar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 470));
        setLayout(null);

        LogoMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoMenor.png"))); // NOI18N
        add(LogoMenor);
        LogoMenor.setBounds(20, 20, 140, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Edição de Produtos");
        add(jLabel3);
        jLabel3.setBounds(110, 70, 180, 30);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 360, 240);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Selecione o produto que deseja editar:");
        add(jLabel2);
        jLabel2.setBounds(70, 100, 270, 30);

        B_Editar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        B_Editar.setText("Editar");
        B_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_EditarMouseClicked(evt);
            }
        });
        add(B_Editar);
        B_Editar.setBounds(280, 420, 80, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(40, 420, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-3, -4, 420, 500);
    }// </editor-fold>//GEN-END:initComponents

    public void inicializaTabela() {
        String[] colunas = {"Nome", "Categoria", "Preço"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (int i = 0; i < this.listaProdutos.size(); i++) {
            Produto produto = this.listaProdutos.get(i);
            Object[] linha = {produto.getNome(), produto.getCategoria(), produto.getPreco()};
            modelo.addRow(linha);
        }

        this.jTable.setModel(modelo);
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Janela.TelaAdmin = new TelaAdmin(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.TelaEditaProduto);
        janela.add(Janela.TelaAdmin, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jButton1MouseClicked

    private void B_EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_EditarMouseClicked
        int selectedRow = this.jTable.getSelectedRow();
        if (selectedRow >= 0) {
            selecionado = (String) this.jTable.getValueAt(selectedRow, 0);
            Produto p = null;

            for (int i = 0; i < listaProdutos.size(); i++) {
                if (selecionado.equals(listaProdutos.get(i).getNome())) {
                    p = (Produto) listaProdutos.get(i);
                }
            }

            if (p != null) {
                Janela.TelaEdicaoProduto = new TelaEdicaoProduto(this.listaProdutos, p);
                JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().remove(Janela.TelaEditaProduto);
                janela.add(Janela.TelaEdicaoProduto, BorderLayout.CENTER);
                janela.pack();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione algum funcionário da tabela antes de continuar!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_B_EditarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Editar;
    private javax.swing.JLabel LogoMenor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
