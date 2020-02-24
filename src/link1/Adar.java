/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Adar.java
 *
 * Created on Feb 10, 2014, 9:44:34 AM
 */

package link1;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author PC
 */
public class Adar extends javax.swing.JFrame {

    /** Creates new form Adar */
                //Validation v=Validation.getInstance();
                Validation v=new Validation();
                Accuracy a=Accuracy.getInstance();
                Userprofile user=Userprofile.getInstance();

    static ArrayList<String> target_sample=new ArrayList<String>();
                static ArrayList<String> MergedProtein = new ArrayList<String>();
    		static float[] adar=new float[10000];
                static double hit_adar=0;
                int i,j;
    public Adar() {
        initComponents();
        String proteinswap;
			float swap;
			for(i=0;i<v.MergedProtein.size();i++)
				for(j=0;j<v.MergedProtein.size()-i-1;j++)
					if(v.adar[j]<v.adar[j+1])
					{
						swap=v.adar[j];
						v.adar[j]=v.adar[j+1];
						v.adar[j+1]=swap;
						proteinswap=v.MergedProtein.get(j);
						v.MergedProtein.set(j,v.MergedProtein.get(j+1));
						v.MergedProtein.set(j+1,proteinswap);
					}
			System.out.println("\n\nMerged Protein:");

                         ArrayList<String> useful_list=new ArrayList<String>();
                        for(i=0;i<v.MergedProtein.size();i++)
                        {
                            if(v.adar[i]>0)
                            {
                                useful_list.add(v.MergedProtein.get(i));
                                jTextArea1.append(v.MergedProtein.get(i)+"\t"+v.adar[i]);
                        jTextArea1.append("\n");
                            }

                        }
		/*for (i = 0; i < v.MergedProtein.size(); i++)
		{
			System.out.println(v.MergedProtein.get(i)+"\t"+v.adar[i]);
                        jTextArea1.append(v.MergedProtein.get(i)+"\t"+v.adar[i]);
                        jTextArea1.append("\n");
		}*/

                for(i=0;i<user.target_sample.size();i++)
		{
			for(j=0;j<useful_list.size();j++)
			{

				if((useful_list.get(j)).equals(user.target_sample.get(i)))
				{

					hit_adar++;
					break;
				}
			}
		}
                System.out.println("Number of hits: "+hit_adar);
		double accuracy_perc=((hit_adar/user.target_sample.size())*100);

		System.out.println("Percentage of accuracy: "+accuracy_perc);

                String accu=Double.toString(accuracy_perc);
                String hits=Double.toString(hit_adar);
                jLabel4.setText(hits);
                jLabel5.setText(accu);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel1.setText("Adamic/Adar Index");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Number of Hits");

        jLabel3.setText("Percentage of Accuracy");

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //dispose();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}