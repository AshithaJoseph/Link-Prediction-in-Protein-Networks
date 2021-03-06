/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Jaccard.java
 *
 * Created on Feb 10, 2014, 9:24:27 AM
 */

package link1;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author PC
 */
public class Jaccard extends javax.swing.JFrame {

    /** Creates new form Jaccard */

    static ArrayList<String> target_sample=new ArrayList<String>();
                static ArrayList<String> MergedProtein = new ArrayList<String>();
    		static float[] jaccard=new float[10000];
                static double hit_jaccard=0;
                int i,j;
                    static final ArrayList<String> uniqueProtein = new ArrayList<String>();
                    static final ArrayList<String> uniqueProtein1 = new ArrayList<String>();
                   // Validation v=Validation.getInstance();
                    Validation v=new Validation();
                Accuracy a=Accuracy.getInstance();
                Userprofile user=Userprofile.getInstance();

    		static float[] common_neighbours=new float[10000];
                static int hit_neighbour=0;
                static int usize;
    public Jaccard() {
        initComponents();

                    String proteinswap;
			float swap;
			for(i=0;i<v.MergedProtein.size();i++)
				for(j=0;j<v.MergedProtein.size()-i-1;j++)
					if(v.jaccard[j]<v.jaccard[j+1])
					{
						swap=v.jaccard[j];
						v.jaccard[j]=v.jaccard[j+1];
						v.jaccard[j+1]=swap;
						proteinswap=v.MergedProtein.get(j);
						v.MergedProtein.set(j,v.MergedProtein.get(j+1));
						v.MergedProtein.set(j+1,proteinswap);
					}
			System.out.println("\n\nMerged Protein:");
                         ArrayList<String> useful_list=new ArrayList<String>();
                        for(i=0;i<v.MergedProtein.size();i++)
                        {
                            if(v.jaccard[i]>0)
                            {
                                useful_list.add(v.MergedProtein.get(i));
                                jTextArea1.append(v.MergedProtein.get(i)+"\t"+v.jaccard[i]);
                        jTextArea1.append("\n");
                            }

                        }
		/*for (i = 0; i < v.MergedProtein.size(); i++)
		{
			System.out.println(v.MergedProtein.get(i)+"\t"+v.jaccard[i]);
                        jTextArea1.append(v.MergedProtein.get(i)+"\t"+v.jaccard[i]);
                        jTextArea1.append("\n");
		}*/

                for(i=0;i<user.target_sample.size();i++)
		{
			for(j=0;j<useful_list.size();j++)
			{

				if((useful_list.get(j)).equals(user.target_sample.get(i)))
				{

					hit_jaccard++;
					break;
				}
			}
		}
                System.out.println("Number of hits: "+hit_jaccard);
		double accuracy_perc=((hit_jaccard/user.target_sample.size())*100);

		System.out.println("Percentage of accuracy: "+accuracy_perc);

                String accu=Double.toString(accuracy_perc);
                String hits=Double.toString(hit_jaccard);
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
        jLabel1.setText("Jaccard's Coefficient");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(224, 224, 224))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(jButton1)))
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
                new Jaccard().setVisible(true);
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
