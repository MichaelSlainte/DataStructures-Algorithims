/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueueSLList;

/**
 *
 * @author engmi
 */
public class MyPQueue implements PQInterface{
    private Node head;
    private int size;
    private Node curr;
    private Node prev;
    
    public MyPQueue(){
        head = null;
        size = 0;
        curr = null;
        prev = null;
    }
    
    public boolean isEmpty(){
        if (size == 0)
            return true;
        else
            return false;
    }
    
    public int size(){
        return size;    
    }
    
    public void add(int index, int priorkey, Object item){
        //special case of adding at the head of the list 
        if (index == 1){
            Node newNode = new Node (priorkey, item, head); 
            head = newNode;
        } else{
            setCurrent(index);
            Node newNode = new Node(priorkey, item, curr);
            prev.setNext(newNode);
        }
        size = size + 1;
    }
    
    // add an element at the end of the list
    private void add(int priorkey, Object element){
        Node newNode = new Node(priorkey, element, null);
        if (head == null){
            head = newNode;
        }else {
            setCurrent(size);
            curr.setNext(newNode);
        }
        size = size + 1;
    }
     private void setCurrent(int index){
      // sets curr to the node at position specified in index
      // sets prev to the node previous to curr

      prev = null;
      curr = head;
      for (int k  = 1; k < index; k++){
            prev = curr;
            curr = curr.getNext();
      }
    }       
    
    private int findInsertPosition(int newkey){
        Node aNode = head;
        boolean found;
        int position;
        found = false;
        position = 1;
        while(aNode != null && ! found){
            if(aNode.getKey() > newkey){
                aNode = aNode.getNext();
                position = position + 1;            
            } else{
                found = true;            
            }        
        }
            return position;
    }
    
    // New node with a given key and element information will be added
    public void enqueue(int priorkey, Object item){
        int index;
        index = findInsertPosition(priorkey);
        
        if (index > size)
            add(priorkey, item);
        else
            add(index, priorkey, item);
    }
    
    //The first element has the highest priority
    public Object dequeue(){
        Node toBeRemoved;
        toBeRemoved = head;
        head = head.getNext();
        size = size - 1;
        return toBeRemoved;
    }
    
    //************************************************************/
    // Provide a printlist() method which will print out         */
    // the content of the priority queue                         */
    //************************************************************/
    public String printPQueue(){
        String srt = new String();
        Node aNode = head;
        while (aNode != null){
        srt = srt.concat("Key = "+aNode.getKey()+" Element= "+aNode.getElement())+ "\n";
        aNode = aNode.getNext();
        srt = srt.concat("");
        }
        return srt;
    }   
    
}
