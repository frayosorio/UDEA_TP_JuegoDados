package juegodados;

import java.util.Random;

public class FrmJuego extends javax.swing.JFrame {

    private int lanzamientos;
    private int cenas;

    //Declarar los objetos de cla clase DADO
    private Dado dado1, dado2;

    //Objeto para generar la suerte
    private Random r;

    public FrmJuego() {
        initComponents();

        //instanciar los objetos DADO
        dado1 = new Dado();
        dado2 = new Dado();

        //Instanciar la suerte del juego
        r = new Random();

        //Iniciar los contadores
        lanzamientos = 0;
        cenas = 0;
        mostrarContadores();
    }
    
    private void mostrarContadores(){
        lblLanzamientos.setText(String.valueOf(lanzamientos));
        lblCenas.setText(String.valueOf(cenas));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDado1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLanzamientos = new javax.swing.JLabel();
        lblCenas = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnLanzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de Daos");

        lblDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.jpg"))); // NOI18N

        jLabel1.setText("Lanzamientos");

        jLabel2.setText("Cenas");

        lblLanzamientos.setBackground(new java.awt.Color(0, 0, 0));
        lblLanzamientos.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        lblLanzamientos.setForeground(new java.awt.Color(51, 255, 0));
        lblLanzamientos.setText("0");
        lblLanzamientos.setOpaque(true);

        lblCenas.setBackground(new java.awt.Color(0, 0, 0));
        lblCenas.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        lblCenas.setForeground(new java.awt.Color(51, 255, 0));
        lblCenas.setText("0");
        lblCenas.setOpaque(true);

        lblDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.jpg"))); // NOI18N

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnLanzar.setText("Lanzar");
        btnLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblDado1)
                        .addGap(32, 32, 32)
                        .addComponent(lblDado2)
                        .addGap(122, 122, 122)
                        .addComponent(lblLanzamientos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCenas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnIniciar)
                .addGap(71, 71, 71)
                .addComponent(btnLanzar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDado2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLanzamientos)
                            .addComponent(lblCenas)))
                    .addComponent(lblDado1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnLanzar))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        //Iniciar los contadores
        lanzamientos = 0;
        cenas = 0;
        mostrarContadores();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarActionPerformed

        dado1.lanzar(r);
        dado1.mostrar(lblDado1);

        dado2.lanzar(r);
        dado2.mostrar(lblDado2);
        
        //actualizar los contadores
        lanzamientos++;
        if(dado1.getNumero()+dado2.getNumero()>=11){
            cenas++;
        }
        
        mostrarContadores();
    }//GEN-LAST:event_btnLanzarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnLanzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCenas;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    private javax.swing.JLabel lblLanzamientos;
    // End of variables declaration//GEN-END:variables
}