/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSortAlgorithm;
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
        mylist = new MyArrayList<String>();

        mylist.add("United States");
        mylist.add("Portugal");
        mylist.add("Russia");
        mylist.add("Argentina");
        mylist.add("Belgium");

        System.out.println("The elements are: " +mylist.toString());

        mylist.bubbleSort();

        System.out.println("The elements after Bubble sort are: " +mylist.toString());


        //*--------------------------------------------
        // Shuffle the collection  before sorting it
        //*--------------------------------------------
        Collections.shuffle(mylist);

        System.out.println("The elements after shuffle are: " +mylist.toString());

        mylist.insertionSort();

        System.out.println("The elements after Insertion sort are: " +mylist.toString());
     
    }


}

