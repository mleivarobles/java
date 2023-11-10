/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import javax.swing.table.DefaultTableModel;
import dao.DAOAlumno;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Alumno;

/**
 *
 * @author mario
 */
public class JIM_ListarAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIM_Insertar
     */
    
    public JIM_ListarAlumno() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_listadoAlumnos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbtn_listar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_actualizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Listado de Alumnos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jtbl_listadoAlumnos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return col != 0;
            }
        };
        jtbl_listadoAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "rut", "nombre", "edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbl_listadoAlumnos.getTableHeader().setReorderingAllowed(false);
        jtbl_listadoAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_listadoAlumnosMouseClicked(evt);
            }
        });
        jtbl_listadoAlumnos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbl_listadoAlumnosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl_listadoAlumnos);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        jbtn_listar.setBackground(new java.awt.Color(0, 204, 51));
        jbtn_listar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jbtn_listar.setText("Listar");
        jbtn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_listarActionPerformed(evt);
            }
        });

        jbtn_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        jbtn_eliminar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jbtn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_eliminar.setText("Eliminar");
        jbtn_eliminar.setEnabled(false);
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });

        jbtn_actualizar.setBackground(new java.awt.Color(0, 0, 255));
        jbtn_actualizar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jbtn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_actualizar.setText("Actualizar");
        jbtn_actualizar.setEnabled(false);
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_listar)
                .addGap(18, 18, 18)
                .addComponent(jbtn_actualizar)
                .addGap(18, 18, 18)
                .addComponent(jbtn_eliminar)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_listar)
                    .addComponent(jbtn_eliminar)
                    .addComponent(jbtn_actualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_listarActionPerformed
        this.jtbl_listadoAlumnos.editCellAt(-1,-1);
        llenarTabla();
        this.jbtn_eliminar.setEnabled(false);
        this.jbtn_actualizar.setEnabled(false);
    }//GEN-LAST:event_jbtn_listarActionPerformed

    private void llenarTabla(){
        DefaultTableModel tabla = (DefaultTableModel) this.jtbl_listadoAlumnos.getModel();
        ArrayList<Alumno> alumnos = DAOAlumno.listar();
        
        tabla.setRowCount(0);
        
        String rut, nombre;
        int edad;
        
        for (Alumno a : alumnos) {
            rut = a.getRut();
            nombre = a.getNombre();
            edad = a.getEdad();
            tabla.addRow(new Object[]{rut,nombre,edad});
        }
    }
    
    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
        
        try {
            int fila = jtbl_listadoAlumnos.getSelectedRow();
            if (fila != -1){
                String rut = (String) jtbl_listadoAlumnos.getValueAt(fila,0);
                String nombre = (String) jtbl_listadoAlumnos.getValueAt(fila,1);
                int resp = JOptionPane.showConfirmDialog(null, "Confirma eliminación de alumno " + nombre + "?",
                            "Eliminar alumno", JOptionPane.OK_CANCEL_OPTION);

                 if(resp == JOptionPane.YES_OPTION){
                    if(DAOAlumno.eliminarAlumno(rut)){
                        JOptionPane.showMessageDialog(null,"Alumno eliminado correctamente " + nombre);
                        llenarTabla();
                        this.jbtn_eliminar.setEnabled(false);
                        this.jbtn_actualizar.setEnabled(false);
                    }else{
                      JOptionPane.showMessageDialog(null,"Alumno no pudo ser eliminado " + rut);
                    }
                 }
            }
        } catch (HeadlessException e) {
            System.out.println("Problema al eliminar alumno desde celda: " + e.toString());
            
        }
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed

        int fila = jtbl_listadoAlumnos.getSelectedRow();
        System.out.println("Fila seleccionada: "+ fila);
        
        try {
            if(fila != -1){
                String rut = (String) jtbl_listadoAlumnos.getValueAt(fila,0);
                String nombre = (String) jtbl_listadoAlumnos.getValueAt(fila, 1);
                int edad = (int) jtbl_listadoAlumnos.getValueAt(fila, 2);

                Alumno alumno = new Alumno(rut,nombre,edad);

                if(DAOAlumno.actualizarAlumno(alumno)){
                    JOptionPane.showMessageDialog(null, "Alumno " + nombre + " fue actualizado!!!");
                    llenarTabla();
                    this.jbtn_eliminar.setEnabled(false);
                    this.jbtn_actualizar.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(null, "El alumno " + nombre + " no pudo ser actualizado");
                }    
            }
        } catch (HeadlessException e) {
            System.out.println("Problema al editar alumno desde celda: " + e.toString());
        }
        
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        limpiarTabla();
    }//GEN-LAST:event_formInternalFrameClosed

    private void jtbl_listadoAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_listadoAlumnosMouseClicked
        this.jbtn_eliminar.setEnabled(true);
        //this.jbtn_actualizar.setEnabled(true);
    }//GEN-LAST:event_jtbl_listadoAlumnosMouseClicked

    private void jtbl_listadoAlumnosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbl_listadoAlumnosKeyReleased
        this.jbtn_actualizar.setEnabled(true);
    }//GEN-LAST:event_jtbl_listadoAlumnosKeyReleased

    private void limpiarTabla(){
        System.out.println("limpiando tablas");
        try {
            DefaultTableModel tabla = (DefaultTableModel) jtbl_listadoAlumnos.getModel();
            tabla.setRowCount(0);
        } catch (Exception e) {
            System.out.println("Error al limpiar la jtabla: " + e.toString());
        }
        
        //forma alternativa para limpiar la JTable
        
       /*
        for (int i = tabla.getRowCount()-1; i >= 0 ; i--) {    
            tabla.removeRow(i); 
        }
        */
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_listar;
    private javax.swing.JTable jtbl_listadoAlumnos;
    // End of variables declaration//GEN-END:variables
}
