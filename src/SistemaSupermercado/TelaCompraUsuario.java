/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SistemaSupermercado;

import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class TelaCompraUsuario extends javax.swing.JPanel {

    private ArrayList<Produto> listaProdutos;
    private ArrayList<Produto> listaCarrinho = new ArrayList<>();
    private Cliente c;
    private String selecionado = null;

    DefaultTableModel model, model2;

    public TelaCompraUsuario(ArrayList<Produto> listaProdutos, Cliente c, ArrayList<Produto> listaCarrinho) {
        initComponents();
        this.listaProdutos = listaProdutos;
        this.listaCarrinho = new ArrayList<>();
        this.model = (DefaultTableModel) this.jTableProdutos.getModel();
        this.c = c;
        inicializaTabela();
        l_Boasvindas.setText("Olá " + c.getNome() + "! Seja bem vindo!");
    }

    public void inicializaTabela() {
        String[] colunas = {"Nome", "Categoria", "Preço"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (int i = 0; i < this.listaProdutos.size(); i++) {
            Produto produto = this.listaProdutos.get(i);
            Object[] linha = {produto.getNome(), produto.getCategoria(), produto.getPreco()};
            modelo.addRow(linha);
        }

        this.jTableProdutos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l_total = new javax.swing.JLabel();
        l_Boasvindas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_removeCarrinho = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCarrinho = new javax.swing.JTable();
        B_FinalizaCompra = new javax.swing.JButton();
        b_adcCarrinho = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        LogoMenor = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(687, 470));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha seus produtos abaixo:");
        add(jLabel1);
        jLabel1.setBounds(60, 70, 270, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Seu carrinho");
        add(jLabel4);
        jLabel4.setBounds(460, 80, 130, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Total a pagar:");
        add(jLabel5);
        jLabel5.setBounds(450, 370, 100, 20);

        l_total.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        l_total.setForeground(new java.awt.Color(0, 102, 0));
        l_total.setText("0.0000");
        add(l_total);
        l_total.setBounds(560, 370, 100, 20);

        l_Boasvindas.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        l_Boasvindas.setForeground(new java.awt.Color(51, 51, 51));
        l_Boasvindas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_Boasvindas.setText("Olá <> ! Seja bem vindo!");
        add(l_Boasvindas);
        l_Boasvindas.setBounds(190, 20, 310, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IconCarrinho.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(620, 30, 40, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("R$");
        add(jLabel3);
        jLabel3.setBounds(540, 370, 20, 20);

        b_removeCarrinho.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        b_removeCarrinho.setText("Remover do carrinho");
        b_removeCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_removeCarrinhoMouseClicked(evt);
            }
        });
        b_removeCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_removeCarrinhoActionPerformed(evt);
            }
        });
        add(b_removeCarrinho);
        b_removeCarrinho.setBounds(420, 330, 200, 30);

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
        jScrollPane3.setViewportView(jTableCarrinho);

        add(jScrollPane3);
        jScrollPane3.setBounds(400, 110, 240, 210);

        B_FinalizaCompra.setBackground(new java.awt.Color(255, 255, 255));
        B_FinalizaCompra.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        B_FinalizaCompra.setForeground(new java.awt.Color(51, 51, 51));
        B_FinalizaCompra.setText("Finalizar Compra");
        B_FinalizaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_FinalizaCompraMouseClicked(evt);
            }
        });
        add(B_FinalizaCompra);
        B_FinalizaCompra.setBounds(260, 410, 190, 30);

        b_adcCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        b_adcCarrinho.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        b_adcCarrinho.setForeground(new java.awt.Color(51, 51, 51));
        b_adcCarrinho.setText("Adicionar ao Carrinho");
        b_adcCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_adcCarrinhoMouseClicked(evt);
            }
        });
        add(b_adcCarrinho);
        b_adcCarrinho.setBounds(110, 330, 160, 30);

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
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProdutos);

        add(jScrollPane2);
        jScrollPane2.setBounds(50, 110, 280, 210);

        LogoMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoMenor.png"))); // NOI18N
        add(LogoMenor);
        LogoMenor.setBounds(20, 20, 140, 50);

        Background.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(Background);
        Background.setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void EntraTelaFinalizaCompra() {
        double valorPago = Double.valueOf(l_total.getText());
        c.setValorTotal(valorPago);
        Janela.TelaFinalCompra = new TelaFinalizaCompra(listaProdutos, c, listaCarrinho);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.TelaCompraUser);
        janela.add(Janela.TelaFinalCompra, BorderLayout.CENTER);
        janela.pack();
    }

    private void B_FinalizaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_FinalizaCompraMouseClicked
        switch (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja finalizar sua compra?")) {
            case 0:
                EntraTelaFinalizaCompra(); // sim
                break;
            case 1: //nao
                break;
            case 2: // cancela
                break;
        }
    }//GEN-LAST:event_B_FinalizaCompraMouseClicked

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        Object temp;
        int column = 0;
        int row = this.jTableProdutos.getSelectedRow();
        temp = this.jTableProdutos.getModel().getValueAt(row, column);
        Produto p = null;

        if (temp != null) {
            this.selecionado = temp.toString();
            for (int i = 0; i < listaProdutos.size(); i++) {
                if (this.selecionado.equals(listaProdutos.get(i).getNome())) {
                    p = listaProdutos.get(i);
                }
            }

        }
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void b_adcCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_adcCarrinhoMouseClicked
        if (this.selecionado != null) {
            Produto p = null;
            int index = jTableProdutos.getSelectedRow();
            if (index >= 0) {
                p = new Produto(listaProdutos.get(index));
                listaCarrinho.add(p);
                inicializaTabelaCarrinho();
                CalculaTotalCompra();
            }

        }
    }//GEN-LAST:event_b_adcCarrinhoMouseClicked

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

    private void CalculaTotalCompra() {
        double somaTotal = 0;
        for (int i = 0; i < jTableCarrinho.getRowCount(); i++) {
            somaTotal += Double.parseDouble(jTableCarrinho.getValueAt(i, 2).toString());
        }
       // String somaFormat = String.valueOf(somaTotal);
        l_total.setText(String.valueOf(somaTotal));
    }

    private void retiraItemTotal(Produto produtoRemovido) {
        double total = Double.parseDouble(l_total.getText());
        total = total - produtoRemovido.getPreco();
        l_total.setText(String.valueOf(total));
    }

    private void b_removeCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_removeCarrinhoActionPerformed
    }//GEN-LAST:event_b_removeCarrinhoActionPerformed

    private void b_removeCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_removeCarrinhoMouseClicked
        int selectedRow = this.jTableCarrinho.getSelectedRow();
        if (listaCarrinho.size() == 0) {
            JOptionPane.showMessageDialog(null, "Não há produtos para ser removidos", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        if (selectedRow >= 0) {
            String productName = (String) this.jTableCarrinho.getValueAt(selectedRow, 0);

            Produto produtoRemovido = null;
            for (Produto produto : listaCarrinho) {
                if (produto.getNome().equals(productName)) {
                    produtoRemovido = produto;
                    break;
                }
            }

            if (produtoRemovido != null) {
                listaCarrinho.remove(produtoRemovido);

                DefaultTableModel model = (DefaultTableModel) this.jTableCarrinho.getModel();
                model.removeRow(selectedRow);
                retiraItemTotal(produtoRemovido);

            }
        }
    }//GEN-LAST:event_b_removeCarrinhoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_FinalizaCompra;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel LogoMenor;
    private javax.swing.JButton b_adcCarrinho;
    private javax.swing.JButton b_removeCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCarrinho;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel l_Boasvindas;
    private javax.swing.JLabel l_total;
    // End of variables declaration//GEN-END:variables
}
