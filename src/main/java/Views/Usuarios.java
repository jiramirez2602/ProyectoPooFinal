package Views;

import controller.ListaDeUsuarios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class Usuarios extends javax.swing.JPanel {
    
    private ListaDeUsuarios listaUsuarios;
    private DefaultTableModel tableModel;
    private Map<Integer, String> idMap;
    private DefaultTableModel tableModelLab;
    private Usuario userActual;
    
    public Usuarios(Usuario user,ListaDeUsuarios usuarios) {
        this.listaUsuarios = usuarios;
        this.userActual=user;
        initComponents();
        InitStyles();
        idMap = new HashMap<>();
        inicializarTabla();
        actualizarTabla();
    }
    
     private void inicializarTabla() {
        String[] columnas = {"Username", "Nombre Completo", "Rol", "Estado"};
        tableModel = new DefaultTableModel(columnas, 0);
        jTable1.setModel(tableModel);
    }
     
   private void actualizarTabla() {
        tableModel.setRowCount(0); 
        idMap.clear();
        int row = 0;

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (Usuario usuario : listaUsuarios.getListaUsuarios()) {
            String estadoString = usuario.getStatus();
            boolean estado = Boolean.parseBoolean(estadoString); 
            String estadoMostrar = estado ? "Activo" : "Inactivo"; 

            Object[] fila = {
                usuario.getUsername(),
                usuario.getNombreUser(),
                usuario.getRolUsuario(),
                estadoMostrar 
            };
            tableModel.addRow(fila);

            idMap.put(row, usuario.getId());


            for (int i = 0; i < tableModel.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }

            row++;
        }
        jTable1.setDefaultEditor(Object.class, null); 
    }
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        userSearch.putClientProperty("JTextField.placeholderText", "Ingrese el nombre de usuario a buscar.");
    }

    private void MostrarJPanel(JPanel p) {
        p.setSize(1180, 556);
        p.setLocation(0,0);
        BackGroundUsuarios.removeAll();
        BackGroundUsuarios.add(p, BorderLayout.CENTER);
        BackGroundUsuarios.revalidate();
        BackGroundUsuarios.repaint();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundUsuarios = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userSearch = new javax.swing.JTextField();
        BotonBuscarUsuarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonEliminarUsuario = new javax.swing.JButton();
        BotonModificarUsuario = new javax.swing.JButton();
        BotonCrearUsuario = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        BackGroundUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Usuarios");

        BotonBuscarUsuarios.setBackground(new java.awt.Color(18, 90, 173));
        BotonBuscarUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonBuscarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarUsuarios.setText("Buscar");
        BotonBuscarUsuarios.setBorderPainted(false);
        BotonBuscarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonBuscarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarUsuariosActionPerformed(evt);
            }
        });

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

        BotonEliminarUsuario.setBackground(new java.awt.Color(18, 90, 173));
        BotonEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminarUsuario.setText("Borrar");
        BotonEliminarUsuario.setBorderPainted(false);
        BotonEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarUsuarioActionPerformed(evt);
            }
        });

        BotonModificarUsuario.setBackground(new java.awt.Color(18, 90, 173));
        BotonModificarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificarUsuario.setText("Editar");
        BotonModificarUsuario.setBorderPainted(false);
        BotonModificarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarUsuarioActionPerformed(evt);
            }
        });

        BotonCrearUsuario.setBackground(new java.awt.Color(18, 90, 173));
        BotonCrearUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrearUsuario.setText("Nuevo");
        BotonCrearUsuario.setBorderPainted(false);
        BotonCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackGroundUsuariosLayout = new javax.swing.GroupLayout(BackGroundUsuarios);
        BackGroundUsuarios.setLayout(BackGroundUsuariosLayout);
        BackGroundUsuariosLayout.setHorizontalGroup(
            BackGroundUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackGroundUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundUsuariosLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addGap(699, 699, 699))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundUsuariosLayout.createSequentialGroup()
                        .addGroup(BackGroundUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackGroundUsuariosLayout.createSequentialGroup()
                                .addGap(427, 427, 427)
                                .addComponent(BotonCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(BackGroundUsuariosLayout.createSequentialGroup()
                                .addComponent(userSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonBuscarUsuarios)))
                        .addGap(50, 50, 50))
                    .addGroup(BackGroundUsuariosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BackGroundUsuariosLayout.setVerticalGroup(
            BackGroundUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackGroundUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEliminarUsuario)
                    .addComponent(BotonModificarUsuario)
                    .addComponent(BotonCrearUsuario))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

    }//GEN-LAST:event_jTable1MousePressed

    private void BotonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearUsuarioActionPerformed
       MostrarJPanel(new CrearUsuario(userActual,listaUsuarios));
    }//GEN-LAST:event_BotonCrearUsuarioActionPerformed

    private void BotonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarUsuarioActionPerformed
    int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow != -1) { 
        
        String idUsuarioAEliminar = idMap.get(selectedRow);
        
        if (idUsuarioAEliminar != null && !idUsuarioAEliminar.isEmpty()) {
          
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este usuario?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
            
            if (confirmacion == JOptionPane.YES_OPTION) {
                
                boolean exito = listaUsuarios.eliminarUsuario(userActual, idUsuarioAEliminar);

                if (exito) {
                    JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
                    actualizarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún usuario para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BotonEliminarUsuarioActionPerformed

    private void BotonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarUsuarioActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String username = (String) jTable1.getValueAt(selectedRow, 0);
            
            ModificarUsuario modificarUsuarioPanel = new ModificarUsuario(userActual, listaUsuarios,username);
            modificarUsuarioPanel.cargarDatosUsuario(username);

            MostrarJPanel(modificarUsuarioPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonModificarUsuarioActionPerformed

    private void BotonBuscarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarUsuariosActionPerformed
       
    }//GEN-LAST:event_BotonBuscarUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundUsuarios;
    private javax.swing.JButton BotonBuscarUsuarios;
    private javax.swing.JButton BotonCrearUsuario;
    private javax.swing.JButton BotonEliminarUsuario;
    private javax.swing.JButton BotonModificarUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userSearch;
    // End of variables declaration//GEN-END:variables
}