/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author engmi
 */
public interface StackInter {
    //Stack methods
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object nexItem);
    public Object pop();
    public int size();
    
    //Extra methods for stack
    public void emptyStack();
    public String displayStack();
             
}
