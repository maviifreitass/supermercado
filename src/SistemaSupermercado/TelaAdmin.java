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

/**
 *
 * @author maria
 */
public class TelaAdmin extends javax.swing.JPanel {

    ArrayList<Produto> listaProdutos;

    public TelaAdmin(ArrayList<Produto> listaProdutos) {
        initComponents();
        this.listaProdutos = listaProdutos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_CadProduto = new javax.swing.JButton();
        B_EditProduto = new javax.swing.JButton();
        B_VisualizaProduto = new javax.swing.JButton();
        B_RemoveProduto = new javax.swing.JButton();
        B_Deslogar = new javax.swing.JButton();
        TelaDoAdmin = new javax.swing.JLabel();
        LogoMenor = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 470));
        setLayout(null);

        B_CadProduto.setBackground(new java.awt.Color(255, 255, 255));
        B_CadProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_CadProduto.setForeground(new java.awt.Color(51, 51, 51));
        B_CadProduto.setText("Cadastrar Produtos");
        B_CadProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CadProdutoMouseClicked(evt);
            }
        });
        add(B_CadProduto);
        B_CadProduto.setBounds(80, 150, 240, 40);

        B_EditProduto.setBackground(new java.awt.Color(255, 255, 255));
        B_EditProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_EditProduto.setForeground(new java.awt.Color(51, 51, 51));
        B_EditProduto.setText("Editar Produtos");
        B_EditProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_EditProdutoMouseClicked(evt);
            }
        });
        add(B_EditProduto);
        B_EditProduto.setBounds(80, 200, 240, 40);

        B_VisualizaProduto.setBackground(new java.awt.Color(255, 255, 255));
        B_VisualizaProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_VisualizaProduto.setForeground(new java.awt.Color(51, 51, 51));
        B_VisualizaProduto.setText("Visualizar Produtos");
        B_VisualizaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_VisualizaProdutoMouseClicked(evt);
            }
        });
        add(B_VisualizaProduto);
        B_VisualizaProduto.setBounds(80, 250, 240, 40);

        B_RemoveProduto.setBackground(new java.awt.Color(255, 255, 255));
        B_RemoveProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_RemoveProduto.setForeground(new java.awt.Color(51, 51, 51));
        B_RemoveProduto.setText("Remover Produtos");
        B_RemoveProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_RemoveProdutoMouseClicked(evt);
            }
        });
        add(B_RemoveProduto);
        B_RemoveProduto.setBounds(80, 300, 240, 40);

        B_Deslogar.setBackground(new java.awt.Color(255, 212, 0));
        B_Deslogar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        B_Deslogar.setForeground(new java.awt.Color(204, 3, 3));
        B_Deslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IconDeslog.png"))); // NOI18N
        B_Deslogar.setBorderPainted(false);
        B_Deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_DeslogarMouseClicked(evt);
            }
        });
        add(B_Deslogar);
        B_Deslogar.setBounds(330, 20, 50, 40);

        TelaDoAdmin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TelaDoAdmin.setForeground(new java.awt.Color(51, 51, 51));
        TelaDoAdmin.setText("Tela do Administrador");
        add(TelaDoAdmin);
        TelaDoAdmin.setBounds(80, 90, 250, 40);

        LogoMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoMenor.png"))); // NOI18N
        add(LogoMenor);
        LogoMenor.setBounds(20, 20, 140, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(Background);
        Background.setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents
    private void DeslogaAdm() {
        Janela.TelaID = new TelaIdentificacao(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);  
        janela.getContentPane().remove(Janela.TelaAdmin);   
        janela.add(Janela.TelaID, BorderLayout.CENTER); 
        janela.pack();
    }

    private void B_DeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_DeslogarMouseClicked
        switch (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja deslogar da conta de administrador?")) {
            case 0:
                DeslogaAdm(); // sim
                break;
            case 1: //nao
                break;
            case 2: // cancela
                break;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_B_DeslogarMouseClicked

    private void B_CadProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CadProdutoMouseClicked
        Janela.TelaCadProduto = new TelaCadastraProduto(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this); 
        janela.getContentPane().remove(Janela.TelaAdmin);   
        janela.add(Janela.TelaCadProduto, BorderLayout.CENTER); 
        janela.pack();
    }//GEN-LAST:event_B_CadProdutoMouseClicked

    private void B_EditProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_EditProdutoMouseClicked
        Janela.TelaEditaProduto = new TelaEditaProduto(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this); 
        janela.getContentPane().remove(Janela.TelaAdmin);  
        janela.add(Janela.TelaEditaProduto, BorderLayout.CENTER); 
        janela.pack();   
    }//GEN-LAST:event_B_EditProdutoMouseClicked

    private void B_VisualizaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_VisualizaProdutoMouseClicked
        Janela.TelaVisualizaProduto = new TelaVisualizaProduto(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);  
        janela.getContentPane().remove(Janela.TelaAdmin);  
        janela.add(Janela.TelaVisualizaProduto, BorderLayout.CENTER); 
        janela.pack();         
    }//GEN-LAST:event_B_VisualizaProdutoMouseClicked

    private void B_RemoveProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_RemoveProdutoMouseClicked
        Janela.TelaRemoveProduto = new TelaRemoveProduto(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);  
        janela.getContentPane().remove(Janela.TelaAdmin);  
        janela.add(Janela.TelaRemoveProduto, BorderLayout.CENTER);
        janela.pack();    
    }//GEN-LAST:event_B_RemoveProdutoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_CadProduto;
    private javax.swing.JButton B_Deslogar;
    private javax.swing.JButton B_EditProduto;
    private javax.swing.JButton B_RemoveProduto;
    private javax.swing.JButton B_VisualizaProduto;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel LogoMenor;
    private javax.swing.JLabel TelaDoAdmin;
    // End of variables declaration//GEN-END:variables
}
