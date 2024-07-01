/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import controller.ListaDeUsuarios;
import controller.ListaLaboratorios;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Laboratorio;
import model.Usuario;

/**
 *
 * @author derno
 */
public class CrearLaboratorios extends javax.swing.JPanel {
    
    private ListaDeUsuarios listaUsuarios; 
    private ListaLaboratorios listalaboratorios; 
    private Usuario userActual;
    private DefaultTableModel tableModelAdmin;
    
    public CrearLaboratorios(Usuario user,ListaLaboratorios laboratorios,ListaDeUsuarios usuarios) {
        this.listaUsuarios = usuarios;
        this.listalaboratorios = laboratorios;
        this.userActual=user;
        initComponents();
        inicializarTablaAdmin();
        actualizarTablaAdmin();
    }
    
    private void inicializarTablaAdmin() {
        String[] columnas = {"Username", "Nombre Completo", "Rol", "Estado"};
        tableModelAdmin = new DefaultTableModel(columnas, 0);
        JTableAdmin.setModel(tableModelAdmin);
    }
    
    private String[] facultadComboBox(String facultad){
        String[]escuela=new String[5];
        if(facultad.equals("Ciencias Económicas")){
            escuela[0]="Administración de empresas";
            escuela[1]="Contaduría pública";
            escuela[2]="Relaciones Industriales";
            escuela[3]="Sociología";
            escuela[4]="Economía";
        }
        if(facultad.equals("Seleccionar")){
            escuela=new String[1];
            escuela[0]="Seleccionar facultad primero";
        }
        if(facultad.equals("Humanidades y Educación")){
            escuela[0]="Educación";
            escuela[1]="Comunicación Social";
            escuela[2]="Psicología";
            escuela[3]="Letras";
            escuela[4]="Filosofía";
        }
        if(facultad.equals("Ingeniería")){
            escuela[0]="Ingeniería Civil";
            escuela[1]="Ingeniería Informatica";
            escuela[2]="Ingeniería Industrial";
            escuela[3]="Ingeniería Telecomunicaciones";
            escuela[4]="Arquitectura";
        }
        if(facultad.equals("Derecho")){
            escuela=new String[2];
            escuela[0]="Derecho";
            escuela[1]="Derecho ITER";
        }
        return escuela;
    }
    
    private void actualizarTablaAdmin() {
        tableModelAdmin.setRowCount(0); 

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        for (Usuario usuario : listaUsuarios.getListaUsuarios()) {
            String rol = usuario.getRolUsuario();
            if ("Administrador".equals(rol) || "Tecnico".equals(rol)) {
                 
                Object[] fila = {
                    usuario.getUsername(),
                    usuario.getNombreUser(),
                    usuario.getRolUsuario(),
                    usuario.getStatus()
                };
                tableModelAdmin.addRow(fila);
            }
        }

        for (int i = 0; i < tableModelAdmin.getColumnCount(); i++) {
            JTableAdmin.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        JTableAdmin.setDefaultEditor(Object.class, null); 
    }
    
    private String obtenerIdAdministradorSeleccionado() {
        int selectedRow = JTableAdmin.getSelectedRow();
        if (selectedRow >= 0) {
            return listaUsuarios.listarUsuarioPorNombre((String) tableModelAdmin.getValueAt(selectedRow, 0));
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un administrador.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return null;
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
        NombreLaboratorioTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CrearLaboratorio = new javax.swing.JButton();
        nameLbl3 = new javax.swing.JLabel();
        nameLbl6 = new javax.swing.JLabel();
        nameLbl4 = new javax.swing.JLabel();
        DepartamentoTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAdmin = new javax.swing.JTable();
        nameLbl5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        BackgroundCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear laboratorio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder crear el laboratorio: ");

        nameLbl1.setText("Nombre del laboratorio:");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        CrearLaboratorio.setBackground(new java.awt.Color(21, 101, 192));
        CrearLaboratorio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearLaboratorio.setForeground(new java.awt.Color(255, 255, 255));
        CrearLaboratorio.setText("Crear");
        CrearLaboratorio.setBorder(null);
        CrearLaboratorio.setBorderPainted(false);
        CrearLaboratorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        nameLbl5.setText("Usuarios disponibles para asignar el laboratorio:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ciencias Económicas", "Humanidades y Educación", "Ingeniería", "Derecho" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar facultad primero" }));

        javax.swing.GroupLayout BackgroundCrearUsuarioLayout = new javax.swing.GroupLayout(BackgroundCrearUsuario);
        BackgroundCrearUsuario.setLayout(BackgroundCrearUsuarioLayout);
        BackgroundCrearUsuarioLayout.setHorizontalGroup(
            BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1004, 1004, 1004))
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(nameLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(95, 95, 95))
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1)
                                        .addComponent(NombreLaboratorioTxt))
                                    .addComponent(nameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                        .addComponent(nameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(185, 185, 185))
                                    .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CrearLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DepartamentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(193, 193, 193))
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
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
                            .addGap(25, 25, 25)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(nameLbl5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        if (!jComboBox1.getSelectedItem().equals("Seleccionar")) {
            String nombreLaboratorio = NombreLaboratorioTxt.getText();
            String facultad =jComboBox1.getSelectedItem().toString();
            String escuela =jComboBox2.getSelectedItem().toString();
            String departamento = DepartamentoTxt.getText();

            String idAdministrador = obtenerIdAdministradorSeleccionado();
            if (idAdministrador == null) {
                return;
            }

            boolean exito = listalaboratorios.crearLaboratorio(this.userActual, nombreLaboratorio, facultad, escuela, departamento, idAdministrador);

            if (exito) {
                JOptionPane.showMessageDialog(this, "Laboratorio creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al crear el laboratorio.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione una opcion de facultad", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CrearLaboratorioActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.jComboBox1.getSelectedIndex()>=0){
                this.jComboBox2.setModel(new DefaultComboBoxModel(this.facultadComboBox(this.jComboBox1.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearUsuario;
    private javax.swing.JButton CrearLaboratorio;
    private javax.swing.JTextField DepartamentoTxt;
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JTable JTableAdmin;
    private javax.swing.JTextField NombreLaboratorioTxt;
    private javax.swing.ButtonGroup Rol;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl3;
    private javax.swing.JLabel nameLbl4;
    private javax.swing.JLabel nameLbl5;
    private javax.swing.JLabel nameLbl6;
    // End of variables declaration//GEN-END:variables
}
