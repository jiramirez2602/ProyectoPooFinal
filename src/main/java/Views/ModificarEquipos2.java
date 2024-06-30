package Views;

import controller.ListaDeEquipos;
import controller.ListaLaboratorios;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Equipo;
import model.Laboratorio;
import model.Usuario;

/**
 *
 * @author derno
 */
public class ModificarEquipos2 extends javax.swing.JPanel {
    
    private Usuario userActual;
    private ListaLaboratorios listalaboratorios;
    private ListaDeEquipos listaequipos;
    private Equipo equipoActual;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private String descripcion;
    private String marca;
    private String modelo;
    private String numeroSerial;
    private String numeroActivo;
    private String presentacion;
    private String voltaje;
    private String procesable;
    private String materialRequerido;
    private String añoDeCompra;
    
    public ModificarEquipos2(Usuario user, ListaLaboratorios listaLab, ListaDeEquipos equipos, Equipo equipo, 
                     String descripcion, String marca, String modelo, String numeroSerial, 
                     String numeroActivo, String presentacion, String voltaje, 
                     String procesable, String materialRequerido, String añoDeCompra) {
        initComponents();
        this.userActual = user;
        this.listalaboratorios = listaLab;
        this.listaequipos = equipos;
        this.equipoActual = equipo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerial = numeroSerial;
        this.numeroActivo = numeroActivo;
        this.presentacion = presentacion;
        this.voltaje = voltaje;
        this.procesable = procesable;
        this.materialRequerido = materialRequerido;
        this.añoDeCompra = añoDeCompra;
        cargarDatosEquipo();
        initLabDisponible();
        cargarLabActual();
    }
    
    private void cargarDatosEquipo() {
        if (equipoActual != null) {
            AplicacionTXT.setText(equipoActual.getAplicacion());
            InventarioExistenteTXT.setText(String.valueOf(equipoActual.getInventarioExistente()));
            NombreProductoTXT.setText(equipoActual.getNombreProducto());
            ObservacionesTXT.setText(equipoActual.getObservaciones());
            ProvedorServicioTXT.setText(equipoActual.getProovedoresDeServicios());
            ProximaCalibracionTXT.setText(dateFormat.format(equipoActual.getProximaCalibracion()));
            ProximoMantenimientoTXT.setText(dateFormat.format(equipoActual.getProximoMantenimiento()));
            UltimaCalibracionTXT.setText(dateFormat.format(equipoActual.getUltimaCalibracion()));
            UltimoMantenimientoTXT.setText(dateFormat.format(equipoActual.getUltimoMantenimiento()));
            if ("Sí".equals(equipoActual.getEncendidoDenoche())) {
                EncendidoNocheSi.setSelected(true);
            } else {
                EncendidoNocheNo.setSelected(true);
            }
        }
    }
    
