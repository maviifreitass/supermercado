/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SistemaSupermercado;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author maria
 */
public class TelaEdicaoProduto extends javax.swing.JPanel {

    private ArrayList<Produto> listaProdutos;
    private Produto produto;

    public TelaEdicaoProduto(ArrayList<Produto> listaProdutos, Produto p) {
        initComponents();
        this.listaProdutos = listaProdutos;
        this.produto = p;
        InicializaLabel();
    }

    public void InicializaLabel() {
        L_NomeDoProduto.setText(this.produto.getNome());
        L_nome.setText(this.produto.getNome());
        L_categoria.setText(this.produto.getCategoria());
        L_preco.setText("R$" + String.valueOf(this.produto.getPreco()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoMenor = new javax.swing.JLabel();
        B_AlterarPreco = new javax.swing.JButton();
        B_AlterarCategoria = new javax.swing.JButton();
        TF_Preco = new javax.swing.JTextField();
        L_categoria = new javax.swing.JLabel();
        TF_NovoNome = new javax.swing.JTextField();
        B_AlterarNome = new javax.swing.JButton();
        L_preco = new javax.swing.JLabel();
        L_nome = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        L_NomeDoProduto = new javax.swing.JLabel();
        B_Voltar = new javax.swing.JButton();
        cb_Categoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 350));
        setLayout(null);

        LogoMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoMenor.png"))); // NOI18N
        add(LogoMenor);
        LogoMenor.setBounds(20, 20, 140, 50);

        B_AlterarPreco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        B_AlterarPreco.setText("Alterar preço");
        B_AlterarPreco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AlterarPrecoMouseClicked(evt);
            }
        });
        add(B_AlterarPreco);
        B_AlterarPreco.setBounds(30, 300, 130, 30);

        B_AlterarCategoria.setText("Alterar Categoria");
        B_AlterarCategoria.setMaximumSize(new java.awt.Dimension(99, 22));
        B_AlterarCategoria.setMinimumSize(new java.awt.Dimension(99, 22));
        B_AlterarCategoria.setPreferredSize(new java.awt.Dimension(99, 22));
        B_AlterarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AlterarCategoriaMouseClicked(evt);
            }
        });
        add(B_AlterarCategoria);
        B_AlterarCategoria.setBounds(30, 210, 130, 30);

        TF_Preco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_PrecoKeyTyped(evt);
            }
        });
        add(TF_Preco);
        TF_Preco.setBounds(120, 270, 80, 20);

        L_categoria.setForeground(new java.awt.Color(51, 51, 51));
        L_categoria.setText("<categoria>");
        add(L_categoria);
        L_categoria.setBounds(150, 160, 110, 20);
        add(TF_NovoNome);
        TF_NovoNome.setBounds(120, 90, 150, 22);

        B_AlterarNome.setText("Alterar nome");
        B_AlterarNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_AlterarNomeMouseClicked(evt);
            }
        });
        add(B_AlterarNome);
        B_AlterarNome.setBounds(30, 120, 130, 30);

        L_preco.setForeground(new java.awt.Color(51, 51, 51));
        L_preco.setText("<precoatual>");
        add(L_preco);
        L_preco.setBounds(120, 250, 100, 16);

        L_nome.setForeground(new java.awt.Color(51, 51, 51));
        L_nome.setText("<nome>");
        add(L_nome);
        L_nome.setBounds(120, 70, 60, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Novo nome:");
        add(jLabel9);
        jLabel9.setBounds(30, 90, 90, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nome atual:");
        add(jLabel8);
        jLabel8.setBounds(30, 70, 90, 20);

        L_NomeDoProduto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        L_NomeDoProduto.setForeground(new java.awt.Color(51, 51, 51));
        L_NomeDoProduto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_NomeDoProduto.setText("<nomedoproduto>");
        add(L_NomeDoProduto);
        L_NomeDoProduto.setBounds(177, 50, 190, 20);

        B_Voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        B_Voltar.setText("Voltar");
        B_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_VoltarMouseClicked(evt);
            }
        });
        add(B_Voltar);
        B_Voltar.setBounds(270, 300, 90, 30);

        cb_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hortifruti\t", "Padaria", "Grãos", "Higiene", "Frios", "Bebidas" }));
        add(cb_Categoria);
        cb_Categoria.setBounds(150, 180, 140, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Produto a editar:");
        add(jLabel6);
        jLabel6.setBounds(260, 30, 120, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nova categoria:");
        add(jLabel5);
        jLabel5.setBounds(30, 180, 110, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Novo Preço:");
        add(jLabel4);
        jLabel4.setBounds(30, 270, 90, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Categoria Atual:");
        add(jLabel2);
        jLabel2.setBounds(30, 160, 130, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Preço Atual:");
        add(jLabel3);
        jLabel3.setBounds(30, 250, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void TF_PrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_PrecoKeyTyped
      char enter = evt.getKeyChar();
        String precoTx = TF_Preco.getText();
        if (!(Character.isDigit(enter)) && enter!=KeyEvent.VK_BACK_SPACE && enter!=KeyEvent.VK_DELETE) {
            if(enter == '.' && !TF_Preco.getText().isBlank() && !precoTx.contains(".")) {
                
            }
         else {
        evt.consume();

        } }
    }//GEN-LAST:event_TF_PrecoKeyTyped

    private void B_AlterarNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AlterarNomeMouseClicked
        try {
            String novoNome = TF_NovoNome.getText();
            if (!novoNome.equals("")) {
                if (!novoNome.equalsIgnoreCase(this.produto.getNome())) {
                novoNome = TF_NovoNome.getText();
                this.produto.setNome(novoNome);
                JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                TF_NovoNome.setText("");
                InicializaLabel();
            }else {
                throw new Exception("Esse é o nome atual do produto. Por favor, selecione outro");
            }
            }else {
                throw new Exception("Você precisar preencher o campo para alterar o nome deste produto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_AlterarNomeMouseClicked

    private void B_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_VoltarMouseClicked
        Janela.TelaEditaProduto = new TelaEditaProduto(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);  //referencia ao Jframe pai
        janela.getContentPane().remove(Janela.TelaEdicaoProduto);   //remove janelap1
        janela.add(Janela.TelaEditaProduto, BorderLayout.CENTER); //adiciona p2
        janela.pack();
    }//GEN-LAST:event_B_VoltarMouseClicked

    private void B_AlterarPrecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AlterarPrecoMouseClicked
        try {
            String novoPreco = TF_Preco.getText();
            if (!novoPreco.equals("")) {
                novoPreco = TF_Preco.getText();
                this.produto.setPreco(Double.valueOf(novoPreco));
                JOptionPane.showMessageDialog(null, "Preço alterado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                TF_Preco.setText("");
                InicializaLabel();
            } else {
                throw new Exception("Você precisar preencher o campo para alterar o preço deste produto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_AlterarPrecoMouseClicked

    private void B_AlterarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_AlterarCategoriaMouseClicked
        try {
            String novaCategoria = cb_Categoria.getSelectedItem().toString();
            if (!novaCategoria.equals(this.produto.getCategoria())) {
                novaCategoria = cb_Categoria.getSelectedItem().toString();
                this.produto.setCategoria(novaCategoria);
                JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                InicializaLabel();
            } else {
                throw new Exception("Essa é a categoria atual do produto. Por favor, selecione outra");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_AlterarCategoriaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_AlterarCategoria;
    private javax.swing.JButton B_AlterarNome;
    private javax.swing.JButton B_AlterarPreco;
    private javax.swing.JButton B_Voltar;
    private javax.swing.JLabel L_NomeDoProduto;
    private javax.swing.JLabel L_categoria;
    private javax.swing.JLabel L_nome;
    private javax.swing.JLabel L_preco;
    private javax.swing.JLabel LogoMenor;
    private javax.swing.JTextField TF_NovoNome;
    private javax.swing.JTextField TF_Preco;
    private javax.swing.JComboBox<String> cb_Categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
