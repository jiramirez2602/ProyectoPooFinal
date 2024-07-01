/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import controller.ListaDeEquipos;
import controller.ListaDeSustanciasQuimicas;
import controller.ListaLaboratorios;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import model.Usuario;

/**
 *
 * @author derno
 */
public class CrearSustanciasQuimicas extends javax.swing.JPanel {
    
    private Usuario userActual;
    private ListaLaboratorios listalaboratorios;
    private ListaDeSustanciasQuimicas listadesustancias;
    
    public CrearSustanciasQuimicas(Usuario user,ListaLaboratorios listaLab,ListaDeSustanciasQuimicas sustancias ) {
        initComponents();
        this.userActual=user;
        this.listalaboratorios=listaLab;
        this.listadesustancias = sustancias;
       
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

        MSD = new javax.swing.ButtonGroup();
        BackgroundCrearEquipo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameLbl1 = new javax.swing.JLabel();
        NombreSustanciaTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CrearSustanciaSiguiente = new javax.swing.JButton();
        nameLbl3 = new javax.swing.JLabel();
        NombreComercialTxt = new javax.swing.JTextField();
        nameLbl6 = new javax.swing.JLabel();
        MetodoSustanciaTXt = new javax.swing.JTextField();
        nameLbl4 = new javax.swing.JLabel();
        PermisosSutanciasTxt = new javax.swing.JTextField();
        nameLbl5 = new javax.swing.JLabel();
        PresentacionSustanciaTxt = new javax.swing.JTextField();
        nameLbl7 = new javax.swing.JLabel();
        ProveedorSustanciaTxt = new javax.swing.JTextField();
        nameLbl8 = new javax.swing.JLabel();
        ConcentracionTxt = new javax.swing.JTextField();
        nameLbl10 = new javax.swing.JLabel();
        NumIdentificacionTxt = new javax.swing.JTextField();
        nameLbl11 = new javax.swing.JLabel();
        UnidadSustanciaTxt = new javax.swing.JTextField();
        SiMSD = new javax.swing.JRadioButton();
        NoMSD = new javax.swing.JRadioButton();
        nameLbl12 = new javax.swing.JLabel();
        nameLbl9 = new javax.swing.JLabel();
        FormulaQuimicaTxt = new javax.swing.JTextField();

        BackgroundCrearEquipo1.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundCrearEquipo1.setMinimumSize(new java.awt.Dimension(1038, 666));
        BackgroundCrearEquipo1.setPreferredSize(new java.awt.Dimension(1038, 666));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear Sustancia Quimica");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, ingrese los datos para poder crear la sustancia: ");

