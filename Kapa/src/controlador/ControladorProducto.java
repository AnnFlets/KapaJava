package controlador;

import extras.Extras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.ProductoDAO;
import modelo.ProductoVO;
import vista.FrmProducto;
import javax.swing.JOptionPane;
import modelo.ProveedorDAO;
import modelo.ProveedorVO;

public class ControladorProducto implements ActionListener, WindowListener, MouseListener {

    FrmProducto vProducto = new FrmProducto();
    ProductoVO pvo = new ProductoVO();
    ProductoDAO pdao = new ProductoDAO();
    ProveedorVO prvo = new ProveedorVO();
    ProveedorDAO prdao = new ProveedorDAO();
    Extras extras = new Extras();
    DefaultTableModel modeloTablaProductos;
    boolean banderaReporte = false;

    /**
     * Controlador con parámetro
     *
     * @param vProducto -> Representa la vista del administrador
     */
    public ControladorProducto(FrmProducto vProducto) {
        this.vProducto = vProducto;
        this.vProducto.addWindowListener(this);
        this.vProducto.tblProductos.addMouseListener(this);
        this.vProducto.btnLimpiarCampos.addActionListener(this);
        this.vProducto.btncrearProducto.addActionListener(this);
        this.vProducto.btnActualizarProducto.addActionListener(this);
        this.vProducto.btnEliminarProducto.addActionListener(this);
        this.vProducto.btnReporteProducto.addActionListener(this);
        this.vProducto.btnSalirProducto.addActionListener(this);
    }

    private void mostrarProductos() {
        ArrayList<ProveedorVO> proveedor = prdao.consultarProveedor();
        ArrayList<ProductoVO> producto = pdao.consultarProducto();
        modeloTablaProductos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modeloTablaProductos.setColumnCount(0);
        modeloTablaProductos.addColumn("ID");
        modeloTablaProductos.addColumn("Descripción");
        modeloTablaProductos.addColumn("Marca");
        modeloTablaProductos.addColumn("Presentación");
        modeloTablaProductos.addColumn("Categoria");
        modeloTablaProductos.addColumn("Precio de Compra");
        modeloTablaProductos.addColumn("Precio de Venta");
        modeloTablaProductos.addColumn("Existencias");
        modeloTablaProductos.addColumn("Imagen");
        modeloTablaProductos.addColumn("ID proveedor");
        modeloTablaProductos.addColumn("Proveedor");
        for (int i = 0; i < producto.size(); i++) {
            for (int j = 0; j < proveedor.size(); j++) {
                if (proveedor.get(j).getIdProveedor() == producto.get(i).getIdProducto()) {
                    modeloTablaProductos.addRow(new Object[]{producto.get(i).getIdProducto(),
                        producto.get(i).getDescripcionProducto(), producto.get(i).getMarcaProducto(), producto.get(i).getPresentacionProducto(),
                        producto.get(i).getCategoriaProducto(), producto.get(i).getPrecioCompraProducto(), producto.get(i).getPrecioVentaProducto(),
                        producto.get(i).getExistenciaProducto(), producto.get(i).getImgProducto(), producto.get(i).getIdProveedor(), proveedor.get(j).getNombreProveedor()
                    });
                }
            }
        }
        this.vProducto.tblProductos.setModel(modeloTablaProductos);
        this.vProducto.tblProductos.getTableHeader().setReorderingAllowed(false);
        this.vProducto.tblProductos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        this.vProducto.tblProductos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        this.vProducto.tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        this.vProducto.tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
        this.vProducto.tblProductos.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        this.vProducto.tblProductos.getTableHeader().getColumnModel().getColumn(8).setMinWidth(0);
        this.vProducto.tblProductos.getColumnModel().getColumn(8).setMaxWidth(0);
        this.vProducto.tblProductos.getColumnModel().getColumn(8).setMinWidth(0);
        this.vProducto.tblProductos.getTableHeader().getColumnModel().getColumn(9).setMaxWidth(0);
        this.vProducto.tblProductos.getTableHeader().getColumnModel().getColumn(9).setMinWidth(0);
        this.vProducto.tblProductos.getColumnModel().getColumn(9).setMaxWidth(0);
        this.vProducto.tblProductos.getColumnModel().getColumn(9).setMinWidth(0);
    }

    private void llenarComboboxProveedores() {
        ArrayList<ProveedorVO> proveedores = prdao.consultarProveedor();
        if (this.vProducto.cmbProveedorProducto.getItemCount() == 0) {
            for (int i = 0; i < proveedores.size(); i++) {
                this.vProducto.cmbProveedorProducto.addItem(proveedores.get(i).getNombreProveedor());
            }
        } else {
            borrarComboboxProveedores();
            for (int i = 0; i < proveedores.size(); i++) {
                this.vProducto.cmbProveedorProducto.addItem(proveedores.get(i).getNombreProveedor());
            }
        }
    }

    private void borrarComboboxProveedores() {
        this.vProducto.cmbProveedorProducto.removeAllItems();
    }

