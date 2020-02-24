/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package link1;

/**
 *
 * @author Seban
 */
public class Random {
public int getRandom(int Min,int Max)
	{
		return (Min + (int)(Math.random() * ((Max - Min) + 1)));


	}
}
