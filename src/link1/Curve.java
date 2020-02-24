/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package link1;
import java.io.*;
import java.util.ArrayList;
import java.lang.*;
import java.util.Collections;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Curve {

     Propflow pf=new Propflow();
    public void auc(ArrayList<String> Actualtestdata,ArrayList<String> Outputlist, double[] proparray,int mat)
    {
        //ArrayList<String> Outputlist = new ArrayList<String>();
	//ArrayList<String> Actualtestdata = new ArrayList<String>();
	ArrayList<String> Firstset = new ArrayList<String>();
	ArrayList<String> Secondset = new ArrayList<String>();
	ArrayList<String> Inlist = new ArrayList<String>();
	ArrayList<String> Outlist = new ArrayList<String>();
        double[] Twotrain=new double[] {0.5,0.58,0.6,0.62};
        double[] Fortrain=new double[] {0.68,0.72,0.75,0.79};
        double[] Sixtrain=new double[] {0.83,0.86,0.88,0.91};
        double[] Egttrain=new double[] {0.93,0.95,1.0,1.09};
	double[] Inprop=new double[5000];
	double[] Outprop=new double[5000];
	double[] Firstpropval=new double[5000];
	double[] Secondpropval=new double[5000];
	double swap;
	int i;
	int[] arr=new int[1000];
        int checkflag=0;
	//double[] proparray=new double[20];
        i=0;
     int j,k=0,flag2=0,hit=0;
	 int Outputlistsize=16,incount=0,outcount=0,Eachsetcount=5;
	 //Divide the output list into 2 sets-those present in test set and those not present in it


         System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^AREA UNDER CURVE PRINTINGS^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
         System.out.println("*******Proparray********");
         for(i=0;i<mat;i++)
             System.out.println(proparray[i]);
          System.out.println("************Actualtestdata*************");
         for(i=0;i<Actualtestdata.size();i++)
             System.out.println(Actualtestdata.get(i));
           System.out.println("************Outputlist*************");
         for(i=0;i<Outputlist.size();i++)
             System.out.println(Outputlist.get(i));


	 for(i=0;i<Actualtestdata.size();i++)
         {
         for(j=0;j<Outputlist.size();j++)
         {
	 if((Actualtestdata.get(i)).equals(Outputlist.get(j)))
	 {
		/*Inlist.add(Outputlist.get(i));
		Inprop[incount]=proparray[i];
		incount++;*/

               // break;
              //  System.out.println("HHHHHHHHHHHHHHH");
			  checkflag=1;
                          break;

	 }
	 else
	 {
            //    System.out.println("$$$$$$Oulist$$$$$");
             /*   Outlist.add(Outputlist.get(i));
		Outprop[outcount]=proparray[i];
		outcount++;*/
               // break;
			   checkflag=0;

	 }

	 }
	 if(checkflag==0)
	 {
           /*  Outlist.add(Outputlist.get(i));
		Outprop[outcount]=proparray[i];
		outcount++;*/

	 }
	 else
	 {
	  Inlist.add(Actualtestdata.get(i));
		Inprop[incount]=proparray[j];
		incount++;
	 }
        }
            for(i=0;i<Outputlist.size();i++)
         {
         for(j=0;j<Actualtestdata.size();j++)
         {
	 if((Outputlist.get(i)).equals(Actualtestdata.get(j)))
	 {
			  checkflag=1;
                          break;

	 }
	 else
	 {
               checkflag=0;

	 }

	 }
	 if(checkflag==0)
	 {
             Outlist.add(Outputlist.get(i));
		Outprop[outcount]=proparray[i];
		outcount++;

	 }
	 else
	 {

	 }
        }

        int ran;

         System.out.println("************Inlist*************");
         for(i=0;i<Inlist.size();i++)
             System.out.println(Inlist.get(i));
              ran= 1+ (int)(Math.random() * ((outcount-15)+ 1));
         System.out.println("************Outlist*************");
         for(i=0;i<Outlist.size();i++)
             System.out.println(Outlist.get(i));
          System.out.println("************Inprop values*************");
             for(i=0;i<Inlist.size();i++)
             System.out.println(Inprop[i]);


          //@@@@@@@@@@@@@@@@@@@@@@@@TILL HERE MY CODE IS CORRECT@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



	// incount--;
	// outcount--;
         int limitt;
         if(incount<outcount)
             limitt=incount;
         else
             limitt=outcount;
         for(i=0;i<100;i++)
             arr[i]=0;
         System.out.println("limittt"+limitt);
         int randomIndex=0;
         int counter=0;
         i=0;
		while(i<limitt)
		{
			int flag=0;
                         randomIndex = 1+ (int)(Math.random() * ((outcount-15)+ 1));
                        System.out.println(randomIndex);
			for(j=0;j<k;j++)
			{
			if(randomIndex==arr[j]){

				flag=1;
				break;
			}
			}
		if(flag==0)
		{
			i++;
			//Firstset.add(Inlist.get(randomIndex));
			Secondset.add(Outlist.get(randomIndex));
			//Firstpropval[counter]=Inprop[i];
			//Secondpropval[counter]=Outprop[i];
                      //  Firstpropval[counter]=Inprop[randomIndex];
                        Secondpropval[counter]=Outprop[randomIndex];
			arr[k]=randomIndex;
			k++;
			counter++;
		}

		}
         for(i=0;i<Inlist.size();i++)
         {
             Firstset.add(Inlist.get(i));
             Firstpropval[i]=Inprop[i];
        }

         System.out.println("************Firstset*************");
         for(i=0;i<Firstset.size();i++)
             System.out.println("\n"+Firstset.get(i));
         System.out.println("************Secondset*************");
         for(i=0;i<Secondset.size();i++)
             System.out.println("\n"+Secondset.get(i));


		k--;
		counter--;
		for (i=0;i<(counter-1);i++)
		{
		for(j=0;j<counter-i-1;j++)
		{
		if(Secondpropval[j]<Secondpropval[j+1])
		{
                swap= Secondpropval[j];
                Secondpropval[j]= Secondpropval[j+1];
                Secondpropval[j+1]=swap;
		Collections.swap(Secondset,j,j+1);
		}
		}
		}
		int countgreater=0,countequal=0;
                System.out.println("Highessssssssssstvalue"+Secondpropval[counter]);
		for(i=0;i<counter;i++)	{
		if(Firstpropval[i]>Secondpropval[counter])	{
			countgreater++;;
		}
		else if(Firstpropval[i]==Secondpropval[counter])	{
			countequal++;
		}
		else	{
		}
		}
		double aucc;
		aucc=((countgreater+(0.5*countequal))/counter);
		System.out.println("\n\n\n********#########AUC value#########@@@@@@@@@@@"+aucc);

    }

}
