/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm_sys;

import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author bhanu
 */
public class register extends javax.swing.JFrame {
   

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        //String user_type = cbox1.getSelectedItem().toString();
    }
    //String user_type = cbox1.getSelectedItem().toString();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pass1 = new javax.swing.JTextField();
        pho = new javax.swing.JTextField();
        mail1 = new javax.swing.JTextField();
        user1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jButton4.setText("jButton4");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setText("REGISTRATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 227, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel2.setText("PASSWORD :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, 37));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel3.setText("E-MAIL :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, 37));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel4.setText("PHONE :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, 37));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel5.setText("USERNAME :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, 37));
        getContentPane().add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 276, 37));

        pho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoActionPerformed(evt);
            }
        });
        getContentPane().add(pho, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 276, 37));
        getContentPane().add(mail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 276, 37));
        getContentPane().add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 276, 37));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel6.setText("USER TYPE :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        cbox1.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        cbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select user type", "Admin", "User" }));
        cbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox1ActionPerformed(evt);
            }
        });
        getContentPane().add(cbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 276, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton3.setText("REGISTER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 116, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pm_sys/ZPcDax.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pharmacy_management PM1= new pharmacy_management();
        setVisible(false);
        PM1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void phoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    
        JSONObject obj = new JSONObject();
        JSONObject obj1 = new JSONObject();
        JSONArray jrr = new JSONArray();
        JSONArray jrr1 = new JSONArray();
        JSONParser jp = new JSONParser();
        try{
            FileReader file = new FileReader("UserData.json");
            FileReader file1 = new FileReader("verify.json");
            jrr=(JSONArray)jp.parse(file);
            jrr1=(JSONArray)jp.parse(file1);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error occured");
        }
        
        obj.put("Username",user1.getText());
        obj.put("Password",pass1.getText());
        obj.put("User-type",cbox1.getSelectedItem().toString());
        obj.put("E-mail",mail1.getText());
        obj.put("Phone",pho.getText());
        obj1.put("Username",user1.getText());
        obj1.put("Password",pass1.getText());
        obj1.put("User-type",cbox1.getSelectedItem().toString());
        jrr.add(obj);
        jrr1.add(obj1);
        try{
            FileWriter file = new FileWriter("UserData.json");
            FileWriter file1 = new FileWriter("verify.json");
            file.write(jrr.toJSONString());
            file1.write(jrr1.toJSONString());
            file.close();
            file1.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error occured");
        }
        JOptionPane.showMessageDialog(null,"Data Saved");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cbox1.setSelectedItem("Select user type");
        user1.setText("");
        pass1.setText("");
        mail1.setText("");
        pho.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mail1;
    private javax.swing.JTextField pass1;
    private javax.swing.JTextField pho;
    private javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables
}
