/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SistemaSupermercado;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class TelaFinalizaCompra extends javax.swing.JPanel {

    ArrayList<Produto> listaProdutos;
    ArrayList<Produto> listaCarrinho;
    Cliente c;

    public TelaFinalizaCompra(ArrayList<Produto> listaProdutos, Cliente c, ArrayList<Produto> listaCarrinho) {
        initComponents();
        this.listaProdutos = listaProdutos;
        this.listaCarrinho = listaCarrinho;
        this.c = c;
        inicializaTabelaCarrinho();
        inicializaLabel();
    }

    public void inicializaLabel() {
        L_nome.setText("Nome: " + c.getNome());
        String cpfFormat = c.getCpf();
        String Formatado = cpfFormat.substring(0, 3) + "." + cpfFormat.substring(3, 6) + "." + cpfFormat.substring(6, 9) + "-" + cpfFormat.substring(9, 11);
        L_CPF.setText("CPF: " + Formatado);
        L_ValorPago.setText("Valor pago: R$" + String.valueOf(c.getValorTotal()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarrinho = new javax.swing.JTable();
        L_nome = new javax.swing.JLabel();
        L_ValorPago = new javax.swing.JLabel();
        L_CPF = new javax.swing.JLabel();
        LogoMenor = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 472));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Emissão de Nota Fiscal");
        add(jLabel1);
        jLabel1.setBounds(70, 80, 270, 30);

        jTableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableCarrinho);

        add(jScrollPane2);
        jScrollPane2.setBounds(60, 120, 260, 190);

        L_nome.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        L_nome.setForeground(new java.awt.Color(51, 51, 51));
        L_nome.setText("<nome>");
        add(L_nome);
        L_nome.setBounds(60, 320, 200, 25);

        L_ValorPago.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        L_ValorPago.setForeground(new java.awt.Color(51, 51, 51));
        L_ValorPago.setText("00000");
        add(L_ValorPago);
        L_ValorPago.setBounds(60, 380, 290, 30);

        L_CPF.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        L_CPF.setForeground(new java.awt.Color(51, 51, 51));
        L_CPF.setText("<cpf>");
        add(L_CPF);
        L_CPF.setBounds(60, 350, 210, 30);

        LogoMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoMenor.png"))); // NOI18N
        add(LogoMenor);
        LogoMenor.setBounds(20, 20, 140, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(Background);
        Background.setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void inicializaTabelaCarrinho() {
        String[] colunas = {"Nome", "Categoria", "Preço"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (int i = 0; i < this.listaCarrinho.size(); i++) {
            Produto produto = this.listaCarrinho.get(i);
            Object[] linha = {produto.getNome(), produto.getCategoria(), produto.getPreco()};
            modelo.addRow(linha);
        }

        this.jTableCarrinho.setModel(modelo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel L_CPF;
    private javax.swing.JLabel L_ValorPago;
    private javax.swing.JLabel L_nome;
    private javax.swing.JLabel LogoMenor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarrinho;
    // End of variables declaration//GEN-END:variables
}
