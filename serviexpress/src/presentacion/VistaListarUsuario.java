/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Logica_usuario;
import logica.Usuario;


/**
 *
 * @author jpbri
 */
public class VistaListarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form VistaListarUsuario
     */
    public VistaListarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizar_lista();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_usuarios = new javax.swing.JTable();
        btn_crear_nuevo = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        btn_atras1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(189, 189, 189));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(750, 630));

        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setPreferredSize(new java.awt.Dimension(100, 20));
        label1.setText("Usuarios");

        tbl_usuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbl_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Telefono", "Email", "Rut", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_usuarios);

        btn_crear_nuevo.setBackground(new java.awt.Color(49, 69, 84));
        btn_crear_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear_nuevo.setText("Crear Nuevo");
        btn_crear_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_nuevoActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(49, 69, 84));
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(49, 69, 84));
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar Nombre");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(29, 41, 83));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N

        btn_atras1.setBackground(new java.awt.Color(251, 200, 51));
        btn_atras1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        btn_atras1.setForeground(new java.awt.Color(255, 255, 255));
        btn_atras1.setText("Atras");
        btn_atras1.setActionCommand("");
        btn_atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btn_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_crear_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(32, 32, 32))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crear_nuevo)
                    .addComponent(btn_eliminar)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crear_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_nuevoActionPerformed

        VistaCrearUsuario crear_user = new VistaCrearUsuario();
        crear_user.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_crear_nuevoActionPerformed

    
    public void actualizar_lista(){
        ArrayList<Usuario> listaUsuarios= new ArrayList<>();
        Logica_usuario log_usuario = new Logica_usuario();
        
        try{
            String nombre = txt_buscar.getText();
            listaUsuarios = log_usuario.listarUsuario(nombre);
            
            DefaultTableModel tablaModelo = (DefaultTableModel)tbl_usuarios.getModel();
            tablaModelo.setRowCount(0);
            
            for(Usuario x: listaUsuarios){
               Object[] fila = {
                x.getId(),
                x.getNombre(),
                x.getPhone(),
                x.getEmail(),
                x.getRut(),
                x.getUsername()};
                tablaModelo.addRow(fila);
            }
     
        }
        catch(Exception err){
            
            System.out.println("Error: " + err.getMessage());
        }  
    }
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        Logica_usuario lg_usuario = new Logica_usuario();
        
        
        try{
            String nombre = txt_buscar.getText();
            listaUsuarios = lg_usuario.listarUsuario(nombre);
            
            DefaultTableModel tablaModelo = (DefaultTableModel)tbl_usuarios.getModel();
            tablaModelo.setRowCount(0);
            
            for(Usuario x: listaUsuarios){
               Object[] fila = {
                x.getId(),
                x.getNombre(),
                x.getPhone(),
                x.getEmail(),
                x.getRut(),
                x.getUsername()};
                tablaModelo.addRow(fila);
            }
     
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }  
        
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        Logica_usuario log_usuario = new Logica_usuario();
        try{
            if(tbl_usuarios.getSelectedRow()==-1){
                JOptionPane.showMessageDialog(rootPane, "Seleccione una opción");
            }else{
                
                
            int indice = tbl_usuarios.getSelectedRow();
            String username = tbl_usuarios.getValueAt(indice, 5).toString();
            
            
            log_usuario.eliminarUsuario(username);
            
            JOptionPane.showMessageDialog(rootPane, "USUARIO SE DEHABILITÓ CORRECTAMENTE");
            btn_buscarActionPerformed(evt);
            }
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(rootPane, "ERROR " + err.getMessage());
        }
     
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void btn_atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras1ActionPerformed
        VistaAdministrador entrar_admin = new VistaAdministrador();
        entrar_admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_atras1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaListarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaListarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaListarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaListarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaListarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras1;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_crear_nuevo;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private java.awt.Label label1;
    private javax.swing.JTable tbl_usuarios;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}