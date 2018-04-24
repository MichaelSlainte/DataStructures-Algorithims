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
public interface MyLinearList {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public void remove(int index);
    public void removeFront();
    public void removeEnd();
    public void add(int index, Object theElement);
    public void addFront(Object element);
    public void addEnd(Object element);    
    public String printList();
    public String printReverse();
    public String OddInt();
    
    
}
