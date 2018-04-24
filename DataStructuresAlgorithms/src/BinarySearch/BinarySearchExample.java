/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;


public class BinarySearchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int pos;
        MyArrayList<Integer> mylist2;
        mylist2 = new MyArrayList<Integer>();

        mylist2.add(new Integer(1));
        mylist2.add(new Integer(2));
        mylist2.add(new Integer(3));
        mylist2.add(new Integer(5));
        mylist2.add(new Integer(10));
        mylist2.add(new Integer(15));
        mylist2.add(new Integer(27));
        mylist2.add(new Integer(100));
        mylist2.add(new Integer(104));

         System.out.println("The elements are: " +mylist2.toString());
        Integer key1 = new Integer(58);
        pos = mylist2.binarySearch_nonRecursive(key1, 0, mylist2.size()-1);

        if (pos==-1)
        System.out.println("The number : " + key1.toString() +" NOT found!");
        else
         System.out.println("The number : " + key1.toString() +" found!");

         Integer key2 = new Integer(104);
        pos = mylist2.binarySearch_recursive(key2, 0, mylist2.size()-1);

        if (pos==-1)
        System.out.println("The number : " + key2.toString() +" NOT found!");
        else
         System.out.println("The number : " + key2.toString() +" found!");
    }


}