    private void llenarCamposProductos() {
        int numero = 0;
        while (numero < 11) {
            switch (numero) {
                case 0:
                    this.vProducto.txtIdProducto.setText(String.valueOf(this.vProducto.tblProductos.getValueAt(this.vProducto.tblProductos.getSelectedRow(), numero)));
                    break;
                case 1:
                    this.vProducto.txtDescripcionProducto.setText(String.valueOf(this.vProducto.tblProductos.getValueAt(this.vProducto.tblProductos.getSelectedRow(), numero)));
                    break;
                case 2:
                    this.vProducto.txtMarcaProducto.setText(String.valueOf(this.vProducto.tblProductos.getValueAt(this.vProducto.tblProductos.getSelectedRow(), numero)));
                    break;
                case 3:
                    this.vProducto.txtPresentacionProducto.setText(String.valueOf(this.vProducto.tblProductos.getValueAt(this.vProducto.tblProductos.getSelectedRow(), numero)));
                    break;
                case 4:
                    this.vProducto.txtCategoriaProducto.setText(String.valueOf(this.vProducto.tblProductos.getValueAt(this.vProducto.tblProductos.getSelectedRow(), numero)));
                    break;
                case 5:
                    this.vProducto.txtPrecioCompraProducto.setText(String.valueOf(this.vProducto.tblProductos.getValueAt(this.vProducto.tblProductos.getSelectedRow(), numero)));
                    break;
                case 6:
                    this.vProducto.txtPrecioVentaProducto.setText(String.valueOf(this.vProducto.tblProductos.getValueAt(this.vProducto.tblProductos.getSelectedRow(), numero)));
                    break;
                case 7:
                    this.vProducto.txtExistenciasProducto.setText(String.valueOf(this.vProducto.tblProductos.getValueAt(this.vProducto.tblProductos.getSelectedRow(), numero)));
                    break;
                case 10:
                    this.vProducto.cmbProveedorProducto.setSelectedItem(String.valueOf(this.vProducto.tblProductos.getValueAt(this.vProducto.tblProductos.getSelectedRow(), numero)));
                    break;
            }
            numero++;
        }
    }

