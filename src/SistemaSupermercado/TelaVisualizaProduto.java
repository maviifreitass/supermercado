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

public class TelaVisualizaProduto extends javax.swing.JPanel {

    ArrayList<Produto> listaProdutos;
    String selecionado = null;

    DefaultTableModel model;

    public TelaVisualizaProduto(ArrayList<Produto> listaProdutos) {
        initComponents();
        this.listaProdutos = listaProdutos;
        inicializaTabela();
    }

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoMenor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 470));
        setLayout(null);

        LogoMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoMenor.png"))); // NOI18N
        add(LogoMenor);
        LogoMenor.setBounds(20, 20, 140, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Visualização dos Produtos");
        add(jLabel4);
        jLabel4.setBounds(90, 70, 230, 30);

        jButton1.setText("Voltar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(30, 430, 80, 22);

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
        jScrollPane2.setViewportView(jTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(50, 110, 300, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-3, -4, 660, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Janela.TelaAdmin = new TelaAdmin(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.TelaVisualizaProduto);
        janela.add(Janela.TelaAdmin, BorderLayout.CENTER);
        janela.pack();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoMenor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
