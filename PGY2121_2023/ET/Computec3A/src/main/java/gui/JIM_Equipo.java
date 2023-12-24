/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import dao.DAOEquipo;
import javax.swing.JOptionPane;
import model.Desktop;
import model.Equipo;
import model.Laptop;

/**
 *
 * @author mario
 */
public class JIM_Equipo extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIM_Cliente
     */
    public JIM_Equipo() {
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

        jPanel1 = new javax.swing.JPanel();
        jtxtCodigo = new javax.swing.JTextField();
        jtxtDescripcion = new javax.swing.JTextField();
        jtxtCpu = new javax.swing.JTextField();
        jtxtDiscoDuro = new javax.swing.JTextField();
        jbtbBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtbtnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcbTipoEquipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtxtRam = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jlblAtributo1 = new javax.swing.JLabel();
        jlblAtributo2 = new javax.swing.JLabel();
        jtxtAtributo1 = new javax.swing.JTextField();
        jtxtAtributo2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtnEliminar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnIngresar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Administracion Equipos");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jbtbBuscar.setText("Buscar");
        jbtbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtbBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("CPU");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("HDD");

        jtbtnLimpiar.setText("Limpiar");
        jtbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setText("Tipo Equipo");

        jcbTipoEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop" }));
        jcbTipoEquipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipoEquipoItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setText("RAM");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setText("Precio");

        jlblAtributo1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jlblAtributo1.setText("Pantalla");

        jlblAtributo2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jlblAtributo2.setText("#USB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jlblAtributo1)
                            .addComponent(jlblAtributo2))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtDiscoDuro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtCpu, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtRam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jtxtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtAtributo1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtAtributo2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jtbtnLimpiar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jbtbBuscar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcbTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jbtbBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAtributo1)
                    .addComponent(jtxtAtributo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAtributo2)
                    .addComponent(jtxtAtributo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtbtnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 0));

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnEditar.setText("Modificar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnIngresar.setText("Ingresar");
        jbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jbtnIngresar)
                .addGap(18, 18, 18)
                .addComponent(jbtnEditar)
                .addGap(18, 18, 18)
                .addComponent(jbtnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEditar)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnIngresar))
                .addContainerGap(11, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoEquipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipoEquipoItemStateChanged
        validarEquipos();
    }//GEN-LAST:event_jcbTipoEquipoItemStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        limpiarCampos();
    }//GEN-LAST:event_formComponentShown

    private boolean validarCampos(){
        return !(
                jtxtDescripcion.getText().isBlank() ||
                jtxtCpu.getText().isBlank() || 
                jtxtDiscoDuro.getText().isBlank() || 
                jtxtRam.getText().isBlank() ||
                jtxtPrecio.getText().isBlank() || 
                jtxtAtributo1.getText().isBlank() || 
                jtxtAtributo2.getText().isBlank());
    }
    
    private void limpiarCampos(){
        jtxtCodigo.setEnabled(true);
        jcbTipoEquipo.setSelectedIndex(0);
        jtxtCodigo.setText("");
        jtxtDescripcion.setText("");
        jtxtCpu.setText("");
        jtxtDiscoDuro.setText("");
        jtxtRam.setText("");
        jtxtPrecio.setText("");
        jtxtAtributo1.setText("");
        jtxtAtributo2.setText("");
    }
    
    private Equipo getEquipo(String codigo){
        
        try {
            if (validarCampos()){
                String descripcion = this.jtxtDescripcion.getText();
                String cpu = this.jtxtCpu.getText();
                int disco = Integer.parseInt(this.jtxtDiscoDuro.getText());
                int ram = Integer.parseInt(this.jtxtRam.getText());
                double precio = Double.parseDouble(this.jtxtPrecio.getText());
                double potencia = 0;
                double pantalla = 0;
                int cantidadUsb = 0;

                String factor = new String();
                Equipo equipo = null;

                if(this.jcbTipoEquipo.getSelectedItem().toString().equalsIgnoreCase("Desktop")){
                    potencia = Double.parseDouble(this.jtxtAtributo1.getText());
                    factor = this.jtxtAtributo2.getText();
                    equipo = new Desktop(codigo, potencia, factor
                            , descripcion,cpu,disco,ram,precio);
                }else{
                    pantalla = Double.parseDouble(this.jtxtAtributo1.getText());
                    cantidadUsb = Integer.parseInt(this.jtxtAtributo2.getText());
                    equipo = new Laptop(codigo, pantalla, cantidadUsb,
                            descripcion,cpu,disco,ram,precio);
                }
                return equipo;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error de conversion: " + e.toString());
        }
        return null;
    }
    
    private void jbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarActionPerformed
        String codigo = "";
        Equipo equipo = getEquipo(codigo);
        
        if (equipo != null){
            if(DAOEquipo.ingresar(equipo)){
                JOptionPane.showMessageDialog(null,"Equipo ingresado OK: " + equipo.getCodigo() );
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null,"Cliente no ingresado " + equipo.getCodigo() );
            }
        }else{
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios!!");
        }
    }//GEN-LAST:event_jbtnIngresarActionPerformed

    private void jtbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jtbtnLimpiarActionPerformed

    private void jbtbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtbBuscarActionPerformed
        
        if(!this.jtxtCodigo.getText().isBlank()){
            String codigo = jtxtCodigo.getText();
            Equipo equipo = DAOEquipo.existeEquipo(codigo);
            
            if( equipo != null ){
                this.jtxtCodigo.setEnabled(false);
                
                this.jtxtDescripcion.setText(equipo.getDescripcionModelo());
                this.jtxtCpu.setText(equipo.getCpu());
                this.jtxtDiscoDuro.setText(String.valueOf(equipo.getDiscoDuro()));
                this.jtxtRam.setText(String.valueOf(equipo.getCantidadRam()));
                this.jtxtPrecio.setText(String.valueOf(equipo.getPrecio()));
                
                if(equipo instanceof Laptop laptop){
                    this.jcbTipoEquipo.setSelectedIndex(0);
                    this.jtxtAtributo1.setText(String.valueOf(laptop.getTamanoPantalla()));
                    this.jtxtAtributo2.setText(String.valueOf(laptop.getCantidadPuertosUsb()));
                }else if(equipo instanceof Desktop desktop){
                    this.jcbTipoEquipo.setSelectedIndex(1);
                    this.jtxtAtributo1.setText(String.valueOf(desktop.getPotenciaFuente()));
                    this.jtxtAtributo2.setText(desktop.getFactorForma());
                }
            }else{
                JOptionPane.showMessageDialog(null,"El codigo equipo no existe: " + codigo);
            }
        } else{
            JOptionPane.showMessageDialog(null,"Debe ingresar el codigo!!");
        }
    }//GEN-LAST:event_jbtbBuscarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        String codigo = "";
        if (!this.jtxtCodigo.getText().isBlank()){
            codigo = this.jtxtCodigo.getText();
        }
        Equipo equipo = getEquipo(codigo);
        
        if(equipo != null){
            if(DAOEquipo.actualizar(equipo)){
                JOptionPane.showMessageDialog(null,"Vehiculo modificado ok: " + equipo.getCodigo());            
                this.jtxtCodigo.setEnabled(true);
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null,"Vehiculo no existe: " + equipo.getCodigo());
            }
        }else{
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios!!");
        }  
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        String codigo = "";
        if (!this.jtxtCodigo.getText().isBlank()){
            codigo = this.jtxtCodigo.getText();
        }
        Equipo equipo = getEquipo(codigo);
         
        if(equipo != null){
            codigo = jtxtCodigo.getText();
            if(DAOEquipo.eliminar(codigo)){
                this.jtxtCodigo.setEnabled(true);
                JOptionPane.showMessageDialog(null,"Equipo eliminado OK: " + codigo);
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null,"Equipo no existe: " + codigo);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios!!");
        } 
    }//GEN-LAST:event_jbtnEliminarActionPerformed
    
    private void ocultarCampos(){
        this.jlblAtributo1.setVisible(false);
        this.jlblAtributo2.setVisible(false);
        this.jtxtAtributo1.setVisible(false);
        this.jtxtAtributo2.setVisible(false);
    }
    
    private void validarEquipos(){
        int opcion = this.jcbTipoEquipo.getSelectedIndex();
        switch (opcion) {
            case 0 -> {
                //Laptop
                this.jlblAtributo1.setText("Pantalla");
                this.jlblAtributo2.setText("#USB");
            }
            case 1 -> {
                //Desktop
                this.jlblAtributo1.setText("Fuente");
                this.jlblAtributo2.setText("F. Forma");
            }
            default -> {
                ocultarCampos();
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtbBuscar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnIngresar;
    private javax.swing.JComboBox<String> jcbTipoEquipo;
    private javax.swing.JLabel jlblAtributo1;
    private javax.swing.JLabel jlblAtributo2;
    private javax.swing.JButton jtbtnLimpiar;
    private javax.swing.JTextField jtxtAtributo1;
    private javax.swing.JTextField jtxtAtributo2;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtCpu;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtDiscoDuro;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtRam;
    // End of variables declaration//GEN-END:variables
}