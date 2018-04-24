/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author engmi
 */
public interface DLListInterface {
    public boolean isEmpty();
    public int size();
    
    public void add(int index, Object theElement);
    public void addFront(Object element);
    public void addEnd(Object element); 
    
    public void remove(int index);
    public void removeFront();
    public void removeEnd(); 
    
    public Object get(int index);
    public String printList();
    public String printBackwardList();
    public String OddInt();
    
    
    
    
}
