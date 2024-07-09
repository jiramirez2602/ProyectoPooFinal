/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import controller.ListaDeEquipos;
import controller.ListaLaboratorios;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import model.Usuario;

/**
 *
 * @author derno
 */
public class CrearEquipos extends javax.swing.JPanel {
    
    private Usuario userActual;
    private ListaLaboratorios listalaboratorios;
    private ListaDeEquipos listaequipos;
    
    public CrearEquipos(Usuario user,ListaLaboratorios listaLab,ListaDeEquipos equipos ) {
        initComponents();
        this.userActual=user;
        this.listalaboratorios=listaLab;
        this.listaequipos=equipos;
    }
    
      private void MostrarJpanel(JPanel p){
        p.setSize(1038, 666);   
        p.setLocation(0,0);
        BackgroundCrearEquipo1.removeAll();
        BackgroundCrearEquipo1.add(p,BorderLayout.CENTER);
        BackgroundCrearEquipo1.revalidate();
        BackgroundCrearEquipo1.repaint();
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
        Procesable = new javax.swing.ButtonGroup();
        BackgroundCrearEquipo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameLbl1 = new javax.swing.JLabel();
        DescripcionTXT = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CrearEquipoSiguiente = new javax.swing.JButton();
        nameLbl3 = new javax.swing.JLabel();
        MarcaTXT = new javax.swing.JTextField();
        nameLbl6 = new javax.swing.JLabel();
        PresentacionTXT = new javax.swing.JTextField();
        nameLbl4 = new javax.swing.JLabel();
        VoltajeTXT = new javax.swing.JTextField();
        nameLbl5 = new javax.swing.JLabel();
        ModeloTXT = new javax.swing.JTextField();
        nameLbl7 = new javax.swing.JLabel();
        NumSerialTXT = new javax.swing.JTextField();
        nameLbl8 = new javax.swing.JLabel();
        NumActivoTXT = new javax.swing.JTextField();
        nameLbl9 = new javax.swing.JLabel();
        nameLbl10 = new javax.swing.JLabel();
        MaterialRequeridoTXT = new javax.swing.JTextField();
        nameLbl11 = new javax.swing.JLabel();
        AñodeCompraTXT = new javax.swing.JTextField();
        ProcesableSIRadioBtton = new javax.swing.JCheckBox();
        ProcesableNoRadioBtton = new javax.swing.JCheckBox();

        BackgroundCrearEquipo1.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundCrearEquipo1.setMinimumSize(new java.awt.Dimension(1038, 666));
        BackgroundCrearEquipo1.setPreferredSize(new java.awt.Dimension(1038, 666));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear Equipo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder crear el equipo: ");

        nameLbl1.setText("Ingrese la descripcion:");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        CrearEquipoSiguiente.setBackground(new java.awt.Color(21, 101, 192));
        CrearEquipoSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearEquipoSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        CrearEquipoSiguiente.setText("Siguiente");
        CrearEquipoSiguiente.setBorder(null);
        CrearEquipoSiguiente.setBorderPainted(false);
        CrearEquipoSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearEquipoSiguiente.setIconTextGap(13);
        CrearEquipoSiguiente.setInheritsPopupMenu(true);
        CrearEquipoSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEquipoSiguienteActionPerformed(evt);
            }
        });

        nameLbl3.setText("Ingrese la marca: ");

        nameLbl6.setText("Ingrese la presentacion:");

        nameLbl4.setText("Ingrese el voltaje:");

        nameLbl5.setText("Ingrese el modelo: ");

        nameLbl7.setText("Ingrese el numero de serial: ");

        nameLbl8.setText("Ingrese numero de activo:");

        nameLbl9.setText("Ingrese el procesable:");

        nameLbl10.setText("Ingrese el material requerido:");

        nameLbl11.setText("Ingrese el año de compra:");

        Procesable.add(ProcesableSIRadioBtton);
        ProcesableSIRadioBtton.setText("Si");

        Procesable.add(ProcesableNoRadioBtton);
        ProcesableNoRadioBtton.setText("No");

        javax.swing.GroupLayout BackgroundCrearEquipo1Layout = new javax.swing.GroupLayout(BackgroundCrearEquipo1);
        BackgroundCrearEquipo1.setLayout(BackgroundCrearEquipo1Layout);
        BackgroundCrearEquipo1Layout.setHorizontalGroup(
            BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addGap(764, 764, 764))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(460, 460, 460))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41))
                            .addComponent(DescripcionTXT)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(255, 255, 255))
                            .addComponent(MarcaTXT)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(255, 255, 255))
                            .addComponent(ModeloTXT)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(224, 224, 224))
                            .addComponent(NumSerialTXT)
                            .addComponent(nameLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumActivoTXT))
                        .addGap(54, 54, 54)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(138, 138, 138))
                            .addComponent(PresentacionTXT)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(307, 307, 307))
                            .addComponent(VoltajeTXT)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(307, 307, 307))
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(ProcesableSIRadioBtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(ProcesableNoRadioBtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(341, 341, 341))
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(187, 187, 187))
                            .addComponent(MaterialRequeridoTXT)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(271, 271, 271))
                            .addComponent(AñodeCompraTXT)
                            .addComponent(CrearEquipoSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(83, 83, 83))
        );
        BackgroundCrearEquipo1Layout.setVerticalGroup(
            BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(nameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DescripcionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MarcaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ModeloTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nameLbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NumSerialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nameLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NumActivoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(nameLbl6)
                        .addGap(18, 18, 18)
                        .addComponent(PresentacionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(nameLbl4)
                        .addGap(18, 18, 18)
                        .addComponent(VoltajeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nameLbl9)
                        .addGap(12, 12, 12)
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProcesableSIRadioBtton)
                            .addComponent(ProcesableNoRadioBtton))
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl10)
                        .addGap(6, 6, 6)
                        .addComponent(MaterialRequeridoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(nameLbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(AñodeCompraTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CrearEquipoSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEquipoSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEquipoSiguienteActionPerformed
        String descripcion = DescripcionTXT.getText();
        String marca = MarcaTXT.getText();
        String modelo = ModeloTXT.getText();
        String numeroSerial = NumSerialTXT.getText();
        String numeroActivo = NumActivoTXT.getText();
        String presentacion = PresentacionTXT.getText();
        String voltaje = VoltajeTXT.getText();
        String procesable = ProcesableSIRadioBtton.isSelected() ? "SI" : "NO";
        String materialRequerido = MaterialRequeridoTXT.getText();
        String añoDeCompra = AñodeCompraTXT.getText();
        
        MostrarJpanel(new CrearEquipos2(userActual, listalaboratorios, listaequipos, descripcion, marca, modelo, numeroSerial, numeroActivo, presentacion, voltaje, procesable, materialRequerido, añoDeCompra));
    }//GEN-LAST:event_CrearEquipoSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AñodeCompraTXT;
    private javax.swing.JPanel BackgroundCrearEquipo1;
    private javax.swing.JButton CrearEquipoSiguiente;
    private javax.swing.JTextField DescripcionTXT;
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JTextField MarcaTXT;
    private javax.swing.JTextField MaterialRequeridoTXT;
    private javax.swing.JTextField ModeloTXT;
    private javax.swing.JTextField NumActivoTXT;
    private javax.swing.JTextField NumSerialTXT;
    private javax.swing.JTextField PresentacionTXT;
    private javax.swing.ButtonGroup Procesable;
    private javax.swing.JCheckBox ProcesableNoRadioBtton;
    private javax.swing.JCheckBox ProcesableSIRadioBtton;
    private javax.swing.ButtonGroup Rol;
    private javax.swing.JTextField VoltajeTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl10;
    private javax.swing.JLabel nameLbl11;
    private javax.swing.JLabel nameLbl3;
    private javax.swing.JLabel nameLbl4;
    private javax.swing.JLabel nameLbl5;
    private javax.swing.JLabel nameLbl6;
    private javax.swing.JLabel nameLbl7;
    private javax.swing.JLabel nameLbl8;
    private javax.swing.JLabel nameLbl9;
    // End of variables declaration//GEN-END:variables
}
