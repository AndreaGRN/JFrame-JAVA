
package jframe1;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;

public class FrmVenta extends javax.swing.JFrame {

    public FrmVenta() {
        initComponents();
        
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Imagenes/fondo.jpg")); 
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        txtPrecio = new javax.swing.JTextField();
        cboProducto = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRecibeCliente = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("INSTRUMENTOS MUSICALES");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("\"THE BEATLES\"");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Producto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Cantidad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Total");

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "guitarra electrica", "guitarra acustica", "guitarra clasica", "bajo", "organo electronico", "piano", "bateria", "armonica", "violin", "trompeta" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calcular.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cerrar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cliente.png"))); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Cliente");

        txtRecibeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecibeClienteActionPerformed(evt);
            }
        });

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ver.png"))); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Codigo");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtTotal))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtRecibeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(102, 102, 102)
                                                .addComponent(btnCliente)))
                                        .addGap(0, 70, Short.MAX_VALUE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevo)
                            .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(267, 267, 267))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRecibeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
      int total;
       
       total = Integer.parseInt(txtPrecio.getText()) * Integer.parseInt(spnCantidad.getValue().toString());
       
       txtTotal.setText("" + total);
       
       
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        FrmCliente micliente = new FrmCliente();
        
        micliente.setTitle("Cliente");
        micliente.setVisible(true);
        micliente.setSize(400, 300);
        micliente.setLocationRelativeTo(null);
        micliente.setResizable(false);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      txtPrecio.setText("");
      txtCodigo.setText("");
      cboProducto.setSelectedItem("--Seleccione--");
      spnCantidad.setValue(1);
      txtTotal.setText("");
      txtPrecio.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        int producto, codigo=0, precio=0;
        
        ImageIcon foto1 = new ImageIcon("guitarra electrica.jpg");
        ImageIcon foto2 = new ImageIcon("guitarra acustica.jpg");
        ImageIcon foto3 = new ImageIcon("guitarra clasica.jpg");
        ImageIcon foto4 = new ImageIcon("bajo.jpg");
        ImageIcon foto5 = new ImageIcon("organo electronico.jpg");
        ImageIcon foto6 = new ImageIcon("piano.jpg");
        ImageIcon foto7 = new ImageIcon("bateria.jpg");
        ImageIcon foto8 = new ImageIcon("armonica.jpg");
        ImageIcon foto9 = new ImageIcon("violin.jpg");
        ImageIcon foto10 = new ImageIcon("trompeta.jpg");
        
        
        producto = cboProducto.getSelectedIndex();
        
        switch (producto) {
            case 0:
                lblFoto.setIcon(null);
                break;
            case 1:
                precio = 1500;
                codigo = 101; 
                lblFoto.setIcon(foto1);
                break;
            case 2:
                precio = 500;
                codigo = 102; 
                lblFoto.setIcon(foto2);
                break;
            case 3:
                precio = 300;
                codigo = 103; 
                lblFoto.setIcon(foto3);
                break;
            case 4:
                precio = 1000;
                codigo = 104; 
                lblFoto.setIcon(foto4);
                break;
            case 5:
                precio = 800;
                codigo = 105; 
                lblFoto.setIcon(foto5);
                break;
            case 6:
                precio = 2000;
                codigo = 106; 
                lblFoto.setIcon(foto6);
                break;
            case 7:
                precio = 3000;
                codigo = 107; 
                lblFoto.setIcon(foto7);
                break;
            case 8:
                precio = 100;
                codigo = 108; 
                lblFoto.setIcon(foto8);
                break;
            case 9:
                precio = 250;
                codigo = 109; 
                lblFoto.setIcon(foto9);
                break;
            case 10:
                precio = 900;
                codigo = 110; 
                lblFoto.setIcon(foto10);
                break;
        }
        
        if (producto == 0) {
            txtPrecio.setText("");
            txtCodigo.setText("");
        } else {
            txtPrecio.setText("" + precio);
            txtCodigo.setText("" + codigo);
            spnCantidad.requestFocus();
    }//GEN-LAST:event_cboProductoActionPerformed
    }
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
      
      try {
        Connection con;
        Statement sent;
        ResultSet rs;
        
        String nombre_bd = "d:\\MisBD\\BD para leer.accdb";
        String usuarioBD="";
        String passwordBD="";
        
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
        con = DriverManager.getConnection("jdbc:ucanaccess://" + nombre_bd, usuarioBD, 
                passwordBD);
        sent = con.createStatement();
        rs = sent.executeQuery("SELECT * FROM Venta WHERE codigo='"
                    + txtCodigo.getText() + "'");
        rs.next();
        txtCodigo.setText(rs.getString(1));
        cboProducto.setSelectedItem(rs.getString(2));
        txtPrecio.setText(rs.getString(3));
        
        rs.close();
        sent.close();
        con.close();
      }
        catch (ClassNotFoundException | SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, "Error en " +e);
      }
       
      
          
    }//GEN-LAST:event_btnVerActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtRecibeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecibeClienteActionPerformed
        
    }//GEN-LAST:event_txtRecibeClienteActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextField txtCodigo;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtRecibeCliente;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
