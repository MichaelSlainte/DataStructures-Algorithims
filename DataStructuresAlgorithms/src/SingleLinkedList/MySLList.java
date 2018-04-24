/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleLinkedList;

/**
 *
 * @author engmi
 */
public class MySLList implements MyLinearList {

    //data member
    private Node head;
    private int size;
    private Node curr;
    private Node prev;

    //constructor & initialization
    public MySLList() {
        head = null;
        size = 0;
        curr = null;
        prev = null;
    }

    //is empty?
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //the size
    public int size() {
        return size;
    }

    // assume the index is in the correct range
    public void add(int index, Object item) {
        //special case of adding at the head of the list 
        if (index == 1) {
            Node newNode = new Node(item, head);
            head = newNode;
        } else {
            setCurrent(index);
            Node newNode = new Node(item, curr);
            prev.setNext(newNode);
        }
        size = size + 1;
    }

    //add an element at the front of the list
    public void addFront(Object element) {
        Node newNode = new Node(element, head);
        head = newNode;
        size = size + 1;
    }

    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

    //add an element at the end of the list
    public void addEnd(Object element) {
        Node newNode = new Node(element, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(size);
            curr.setNext(newNode);
        }
        size = size + 1;
    }

    public void remove(int index) {
        //special case of removing at the head of the list
        if (index == 1) {
            head = head.getNext();
        } else {
            //find the previous and current node
            setCurrent(index);
            prev.setNext(curr.getNext());
        }
        size = size - 1;
    }

    public void removeFront() {
        //special case of removing at the head of the list
        head = head.getNext();
        size = size - 1;
    }

    public void removeEnd() {
        //special case of removing at the head of the list
        setCurrent(size);
        prev.setNext(curr.getNext());
        size = size - 1;
    }

    private void setCurrent(int index) {
        // sets curr to the node position specified in index
        //setx prev to the node previous to curr
        int k;
        prev = null;
        curr = head;
        for (k = 1; k < index; k++) {
            prev = curr;
            curr = curr.getNext();
        }
    }

    //************************************************************/
    // Provide a printlist() method which will print out         */
    // the content of the list                                   */
    //************************************************************/
    public String printList() {

        String srt = new String();
        Node aNode = head;
        while (aNode != null) {
            srt = srt.concat(aNode.toString());
            aNode = aNode.getNext();
            srt = srt.concat(";" + "\n");
        }
        return srt;
    }

    public String printReverse() {
        String srt = new String();

        // for loop reduces the value after each iteration
        for (int i = size; i > 0; i--) {
            //System.out.println(size);
            //Counter (i) initializes with the highest value
            setCurrent(i);
            // Find the element at the current node
            // change the cast of element to integer
            srt = srt.concat((String) curr.getElement());
            srt = srt.concat(";" + "\n");
        }
        return srt;
    }

    public String OddInt() {
        //declare and initialize object for the class Node, our starting point   
        
        Node aNode = head;
        String srt = new String();
        //loop through elements until we get to null element                       
        while (aNode != null) {
            int result = Integer.parseInt(aNode.toString());
            if ((result % 2) != 0) 
            //print out element in the node using toString()
            srt = srt.concat(aNode.toString() + ";" + "\n");
            aNode = aNode.getNext();
            
                                    
        }
        return srt;
    }
}