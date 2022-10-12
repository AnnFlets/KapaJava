/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Pablo_Fuentes
 */
public class FrmProducto extends javax.swing.JFrame {

    /**
     * Creates new form frm_01producto
     */
    public FrmProducto() {
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

        jop_mensajes = new javax.swing.JOptionPane();
        jfile_imagenes = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnSalirProducto = new javax.swing.JButton();
        btncrearProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnReporteProducto = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioVentaProducto = new javax.swing.JTextField();
        txtExistenciasProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCategoriaProducto = new javax.swing.JTextField();
        txtPrecioCompraProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMarcaProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPresentacionProducto = new javax.swing.JTextField();
        cmbProveedorProducto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lbFondoHorizontal = new javax.swing.JLabel();
        lbfondoVertical = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador de Productos");
        setBackground(new java.awt.Color(187, 128, 201));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setName("frm_01producto"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESO DE PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 153, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 20, 350));

        jSeparator8.setForeground(new java.awt.Color(204, 153, 255));
        jSeparator8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1070, 20));

        btnSalirProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_4salir.png"))); // NOI18N
        btnSalirProducto.setToolTipText("Regresar al menú principal");
        getContentPane().add(btnSalirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 40, 30));

        btncrearProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_1crear.png"))); // NOI18N
        btncrearProducto.setToolTipText("Crear (debe tener los campos llenos)");
        getContentPane().add(btncrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 40, 30));

        btnActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_2actulizar.png"))); // NOI18N
        btnActualizarProducto.setToolTipText("Actualizar (debe tener algún registro seleccionado)");
        getContentPane().add(btnActualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 40, 30));

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_3eliminar.png"))); // NOI18N
        btnEliminarProducto.setToolTipText("Eliminar (debe tener algún registro seleccionado)");
        getContentPane().add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 40, 30));

        btnReporteProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_5reporte.png"))); // NOI18N
        btnReporteProducto.setToolTipText("Crear un reporte (Con los registros mostrados)");
        getContentPane().add(btnReporteProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 40, 30));

        btnLimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_limpiarcampos.png"))); // NOI18N
        btnLimpiarCampos.setToolTipText("Limpiar campos!!");
        getContentPane().add(btnLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 40, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, -1));

        txtIdProducto.setEditable(false);
        txtIdProducto.setBackground(new java.awt.Color(169, 234, 255));
        txtIdProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdProducto.setForeground(new java.awt.Color(51, 51, 51));
        txtIdProducto.setEnabled(false);
        txtIdProducto.setName("txtIdProducto"); // NOI18N
        getContentPane().add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 40, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Descripción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 400, -1));

        txtDescripcionProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDescripcionProducto.setName("txtDescripcionProducto"); // NOI18N
        getContentPane().add(txtDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 410, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Precio U. Venta");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 134, 20));

        txtPrecioVentaProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrecioVentaProducto.setName("txt_descripcion"); // NOI18N
        txtPrecioVentaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioVentaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 30));

        txtExistenciasProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtExistenciasProducto.setName("txt_descripcion"); // NOI18N
        txtExistenciasProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExistenciasProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtExistenciasProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 90, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Existencias");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 90, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Categoría");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 190, -1));

        txtCategoriaProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCategoriaProducto.setName("txt_descripcion"); // NOI18N
        getContentPane().add(txtCategoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 190, 30));

        txtPrecioCompraProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrecioCompraProducto.setName("txt_descripcion"); // NOI18N
        getContentPane().add(txtPrecioCompraProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 140, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Precio U. Compra");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 140, -1));

        txtMarcaProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMarcaProducto.setName("txt_descripcion"); // NOI18N
        txtMarcaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMarcaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 210, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Marca");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 210, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Presentación");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 230, -1));

        txtPresentacionProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPresentacionProducto.setName("txt_descripcion"); // NOI18N
        getContentPane().add(txtPresentacionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 230, -1));

        getContentPane().add(cmbProveedorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 350, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nombre Proveedor");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 150, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 153, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 10, 50));

        jSeparator2.setForeground(new java.awt.Color(204, 153, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 10, 60));

        jSeparator3.setForeground(new java.awt.Color(204, 153, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 10, 60));

        lbFondoHorizontal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoLogin.png"))); // NOI18N
        getContentPane().add(lbFondoHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 260));

        lbfondoVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoLogin.png"))); // NOI18N
        getContentPane().add(lbfondoVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 40, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 990, 290));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("De doble clic sobre el producto para seleccionarlo.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 1030, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExistenciasProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExistenciasProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExistenciasProductoActionPerformed

    private void txtPrecioVentaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaProductoActionPerformed

    private void txtMarcaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaProductoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarProducto;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnLimpiarCampos;
    public javax.swing.JButton btnReporteProducto;
    public javax.swing.JButton btnSalirProducto;
    public javax.swing.JButton btncrearProducto;
    public javax.swing.JComboBox<String> cmbProveedorProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JFileChooser jfile_imagenes;
    public javax.swing.JOptionPane jop_mensajes;
    private javax.swing.JLabel lbFondoHorizontal;
    private javax.swing.JLabel lbfondoVertical;
    public javax.swing.JTable tblProductos;
    public javax.swing.JTextField txtCategoriaProducto;
    public javax.swing.JTextField txtDescripcionProducto;
    public javax.swing.JTextField txtExistenciasProducto;
    public javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtMarcaProducto;
    public javax.swing.JTextField txtPrecioCompraProducto;
    public javax.swing.JTextField txtPrecioVentaProducto;
    public javax.swing.JTextField txtPresentacionProducto;
    // End of variables declaration//GEN-END:variables
}
