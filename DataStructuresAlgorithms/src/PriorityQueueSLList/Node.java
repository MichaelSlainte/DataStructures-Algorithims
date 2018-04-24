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
public class Node {

    private int key;
    private Object element;
    private Node next;

    public Node(int priority, Object e, Node n) {
        key = priority;
        element = e;
        next = n;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int val) {
        key = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
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
