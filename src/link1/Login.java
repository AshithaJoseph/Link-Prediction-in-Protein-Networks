/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Jan 21, 2014, 1:16:51 PM
 */

package link1;

/**
 *
 * @author Seban
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    public Login() {
        initComponents();
        setSize(800,800);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel2.setText("UserName");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 110, 100, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 170, 90, 22);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 240, 80, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 110, 140, 30);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 3, 36));
        jLabel1.setText("Link Prediction in protein networks");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 500, 50);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(140, 170, 140, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/link1/links1.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-70, -50, 1590, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String u=jTextField1.getText();
        String p=jPasswordField1.getText();
        if(u.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Username Empty!!");
        } else if(p.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Password Empty!!");
        }
        
        else if((u.equals("Ann") && p.equals("annanjanu")) || (u.equals("Ashitha") && p.equals("ash")) || (u.equals("Chinnu") && p.equals("cjk"))) {

                         dispose();
                        new Userprofile().setVisible(true);
            }
        else
        {
        javax.swing.JOptionPane.showMessageDialog(null, "Invalid login");}
}//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
