/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import controller.ListaDeInsumos;
import controller.ListaDeUsuarios;
import controller.ListaLaboratorios;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Insumo;
import model.Laboratorio;
import model.Usuario;

/**
 *
 * @author derno
 */
public class ModificarInsumos2 extends javax.swing.JPanel {
    
    private Usuario userActual;
    private ListaLaboratorios listalaboratorios;
    private ListaDeInsumos listaInsumos;
    private Insumo insumoActual;
    private String nombre;
    private String categoria;
    private String clasificacion;
    private String marca;
    private String modelo;
    private String presentacion;
    private String descripcion;
    private String unidad;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private DefaultTableModel tableModelLab;
    
    
    public ModificarInsumos2(Usuario user, ListaLaboratorios listaLab, ListaDeInsumos insumos, Insumo insumo, 
                             String nombre, String categoria, String clasificacion, String marca, 
                             String modelo, String presentacion, String descripcion, String unidad) {
        this.userActual = user;
        this.listalaboratorios = listaLab;
        this.listaInsumos = insumos;
        this.insumoActual = insumo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.clasificacion = clasificacion;
        this.marca = marca;
        this.modelo = modelo;
        this.presentacion = presentacion;
        this.descripcion = descripcion;
        this.unidad = unidad;
        initComponents();
        cargarDatosInsumo();
        initLabDisponible();
        inicializarTablaInsumos();
        cargarLabActual();
    }
    
     private void cargarDatosInsumo() {
         if (insumoActual != null) {
        ProveedorinsumoTxt.setText(insumoActual.getProveedor());
        UltimaCompraInsumoTxt.setText(dateFormat.format(insumoActual.getUltimaCompra()));
        PrecioEstimadoInsumoTxt.setText(String.valueOf(insumoActual.getPrecioEstimado()));
        InvenatrioInsumoTxt.setText(String.valueOf(insumoActual.getInventarioExistente()));
        ObservacionesInsumoTxt.setText(insumoActual.getObservaciones());
        }
    }
    
    private void inicializarTablaInsumos() {
        String[] columnas = {"Nombre Laboratorio"};
        tableModelLab = new DefaultTableModel(columnas, 0);
        LabActual.setModel(tableModelLab);
    }
    
    private void cargarLabActual() {
        tableModelLab.setRowCount(0);

        if (insumoActual != null) {
            String idLaboratorio = insumoActual.getLaboratorio();
            Laboratorio laboratorioActual = listalaboratorios.listarLaboratorio(idLaboratorio);

            if (laboratorioActual != null) {
                Object[] fila = {laboratorioActual.getNombreLaboratorio()};
                tableModelLab.addRow(fila);
            } else {
                System.out.println("Laboratorio no encontrado");
            }
        }
    }       
    
    private void initLabDisponible() {
        ArrayList<Laboratorio> laboratorios = listalaboratorios.getListaLaboratorios();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (Laboratorio lab : laboratorios) {
            model.addElement(lab.getNombreLaboratorio());
        }

        LabDisponible.setModel(model);
    }

    private void LabDisponibleActionPerformed(java.awt.event.ActionEvent evt) {
        String nombreLaboratorioSeleccionado = (String) LabDisponible.getSelectedItem();
        String idLaboratorio = listalaboratorios.listarLaboratorioPorNombre(nombreLaboratorioSeleccionado);
    }
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundCrearUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameLbl1 = new javax.swing.JLabel();
        UltimaCompraInsumoTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ModificarInsumoFinal = new javax.swing.JButton();
        nameLbl3 = new javax.swing.JLabel();
        InvenatrioInsumoTxt = new javax.swing.JTextField();
        nameLbl6 = new javax.swing.JLabel();
        ObservacionesInsumoTxt = new javax.swing.JTextField();
        nameLbl2 = new javax.swing.JLabel();
        PrecioEstimadoInsumoTxt = new javax.swing.JTextField();
        nameLbl4 = new javax.swing.JLabel();
        ProveedorinsumoTxt = new javax.swing.JTextField();
        nameLbl11 = new javax.swing.JLabel();
        LabDisponible = new javax.swing.JComboBox<>();
        nameLbl12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LabActual = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear Insumo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder crear el insumo: ");

