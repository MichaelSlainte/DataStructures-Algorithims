/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;
import java.util.*;


public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        MyArrayList<String> mylist;
        mylist = new MyArrayList<String>();

        //TAKS2: add at least 5 elements of String type in your collection

        mylist.add("United States");
        mylist.add("Portugal");
        mylist.add("Russia");
        mylist.add("Argentina");
        mylist.add("Belgium");

        //TASK3: Print the elements from your collection
         System.out.println("The elements are: " +mylist.toString());

        //TASK4: call the bubbleSort() method

         mylist.bubbleSort();

        //TASK5: Print again the elements. Now your colection should be sorted

        System.out.println("The elements after  Bubble sort are: " +mylist.toString());

        //TASK7: call the simplebubblesort() method and check if it works correct
        //*--------------------------------------------
        // Shuffle the collection  before sorting it
        //*--------------------------------------------
        Collections.shuffle(mylist);

        System.out.println("The elements are: " +mylist.toString());

        mylist.simpleBubbleSort();

          System.out.println("The elements after Simple Bubble sort are: " +mylist.toString());



   }

}


