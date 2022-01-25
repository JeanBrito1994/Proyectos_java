/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author jeanpierrebritocastro
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        m_opciones = new javax.swing.JMenu();
        mi_almacenarPersona = new javax.swing.JMenuItem();
        mi_buscarMascota = new javax.swing.JMenuItem();
        mi_listarMascota = new javax.swing.JMenuItem();
        mi_eliminarModificar = new javax.swing.JMenuItem();
        m_quienesSomos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediPet");
        setSize(new java.awt.Dimension(800, 500));

        m_opciones.setText("Opciones");

        mi_almacenarPersona.setText("Almacenar Mascota");
        mi_almacenarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_almacenarPersonaActionPerformed(evt);
            }
        });
        m_opciones.add(mi_almacenarPersona);

        mi_buscarMascota.setText("Buscar Mascota");
        mi_buscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_buscarMascotaActionPerformed(evt);
            }
        });
        m_opciones.add(mi_buscarMascota);

        mi_listarMascota.setText("Listar Mascota");
        m_opciones.add(mi_listarMascota);

        mi_eliminarModificar.setText("Eliminar / Modificar");
        m_opciones.add(mi_eliminarModificar);

        jMenuBar1.add(m_opciones);

        m_quienesSomos.setText("Quienes Somos");
        jMenuBar1.add(m_quienesSomos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_almacenarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_almacenarPersonaActionPerformed
        VistaAlmacenarMascota vistaAlmacenar = new VistaAlmacenarMascota();
        vistaAlmacenar.setVisible(true);
    }//GEN-LAST:event_mi_almacenarPersonaActionPerformed

    private void mi_buscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_buscarMascotaActionPerformed
        BuscarMascota buscarmascota = new BuscarMascota();
        buscarmascota.setVisible(true);
    }//GEN-LAST:event_mi_buscarMascotaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu m_opciones;
    private javax.swing.JMenu m_quienesSomos;
    private javax.swing.JMenuItem mi_almacenarPersona;
    private javax.swing.JMenuItem mi_buscarMascota;
    private javax.swing.JMenuItem mi_eliminarModificar;
    private javax.swing.JMenuItem mi_listarMascota;
    // End of variables declaration//GEN-END:variables
}