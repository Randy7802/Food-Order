/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurentsystem.billing;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import restaurentsystem.order.OrderManagement;
import restaurentsystem.order.OrdrManagement;
import restaurantsystem.RestaurentManagement;

/**
 *
 * @author Shahin
 */
public class BillManagement extends javax.swing.JFrame {
    private OrdrManagement  o;
    private TotalPrice t;
    private String name;
    private String quantity ;
    private double totalPrice=0;
    private double sum=0;
    
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public String getQuantity() {
        return quantity;
    }
    
    
    /**
     * Creates new form BillManagement
     */
    public BillManagement() {
        initComponents();
        display();
        performFileRelatedTask();
    }
    public void display(){
        t = new TotalPrice();
        text.setText(t.getFullNames().toString());    
        totalPriceArea.setText(t.getTotal());
    
    }
    private void performFileRelatedTask() {
        o = new OrdrManagement();
      //  RestaurentManagement r= new RestaurentManagement();
       // r.setVisible(true);
       // this.dispose();
       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        totalPriceArea = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        printB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        text.setEditable(false);
        text.setBackground(new java.awt.Color(204, 204, 255));
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        totalPriceArea.setEditable(false);
        totalPriceArea.setBackground(new java.awt.Color(255, 102, 102));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        payment.setText("Payment");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        printB.setText("Print");
        printB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalPriceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(printB)
                        .addGap(18, 18, 18)
                        .addComponent(payment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalPriceArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment)
                    .addComponent(backButton)
                    .addComponent(printB))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        OrderManagement om = new OrderManagement();
        om.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:
        o.delete();
        t = new TotalPrice();
        
        RestaurentManagement rm = new RestaurentManagement();
        rm.setVisible(true);
        this.dispose();
        try {
            PrintWriter pw1 = new PrintWriter(new FileOutputStream("temp.txt"));
            PrintWriter pw2 = new PrintWriter(new FileOutputStream("order.txt"));
            PrintWriter pw3 = new PrintWriter(new FileOutputStream("totalBill.txt",true));
            pw3.println(t.getFullNames()+"\t");
            
            
            
            pw1.close();;
            pw2.close();
            pw3.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_paymentActionPerformed

    private void printBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBActionPerformed
        // TODO add your handling code here:
        try {
            
            boolean complete = text.print();
            if(complete){
            
                JOptionPane.showMessageDialog(null, "Done printing");
            }
            else{
                JOptionPane.showMessageDialog(null, "Printing cancel","Printer",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printBActionPerformed

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
            java.util.logging.Logger.getLogger(BillManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton payment;
    private javax.swing.JButton printB;
    public javax.swing.JTextArea text;
    private javax.swing.JTextField totalPriceArea;
    // End of variables declaration//GEN-END:variables
}