    private boolean verificarProductoDuplicado(int opcion) {
        boolean banderaProducto = true;
        if (opcion == 1) {
            for (ProductoVO Producto : pdao.consultarProducto()) {
                if (Producto.getIdProducto() == Integer.parseInt(this.vProducto.txtIdProducto.getText())) {
                    banderaProducto = false;

                    this.vProducto.jopMensaje.showMessageDialog(null, "Ya existe un Producto con el mismo ID.",
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
                    if (!this.vProducto.txtIdProducto.getText().isEmpty()) {
                        limpiarCampos();
                    }
                    break;
                }
            }
        } else {
            ArrayList<ProductoVO> Producto = pdao.consultarProducto();
            for (int i = 0; i < Producto.size(); i++) {
                if (Producto.get(i).getIdProducto() == Integer.parseInt(this.vProducto.txtIdProducto.getText())) {
                    if (i != this.vProducto.tblProductos.getSelectedRow()) {
                        banderaProducto = false;
                        this.vProducto.jopMensaje.showMessageDialog(null, "Ya existe un Producto con el mismo nombre y/o teléfono.",
                                "Advertencia", JOptionPane.WARNING_MESSAGE);
                        limpiarCampos();
                        break;
                    }
                }
            }
        }
        return banderaProducto;
    }

    private void registrarProducto() {
        if (!this.vProducto.txtDescripcionProducto.getText().isEmpty()
                && !this.vProducto.txtMarcaProducto.getText().isEmpty()
                && !this.vProducto.txtPresentacionProducto.getText().isEmpty()
                && !this.vProducto.txtCategoriaProducto.getText().isEmpty()
                && !this.vProducto.txtPrecioCompraProducto.getText().isEmpty()
                && !this.vProducto.txtPrecioVentaProducto.getText().isEmpty()
                && !this.vProducto.txtExistenciasProducto.getText().isEmpty()) {
            if (verificarProductoDuplicado(1)) {
                this.pvo.setDescripcionProducto(this.vProducto.txtDescripcionProducto.getText());
                this.pvo.setMarcaProducto(this.vProducto.txtMarcaProducto.getText());
                this.pvo.setPresentacionProducto(this.vProducto.txtPresentacionProducto.getText());
                this.pvo.setCategoriaProducto(this.vProducto.txtCategoriaProducto.getText());
                this.pvo.setPrecioCompraProducto(Double.parseDouble(this.vProducto.txtPrecioCompraProducto.getText()));
                this.pvo.setPrecioVentaProducto(Double.parseDouble(this.vProducto.txtPrecioVentaProducto.getText()));
                this.pvo.setExistenciaProducto(Integer.parseInt(this.vProducto.txtExistenciasProducto.getText()));
                this.pvo.setIdProveedor(this.vProducto.cmbProveedorProducto.getSelectedIndex() + 1);
                if (pdao.insertarProducto(pvo) == true) {
                    limpiarCampos();
                    this.vProducto.jopMensaje.showMessageDialog(null, "Producto registrado correctamente.",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    this.vProducto.jopMensaje.showMessageDialog(null, "Error, datos no registrados.",
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            this.vProducto.jopMensaje.showMessageDialog(null, "Todos los campos deben de tener información según corresponda",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void modificarProducto() {
        if (!this.vProducto.txtDescripcionProducto.getText().isEmpty()
                && !this.vProducto.txtMarcaProducto.getText().isEmpty()
                && !this.vProducto.txtPresentacionProducto.getText().isEmpty()
                && !this.vProducto.txtCategoriaProducto.getText().isEmpty()
                && !this.vProducto.txtPrecioCompraProducto.getText().isEmpty()
                && !this.vProducto.txtPrecioVentaProducto.getText().isEmpty()
                && !this.vProducto.txtExistenciasProducto.getText().isEmpty()) {
            if (verificarProductoDuplicado(2)) {
                this.pvo.setIdProducto(Integer.parseInt(this.vProducto.txtIdProducto.getText()));
                this.pvo.setDescripcionProducto(this.vProducto.txtDescripcionProducto.getText());
                this.pvo.setMarcaProducto(this.vProducto.txtMarcaProducto.getText());
                this.pvo.setPresentacionProducto(this.vProducto.txtPresentacionProducto.getText());
                this.pvo.setCategoriaProducto(this.vProducto.txtCategoriaProducto.getText());
                this.pvo.setPrecioCompraProducto(Double.parseDouble(this.vProducto.txtPrecioCompraProducto.getText()));
                this.pvo.setPrecioVentaProducto(Double.parseDouble(this.vProducto.txtPrecioVentaProducto.getText()));
                this.pvo.setExistenciaProducto(Integer.parseInt(this.vProducto.txtExistenciasProducto.getText()));
                this.pvo.setIdProveedor(this.vProducto.cmbProveedorProducto.getSelectedIndex() + 1);
                if (pdao.actualizarProducto(pvo) == true) {
                    limpiarCampos();
                    this.vProducto.jopMensaje.showMessageDialog(null, "Producto actualizado correctamente.",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    this.vProducto.jopMensaje.showMessageDialog(null, "Error, no se pudo actualizar el producto.",
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            this.vProducto.jopMensaje.showMessageDialog(null, "No ha seleccionado ningún producto.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void eliminarProducto() {
        if (!this.vProducto.txtIdProducto.getText().isEmpty()) {
            this.pvo.setIdProducto(Integer.parseInt(this.vProducto.txtIdProducto.getText()));
            if (pdao.eliminarProducto(pvo) == true) {
                limpiarCampos();
                this.vProducto.jopMensaje.showMessageDialog(null, "Producto eliminado correctamente.",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                this.vProducto.jopMensaje.showMessageDialog(null, "Error, no se pudo eliminar el producto.",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            this.vProducto.jopMensaje.showMessageDialog(null, "No ha seleccionado ningún producto.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void reporteProductos() {
        pdao.reporteProducto();
        pdao.jasperViewer.setDefaultCloseOperation(this.vProducto.DISPOSE_ON_CLOSE);
        pdao.jasperViewer.setVisible(true);
        banderaReporte = true;
    }

    private void limpiarCampos() {
        this.vProducto.txtIdProducto.setText("");
        this.vProducto.txtDescripcionProducto.setText("");
        this.vProducto.txtMarcaProducto.setText("");
        this.vProducto.txtPresentacionProducto.setText("");
        this.vProducto.txtCategoriaProducto.setText("");
        this.vProducto.txtPrecioCompraProducto.setText("");
        this.vProducto.txtPrecioVentaProducto.setText("");
        this.vProducto.txtExistenciasProducto.setText("");
        this.vProducto.cmbProveedorProducto.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vProducto.btnLimpiarCampos) {
            limpiarCampos();
        }
        if (e.getSource() == this.vProducto.btncrearProducto) {
            registrarProducto();
        }
        if (e.getSource() == this.vProducto.btnActualizarProducto) {
            modificarProducto();
        }
        if (e.getSource() == this.vProducto.btnEliminarProducto) {
            eliminarProducto();
        }
        if (e.getSource() == this.vProducto.btnReporteProducto) {
            reporteProductos();
        }
        if (e.getSource() == this.vProducto.btnSalirProducto) {
            this.vProducto.dispose();
            limpiarCampos();
            if (banderaReporte) {
                pdao.jasperViewer.setVisible(false);
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        llenarComboboxProveedores();
        mostrarProductos();
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        limpiarCampos();
        if (banderaReporte) {
            pdao.jasperViewer.setVisible(false);
        }
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        mostrarProductos();
        llenarComboboxProveedores();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.vProducto.tblProductos) {
            if (e.getClickCount() == 2) {
                llenarCamposProductos();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
