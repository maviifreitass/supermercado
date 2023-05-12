
package SistemaSupermercado;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class TelaRemoveProduto extends javax.swing.JPanel {

    ArrayList<Produto> listaProdutos;
    DefaultListModel<String> model1;

    public TelaRemoveProduto(ArrayList<Produto> listaProdutos) {
        initComponents();
        this.listaProdutos = listaProdutos;
        this.model1 = new DefaultListModel();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        B_Remove = new javax.swing.JButton();
        B_Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 370));
        setLayout(null);

        LogoMenor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoMenor.png"))); // NOI18N
        add(LogoMenor);
        LogoMenor.setBounds(20, 20, 140, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Por favor, selecione um produto para remover");
        add(jLabel2);
        jLabel2.setBounds(40, 70, 330, 30);

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
        jScrollPane2.setBounds(40, 110, 310, 150);

        B_Remove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        B_Remove.setText("Remover Produto");
        B_Remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_RemoveMouseClicked(evt);
            }
        });
        add(B_Remove);
        B_Remove.setBounds(110, 270, 150, 30);

        B_Voltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        B_Voltar.setText("Voltar");
        B_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_VoltarMouseClicked(evt);
            }
        });
        add(B_Voltar);
        B_Voltar.setBounds(30, 330, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-3, -4, 420, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void B_RemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_RemoveMouseClicked
        int selectedRow = this.jTable.getSelectedRow();
        if (selectedRow >= 0) {
            String productName = (String) this.jTable.getValueAt(selectedRow, 0);
            Produto produtoRemovido = null;
            for (Produto produto : listaProdutos) {
                if (produto.getNome().equals(productName)) {
                    produtoRemovido = produto;
                    break;
                }
            }

            if (produtoRemovido != null) {
                int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o produto " + productName + "?");
                if (confirmacao == JOptionPane.YES_OPTION) {
                    listaProdutos.remove(produtoRemovido);

                    DefaultTableModel model = (DefaultTableModel) this.jTable.getModel();
                    model.removeRow(selectedRow);
                }
            }
        }

    }//GEN-LAST:event_B_RemoveMouseClicked

    private void B_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_VoltarMouseClicked
        Janela.TelaAdmin = new TelaAdmin(listaProdutos);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.TelaRemoveProduto);
        janela.add(Janela.TelaAdmin, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_B_VoltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Remove;
    private javax.swing.JButton B_Voltar;
    private javax.swing.JLabel LogoMenor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
