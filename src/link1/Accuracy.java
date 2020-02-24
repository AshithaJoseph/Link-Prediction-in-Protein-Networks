/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Accuracy.java
 *
 * Created on Feb 7, 2014, 11:26:00 AM
 */

package link1;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;
/**
 *
 * @author project1
 */
public class Accuracy extends javax.swing.JFrame {
    private final static Accuracy a=new Accuracy();
    Userprofile user=Userprofile.getInstance();
    Propflow prop=Propflow.getInstance();
   // Validation v=Validation.getInstance();
    static String accu;
    static ArrayList<String> combinedarray1 = new ArrayList<String>();
    static ArrayList test_sample=new ArrayList();
    static ArrayList<String> main_sample = new ArrayList<String>();
    //static ArrayList target_sample=new ArrayList();
    static ArrayList<String> target_sample=new ArrayList<String>();
    static ArrayList<String> test_output_old = new ArrayList<String>();
    static double hit=0;
    static String hits;
    static ArrayList target_sample1=new ArrayList();
    static ArrayList target_sample2=new ArrayList();
    static double false_data=0;
    static int samp,not_in_target=0,indic=0;
    static ArrayList<String> lower_60=new ArrayList<String>();
    /** Creates new form Accuracy */
    public Accuracy() {
        initComponents();


        try{
            
            
ArrayList<String> test_output = new ArrayList<String>();

		ArrayList propflow_score=new ArrayList();
		ArrayList test_pair1=new ArrayList();
		ArrayList test_pair=new ArrayList();
		ArrayList test_pair2=new ArrayList();

                int i=0,j,k=0,flag2=0;
               // ArrayList<String> main_sample = new ArrayList<String>();
		//ArrayList test_sample=new ArrayList();
		//ArrayList<String> target_sample=new ArrayList<String>();


		int[] arr=new int[1000];

		/*File f = new File("D:/output.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
                String line;


		while ((line = bufferedReader.readLine()) != null) {

				test_output_old.add(line);
		}*/

                for(i=0;i<prop.combinedarray1.size();i++)
                {
                    test_output_old.add(prop.combinedarray1.get(i));
                }
		 samp=(int)(60*test_output_old.size())/100;
		System.out.println("sample size::"+samp);
		i=0;
		while(test_output.size()!=samp)
		{
			test_output.add(test_output_old.get(i));

                        System.out.println("test output"+test_output.get(i));
                        i++;
		}
                //**************************************
                j=0;
                while(i<test_output_old.size())
                {
                    lower_60.add(test_output_old.get(i));
                    i++;
                    System.out.println("lower_60 "+lower_60.get(j)+" j="+j);
                    j++;
                }
                //***********************************
		for (String s : test_output)
		{
			//System.out.println("s: "+s);
			String[] temp;
			temp = s.split("\t",2);
			/*for(i =0; i < temp.length ; i++)
			{
				System.out.println(temp[i]);

			}*/
			propflow_score.add(temp[0]);
			test_pair1.add(temp[1]);
			//test_pair2.add(temp[2]);
		}
		for (String s : user.target_sample)
		{
			//System.out.println("s: "+s);
			String[] temp;
			temp = s.split("\t",2);
			for(i =0; i < temp.length ; i++)
			{
				//System.out.println(temp[0]);

			}

			target_sample1.add(temp[0]);
			target_sample2.add(temp[1]);
		}



		/*for(j=0;j<test_pair1.size();j++)
		{
			for(i=0;i<target_sample2.size();i++)
			{
				if((test_pair1.get(j)).equals(target_sample1.get(i)))
				{
					//System.out.println("SUCCESS"+target_sample2.get(i));
					if((test_pair2.get(j)).equals(target_sample2.get(i)))
					{
									System.out.println(test_pair1.get(j)+"-"+test_pair2.get(j));
					hit++;
					break;
					}
                                        else{
                                            false_data++;
                                            break;
                                        }

				}
				/*else if((test_pair2.get(j)).equals(target_sample1.get(i)) && (test_pair1.get(j)).equals(target_sample2.get(i)))
				{
					System.out.println(test_pair1.get(j)+"-"+test_pair2.get(j));
					hit++;
					break;
				}*/
                               /* else{
                                    false_data++;
                                }
			}
		}*/
		for(i=0;i<user.target_sample.size();i++)
		{
			for(j=0;j<test_output.size();j++)
			{

				if((test_output.get(j)).equals(user.target_sample.get(i)))
				{

					hit++;
					break;
				}
                                else{
                                    false_data++;
                                }
			}
		}
                //**********************************
                for(i=0;i<lower_60.size();i++)
		{
			for(j=0;j<user.target_sample.size();j++)
			{

				if((lower_60.get(i)).equals(user.target_sample.get(j)))
				{
                                        indic=1;
                                        break;
				}

			}
                        if(indic==0)
                        {
                            not_in_target++;

                        }
                        indic=0;
		}
                //*****************
		System.out.println("target sample size:"+user.target_sample.size());
		System.out.println("Number of hits: "+hit);
                DecimalFormat twoDForm = new DecimalFormat("#.##");
		double accuracy_perc=((hit/user.target_sample.size())*100);
                twoDForm.format(accuracy_perc);
		System.out.println("Percentage of accuracy: "+accuracy_perc);

                accu=Double.toString(accuracy_perc);
                hits=Double.toString(hit);
                jLabel4.setText(hits);
                jLabel5.setText(accu);

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
   /* public static void put_val()
    {
        jLabel4.setText(hits);
                jLabel5.setText(accu);


    }*/
     public static Accuracy getInstance( ) {
      return a;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel1.setText("ACCURACY PREDICTION");

        jLabel2.setText("Number of Hits");

        jLabel3.setText("Percentage of Accuracy");

        jButton2.setText("Confusion Matrix");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Validation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                      //  dispose();
                        new Confusionmatrix().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
        new Validation().setVisible(true);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getCause());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Accuracy ac=new Accuracy();
                new Accuracy().setVisible(true);
                //   ac.put_val();
                //jLabel4.setText(hits);
                //jLabel5.setText(accu);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
