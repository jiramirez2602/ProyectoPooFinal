package Views;


import controller.ListaDeUsuarios;
import controller.ListaLaboratorios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Laboratorio;
import model.Usuario;


public class Laboratorios extends javax.swing.JPanel {
    
    private ListaDeUsuarios listaUsuarios; 
    private ListaLaboratorios listalaboratorios; 
    private Usuario userActual;
    private DefaultTableModel tableModelLab;
    private HashMap<Integer, String> idMapLab;
    
    public Laboratorios(Usuario user,ListaLaboratorios laboratorios,ListaDeUsuarios usuarios) {
        this.listaUsuarios = usuarios;
        this.listalaboratorios = laboratorios;
        this.userActual = user;
        idMapLab = new HashMap<>(); 
        initComponents();
        InitStyles();
        inicializarTablaLab();
        actualizarTablaLab();
        bloquearPorRol(userActual);
    }

    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
    }
    
        private void MostrarJPanel(JPanel p) {
        p.setSize(1180, 556);
        p.setLocation(0,0);
        BackgroundLab.removeAll();
        BackgroundLab.add(p, BorderLayout.CENTER);
        BackgroundLab.revalidate();
        BackgroundLab.repaint();
    }
    
    private void inicializarTablaLab() {
        String[] columnas = {"Nombre del Laboratorio", "Facultad", "Escuela", "Departamento", "Administrador"};
        tableModelLab = new DefaultTableModel(columnas, 0);
        jTable1.setModel(tableModelLab);
    }
    
    private void bloquearPorRol(Usuario user){
        if((user.verificarRol(user,"Invitado"))||(user.verificarRol(user,"Tecnico"))){
            BotonCrearLab.setEnabled(false);
            BotonEliminarLab.setEnabled(false);
            BotonModificarLab.setEnabled(false);
        }
    }
    
    private void actualizarTablaLab() {
        listalaboratorios.getListaLaboratorios();
        tableModelLab.setRowCount(0);
        idMapLab.clear();
        int row = 0;

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (Laboratorio laboratorio : listalaboratorios.listarLaboratorios()) {
            Usuario administrador = listaUsuarios.listarUsuario(laboratorio.getIdAdministrador());
            String nombreAdministrador = (administrador != null) ? administrador.getNombreUser() : "Desconocido";

            Object[] fila = {
                laboratorio.getNombreLaboratorio(),
                laboratorio.getFacultad(),
                laboratorio.getEscuela(),
                laboratorio.getDepartamento(),
                nombreAdministrador
            };
            tableModelLab.addRow(fila);

            idMapLab.put(row, laboratorio.getId());

            for (int i = 0; i < tableModelLab.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }

            row++;
        }

        jTable1.setDefaultEditor(Object.class, null); 
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundLab = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonEliminarLab = new javax.swing.JButton();
        BotonModificarLab = new javax.swing.JButton();
        BotonCrearLab = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundLab.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Laboratorios");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BotonEliminarLab.setBackground(new java.awt.Color(18, 90, 173));
        BotonEliminarLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonEliminarLab.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminarLab.setText("Borrar");
        BotonEliminarLab.setBorderPainted(false);
        BotonEliminarLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarLabActionPerformed(evt);
            }
        });

        BotonModificarLab.setBackground(new java.awt.Color(18, 90, 173));
        BotonModificarLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonModificarLab.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificarLab.setText("Editar");
        BotonModificarLab.setBorderPainted(false);
        BotonModificarLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarLabActionPerformed(evt);
            }
        });

        BotonCrearLab.setBackground(new java.awt.Color(18, 90, 173));
        BotonCrearLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonCrearLab.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrearLab.setText("Nuevo");
        BotonCrearLab.setBorderPainted(false);
        BotonCrearLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCrearLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearLabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLabLayout = new javax.swing.GroupLayout(BackgroundLab);
        BackgroundLab.setLayout(BackgroundLabLayout);
        BackgroundLabLayout.setHorizontalGroup(
            BackgroundLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLabLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(699, 699, 699))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLabLayout.createSequentialGroup()
                        .addGroup(BackgroundLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackgroundLabLayout.createSequentialGroup()
                                .addGap(427, 427, 427)
                                .addComponent(BotonCrearLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonModificarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonEliminarLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(50, 50, 50))))
        );
        BackgroundLabLayout.setVerticalGroup(
            BackgroundLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(BackgroundLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEliminarLab)
                    .addComponent(BotonModificarLab)
                    .addComponent(BotonCrearLab))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

    }//GEN-LAST:event_jTable1MousePressed

    private void BotonCrearLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearLabActionPerformed
        MostrarJPanel(new CrearLaboratorios(userActual,listalaboratorios,listaUsuarios));
    }//GEN-LAST:event_BotonCrearLabActionPerformed

    private void BotonEliminarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarLabActionPerformed
        int selectedRow = jTable1.getSelectedRow();

           if (selectedRow != -1) {
               String idLaboratorioAEliminar = idMapLab.get(selectedRow);

               if (idLaboratorioAEliminar != null && !idLaboratorioAEliminar.isEmpty()) {
                   int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este laboratorio?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

                   if (confirmacion == JOptionPane.YES_OPTION) {
                       listalaboratorios.eliminarLaboratorio(userActual, idLaboratorioAEliminar);

                       JOptionPane.showMessageDialog(null, "Laboratorio eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                       actualizarTablaLab();
                   }
               } else {
                   JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún laboratorio para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
               }
           } else {
               JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
           }
    }//GEN-LAST:event_BotonEliminarLabActionPerformed

    private void BotonModificarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarLabActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            String idLaboratorio = idMapLab.get(selectedRow);
            Laboratorio laboratorio = listalaboratorios.listarLaboratorio(idLaboratorio);
            if (laboratorio != null) {
                MostrarJPanel(new ModificarLaboratorio(userActual, listalaboratorios, listaUsuarios, laboratorio));
            } else {
                JOptionPane.showMessageDialog(null, "Laboratorio no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BotonModificarLabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundLab;
    private javax.swing.JButton BotonCrearLab;
    private javax.swing.JButton BotonEliminarLab;
    private javax.swing.JButton BotonModificarLab;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}