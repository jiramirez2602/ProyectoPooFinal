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
public class ModificarUsuario extends javax.swing.JPanel {
    
    private ListaDeUsuarios listaUsuarios;
    private Usuario usuarioSeleccionado;
    private Usuario userActual;
    private String usernameSeleccionado;
    
    public ModificarUsuario(Usuario user,ListaDeUsuarios usuarios,String username) {
        this.listaUsuarios = usuarios;
        this.userActual = user;
        this.usernameSeleccionado = username;
        initComponents();
    }
    
    public void cargarDatosUsuario(String username) {
    String idUsuario = listaUsuarios.listarUsuarioPorNombre(username); 
    if (idUsuario != null) {
        Usuario usuarioSeleccionado = listaUsuarios.listarUsuario(idUsuario);
        if (usuarioSeleccionado != null) {
            NombreUsuarioTxt.setText(usuarioSeleccionado.getUsername());
            ContraseñaTxt.setText(usuarioSeleccionado.getContrasena());
            NombreCompletoTxt.setText(usuarioSeleccionado.getNombreUser());

            // Cargar rol
            String rol = usuarioSeleccionado.getRolUsuario();
            switch (rol) {
                case "Administrador":
                    AdminRadioBtton.setSelected(true);
                    break;
                case "Invitado":
                    InvitadoRadioBtton.setSelected(true);
                    break;
                case "Tecnico":
                    TecnicoRadiobtton.setSelected(true);
                    break;
                default:
                    // Manejar el caso por defecto si es necesario
                    break;
            }

            // Cargar estado
            String state = usuarioSeleccionado.getStatus();
            if(state.equals(ActivoRadioBtton.getText())){
                ActivoRadioBtton.setSelected(true);
            }
            else if(state.equals(InactivoRadioBtton.getText())){
                InactivoRadioBtton.setSelected(true);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
    }
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
        ModificarUsuario = new javax.swing.JButton();
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

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BackgroundCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Modificar usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder modificar el usuario: ");

        nameLbl1.setText("Nombre de usuario:");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        ModificarUsuario.setBackground(new java.awt.Color(21, 101, 192));
        ModificarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        ModificarUsuario.setText("Modificar");
        ModificarUsuario.setBorder(null);
        ModificarUsuario.setBorderPainted(false);
        ModificarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ModificarUsuario.setIconTextGap(13);
        ModificarUsuario.setInheritsPopupMenu(true);
        ModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarUsuarioActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(728, 728, 728))
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                        .addComponent(nameLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(313, 313, 313))
                                    .addComponent(NombreUsuarioTxt)
                                    .addComponent(ContraseñaTxt)
                                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                        .addComponent(nameLbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(14, 14, 14))
                                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                        .addComponent(ActivoRadioBtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(327, 327, 327))
                                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                        .addComponent(InactivoRadioBtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(319, 319, 319)))
                                .addGap(48, 48, 48)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(nameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(58, 58, 58))
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(nameLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(113, 113, 113))
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(AdminRadioBtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(331, 331, 331))
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(InvitadoRadioBtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(364, 364, 364))
                            .addComponent(ModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NombreCompletoTxt)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(TecnicoRadiobtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(366, 366, 366)))
                        .addGap(312, 312, 312))))
        );
        BackgroundCrearUsuarioLayout.setVerticalGroup(
            BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(nameLbl1)
                        .addGap(18, 18, 18)
                        .addComponent(NombreUsuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ContraseñaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(nameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ActivoRadioBtton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InactivoRadioBtton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(nameLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NombreCompletoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AdminRadioBtton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InvitadoRadioBtton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TecnicoRadiobtton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(ModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)))
                .addGap(89, 89, 89))
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

    private void ModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarUsuarioActionPerformed
        String idUsuario = listaUsuarios.listarUsuarioPorNombre(usernameSeleccionado);
        

        if (idUsuario == null) {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

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

        String estado="";
        if(ActivoRadioBtton.isSelected()){
            estado="Activo";
        }
        else if(InactivoRadioBtton.isSelected()){
            estado="Inactivo";
        }

        boolean exito = listaUsuarios.actualizarUsuario(userActual, idUsuario, username, contrasena, nombreCompleto, rol, estado);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Usuario modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ModificarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ActivoRadioBtton;
    private javax.swing.JRadioButton AdminRadioBtton;
    private javax.swing.JPanel BackgroundCrearUsuario;
    private javax.swing.JTextField ContraseñaTxt;
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JRadioButton InactivoRadioBtton;
    private javax.swing.JRadioButton InvitadoRadioBtton;
    private javax.swing.JButton ModificarUsuario;
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
