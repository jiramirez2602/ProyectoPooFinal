/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import controller.ListaDeEquipos;
import controller.ListaLaboratorios;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Laboratorio;
import model.Usuario;

/**
 *
 * @author derno
 */
public class CrearEquiposUltimo extends javax.swing.JPanel {
    
    private Usuario userActual;
    private ListaLaboratorios listalaboratorios;
    private ListaDeEquipos listaequipos;
    
    public CrearEquiposUltimo(Usuario user, ListaLaboratorios listaLab, ListaDeEquipos equipos, 
                              String aplicacion, String ultimoMantenimiento, String proximoMantenimiento, 
                              String ultimaCalibracion, String proximaCalibracion, String proveedoresDeServicios, 
                              String encendidoDeNoche, String nombreProducto, String inventarioExistente, 
                              String observaciones) {
        initComponents();
        this.userActual = user;
        this.listalaboratorios = listaLab;
        this.listaequipos = equipos;
        inicializarTablaLaboratorios();
    }
    
      private void MostrarJpanel(JPanel p){
        p.setSize(760,478);   
        p.setLocation(0,0);
        BackgroundCrearEquipos2.removeAll();
        BackgroundCrearEquipos2.add(p,BorderLayout.CENTER);
        BackgroundCrearEquipos2.revalidate();
        BackgroundCrearEquipos2.repaint();
    }
    
      
    private void inicializarTablaLaboratorios() {
        String[] columnas = {"ID Laboratorio", "Nombre Laboratorio"};
        DefaultTableModel tableModel = new DefaultTableModel(columnas, 0);
        LabDisponibles.setModel(tableModel);
    }
    
    private void actualizarTablaLaboratorios() {
        DefaultTableModel tableModel = (DefaultTableModel) LabDisponibles.getModel();
        tableModel.setRowCount(0); // Limpiar tabla antes de añadir nuevos datos

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        for (Laboratorio lab : listalaboratorios.getListaLaboratorios()) {
            Object[] fila = { lab.getId(), lab.getNombreLaboratorio() };
            tableModel.addRow(fila);
    }

        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            LabDisponibles.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private String obtenerIdLaboratorioSeleccionado() {
        int selectedRow = LabDisponibles.getSelectedRow();
        if (selectedRow >= 0) {
            return (String) LabDisponibles.getValueAt(selectedRow, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un laboratorio.", "Advertencia", JOptionPane.WARNING_MESSAGE);
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

        EncendidoNoche = new javax.swing.ButtonGroup();
        BackgroundCrearEquipos2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CrearEquiposFinal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LabDisponibles = new javax.swing.JTable();

        BackgroundCrearEquipos2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear Equipo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder crear el equipo: ");

        CrearEquiposFinal.setBackground(new java.awt.Color(21, 101, 192));
        CrearEquiposFinal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearEquiposFinal.setForeground(new java.awt.Color(255, 255, 255));
        CrearEquiposFinal.setText("Crear");
        CrearEquiposFinal.setBorder(null);
        CrearEquiposFinal.setBorderPainted(false);
        CrearEquiposFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearEquiposFinal.setIconTextGap(13);
        CrearEquiposFinal.setInheritsPopupMenu(true);
        CrearEquiposFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEquiposFinalActionPerformed(evt);
            }
        });

        jLabel3.setText("Por ultimo seleccion el Laboratorio a asignar: ");

        LabDisponibles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(LabDisponibles);

        javax.swing.GroupLayout BackgroundCrearEquipos2Layout = new javax.swing.GroupLayout(BackgroundCrearEquipos2);
        BackgroundCrearEquipos2.setLayout(BackgroundCrearEquipos2Layout);
        BackgroundCrearEquipos2Layout.setHorizontalGroup(
            BackgroundCrearEquipos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearEquipos2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BackgroundCrearEquipos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearEquipos2Layout.createSequentialGroup()
                        .addGroup(BackgroundCrearEquipos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearEquipos2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(201, 201, 201))
                            .addGroup(BackgroundCrearEquipos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(663, 663, 663))
                    .addGroup(BackgroundCrearEquipos2Layout.createSequentialGroup()
                        .addGroup(BackgroundCrearEquipos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundCrearEquipos2Layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addComponent(CrearEquiposFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BackgroundCrearEquipos2Layout.setVerticalGroup(
            BackgroundCrearEquipos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearEquipos2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(CrearEquiposFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BackgroundCrearEquipos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearEquipos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEquiposFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEquiposFinalActionPerformed
        
    }//GEN-LAST:event_CrearEquiposFinalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearEquipos2;
    private javax.swing.JButton CrearEquiposFinal;
    private javax.swing.ButtonGroup EncendidoNoche;
    private javax.swing.JTable LabDisponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
