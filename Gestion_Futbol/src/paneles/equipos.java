/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

/**
 *
 * @author Virus1020
 */
public class equipos extends javax.swing.JPanel {

    /**
     * Creates new form equipos
     */
    public equipos() {
        initComponents();
        torneos tor=new torneos();
        tor.setVisible(true);
             
        lbl_equipos.setText(tor.nombre_liga);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_equipos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_equipos.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lbl_equipos.setForeground(new java.awt.Color(128, 128, 131));
        lbl_equipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_equipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/android.png"))); // NOI18N
        lbl_equipos.setText("Equipos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_equipos, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_equipos)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_equipos;
    // End of variables declaration//GEN-END:variables
}
