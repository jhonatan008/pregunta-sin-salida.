package views;

import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;

public class view extends javax.swing.JFrame {

    public view() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelButtons = new javax.swing.JPanel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNA PREGUNTA SIN SALIDA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel1.setText("¿TE GUSTA OTRO?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 600, 60));

        jPanelButtons.setBackground(new java.awt.Color(255, 255, 255));
        jPanelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnYes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnYes.setText("SI");
        btnYes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });
        jPanelButtons.add(btnYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 130, 40));

        btnNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNo.setText("NO");
        btnNo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNoMouseEntered(evt);
            }
        });
        jPanelButtons.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zfqv9dlkwktpmbooopr6.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanelButtons.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -10, 800, 450));

        getContentPane().add(jPanelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseEntered
        int buttonNoWidth = jPanelButtons.getWidth()-btnNo.getWidth();
        int buttonNoHeight =jPanelButtons.getHeight()-btnNo.getHeight();
        int x = (int)Math.round(buttonNoWidth*Math.random());
        int y = (int)Math.round(buttonNoHeight*Math.random());
        btnNo.setLocation(x, y);
    }//GEN-LAST:event_btnNoMouseEntered

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
       JOptionPane.showMessageDialog(null," ME HIERES OE FEA");
     
    }//GEN-LAST:event_btnYesActionPerformed

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButtons;
    // End of variables declaration//GEN-END:variables

    private RSNotifyAnimated RSNotifyAnimated(String genial) {
        throw new UnsupportedOperationException("Aún no es compatible."); //
                                  //Para cambiar el cuerpo de los métodos generados, elija Herramientas | Plantillas
    }
}
