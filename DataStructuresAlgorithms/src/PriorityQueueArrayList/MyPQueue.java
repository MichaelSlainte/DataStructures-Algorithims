package PriorityQueueArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engmi
 */
import java.util.*;
public class MyPQueue implements PQInterface{
    //ArrayList declaration
    private ArrayList<PQElement> thePQueue;
    
    //constructor
    public MyPQueue(){
     thePQueue = new ArrayList<PQElement>();  //instance of ArrayList
    }
    
    //Is Empty? Method
    @Override    
    public boolean isEmpty(){
        return thePQueue.isEmpty();
    }
    
    //Size? Method
    @Override
    public int size(){
        return thePQueue.size();
    }
        
    //Find where to insert the element in the Array List by priority
    private int findInsertPosition(int newkey){
        boolean found;
        PQElement elem;
        int position;
        found = false;
        position = 0;
        
        while (position<thePQueue.size() && !found){
            elem = thePQueue.get(position);
            if(elem.getKey()>newkey)
                position = position + 1;
            else{
                found = true;
            }       
        }
        return position;        
    }
    
    // New element with a given key and element information will be added 
    @Override
    public void enqueue(int priorkey, Object item){
        int index;
        PQElement elem = new PQElement(priorkey,item);
        index = findInsertPosition(priorkey);
            if (index > size())
                thePQueue.add(elem);
            else
                thePQueue.add(index, elem);    
    }
    
    //The first element has the highest priority
    @Override
    public Object dequeue(){
        return thePQueue.remove(0);
    }
    
    @Override
    public String printPQueue(){
        String srt = new String();
        PQElement elem;
        for(int i = 0; i < thePQueue.size(); i++){
            elem = thePQueue.get(i);
            srt = srt.concat("Key = "+elem.getKey()+" Element= "+elem.getElement());
            srt = srt.concat(";" + "\n");
        }
        return srt;    
    }    
}
