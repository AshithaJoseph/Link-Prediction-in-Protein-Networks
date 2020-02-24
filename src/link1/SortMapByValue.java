/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package link1;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 *
 * @author project1
 */


public class SortMapByValue {


    public static boolean ASC = true;
    public static boolean DESC = false;


    Userprofile user=new Userprofile();
    //static Map<String, Integer> freqhash;
    static LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
    public void sortfun()
    {


        //System.out.println("Before sorting......");
        //printMap(user.unsortMap);

        
        System.out.println("After sorting descindeng order......");
        Map<String, Integer> sortedMapDesc = sortByComparator(user.unsortMap, DESC);
        printMap(sortedMapDesc);

    }

    private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order)
    {

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2)
            {
                
                    return o2.getValue().compareTo(o1.getValue());

            }
        });

        // Maintaining insertion order with the help of LinkedList
       // Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void printMap(Map<String, Integer> map)
    {
        for (Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
        }
    }


}
