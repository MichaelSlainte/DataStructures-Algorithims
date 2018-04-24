/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueueArrayList;

/**
 *
 * @author engmi
 */
public class PQElement {

    private int key;
    private Object element;

    //Constructor
    public PQElement(int priority, Object e) {
        key = priority;
        element = e;
    }

    public int getKey() {
        return key;
    }

    public void setKet(int val) {
        key = val;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object e) {
        element = e;
    }

    public String toString() {
        return element.toString();
    }

}
