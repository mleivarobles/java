/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import model.Alumno;
import dao.DAOAlumno;
import java.awt.Color;

/**
 *
 * @author mario
 */
public class JIM_EliminarAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIM_Insertar
     */
    public JIM_EliminarAlumno() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_rut = new javax.swing.JTextField();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_edad = new javax.swing.JTextField();
        jbtn_buscarRut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtn_eliminarAlumno = new javax.swing.JButton();
        jbtn_salir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Eliminar");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar rut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 15))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N

        jLabel1.setText("Rut");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jtxt_nombre.setBackground(new java.awt.Color(0, 51, 255));
        jtxt_nombre.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jtxt_nombre.setCaretColor(new java.awt.Color(0, 204, 0));
        jtxt_nombre.setEnabled(false);

        jtxt_edad.setBackground(new java.awt.Color(0, 51, 204));
        jtxt_edad.setEnabled(false);

        jbtn_buscarRut.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jbtn_buscarRut.setText("Buscar");
        jbtn_buscarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarRutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(63, 63, 63)
                                .addComponent(jtxt_rut))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_buscarRut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxt_edad, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jtxt_nombre))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_buscarRut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jbtn_eliminarAlumno.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jbtn_eliminarAlumno.setText("Eliminar");
        jbtn_eliminarAlumno.setEnabled(false);
        jbtn_eliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarAlumnoActionPerformed(evt);
            }
        });

        jbtn_salir.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jbtn_salir.setText("Salir");
        jbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jbtn_eliminarAlumno)
                .addGap(51, 51, 51)
                .addComponent(jbtn_salir)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_salir)
                    .addComponent(jbtn_eliminarAlumno))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtn_salirActionPerformed

    private void jbtn_eliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarAlumnoActionPerformed
       
        try {
            String rut = jtxt_rut.getText();
            
            if(DAOAlumno.eliminarAlumno(rut)){
                System.out.println("Alumno eliminado" + rut);
                JOptionPane.showMessageDialog(null,"Alumno eliminado correctamente " + rut);
            } else{
                JOptionPane.showMessageDialog(null,"Alumno no pudo ser eliminado " + rut);
            }            
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error al ingresar alumno: " +e.toString());
        }
        limpiarCampos();
    }//GEN-LAST:event_jbtn_eliminarAlumnoActionPerformed

    private void deshabilitarCampos(){
        this.jtxt_nombre.setEnabled(false);
        this.jtxt_edad.setEnabled(false);
        this.jbtn_eliminarAlumno.setEnabled(false);
    }
    
    private void limpiarCampos(){
        jtxt_rut.setText("");
        jtxt_nombre.setText("");
        jtxt_edad.setText("");
    }
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        limpiarCampos();
    }//GEN-LAST:event_formComponentShown

    private void jbtn_buscarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarRutActionPerformed
        
        String rut = jtxt_rut.getText();
        Alumno alumno = DAOAlumno.buscarAlumno(rut);
        try {
            if(alumno != null){
                this.jbtn_eliminarAlumno.setEnabled(true);   
                this.jtxt_nombre.setText(alumno.getNombre());
                this.jtxt_edad.setText(String.valueOf(alumno.getEdad()));
                
           }else{
                JOptionPane.showMessageDialog(null,"El alumno no existe " + rut);
            }
            
        } catch (HeadlessException e) {
            System.out.println("Error en conversion de datos " + e.toString());
        }
    }//GEN-LAST:event_jbtn_buscarRutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn_buscarRut;
    private javax.swing.JButton jbtn_eliminarAlumno;
    private javax.swing.JButton jbtn_salir;
    private javax.swing.JTextField jtxt_edad;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_rut;
    // End of variables declaration//GEN-END:variables
}
