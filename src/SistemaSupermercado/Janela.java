
package SistemaSupermercado;

import java.awt.BorderLayout;
public class Janela extends javax.swing.JFrame {
    static TelaIdentificacao TelaID;
    static TelaAdmin TelaAdmin;
    static TelaCompraUsuario TelaCompraUser;
    static TelaFinalizaCompra TelaFinalCompra;
    static TelaCadastraProduto TelaCadProduto;
    static TelaEditaProduto TelaEditaProduto;
    static TelaRemoveProduto TelaRemoveProduto;
    static TelaVisualizaProduto TelaVisualizaProduto;
    static TelaEdicaoProduto TelaEdicaoProduto;
    static TelaVerificaAdmin TelaVerificaAdmin;
    
    public Janela() {
        initComponents();
        TelaID = new TelaIdentificacao(null);
        this.setLayout(new BorderLayout());
        this.add(TelaID, BorderLayout.CENTER);
        this.pack();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
