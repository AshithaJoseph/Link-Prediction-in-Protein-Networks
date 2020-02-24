/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Userprofile.java
 *
 * Created on Jan 21, 2014, 2:08:44 PM
 */
package link1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Seban
 */
public class Userprofile extends javax.swing.JFrame {

    private Hashtable<Integer, String> hprdHastable = new Hashtable<Integer, String>();

    /** Creates new form Userprofile */
    public Userprofile() {
        initComponents();
    }

    public void setStatusMessage(String message) {
        jLabel5.setText(message);
    }

    public void clearStatusMessage() {
        jLabel5.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Enter your PPI data: ");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Eg: BRCA1 TP53", "PMA BRCA2" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Percentage of Sampling");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 13));
        jLabel3.setText("LINK PREDICTION");

        jLabel4.setText("Status: ");

        jLabel5.setForeground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(472, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 72, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(31, 31, 31)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 73, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(432, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel1)
                            .addGap(14, 14, 14)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(94, 94, 94)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(88, 88, 88)
                    .addComponent(jButton2)
                    .addGap(0, 42, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static int perc2;
    String s0 = null;
    static int tot_intr;
    int inv = 0;
    int flag = 0;

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jButton2.setEnabled(false);

        new Thread(new Runnable() {

            public void run() {

                try {
                    if (hprdHastable.size() == 0) {
                        setStatusMessage("Reading HPRD...");
                        readhprdfile();
                    }

                    setStatusMessage("Reading Input...");

                    String val = jTextArea1.getText();
                    try {
                        perc2 = Integer.parseInt(jTextField2.getText());

                        } catch (Exception e) {
                        perc2 = 0;
                        jTextField2.setText("0");
                    }

                    ArrayList orgProtein1 = new ArrayList();
                    ArrayList orgProtein2 = new ArrayList();
                    //FileWriter f_out = null;

                    //File f = new File("D:/input.txt"); //inserting user input into input.txt file
                    //if (f.exists()) {
                    //} else {
                       // f.createNewFile();
                  //  }
                   // f_out = new FileWriter(f);
                    //System.out.println("helllooo..."+val);
                    String[] strs = val.split("\\n");

                    //ArrayList<String> allItems = new ArrayList<String>();
                    //Collections.addAll(allItems, allItemsArray); to convert a string to an arraylist

                    //sampling starts here....
                    //Random sampling...

                   /* Random randomGen = new Random();
                    int requiredNumOfItems = allItems.size() * perc2 / 100;

                    String[] strs = new String[requiredNumOfItems];

                    for (int c = 0; c < requiredNumOfItems; c++) {

                        int index = randomGen.getRandom(0, allItems.size() - 1);
                        strs[c] = allItems.get(index);

                        allItems.remove(index);

                    }*/
                   /* ArrayList freqofprotein=new ArrayList();
                     int pcount=0;
                    for (int i = 0; i < orgProtein1.size(); i++) {
                       String s=(String)orgProtein1.get(i);
                       for(int j=0;j<orgProtein1.size();j++)
                       {
                           if(s.equals((String)orgProtein1.get(j)))
                           {
                             pcount++;
                           }
                       }


                    }*/








                   tot_intr = strs.length;

                    for (int i = 0; i < tot_intr; i++) {

                        //f_out.write(strs[i]);
                        //f_out.write(System.getProperty("line.separator"));

                        String tab_cut[] = strs[i].split("\\s+");
                        if (tab_cut.length != 2) {
                            System.out.println("error....");
                            javax.swing.JOptionPane.showMessageDialog(null, "Invalid Input - 1!! Len: " + tab_cut.length);
                            break;
                        }
                        String combined = tab_cut[0].trim() + tab_cut[1].trim();

                        if (!hprdHastable.containsValue(combined)) {
                            System.out.println("Not found in hprd: " + tab_cut[0].trim() + "," + tab_cut[1].trim() + " .Not added...");
                            javax.swing.JOptionPane.showMessageDialog(null, "Not found in hprd: " + tab_cut[0].trim() + "," + tab_cut[1].trim() + " .Removing...");

                        } else {
                            orgProtein1.add(tab_cut[0]);
                            orgProtein2.add(tab_cut[1]);

                        }

                    }

                   
                    Hashtable freqhash = new Hashtable();
                    Hashtable freqhash1 = new Hashtable();
                    Set<String> unique = new HashSet<String>(orgProtein1);
                    for (String key : unique) {
                        System.out.println(key + ": " + Collections.frequency(orgProtein1, key));
                        freqhash.put(key, Collections.frequency(orgProtein1, key));

                    }
                    System.out.println(freqhash);

                    Set<String> unique1 = new HashSet<String>(orgProtein2);

                    for (String key : unique1) {
                        System.out.println(key + ": " + Collections.frequency(orgProtein2, key));
                        if(!freqhash.containsKey(key))
                        freqhash.put(key, Collections.frequency(orgProtein2, key));

                    }
                     System.out.println(freqhash);








//*********************************************************************************************************

                    ArrayList<String> combinedOrgProtein = new ArrayList<String>();


                    for (int i = 0; i < orgProtein1.size(); i++) {
                        combinedOrgProtein.add((String) orgProtein1.get(i) + (String) orgProtein2.get(i));
                    }

                    ArrayList<String> uniqueProtein = new ArrayList<String>();
                    ArrayList<String> combinedarray = new ArrayList<String>();
                    String protein;
                    for (int i = 0; i < orgProtein1.size(); i++) {
                        protein = (String) orgProtein1.get(i);

                        if (!uniqueProtein.contains(protein)) {
                            uniqueProtein.add(protein);

                        }
                        protein = (String) orgProtein2.get(i);

                        if (!uniqueProtein.contains(protein)) {
                            uniqueProtein.add(protein);
                        }


                    }
                    System.out.println("uniqueProtein size: " + uniqueProtein.size());
                    for (int i = 0; i < uniqueProtein.size(); i++) {
                        System.out.println(uniqueProtein.get(i));
                    }

                    int[][] weight = new int[uniqueProtein.size()][uniqueProtein.size()];



                    for (int i = 0; i < uniqueProtein.size(); i++) {
                        for (int j = 0; j < uniqueProtein.size(); j++) {

                            String rowProtein = uniqueProtein.get(i);
                            String colProtein = uniqueProtein.get(j);

                            String combined = rowProtein + colProtein;
                            combinedarray.add(combined);

                           String combinedReverse = colProtein+rowProtein;

                            for (int k = 0; k < combinedOrgProtein.size(); k++) {
                                if (combinedOrgProtein.get(k).toString().equals(combined) || combinedOrgProtein.get(k).toString().equals(combinedReverse)) {
                                    weight[i][j] = ++weight[i][j];
                                }
                            }

                        }
                    }

                    System.out.println("MATRIX");

                    for (int i = 0; i < uniqueProtein.size(); i++) {
                        System.out.print("\t\t" + uniqueProtein.get(i));
                    }
                    System.out.println();
                    for (int i = 0; i < uniqueProtein.size(); i++) {
                        for (int j = 0; j < uniqueProtein.size(); j++) {
                            if (j == 0) {
                                System.out.print(uniqueProtein.get(i) + "\t\t");
                            }
                            System.out.print(weight[i][j] + "\t\t");

                        }
                        System.out.println();

                    }
                    System.out.println("combined array");
                    for (int i = 0; i < combinedarray.size(); i++) {
                        String value = (String) combinedarray.get(i);
                        System.out.println(value);
                    }

                    /*
                    for (int i = 0; i < uniqueProtein.size(); i++) {
                    for (int j = 0; j < uniqueProtein.size(); j++) {

                    System.out.print(matrix[i][j]+"\t");

                    }
                    System.out.println();

                    }

                     */

                    System.out.println("\n"+"\n"+"array1");
                    for (int i = 0; i < orgProtein1.size(); i++) {
                        String value = (String) orgProtein1.get(i);
                        System.out.println(value);
                    }

                    System.out.println("array2");
                    for (int i = 0; i < orgProtein2.size(); i++) {
                        String value = (String) orgProtein2.get(i);
                        System.out.println(value);
                    }


                    //f_out.write(val);
                   // f_out.close();


                    setStatusMessage("Validating Input...");


                } catch (Exception e) {
                    e.printStackTrace();
                }


                jButton2.setEnabled(true);


            }
        }).start();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void readhprdfile() {
        hprdHastable = new Hashtable<Integer, String>();
        File f = new File("D:/hprd.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            String line;
            String combined;
            int lineNum = 1;
            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println("Reading line: " + lineNum);
                String lineItems[] = line.split("\t");

                if (lineItems.length != 2) {
                    System.err.println("Failed to read at line " + lineNum);
                    continue;
                }

                combined = lineItems[0].trim() + lineItems[1].trim();
                hprdHastable.put(lineNum, combined);

                // masterInput.containsValue("ALDH1A1ALDH1A1");

                lineNum++;

            }

        } catch (Exception ex) {
            Logger.getLogger(Userprofile.class.getName()).log(Level.SEVERE, null, ex);
        }


            propflow p=new propflow();

    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Userprofile().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
