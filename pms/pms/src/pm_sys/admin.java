/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm_sys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhanu
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    private HashNode[] buckets;
    private int numOfBuckets=10; 
    //private int count=0;
    private int size; 
    private int [] sz = new int[10];
    
    public admin() {
        initComponents();
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
        for(int t=0; t<10;t++)sz[t]=0;
        try {
            // TODO add your handling code here:
            BufferedReader reader = new BufferedReader(new FileReader("package_details.txt"));
            
            Object [] lines = reader.lines().toArray();
            for(int i=0;i<lines.length;i++)
            {//System.out.println(lines[i]);
                String[] row = lines[i].toString().split(" ");
                int k=Integer.parseInt(row[0]);
                String v=row[1];
                int q=Integer.parseInt(row[2]);
                int pi=Integer.parseInt(row[3]);
                put(k,v,q,pi);
            }
            //for(int t=0; t<10;t++)System.out.println(sz[t]);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    
    private class HashNode {
        private Integer key; // Can be generic type
        private String value; // Can be generic type
        private HashNode next; // reference to next HashNode
        private Integer Qy;
        private Integer Pz;

        public HashNode(Integer key, String value,Integer Qy,Integer Pz){
            this.key = key;
            this.value = value;
            this.Qy = Qy;
            this.Pz = Pz;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int put(Integer key, String value,Integer Qy,Integer Pz){
        
        if(key == null || value == null){
            throw new IllegalArgumentException("Key or Value is null !!!");
        }
        int bucketIndex = getBucketIndex(key);
        int w=bucketIndex;
        
        do
        {
            HashNode head = buckets[w];
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                head.Qy=Qy;
                head.Pz=Pz;
                return 1;
            }
            head = head.next;
        }
        
        if(size == 10) {JOptionPane.showMessageDialog(rootPane,"Storage is FULL !");return 0;}
        if(sz[w]<1)
        {
            head = buckets[w];
        HashNode node = new HashNode(key, value,Qy,Pz);
        node.next = head;
        buckets[w] = node;
        ++sz[w];
        ++size;
        //System.out.println(size);
        return 1;
        }
        
        w= (w+1) % 10;
        }while(w!=bucketIndex);
        //for(int t=0; t<10;t++)System.out.println(sz[t]);
        return 2;
        
    }

    private int getBucketIndex(Integer key){
        return key % numOfBuckets; // buckets.length
    }

    public String get(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null !!!");
        }
        int bucketIndex = getBucketIndex(key);
        int r=bucketIndex;
        
        do
        {
            HashNode head = buckets[r];
        while(head != null)
        {
            if(head.key.equals(key)){
                mname.setText(head.value);
                mqty.setText(head.Qy.toString());
                mpz.setText(head.Pz.toString());
            }
            head = head.next;
            }
        r= (r+1) % 10;
        }while(r!=bucketIndex);

        return null;
    }

    public String remove(Integer key, String value,Integer Qy,Integer Pz){
        if(key == null){
            throw new IllegalArgumentException("Key is null !!!");
        }

        int bucketIndex = getBucketIndex(key);
        int y=bucketIndex;
        
        do
        {
            HashNode head = buckets[y]; 
        HashNode previous = null;

        while(head != null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }
        if(head == null){
            y=(y+1)%10;
            
        }
        else
        {
            if(head.key.equals(key))
        {--size;
        --sz[y];
            if(previous != null )
        {
            
            previous.next = head.next;
          
        } 
        else 
        {
            buckets[y] = head.next;
        }
        }
        
        else
        {
            y=(y+1)%10;
        }
        }
        
        
        }while(y!=bucketIndex);
        return null;
    }
     public void printAll()
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hashmap.txt"));
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("package_details.txt"));
            for(int i=0;i<10;i++)
        {
            HashNode head = buckets[i];
            writer.write("{"+i+"}");
            
            while(head != null)
            {
            writer.write("\n"+"->"+"ID:"+head.key+"|"+"Name:"+head.value+"|"+"Quantity:"+head.Qy+"|"+"Price:"+head.Pz);
            writer1.write(head.key+" "+head.value+" "+head.Qy+" "+head.Pz);
            writer1.write("\n");
          
            head = head.next;
            }
            writer.write("\n");
        }
        writer.close();
        writer1.close();
        } catch (IOException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /////////////////////////////////////////////////////////////////////////////////////////

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        mqty = new javax.swing.JTextField();
        mpz = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setText("WELCOME ADMIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 270, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 110, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel2.setText("PACKAGE ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel3.setText("PACKAGE NAME :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel4.setText("AVAILABLE SEATS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel5.setText("PACKAGE PRICE :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midActionPerformed(evt);
            }
        });
        getContentPane().add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 272, 33));

        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        getContentPane().add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 272, 33));

        mqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mqtyActionPerformed(evt);
            }
        });
        getContentPane().add(mqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 272, 33));
        getContentPane().add(mpz, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 272, 33));

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        jButton5.setFont(new java.awt.Font("Serif", 3, 19)); // NOI18N
        jButton5.setText("VIEW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 280, 170, 30));

        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton6.setText("CLEAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 110, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton7.setText("SEARCH");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PACKAGE ID", "PACKAGE NAME", "AVAILABLE SEATS", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 680, 200));

        jButton8.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jButton8.setText("View File  Contents");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 190, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 340, 380));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pm_sys/407986.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        pharmacy_management PM1= new pharmacy_management();
        setVisible(false);
        PM1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(mid.getText());
        String mn=mname.getText();
        int q=Integer.parseInt(mqty.getText());
        int z=Integer.parseInt(mpz.getText());
        //HashTable table = new HashTable(10);
        int u=put(id, mn, q, z);
        if(u==1)
        JOptionPane.showMessageDialog(rootPane,"Added Successfully");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(mid.getText());
        String mn=mname.getText();
        int q=Integer.parseInt(mqty.getText());
        int z=Integer.parseInt(mpz.getText());
        //HashTable table = new HashTable(10);
        remove(id,mn,q,z);
        JOptionPane.showMessageDialog(rootPane,"Removed Successfully");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         //HashTable table = new HashTable(10);
        // printAll();
        int id=Integer.parseInt(mid.getText());
        String mn=mname.getText();
        int q=Integer.parseInt(mqty.getText());
        int z=Integer.parseInt(mpz.getText());
        //HashTable table = new HashTable(10);
        put(id, mn, q, z);
        JOptionPane.showMessageDialog(rootPane,"Updated Successfully");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        printAll();
        JOptionPane.showMessageDialog(rootPane,"Data Saved Successfully");
        try {
            // TODO add your handling code here:
            BufferedReader reader = new BufferedReader(new FileReader("package_details.txt"));
            DefaultTableModel M=(DefaultTableModel)jTable1.getModel();
            M.setRowCount(0);
            Object [] lines = reader.lines().toArray();
            for(int i=0;i<lines.length;i++)
            {
                String[] row = lines[i].toString().split(" ");
                M.addRow(row);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        mid.setText("");
        mname.setText("");
        mqty.setText("");
        mpz.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        get(Integer.parseInt(mid.getText()));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    private void mqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mqtyActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\yoges\\Desktop\\pms\\pms\\hashmap.txt"));
            String msg = new String();
            jTextArea1.read(br, null);
            br.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mpz;
    private javax.swing.JTextField mqty;
    // End of variables declaration//GEN-END:variables
}
