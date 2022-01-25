/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorMaterial;
import javax.swing.JOptionPane;
import modelo.Material;

/**
 *
 * @author jeanpierrebritocastro
 */
public class VentanaAgregar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAgregar
     */
    public VentanaAgregar() {
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

        btng_formato = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        txt_duracion = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        rbn_documental = new javax.swing.JRadioButton();
        rbn_pelicula = new javax.swing.JRadioButton();
        cmb_categoria = new javax.swing.JComboBox<>();
        chk_nuevo = new javax.swing.JCheckBox();
        btn_guardar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_agregar = new javax.swing.JMenuItem();
        mi_listar = new javax.swing.JMenuItem();
        mi_salir = new javax.swing.JMenuItem();

        setTitle("Material Audiovidual");
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 20)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 20)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 20)); // NOI18N
        jLabel3.setText("Formato:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 20)); // NOI18N
        jLabel4.setText("Duración:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 3, 20)); // NOI18N
        jLabel5.setText("Categoría:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 3, 20)); // NOI18N
        jLabel6.setText("Autor:");

        txt_nombre.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N

        txt_codigo.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        txt_duracion.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        txt_duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_duracionActionPerformed(evt);
            }
        });
        txt_duracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_duracionKeyTyped(evt);
            }
        });

        txt_autor.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N

        btng_formato.add(rbn_documental);
        rbn_documental.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N
        rbn_documental.setText("Documental");

        btng_formato.add(rbn_pelicula);
        rbn_pelicula.setFont(new java.awt.Font("Lucida Grande", 0, 19)); // NOI18N
        rbn_pelicula.setText("Pelicula");

        cmb_categoria.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        cmb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONE-", "NATURALEZA", "GUERRA", "RELIGIÓN" }));

        chk_nuevo.setFont(new java.awt.Font("Lucida Grande", 3, 20)); // NOI18N
        chk_nuevo.setText("Nuevo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chk_nuevo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbn_documental)
                                    .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(rbn_pelicula))
                            .addComponent(txt_codigo)
                            .addComponent(txt_autor)
                            .addComponent(cmb_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(274, 274, 274))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbn_documental)
                    .addComponent(rbn_pelicula))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chk_nuevo)
                .addGap(84, 84, 84))
        );

        btn_guardar.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jMenu1.setBackground(new java.awt.Color(153, 255, 102));
        jMenu1.setText("Procesos");

        mi_agregar.setText("Agregar");
        mi_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agregarActionPerformed(evt);
            }
        });
        jMenu1.add(mi_agregar);

        mi_listar.setText("Listar");
        mi_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_listarActionPerformed(evt);
            }
        });
        jMenu1.add(mi_listar);

        mi_salir.setText("Salir");
        mi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(mi_salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(btn_guardar)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_salir))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_listarActionPerformed
        VentanaListar ventanaListar = new VentanaListar();
        ventanaListar.setVisible(true);
    }//GEN-LAST:event_mi_listarActionPerformed

    private void mi_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agregarActionPerformed
        VentanaAgregar ventanaAgrega = new VentanaAgregar();
        ventanaAgrega.setVisible(true);
    }//GEN-LAST:event_mi_agregarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Material material = new Material();
        ControladorMaterial ctrlMaterial = new ControladorMaterial();
        
        
        String cero = "0";
        String cod = txt_codigo.getText();
        
        while(cod.length()<2){
            cod = cero + cod;
        }           
        material.setCodigo("COD"+cod);

        material.setNombre(txt_nombre.getText());
        
        if(rbn_documental.isSelected()){
            material.setFormato("D");
         }else if(rbn_pelicula.isSelected()){
             material.setFormato("P");
         }
        
        material.setDuracion(Integer.parseInt(txt_duracion.getText()));
        material.setCategoria(cmb_categoria.getSelectedItem().toString());
        material.setAutor(txt_autor.getText());
        
        if(chk_nuevo.isSelected())
            material.setNuevo(true);
        else
            material.setNuevo(false);
        
        try{
            ctrlMaterial.almacenarMaterial(material);
            JOptionPane.showMessageDialog(rootPane, "MATERIAL SE ALMACENÓ CORRECTAMENTE");
            btn_limpiarActionPerformed(evt);
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(rootPane, "Error: " + err.getMessage());
        }
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
        
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_codigo.setText("");
        txt_nombre.setText("");
        btng_formato.clearSelection();
        txt_duracion.setText("");
        cmb_categoria.setSelectedItem("-SELECCIONE-");
        txt_autor.setText("");
        chk_nuevo.setSelected(false);
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void mi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_salirActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_mi_salirActionPerformed

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_duracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_duracionActionPerformed
       
    }//GEN-LAST:event_txt_duracionActionPerformed

    private void txt_duracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_duracionKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_duracionKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup btng_formato;
    private javax.swing.JCheckBox chk_nuevo;
    private javax.swing.JComboBox<String> cmb_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mi_agregar;
    private javax.swing.JMenuItem mi_listar;
    private javax.swing.JMenuItem mi_salir;
    private javax.swing.JRadioButton rbn_documental;
    private javax.swing.JRadioButton rbn_pelicula;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_duracion;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
