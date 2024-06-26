/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import controller.ListaDeUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author derno
 */
public class CrearUsuario extends javax.swing.JPanel {
    
    private ListaDeUsuarios listaUsuarios; 
    
    public CrearUsuario(ListaDeUsuarios usuarios) {
        this.listaUsuarios = usuarios;
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

        Rol = new javax.swing.ButtonGroup();
        Estado = new javax.swing.ButtonGroup();
        BackgroundCrearUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameLbl1 = new javax.swing.JLabel();
        NombreUsuarioTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CrearUsuario = new javax.swing.JButton();
        nameLbl3 = new javax.swing.JLabel();
        nameLbl2 = new javax.swing.JLabel();
        AdminRadioBtton = new javax.swing.JRadioButton();
        InvitadoRadioBtton = new javax.swing.JRadioButton();
        ContraseñaTxt = new javax.swing.JTextField();
        nameLbl5 = new javax.swing.JLabel();
        ActivoRadioBtton = new javax.swing.JRadioButton();
        InactivoRadioBtton = new javax.swing.JRadioButton();
        nameLbl6 = new javax.swing.JLabel();
        NombreCompletoTxt = new javax.swing.JTextField();
        TecnicoRadiobtton = new javax.swing.JRadioButton();

        BackgroundCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder crear el usuario: ");

        nameLbl1.setText("Nombre de usuario:");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        CrearUsuario.setBackground(new java.awt.Color(21, 101, 192));
        CrearUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        CrearUsuario.setText("Crear");
        CrearUsuario.setBorder(null);
        CrearUsuario.setBorderPainted(false);
        CrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearUsuario.setIconTextGap(13);
        CrearUsuario.setInheritsPopupMenu(true);
        CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuarioActionPerformed(evt);
            }
        });

        nameLbl3.setText("Contraseña:");

        nameLbl2.setText("Seleccione el rol: ");

        Rol.add(AdminRadioBtton);
        AdminRadioBtton.setText("Administrador");

        Rol.add(InvitadoRadioBtton);
        InvitadoRadioBtton.setText("Invitado");

        nameLbl5.setText("Estado :");

        Estado.add(ActivoRadioBtton);
        ActivoRadioBtton.setText("Activo");

        Estado.add(InactivoRadioBtton);
        InactivoRadioBtton.setText("Inactivo");

        nameLbl6.setText("Nombre completo:");

        Rol.add(TecnicoRadiobtton);
        TecnicoRadiobtton.setText("Tecnico");

        javax.swing.GroupLayout BackgroundCrearUsuarioLayout = new javax.swing.GroupLayout(BackgroundCrearUsuario);
        BackgroundCrearUsuario.setLayout(BackgroundCrearUsuarioLayout);
        BackgroundCrearUsuarioLayout.setHorizontalGroup(
            BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1004, 1004, 1004))
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameLbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLbl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NombreUsuarioTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                        .addComponent(ContraseñaTxt))
                                    .addComponent(nameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ActivoRadioBtton)
                                    .addComponent(InactivoRadioBtton))
                                .addGap(42, 42, 42)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(nameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80))
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(nameLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(135, 135, 135))
                            .addComponent(AdminRadioBtton)
                            .addComponent(InvitadoRadioBtton)
                            .addComponent(CrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreCompletoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TecnicoRadiobtton))
                        .addGap(275, 275, 275))))
        );
        BackgroundCrearUsuarioLayout.setVerticalGroup(
            BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(nameLbl1)
                        .addGap(18, 18, 18)
                        .addComponent(NombreUsuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(nameLbl3)
                        .addGap(18, 18, 18)
                        .addComponent(ContraseñaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ActivoRadioBtton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InactivoRadioBtton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(nameLbl6)
                                .addGap(18, 18, 18)
                                .addComponent(NombreCompletoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AdminRadioBtton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InvitadoRadioBtton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TecnicoRadiobtton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                .addComponent(CrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackgroundCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioActionPerformed
        String username = NombreUsuarioTxt.getText();
        String contrasena = ContraseñaTxt.getText();
        String nombreCompleto = NombreCompletoTxt.getText();  

        String rol = "";
        if (AdminRadioBtton.isSelected()) {
            rol = "Administrador";
        } else if (InvitadoRadioBtton.isSelected()) {
            rol = "Invitado";
        } else if (TecnicoRadiobtton.isSelected()) {
            rol = "Tecnico";
}
        boolean estado = ActivoRadioBtton.isSelected();
        String estadoStr = String.valueOf(estado);

        Usuario nuevoUsuario = new Usuario(username, contrasena, nombreCompleto, rol,estadoStr );
        boolean exito = listaUsuarios.crearUsuario(nuevoUsuario, username, contrasena, nombreCompleto, rol,estadoStr);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Usuario creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al crear el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CrearUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ActivoRadioBtton;
    private javax.swing.JRadioButton AdminRadioBtton;
    private javax.swing.JPanel BackgroundCrearUsuario;
    private javax.swing.JTextField ContraseñaTxt;
    private javax.swing.JButton CrearUsuario;
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JRadioButton InactivoRadioBtton;
    private javax.swing.JRadioButton InvitadoRadioBtton;
    private javax.swing.JTextField NombreCompletoTxt;
    private javax.swing.JTextField NombreUsuarioTxt;
    private javax.swing.ButtonGroup Rol;
    private javax.swing.JRadioButton TecnicoRadiobtton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl2;
    private javax.swing.JLabel nameLbl3;
    private javax.swing.JLabel nameLbl5;
    private javax.swing.JLabel nameLbl6;
    // End of variables declaration//GEN-END:variables
}