        nameLbl1.setText("Ingrese el nombre del productos:");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        CrearSustanciaSiguiente.setBackground(new java.awt.Color(21, 101, 192));
        CrearSustanciaSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CrearSustanciaSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        CrearSustanciaSiguiente.setText("Siguiente");
        CrearSustanciaSiguiente.setBorder(null);
        CrearSustanciaSiguiente.setBorderPainted(false);
        CrearSustanciaSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearSustanciaSiguiente.setIconTextGap(13);
        CrearSustanciaSiguiente.setInheritsPopupMenu(true);
        CrearSustanciaSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearSustanciaSiguienteActionPerformed(evt);
            }
        });

        nameLbl3.setText("Ingrese el nombre comercial:");

        nameLbl6.setText("Ingrese el metodo de control:");

        nameLbl4.setText("Ingrese los permisos:");

        nameLbl5.setText("Ingrese la presentacion:");

        nameLbl7.setText("Proveedor:");

        nameLbl8.setText("Concetracion:");

        nameLbl10.setText("Ingrese el numero de identificacion:");

        nameLbl11.setText("Ingrese la unidad:");

        MSD.add(SiMSD);
        SiMSD.setText("Si");

        MSD.add(NoMSD);
        NoMSD.setText("No");

        nameLbl12.setText("Posee MSD");

        nameLbl9.setText("Ingrese la formula quimica:");

        javax.swing.GroupLayout BackgroundCrearEquipo1Layout = new javax.swing.GroupLayout(BackgroundCrearEquipo1);
        BackgroundCrearEquipo1.setLayout(BackgroundCrearEquipo1Layout);
        BackgroundCrearEquipo1Layout.setHorizontalGroup(
            BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addGap(764, 764, 764))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(460, 460, 460))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41))
                            .addComponent(NombreSustanciaTxt)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(255, 255, 255))
                            .addComponent(NombreComercialTxt)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(255, 255, 255))
                            .addComponent(PresentacionSustanciaTxt)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(224, 224, 224))
                            .addComponent(ProveedorSustanciaTxt)
                            .addComponent(nameLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConcentracionTxt)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(255, 255, 255))
                            .addComponent(FormulaQuimicaTxt))
                        .addGap(54, 54, 54)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(138, 138, 138))
                            .addComponent(MetodoSustanciaTXt)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(307, 307, 307))
                            .addComponent(PermisosSutanciasTxt)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(187, 187, 187))
                            .addComponent(NumIdentificacionTxt)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(271, 271, 271))
                            .addComponent(UnidadSustanciaTxt)
                            .addComponent(CrearSustanciaSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(SiMSD)
                                .addGap(30, 30, 30)
                                .addComponent(NoMSD)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nameLbl12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MetodoSustanciaTXt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(nameLbl4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PermisosSutanciasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameLbl10)
                                .addGap(6, 6, 6)
                                .addComponent(NumIdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(nameLbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(UnidadSustanciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(nameLbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SiMSD)
                                    .addComponent(NoMSD))))
                        .addGap(19, 19, 19)
                        .addComponent(CrearSustanciaSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(nameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NombreSustanciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NombreComercialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PresentacionSustanciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FormulaQuimicaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameLbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProveedorSustanciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nameLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConcentracionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearSustanciaSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearSustanciaSiguienteActionPerformed
        String nombreSustancia = NombreSustanciaTxt.getText();
        String nombreComercial = NombreComercialTxt.getText();
        String concentracion = ConcentracionTxt.getText();
        String presentacion = PresentacionSustanciaTxt.getText();
        String formula = FormulaQuimicaTxt.getText();
        boolean poseeMSD = SiMSD.isSelected();
        String numeroIdentificacion = NumIdentificacionTxt.getText();
        String metodo = MetodoSustanciaTXt.getText();
        String permisos = PermisosSutanciasTxt.getText();
        String unidad = UnidadSustanciaTxt.getText();
        String proveedor = ProveedorSustanciaTxt.getText();

        MostrarJpanel(new CrearSustanciasQuimicas2(userActual, listalaboratorios, listadesustancias, nombreSustancia, nombreComercial, concentracion,formula, presentacion, poseeMSD, numeroIdentificacion, metodo, permisos, unidad, proveedor));
    }//GEN-LAST:event_CrearSustanciaSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearEquipo1;
    private javax.swing.JTextField ConcentracionTxt;
    private javax.swing.JButton CrearSustanciaSiguiente;
    private javax.swing.JTextField FormulaQuimicaTxt;
    private javax.swing.ButtonGroup MSD;
    private javax.swing.JTextField MetodoSustanciaTXt;
    private javax.swing.JRadioButton NoMSD;
    private javax.swing.JTextField NombreComercialTxt;
    private javax.swing.JTextField NombreSustanciaTxt;
    private javax.swing.JTextField NumIdentificacionTxt;
    private javax.swing.JTextField PermisosSutanciasTxt;
    private javax.swing.JTextField PresentacionSustanciaTxt;
    private javax.swing.JTextField ProveedorSustanciaTxt;
    private javax.swing.JRadioButton SiMSD;
    private javax.swing.JTextField UnidadSustanciaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JLabel nameLbl10;
    private javax.swing.JLabel nameLbl11;
    private javax.swing.JLabel nameLbl12;
    private javax.swing.JLabel nameLbl3;
    private javax.swing.JLabel nameLbl4;
    private javax.swing.JLabel nameLbl5;
    private javax.swing.JLabel nameLbl6;
    private javax.swing.JLabel nameLbl7;
    private javax.swing.JLabel nameLbl8;
    private javax.swing.JLabel nameLbl9;
    // End of variables declaration//GEN-END:variables
}
