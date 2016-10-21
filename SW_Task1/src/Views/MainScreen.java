package Views;

import Dao.ProductDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Tables.Product;

public class MainScreen extends javax.swing.JFrame {

    public MainScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Retrieve_all_products = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        T = new javax.swing.JTable();
        Insert = new javax.swing.JButton();
        Retrive_by_manufacturer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Retrieve_all_products.setText("Retrieve all products");
        Retrieve_all_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Retrieve_all_productsActionPerformed(evt);
            }
        });

        T.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Type", "Manufacturer", "ProductionDate", "ExpiryDate"
            }
        ));
        jScrollPane2.setViewportView(T);

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Retrive_by_manufacturer.setText("Retrive by manufacturer");
        Retrive_by_manufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Retrive_by_manufacturerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Retrieve_all_products, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Retrive_by_manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Retrieve_all_products, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Retrive_by_manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        UpdateScreen up = new UpdateScreen();
        up.setVisible(true);
        up.setLocationRelativeTo(null);
        up.setDefaultCloseOperation(up.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DeleteScreen Del = new DeleteScreen();
        Del.setVisible(true);
        Del.setLocationRelativeTo(null);
        Del.setDefaultCloseOperation(Del.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_DeleteActionPerformed

    private void Retrieve_all_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retrieve_all_productsActionPerformed
        ProductDao d = new ProductDao();
        ArrayList<Product> products = d.GetAllProducts();

        Object[] tableColumnNames = new Object[5];

        tableColumnNames[0] = "ProductID";
        tableColumnNames[1] = "Type";
        tableColumnNames[2] = "Manufacturer";
        tableColumnNames[3] = "ProductionDate";
        tableColumnNames[4] = "ExpiryDate";

        DefaultTableModel tbd = new DefaultTableModel();
        tbd.setColumnIdentifiers(tableColumnNames);
        this.T.setModel(tbd);

        Object[] RowProduct = new Object[5];
        for (int i = 0; i < products.size(); i++) {
            RowProduct[0] = products.get(i).getProductID();
            RowProduct[1] = products.get(i).getType();
            RowProduct[2] = products.get(i).getManufacturer();
            RowProduct[3] = products.get(i).getProductionDate();
            RowProduct[4] = products.get(i).getExpiryDate();

            tbd.addRow(RowProduct);

        }
    }//GEN-LAST:event_Retrieve_all_productsActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        InsertScreen In = new InsertScreen();
        In.setVisible(true);
        In.setLocationRelativeTo(null);
        In.setDefaultCloseOperation(In.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_InsertActionPerformed

    private void Retrive_by_manufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retrive_by_manufacturerActionPerformed
        RetrieveScreen Re = new RetrieveScreen();
        Re.setVisible(true);
        Re.setLocationRelativeTo(null);
        Re.setDefaultCloseOperation(Re.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_Retrive_by_manufacturerActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Retrieve_all_products;
    private javax.swing.JButton Retrive_by_manufacturer;
    private javax.swing.JTable T;
    private javax.swing.JButton Update;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
