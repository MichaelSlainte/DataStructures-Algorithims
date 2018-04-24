/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author engmi
 */
import java.util.*;
public class MyQueue implements QueueInterface {
    
    //Array List declaration
    private ArrayList<Patient> theQueue;
    
    //instance of my ArrayList - on Constructor
    
    public MyQueue(){
        theQueue = new ArrayList<Patient>();
    }
    
    //abstract methods     
    
    public boolean isEmpty(){
        return theQueue.isEmpty();
    }
    
    public int size(){
        return theQueue.size();
    }
    
    public Object frontElement(){
        if(!theQueue.isEmpty()){
            return theQueue.get(0);
        }else{
            return null;
        }
    }
    
    public void enqueue (Object newItem){
        theQueue.add((Patient)newItem);
    }
    
    public Object dequeue(){
        if(!theQueue.isEmpty()){
            return theQueue.remove(0);
        }else{
            return null;
        }
    }
}
