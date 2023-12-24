/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import dao.DAORegistroEvento;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.Reporte;


/**
 *
 * @author mario
 */
public class JIM_Reporte extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIM_Cliente
     */
    public JIM_Reporte() {
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
        jcbxEquipos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblReportes = new javax.swing.JTable();
        jlabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jlblCantVentas = new javax.swing.JLabel();
        jlblTotalVentas = new javax.swing.JLabel();
        jcbxAnio = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Reporte de Eventos");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jcbxEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar TipoEvento", "Fiesta", "Matrimonio" }));
        jcbxEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxEquiposActionPerformed(evt);
            }
        });

        jtblReportes.setForeground(new java.awt.Color(0, 0, 153));
        jtblReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Desc", "Nombre", "Telefono", "Correo", "Precio", "Año Venta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblReportes);
        if (jtblReportes.getColumnModel().getColumnCount() > 0) {
            jtblReportes.getColumnModel().getColumn(0).setResizable(false);
            jtblReportes.getColumnModel().getColumn(1).setResizable(false);
            jtblReportes.getColumnModel().getColumn(2).setResizable(false);
            jtblReportes.getColumnModel().getColumn(3).setResizable(false);
            jtblReportes.getColumnModel().getColumn(4).setResizable(false);
            jtblReportes.getColumnModel().getColumn(5).setResizable(false);
            jtblReportes.getColumnModel().getColumn(6).setResizable(false);
        }

        jlabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(204, 0, 0));
        jlabel1.setText("Cantidad de Ventas: ");

        jlabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(255, 0, 0));
        jlabel2.setText("Monto total Recaudado: ");

        jlblCantVentas.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jlblCantVentas.setForeground(new java.awt.Color(0, 0, 153));
        jlblCantVentas.setText("0");
        jlblCantVentas.setToolTipText("");
        jlblCantVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jlblTotalVentas.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jlblTotalVentas.setForeground(new java.awt.Color(0, 0, 153));
        jlblTotalVentas.setText("0");
        jlblTotalVentas.setToolTipText("");
        jlblTotalVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jcbxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Año" }));
        jcbxAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxAnioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbxEquipos, 0, 227, Short.MAX_VALUE)
                            .addComponent(jcbxAnio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel2)
                            .addComponent(jlabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCantVentas)
                            .addComponent(jlblTotalVentas))
                        .addGap(0, 102, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel1)
                    .addComponent(jlblCantVentas))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel2)
                    .addComponent(jlblTotalVentas))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void limpiarCampos(){
        this.jcbxEquipos.setSelectedIndex(0);
        this.jcbxAnio.setSelectedIndex(0);
    }

    private void llenarTabla(){
        DefaultTableModel tabla = (DefaultTableModel) this.jtblReportes.getModel();
        ArrayList<Reporte> lista = DAORegistroEvento.listarVentas();
        tabla.setRowCount(0);
            
        String modelo, nombre, correo, tipoEvento;
        int telefono;
        double precio;
        Date fecha;
       
        int cantVentas = 0;
        double totalVentas = 0;
        String tipo = this.jcbxEquipos.getSelectedItem().toString();
        int anioVenta = 0;
        if (jcbxAnio.getSelectedIndex() != 0){
            anioVenta = Integer.parseInt(this.jcbxAnio.getSelectedItem().toString());
        }
        
        for (Reporte r : lista) {
            tipoEvento = r.getTipoEvento();
            modelo = r.getNombre();
            nombre = r.getNombre();
            telefono = r.getTelefono();
            correo = r.getCorreo();
            precio = r.getPrecio();
            fecha = r.getFecha();
            
            SimpleDateFormat formato = new SimpleDateFormat("yyyy");
            String fechaS = formato.format(fecha);
                        
            //sin filtro de equipo
            if(jcbxEquipos.getSelectedIndex() == 0){
                //sin filtro de año
                if(jcbxAnio.getSelectedIndex() == 0){
                    tabla.addRow(new Object[]{tipoEvento, modelo, nombre, telefono, correo, precio, fechaS});
                    cantVentas++;
                    totalVentas +=precio;
                //con filtro de año
                }else if(anioVenta == Integer.parseInt(fechaS)){
                    tabla.addRow(new Object[]{tipoEvento, modelo, nombre, telefono, correo, precio, fechaS});
                    cantVentas++;
                    totalVentas +=precio;
                }
            //con filtro de equipo
            }else{ // y sin filtro de año
                if(tipoEvento.equalsIgnoreCase(tipo) && (jcbxAnio.getSelectedIndex() == 0)){
                    tabla.addRow(new Object[]{tipoEvento, modelo, nombre, telefono, correo, precio, fechaS});
                    cantVentas++;
                    totalVentas +=precio;
                //con filtro de año
                }else if(anioVenta == Integer.parseInt(fechaS) 
                        && tipoEvento.equalsIgnoreCase(tipo)){
                    tabla.addRow(new Object[]{tipoEvento, modelo, nombre, telefono, correo, precio, fechaS});
                    cantVentas++;
                    totalVentas +=precio;
                }
            }
        }
        jlblCantVentas.setText(""+cantVentas);
        jlblTotalVentas.setText(""+totalVentas);
    }
    
    private void completarAnios(){
        Date fecha = new Date();
        LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int anio = localDate.getYear(); // Extraer el año
        
        //Desde años para atrás desde el año actual
        for (int i = 0; i < 10; i++) {
            this.jcbxAnio.addItem(String.valueOf(anio));
            anio--;
        }
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        limpiarCampos();
        llenarTabla();
        completarAnios();
    }//GEN-LAST:event_formComponentShown

    private void jcbxEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxEquiposActionPerformed
       llenarTabla();
    }//GEN-LAST:event_jcbxEquiposActionPerformed

    private void jcbxAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxAnioActionPerformed
       llenarTabla();
    }//GEN-LAST:event_jcbxAnioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbxAnio;
    private javax.swing.JComboBox<String> jcbxEquipos;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlblCantVentas;
    private javax.swing.JLabel jlblTotalVentas;
    private javax.swing.JTable jtblReportes;
    // End of variables declaration//GEN-END:variables
}