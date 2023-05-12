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
public class TelaVerificaAdmin extends javax.swing.JPanel {
    ArrayList<Produto> listaProdutos;

 
    public TelaVerificaAdmin(ArrayList<Produto> listaProdutos) {
        initComponents();
        this.listaProdutos = listaProdutos;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_logar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LogoMenor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PF_senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 225));
        setLayout(null);

        B_logar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_logar.setText("Fazer login");
        B_logar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_logarMouseClicked(evt);
            }
        });
        add(B_logar);
        B_logar.setBounds(140, 160, 110, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bem vindo(a)!");
        add(jLabel2);
        jLabel2.setBounds(100, 60, 190, 32);

        LogoMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoMenor.png"))); // NOI18N
        add(LogoMenor);
        LogoMenor.setBounds(10, 10, 140, 50);

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Por favor, digite sua senha:");
        add(jLabel3);
        jLabel3.setBounds(120, 100, 160, 20);

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Senha: admin");
        add(jLabel4);
        jLabel4.setBounds(10, 196, 110, 20);

        PF_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PF_senhaActionPerformed(evt);
            }
        });
        add(PF_senha);
        PF_senha.setBounds(120, 120, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 410, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void B_logarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_logarMouseClicked
        String senha = PF_senha.getText();
        
        if (senha.equals("admin")) {
            Janela.TelaAdmin = new TelaAdmin(listaProdutos);
                    JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this); 
                    janela.getContentPane().remove(Janela.TelaVerificaAdmin);  
                    janela.add(Janela.TelaAdmin, BorderLayout.CENTER); 
                    janela.pack();
        }
        else {
        JOptionPane.showMessageDialog(null, "Senha incorreta. Por favor, digiite novamente", "Erro", JOptionPane.ERROR_MESSAGE);
        PF_senha.setText("");
        }
    }//GEN-LAST:event_B_logarMouseClicked

    private void PF_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PF_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PF_senhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_logar;
    private javax.swing.JLabel LogoMenor;
    private javax.swing.JPasswordField PF_senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
