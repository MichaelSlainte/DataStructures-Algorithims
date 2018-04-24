/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PerfAnalysysInsertionBubbleSort;

import java.util.*;
/**
 *
 * @author cmuntean
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     MyArrayList<String> mylist;
     MyArrayList<String> mylist2;
     
      mylist = new MyArrayList<String>();
      mylist2 = new MyArrayList<String>();

        //pupulate the collection with a large number of elements
        for (int i = 0; i < 200 ; i ++ )
       {
	mylist.add("Xerox     ");
	mylist.add("Orange    ");
	mylist.add("Grape     ");
	mylist.add("Pineapple ");
	mylist.add("Lemon     ");
	mylist.add("Strawberry");
	mylist.add("Kiwi      ");
	mylist.add("Nectarine ");
	mylist.add("Melon     ");
	mylist.add("Raspberry ");
	mylist.add("Apple     ");
     }

       for (int i = 0; i < mylist.size() ; i ++ )
       {
           mylist2.add(i, mylist.get(i));
       } 
      
        //*--------------------------------------------
        // find out the time before starting the efficient bubble sort
        //*--------------------------------------------
     long startTime = System.currentTimeMillis();

	//*--------------------------------------------
 	// execute the efficient bubble sort by calling the bubbleSort method
	//*--------------------------------------------
     mylist.bubbleSort();

        //*--------------------------------------------
        // find out the time when the sort is completed
        //*--------------------------------------------
     long endTime = System.currentTimeMillis();

        //*--------------------------------------------
        // calculate the elapsed time and print a message
        //*--------------------------------------------
     System.out.println("effcient bubble sort of " + mylist.size() + " elements took "  + (endTime - startTime)  + " Milliseconds");

        
     long startTimeInsertion = System.currentTimeMillis();

     mylist2.insertionSort();

     long endTimeInsertion = System.currentTimeMillis();


     System.out.println("Insertion Sort of " + mylist.size() + " elements took "  + (endTimeInsertion - startTimeInsertion)  + " Milliseconds");

    }


}

