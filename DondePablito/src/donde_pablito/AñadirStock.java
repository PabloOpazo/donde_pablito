
package donde_pablito;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;


public class AñadirStock extends javax.swing.JFrame {
        
    public AñadirStock() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(img_logo, "src/img/logo1.png");
    }
    
    
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static final String BD = "donde_pablito";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static Connection getConnection() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/" + BD, USERNAME, PASSWORD);
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
        
    }
    
    private void limpiarTx() {
        
        tx_nombre.setText(null);
        tx_precio.setText(null);
        tx_detalle.setText(null);
        sp_stock.setValue(0);
    }
    /*
    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        
    }*/


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_nombre = new javax.swing.JLabel();
        tx_nombre = new javax.swing.JTextField();
        lb_precio = new javax.swing.JLabel();
        tx_precio = new javax.swing.JTextField();
        lb_cantidad = new javax.swing.JLabel();
        sp_stock = new javax.swing.JSpinner();
        bt_añadir = new javax.swing.JButton();
        bt_añadir1 = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        lb_detalle = new javax.swing.JLabel();
        tx_detalle = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        img_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar stock");
        setResizable(false);

        lb_nombre.setText("Nombre:");

        lb_precio.setText("Precio:");

        lb_cantidad.setText("Cantidad");

        sp_stock.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        bt_añadir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_añadir.setText("Añadir");
        bt_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_añadirActionPerformed(evt);
            }
        });

        bt_añadir1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_añadir1.setText("Limpiar");
        bt_añadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_añadir1ActionPerformed(evt);
            }
        });

        bt_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        lb_detalle.setText("Detalle:");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(img_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(bt_añadir1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_eliminar)
                .addGap(18, 18, 18)
                .addComponent(bt_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_nombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_cantidad)
                            .addComponent(lb_precio)
                            .addComponent(lb_detalle))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tx_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(tx_precio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp_stock, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx_detalle, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre)
                    .addComponent(tx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_detalle)
                    .addComponent(tx_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_precio)
                    .addComponent(tx_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cantidad)
                    .addComponent(sp_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_eliminar)
                    .addComponent(bt_añadir)
                    .addComponent(bt_añadir1))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_añadirActionPerformed
        
        Connection con = null;
        
        try {
            con = getConnection();
            
                ps = con.prepareStatement("INSERT INTO producto ( nombre_producto, detalle_producto, precio_producto, stock_producto) VALUES (?,?,?,?)");

                ps.setString(1, tx_nombre.getText().toUpperCase());
                ps.setString(2, tx_detalle.getText().toUpperCase());
                ps.setString(3, tx_precio.getText());
                ps.setString(4, sp_stock.getValue().toString());

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null,"Producto: " + tx_nombre.getText() + "\nAñadido con éxito");

                } else {
                    JOptionPane.showMessageDialog(null, "Error, producto no añadido");
                }
            
            limpiarTx();
            con.close();
            
           
        } catch(Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_bt_añadirActionPerformed

    private void bt_añadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_añadir1ActionPerformed
        limpiarTx();
    }//GEN-LAST:event_bt_añadir1ActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        Connection con = null;
        
        try {
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM producto WHERE `producto`.`nombre_producto` = ?");
            ps.setString(1, tx_nombre.getText().toUpperCase());
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null,"Producto: " + tx_nombre.getText() + "\nEliminado");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error, producto no eliminado");
            }
            
            limpiarTx();
            con.close();
            
           
        } catch(Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_bt_eliminarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AñadirStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_añadir;
    private javax.swing.JButton bt_añadir1;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JLabel img_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cantidad;
    private javax.swing.JLabel lb_detalle;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_precio;
    private javax.swing.JSpinner sp_stock;
    private javax.swing.JTextField tx_detalle;
    private javax.swing.JTextField tx_nombre;
    private javax.swing.JTextField tx_precio;
    // End of variables declaration//GEN-END:variables
}
