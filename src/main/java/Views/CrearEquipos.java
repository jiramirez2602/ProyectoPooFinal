/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author derno
 */
public class CrearEquipos extends javax.swing.JPanel {
    
    
    public CrearEquipos() {
        initComponents();
    }
    
      private void MostrarJpanel(JPanel p){
        p.setSize(760,478);   
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
        ProcesableTXT = new javax.swing.JTextField();
        nameLbl10 = new javax.swing.JLabel();
        MaterialRequeridoTXT = new javax.swing.JTextField();
        nameLbl11 = new javax.swing.JLabel();
        MaterialRequeridoTXT1 = new javax.swing.JTextField();

        BackgroundCrearEquipo1.setBackground(new java.awt.Color(255, 255, 255));

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
        CrearEquipoSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        javax.swing.GroupLayout BackgroundCrearEquipo1Layout = new javax.swing.GroupLayout(BackgroundCrearEquipo1);
        BackgroundCrearEquipo1.setLayout(BackgroundCrearEquipo1Layout);
        BackgroundCrearEquipo1Layout.setHorizontalGroup(
            BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1004, 1004, 1004))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(95, 95, 95))
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(MarcaTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                        .addComponent(DescripcionTXT)
                                        .addComponent(nameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ModeloTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                        .addComponent(nameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NumSerialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NumActivoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                        .addComponent(nameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(185, 185, 185))
                                    .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PresentacionTXT)
                                        .addComponent(VoltajeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(193, 193, 193))
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CrearEquipoSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProcesableTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MaterialRequeridoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MaterialRequeridoTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        BackgroundCrearEquipo1Layout.setVerticalGroup(
            BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addGroup(BackgroundCrearEquipo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                                .addComponent(nameLbl1)
                                .addGap(18, 18, 18)
                                .addComponent(DescripcionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameLbl3)
                                .addGap(18, 18, 18)
                                .addComponent(MarcaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameLbl5)
                                .addGap(18, 18, 18)
                                .addComponent(ModeloTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameLbl7)
                                .addGap(18, 18, 18)
                                .addComponent(NumSerialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameLbl8)
                                .addGap(18, 18, 18)
                                .addComponent(NumActivoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(BackgroundCrearEquipo1Layout.createSequentialGroup()
                        .addComponent(nameLbl6)
                        .addGap(18, 18, 18)
                        .addComponent(PresentacionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl4)
                        .addGap(18, 18, 18)
                        .addComponent(VoltajeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameLbl9)
                        .addGap(18, 18, 18)
                        .addComponent(ProcesableTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLbl10)
                        .addGap(18, 18, 18)
                        .addComponent(MaterialRequeridoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameLbl11)
                        .addGap(18, 18, 18)
                        .addComponent(MaterialRequeridoTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CrearEquipoSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BackgroundCrearEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEquipoSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEquipoSiguienteActionPerformed
        MostrarJpanel(new CrearEquipos2());
    }//GEN-LAST:event_CrearEquipoSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearEquipo1;
    private javax.swing.JButton CrearEquipoSiguiente;
    private javax.swing.JTextField DescripcionTXT;
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JTextField MarcaTXT;
    private javax.swing.JTextField MaterialRequeridoTXT;
    private javax.swing.JTextField MaterialRequeridoTXT1;
    private javax.swing.JTextField ModeloTXT;
    private javax.swing.JTextField NumActivoTXT;
    private javax.swing.JTextField NumSerialTXT;
    private javax.swing.JTextField PresentacionTXT;
    private javax.swing.JTextField ProcesableTXT;
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
