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

public class TelaIdentificacao extends javax.swing.JPanel {

    private ArrayList<Produto> listaProdutos;
    private ArrayList<Produto> listaCarrinho = new ArrayList<>();

    public TelaIdentificacao(ArrayList<Produto> listaProdutos) {
        initComponents();
        this.listaProdutos = listaProdutos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TF_NomeId = new javax.swing.JTextField();
        FormatTF_CPFID = new javax.swing.JFormattedTextField();
        CB_Admin = new javax.swing.JCheckBox();
        LabelNomeId = new javax.swing.JLabel();
        LabelCPFId = new javax.swing.JLabel();
        B_FazerLogin = new javax.swing.JButton();
        LogoLorem = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 470));
        setLayout(null);

        TF_NomeId.setBackground(new java.awt.Color(255, 255, 255));
        TF_NomeId.setForeground(new java.awt.Color(51, 51, 51));
        TF_NomeId.setToolTipText("");
        add(TF_NomeId);
        TF_NomeId.setBounds(60, 210, 270, 30);

        FormatTF_CPFID.setBackground(new java.awt.Color(255, 255, 255));
        FormatTF_CPFID.setForeground(new java.awt.Color(51, 51, 51));
        try {
            FormatTF_CPFID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormatTF_CPFID.setText("###.###.###-##");
        FormatTF_CPFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatTF_CPFIDActionPerformed(evt);
            }
        });
        FormatTF_CPFID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FormatTF_CPFIDKeyTyped(evt);
            }
        });
        add(FormatTF_CPFID);
        FormatTF_CPFID.setBounds(60, 280, 270, 30);
        FormatTF_CPFID.getAccessibleContext().setAccessibleName("");

        CB_Admin.setBackground(new java.awt.Color(255, 179, 10));
        CB_Admin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        CB_Admin.setForeground(new java.awt.Color(51, 51, 51));
        CB_Admin.setText("Administrador");
        add(CB_Admin);
        CB_Admin.setBounds(60, 320, 140, 30);

        LabelNomeId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        LabelNomeId.setForeground(new java.awt.Color(51, 51, 51));
        LabelNomeId.setText("Nome");
        LabelNomeId.setToolTipText("");
        add(LabelNomeId);
        LabelNomeId.setBounds(60, 180, 80, 30);

        LabelCPFId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        LabelCPFId.setForeground(new java.awt.Color(51, 51, 51));
        LabelCPFId.setText("CPF");
        add(LabelCPFId);
        LabelCPFId.setBounds(60, 250, 90, 30);

        B_FazerLogin.setBackground(new java.awt.Color(255, 255, 255));
        B_FazerLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        B_FazerLogin.setForeground(new java.awt.Color(51, 51, 51));
        B_FazerLogin.setText("Fazer login");
        B_FazerLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_FazerLoginMouseClicked(evt);
            }
        });
        add(B_FazerLogin);
        B_FazerLogin.setBounds(120, 370, 150, 31);

        LogoLorem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logo Inicial.png"))); // NOI18N
        LogoLorem.setText("jLabel3");
        add(LogoLorem);
        LogoLorem.setBounds(30, 50, 330, 110);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(Background);
        Background.setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void B_FazerLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_FazerLoginMouseClicked
        try {
            String nomeId = TF_NomeId.getText();
            String cpf = FormatTF_CPFID.getText().replaceAll("[^0-9]", "");

            if (!nomeId.equals("") && !cpf.isEmpty()) {
                if (CB_Admin.isSelected()) {
                    verificaAdmin();
                } else {
                    if (listaProdutos == null) {
                        throw new Exception("Não há produtos cadastrados.\nPor favor, logue como Adm para cadastrar novos produtos.");

                    }
                    Cliente c = new Cliente(nomeId, cpf);
                    Janela.TelaCompraUser = new TelaCompraUsuario(listaProdutos, c, listaCarrinho);
                    JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                    janela.getContentPane().remove(Janela.TelaID);
                    janela.add(Janela.TelaCompraUser, BorderLayout.CENTER);
                    janela.pack();
                }
            } else {
                throw new Exception("Você precisar preencher todos os campos para fazer o login");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_FazerLoginMouseClicked

    private void FormatTF_CPFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatTF_CPFIDActionPerformed
    }//GEN-LAST:event_FormatTF_CPFIDActionPerformed

    private void verificaAdmin() {
        Janela.TelaVerificaAdmin = new TelaVerificaAdmin(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.TelaID);
        janela.add(Janela.TelaVerificaAdmin, BorderLayout.CENTER);
        janela.pack();
    }

    private void FormatTF_CPFIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FormatTF_CPFIDKeyTyped
        char key = evt.getKeyChar();
        if (!(Character.isDigit(key))) {
            evt.consume();
        }
    }//GEN-LAST:event_FormatTF_CPFIDKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_FazerLogin;
    private javax.swing.JLabel Background;
    private javax.swing.JCheckBox CB_Admin;
    private javax.swing.JFormattedTextField FormatTF_CPFID;
    private javax.swing.JLabel LabelCPFId;
    private javax.swing.JLabel LabelNomeId;
    private javax.swing.JLabel LogoLorem;
    private javax.swing.JTextField TF_NomeId;
    // End of variables declaration//GEN-END:variables
}