    private void initLabDisponible() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        LabDisponible.setModel(model);
        ArrayList<Laboratorio> laboratorios = listalaboratorios.getListaLaboratorios();
        if (laboratorios != null && !laboratorios.isEmpty()) {
            for (Laboratorio lab : laboratorios) {
                model.addElement(lab.getNombreLaboratorio());
            }
        } else {
            System.out.println("No hay laboratorios disponibles.");
        }
    }

    private void cargarLabActual() {
        if (equipoActual != null) {
            String idLaboratorio = equipoActual.getLaboratorio();
            Laboratorio laboratorioActual = listalaboratorios.listarLaboratorio(idLaboratorio);
            if (laboratorioActual != null) {
                LabActual.setSelectedItem(laboratorioActual.getNombreLaboratorio());
            } else {
                System.out.println("Laboratorio no encontrado");
            }
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
        BackgroundCrearEquipo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameLbl1 = new javax.swing.JLabel();
        AplicacionTXT = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CrearEquipoSiguiente = new javax.swing.JButton();
        nameLbl3 = new javax.swing.JLabel();
        UltimoMantenimientoTXT = new javax.swing.JTextField();
        nameLbl6 = new javax.swing.JLabel();
        ProvedorServicioTXT = new javax.swing.JTextField();
        nameLbl5 = new javax.swing.JLabel();
        ProximoMantenimientoTXT = new javax.swing.JTextField();
        nameLbl7 = new javax.swing.JLabel();
        UltimaCalibracionTXT = new javax.swing.JTextField();
        nameLbl8 = new javax.swing.JLabel();
        ProximaCalibracionTXT = new javax.swing.JTextField();
        nameLbl10 = new javax.swing.JLabel();
        InventarioExistenteTXT = new javax.swing.JTextField();
        nameLbl11 = new javax.swing.JLabel();
        ObservacionesTXT = new javax.swing.JTextField();
        nameLbl12 = new javax.swing.JLabel();
        EncendidoNocheSi = new javax.swing.JRadioButton();
        EncendidoNocheNo = new javax.swing.JRadioButton();
        nameLbl13 = new javax.swing.JLabel();
        LabActual = new javax.swing.JComboBox<>();
        nameLbl9 = new javax.swing.JLabel();
        NombreProductoTXT = new javax.swing.JTextField();
        nameLbl14 = new javax.swing.JLabel();
        LabDisponible = new javax.swing.JComboBox<>();

        BackgroundCrearEquipo1.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundCrearEquipo1.setMinimumSize(new java.awt.Dimension(1038, 666));
        BackgroundCrearEquipo1.setPreferredSize(new java.awt.Dimension(1038, 666));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Equipo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder modificar el equipo: ");

        nameLbl1.setText("Ingrese la aplicacion:");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        CrearEquipoSiguiente.setBackground(new java.awt.Color(21, 101, 192));
        CrearEquipoSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearEquipoSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        CrearEquipoSiguiente.setText("Modificar");
        CrearEquipoSiguiente.setBorder(null);
        CrearEquipoSiguiente.setBorderPainted(false);
        CrearEquipoSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CrearEquipoSiguiente.setIconTextGap(13);
        CrearEquipoSiguiente.setInheritsPopupMenu(true);
        CrearEquipoSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEquipoSiguienteActionPerformed(evt);
            }
        });

        nameLbl3.setText("Ultimo mantenimiento:");

        nameLbl6.setText("Ingrese el provedor de servicio:");

        nameLbl5.setText("Ingrese el proximo mantenimiento:");

        nameLbl7.setText("Ingrese la ultima calibracion:");

        nameLbl8.setText("Ingrese la proxima calibracion:");

        nameLbl10.setText("Inventario existente:");

        nameLbl11.setText("Ingrese las observaciones: ");

        nameLbl12.setText("Encendido de noche:");

        EncendidoNoche.add(EncendidoNocheSi);
        EncendidoNocheSi.setText("Si");

        EncendidoNoche.add(EncendidoNocheNo);
        EncendidoNocheNo.setText("No");

        nameLbl13.setText("Laboratorio Actual");

        LabActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nameLbl9.setText("Nombre del producto:");

        nameLbl14.setText("Laboratorios Disponibles:");

        LabDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout BackgroundCrearEquipo1Layout = new javax.swing.GroupLayout(BackgroundCrearEquipo1);
        BackgroundCrearEquipo1.setLayout(BackgroundCrearEquipo1Layout);
        BackgroundCrearEquipo1Layout.setHorizontalGroup(
            BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AplicacionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UltimoMantenimientoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl5)
                    .addComponent(ProximoMantenimientoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UltimaCalibracionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProximaCalibracionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProvedorServicioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(EncendidoNocheSi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(EncendidoNocheNo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameLbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreProductoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InventarioExistenteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ObservacionesTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(nameLbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(nameLbl14))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(LabActual, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(LabDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CrearEquipoSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        BackgroundCrearEquipo1Layout.setVerticalGroup(
            BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(nameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(AplicacionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(UltimoMantenimientoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(nameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(ProximoMantenimientoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(nameLbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(UltimaCalibracionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(nameLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(ProximaCalibracionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(nameLbl6)
                        .addGap(24, 24, 24)
                        .addComponent(ProvedorServicioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(nameLbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EncendidoNocheSi)
                            .addComponent(EncendidoNocheNo))
                        .addGap(19, 19, 19)
                        .addComponent(nameLbl9)
                        .addGap(4, 4, 4)
                        .addComponent(NombreProductoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl10)
                        .addGap(4, 4, 4)
                        .addComponent(InventarioExistenteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(nameLbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(ObservacionesTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl13)
                            .addComponent(nameLbl14))
                        .addGap(14, 14, 14)
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(CrearEquipoSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEquipoSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEquipoSiguienteActionPerformed
        String aplicacion = AplicacionTXT.getText();
        String ultimoMantenimiento = UltimoMantenimientoTXT.getText();
        String proximoMantenimiento = ProximoMantenimientoTXT.getText();
        String ultimaCalibracion = UltimaCalibracionTXT.getText();
        String proximaCalibracion = ProximaCalibracionTXT.getText();
        String proovedoresDeServicios = ProvedorServicioTXT.getText();
        String encendidoDenoche = EncendidoNocheSi.isSelected() ? "SI" : "NO";
        String nombreProducto = NombreProductoTXT.getText();
        String inventarioExistente = InventarioExistenteTXT.getText();
        String observaciones = ObservacionesTXT.getText();
        String nombreLaboratorioSeleccionado = (String) LabDisponible.getSelectedItem();
        String idLaboratorio = listalaboratorios.listarLaboratorioPorNombre(nombreLaboratorioSeleccionado);
        boolean creado = listaequipos.crearProductoEquipo(userActual, descripcion, marca, modelo, numeroSerial, numeroActivo,
                presentacion, voltaje, procesable, materialRequerido, añoDeCompra, aplicacion, ultimoMantenimiento,
                proximoMantenimiento, ultimaCalibracion, proximaCalibracion, proovedoresDeServicios, encendidoDenoche,
                nombreProducto, inventarioExistente, observaciones, idLaboratorio);

        if (creado) {
            JOptionPane.showMessageDialog(this, "Equipo creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(this, "Error al crear el equipo. Verifique los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CrearEquipoSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AplicacionTXT;
    private javax.swing.JPanel BackgroundCrearEquipo1;
    private javax.swing.JButton CrearEquipoSiguiente;
    private javax.swing.ButtonGroup EncendidoNoche;
    private javax.swing.JRadioButton EncendidoNocheNo;
    private javax.swing.JRadioButton EncendidoNocheSi;
    private javax.swing.JTextField InventarioExistenteTXT;
    private javax.swing.JComboBox<String> LabActual;
    private javax.swing.JComboBox<String> LabDisponible;
    private javax.swing.JTextField NombreProductoTXT;
    private javax.swing.JTextField ObservacionesTXT;
    private javax.swing.JTextField ProvedorServicioTXT;
    private javax.swing.JTextField ProximaCalibracionTXT;
    private javax.swing.JTextField ProximoMantenimientoTXT;
    private javax.swing.JTextField UltimaCalibracionTXT;
    private javax.swing.JTextField UltimoMantenimientoTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl10;
    private javax.swing.JLabel nameLbl11;
    private javax.swing.JLabel nameLbl12;
    private javax.swing.JLabel nameLbl13;
    private javax.swing.JLabel nameLbl14;
    private javax.swing.JLabel nameLbl3;
    private javax.swing.JLabel nameLbl5;
    private javax.swing.JLabel nameLbl6;
    private javax.swing.JLabel nameLbl7;
    private javax.swing.JLabel nameLbl8;
    private javax.swing.JLabel nameLbl9;
    // End of variables declaration//GEN-END:variables
}