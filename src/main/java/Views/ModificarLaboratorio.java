/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import controller.ListaDeUsuarios;
import controller.ListaLaboratorios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Laboratorio;
import model.Usuario;

/**
 *
 * @author derno
 */
public class ModificarLaboratorio extends javax.swing.JPanel {
    
    private ListaDeUsuarios listaUsuarios; 
    private ListaLaboratorios listalaboratorios; 
    private Usuario userActual;
    private DefaultTableModel tableModelAdmin;
    
    public ModificarLaboratorio(Usuario user,ListaLaboratorios laboratorios,ListaDeUsuarios usuarios) {
        this.listaUsuarios = usuarios;
        this.listalaboratorios = laboratorios;
        this.userActual=user;
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
        NombreLaboratorioTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CrearLaboratorio = new javax.swing.JButton();
        nameLbl3 = new javax.swing.JLabel();
        FacultadTxt = new javax.swing.JTextField();
        nameLbl6 = new javax.swing.JLabel();
        EscuelaTxt = new javax.swing.JTextField();
        nameLbl4 = new javax.swing.JLabel();
        DepartamentoTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAdmin = new javax.swing.JTable();
        nameLbl5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableAdminDisp = new javax.swing.JTable();
        nameLbl7 = new javax.swing.JLabel();

        BackgroundCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Modificar laboratorio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder modificar el laboratorio: ");

        nameLbl1.setText("Nombre del laboratorio:");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        CrearLaboratorio.setBackground(new java.awt.Color(21, 101, 192));
        CrearLaboratorio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearLaboratorio.setForeground(new java.awt.Color(255, 255, 255));
        CrearLaboratorio.setText("Modificar");
        CrearLaboratorio.setBorder(null);
        CrearLaboratorio.setBorderPainted(false);
        CrearLaboratorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearLaboratorio.setIconTextGap(13);
        CrearLaboratorio.setInheritsPopupMenu(true);
        CrearLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearLaboratorioActionPerformed(evt);
            }
        });

        nameLbl3.setText("Facultad:");

        nameLbl6.setText("Escuela:");

        nameLbl4.setText("Departamento:");

        JTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTableAdmin);

        nameLbl5.setText("Usuario asignado como administrador");

        JTableAdminDisp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JTableAdminDisp);

        nameLbl7.setText("Usuarios disponibles como administrador:");

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
                                .addComponent(nameLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(95, 95, 95))
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1)
                                        .addComponent(FacultadTxt)
                                        .addComponent(NombreLaboratorioTxt)
                                        .addComponent(jScrollPane2)
                                        .addComponent(nameLbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(nameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(185, 185, 185))
                            .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CrearLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EscuelaTxt)
                                .addComponent(DepartamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(193, 193, 193))))
        );
        BackgroundCrearUsuarioLayout.setVerticalGroup(
            BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(nameLbl6)
                        .addGap(18, 18, 18)
                        .addComponent(EscuelaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl4)
                        .addGap(18, 18, 18)
                        .addComponent(DepartamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(CrearLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                            .addComponent(nameLbl1)
                            .addGap(18, 18, 18)
                            .addComponent(NombreLaboratorioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(nameLbl3)
                            .addGap(18, 18, 18)
                            .addComponent(FacultadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(nameLbl5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nameLbl7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BackgroundCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearLaboratorioActionPerformed
    
    }//GEN-LAST:event_CrearLaboratorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearUsuario;
    private javax.swing.JButton CrearLaboratorio;
    private javax.swing.JTextField DepartamentoTxt;
    private javax.swing.JTextField EscuelaTxt;
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JTextField FacultadTxt;
    private javax.swing.JTable JTableAdmin;
    private javax.swing.JTable JTableAdminDisp;
    private javax.swing.JTextField NombreLaboratorioTxt;
    private javax.swing.ButtonGroup Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl3;
    private javax.swing.JLabel nameLbl4;
    private javax.swing.JLabel nameLbl5;
    private javax.swing.JLabel nameLbl6;
    private javax.swing.JLabel nameLbl7;
    // End of variables declaration//GEN-END:variables
}
