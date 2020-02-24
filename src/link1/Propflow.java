/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package link1;

import java.io.*;
import java.util.ArrayList;
import java.lang.*;
import java.util.Collections;

/**
 *
 * @author project1
 */
public class Propflow {
      //  double[][] weight=new double[][]{{1,3,1,0},{3,1,0,0},{1,0,1,2},{0,0,2,1}};
  Userprofile user=Userprofile.getInstance();
  private final static Propflow prop=new Propflow();
  static ArrayList<String> combinedarray1 = new ArrayList<String>();
 // static ArrayList<String> uniqueProtein = new ArrayList<String>();

     public void flow(int[][] weight,int matsize,ArrayList<String> uniqueProtein,ArrayList<String> combinedarray,ArrayList<String> Actualtestdata)
    {
       int[] visited=new int[matsize];
       double[][] propflow=new double[matsize][matsize];
       int[] queue=new int[400];
       double[] sumoutput=new double[matsize];
       int i,j,source,front=0,rear=0,s,k=0;
       double large=0,pp,swap;
       double[] nodeinput=new double[matsize];
        ArrayList<String> zerocut = new ArrayList<String>();
        String prop,temp;
        int mat;
         mat=matsize*matsize;
         double[] zeroprop=new double[mat];
       double[] proparray=new double[mat];
        System.out.print("New   Siiize"+matsize);
       for(i=0;i<matsize;i++)
       for(j=0;j<matsize;j++)
         sumoutput[i]=sumoutput[i]+weight[i][j];
      System.out.println("\n");
      System.out.print("\nSumoutput value\n");
      for(i=0;i<matsize;i++)
      {
        System.out.print(sumoutput[i]);
        System.out.print("\t");
      }

     for(i=0;i<matsize;i++)
      for(j=0;j<matsize;j++)
       propflow[i][j]=0;

     for(i=0;i<matsize;i++)
       visited[i]=0;

     for(s=0;s<matsize;s++)
     {
        for(j=0;j<matsize;j++)
	  visited[j]=0;
        for(i=0;i<matsize;i++)
        {
         if(i==s)
           nodeinput[i]=1;
       	 else
           nodeinput[i]=weight[s][i]/sumoutput[s];
        }
       front=0;
       rear=0;
       queue[front]=s;
       rear++;
     // visited[s]=1;
       while(!(front>rear))		//if given condition doesnt wrk try this!!!!  (front==rear+1)
       {
        source=queue[front];
	for(i=0;i<matsize;i++)
	{
	 if(weight[source][i]>=1)
	 {
	  if(visited[i]==0)
	   {
	      propflow[s][i]=(double)(nodeinput[source]+(weight[source][i]/sumoutput[s]));
              //propflow[source][i]
              if(s!=i)
              {
                queue[rear]=i;
		rear++;
              }
              visited[i]=1;
	   }
         }
	}
	front++;
      }
     }

   System.out.print("\nPropflow matrix");
    for(i=0;i<matsize;i++)
   {
     //System.out.print("Row"+i);
     System.out.print("\n");
     for(j=0;j<matsize;j++)
     {
       pp=(double) Math.round(propflow[i][j] * 100) / 100;
       System.out.print(pp);
       System.out.print("\t");
     }
   }
 //  for(i=0;i<matsize;i++)
  // {
       // System.out.print("protein size unique");
      // System.out.print(user.uniqueProtein.size());
    //   System.out.print("\n");
  // }
  System.out.println("\nProtein1\tProtein2\tPropflowvalue");
    for(i=0;i<matsize;i++)
   {
     for(j=0;j<matsize;j++)
     {
   System.out.print(uniqueProtein.get(i)+"\t");
       pp=(double) Math.round(propflow[i][j] * 100) / 100;
       System.out.print(uniqueProtein.get(j)+"\t");
       System.out.print(pp);
       System.out.print("\n");    
     }
   }
  System.out.println("My print");
  for(i=0;i<uniqueProtein.size();i++)
      System.out.print(uniqueProtein.get(i)+"\n");
   System.out.println("My print");
  for(i=0;i<mat;i++)
      System.out.print(combinedarray.get(i)+"\n");

//propflow matrix to 1D array proparray for sorting
  for(i=0;i<matsize;i++)
    for(j=0;j<matsize;j++)
	  {
	    proparray[k]=propflow[i][j];
		k++;
	  }

 //sorting proparray and corresponding pair in combined arraylist Propsort
  
  for (i=0;i<(mat-1);i++)
  {
    for(j=0;j<mat-i-1;j++)
    {
      if(proparray[j]<proparray[j+1])
      {
        swap= proparray[j];
        proparray[j]= proparray[j+1];
        proparray[j+1]=swap;
		/*temp=Propsort.get(i);
		Propsort.add(j,Propsort.get(j+1));
        Propsort.add(j+1,temp); */
		Collections.swap(combinedarray,j,j+1);
      }
    }
  }
int zerocount=0;
  for(i=0;i<mat;i++)
      if(proparray[i]!=0)
      {
          zerocut.add(combinedarray.get(i));
          zeroprop[i]=proparray[i];
          zerocount++;
      }
   System.out.print("Without zeerooo");
   for(i=0;i<zerocount;i++)
   System.out.print(zerocut.get(i)+"\n");
   System.out.print("combinedaray....");

   for(i=0;i<zerocount;i++)
   {
       combinedarray1.add(zerocut.get(i));
       System.out.print(combinedarray1.get(i)+"\n");
   }

   FileWriter f_out = null;
  FileWriter f_outt = null;
  try {

		//propflow value and combined interaction pair to output.txt after sorting
      //  File f = new File("/E:/College/Project/Code/Input/output.txt");
      File f = new File("/D:/output.txt");
        if (f.exists())
        {
        }
        else
        {
          f.createNewFile();
        }
        f_out = new FileWriter(f);
		for(i=0;i<zerocount;i++)
        {
	      pp=(double) Math.round(proparray[i] * 100) / 100;
		  prop=String.valueOf(pp);
	      f_out.append(prop+"\t");
		  f_out.append(zerocut.get(i)+"\t");
          f_out.append("\r\n");
		}

	  //entering propflow value and proteins of two arraylists before sorting to test.txt
	 // File ff = new File("/E:/College/Project/Code/Input/test.txt");
           File ff = new File("/D:/test.txt");
	  if (ff.exists())
        {
        }
        else
        {
          ff.createNewFile();
        }
        f_outt = new FileWriter(ff);

	  for(i=0;i<matsize;i++)
        for(j=0;j<matsize;j++)
	    {
	      pp=(double) Math.round(propflow[i][j] * 100) / 100;
		  prop=String.valueOf(pp);
	      f_outt.append(prop+"\t");
		  f_outt.append( uniqueProtein.get(i)+"\t");
		  f_outt.append( uniqueProtein.get(j));
		  f_outt.append("\r\n");
		}
	}
	  catch (IOException ex) {
                             }
	  finally
	  {
        try {
              f_out.close();
			  f_outt.close();
            }
		catch (IOException ex) {
                               }
      }
Curve cf=new Curve();
                    cf.auc(Actualtestdata,zerocut,zeroprop,zerocount);

    }
public static Propflow getInstance( ) {
      return prop;
    }
}