        nameLbl1.setText("Ultima compra:");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        ModificarInsumoFinal.setBackground(new java.awt.Color(21, 101, 192));
        ModificarInsumoFinal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ModificarInsumoFinal.setForeground(new java.awt.Color(255, 255, 255));
        ModificarInsumoFinal.setText("Modificar");
        ModificarInsumoFinal.setBorder(null);
        ModificarInsumoFinal.setBorderPainted(false);
        ModificarInsumoFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarInsumoFinal.setIconTextGap(13);
        ModificarInsumoFinal.setInheritsPopupMenu(true);
        ModificarInsumoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarInsumoFinalActionPerformed(evt);
            }
        });

        nameLbl3.setText("Inventario existente:");

        nameLbl6.setText("Observacion:");

        nameLbl2.setText("Precio estimado:");

        nameLbl4.setText("Proveedor:");

        nameLbl11.setText("Escoja el laboratorio a asignar:");

        LabDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nameLbl12.setText("Laboratorio Actual");

        LabActual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(LabActual);

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
                        .addGap(702, 702, 702))
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(InvenatrioInsumoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameLbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UltimaCompraInsumoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                .addComponent(nameLbl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PrecioEstimadoInsumoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                .addComponent(nameLbl4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ProveedorinsumoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(nameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(548, 548, 548))
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ObservacionesInsumoTxt)
                                        .addComponent(ModificarInsumoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                                        .addComponent(nameLbl12)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(LabDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        BackgroundCrearUsuarioLayout.setVerticalGroup(
            BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addGroup(BackgroundCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                                .addComponent(nameLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ObservacionesInsumoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameLbl12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameLbl11)
                                .addGap(18, 18, 18)
                                .addComponent(LabDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(ModificarInsumoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(118, 118, 118))
                    .addGroup(BackgroundCrearUsuarioLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(nameLbl4)
                        .addGap(18, 18, 18)
                        .addComponent(ProveedorinsumoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl1)
                        .addGap(18, 18, 18)
                        .addComponent(UltimaCompraInsumoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(nameLbl2)
                        .addGap(18, 18, 18)
                        .addComponent(PrecioEstimadoInsumoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InvenatrioInsumoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(BackgroundCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1082, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarInsumoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarInsumoFinalActionPerformed
         String proveedor = ProveedorinsumoTxt.getText();
        String inventario = InvenatrioInsumoTxt.getText();
        String observaciones = ObservacionesInsumoTxt.getText();
        String precioEstimado = PrecioEstimadoInsumoTxt.getText();
        String ultimaCompra = UltimaCompraInsumoTxt.getText();
        String nombreLaboratorioSeleccionado = (String) LabDisponible.getSelectedItem();
        String idLaboratorio = listalaboratorios.listarLaboratorioPorNombre(nombreLaboratorioSeleccionado);
        boolean exito = listaInsumos.modificarInsumo(userActual, insumoActual.getId(), descripcion, marca, modelo, presentacion, clasificacion, categoria, ultimaCompra, String.valueOf(precioEstimado), unidad, proveedor, nombre, inventario, observaciones, idLaboratorio);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Insumo modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar el insumo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ModificarInsumoFinalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearUsuario;
    private javax.swing.JTextField InvenatrioInsumoTxt;
    private javax.swing.JTable LabActual;
    private javax.swing.JComboBox<String> LabDisponible;
    private javax.swing.JButton ModificarInsumoFinal;
    private javax.swing.JTextField ObservacionesInsumoTxt;
    private javax.swing.JTextField PrecioEstimadoInsumoTxt;
    private javax.swing.JTextField ProveedorinsumoTxt;
    private javax.swing.JTextField UltimaCompraInsumoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl11;
    private javax.swing.JLabel nameLbl12;
    private javax.swing.JLabel nameLbl2;
    private javax.swing.JLabel nameLbl3;
    private javax.swing.JLabel nameLbl4;
    private javax.swing.JLabel nameLbl6;
    // End of variables declaration//GEN-END:variables
}
