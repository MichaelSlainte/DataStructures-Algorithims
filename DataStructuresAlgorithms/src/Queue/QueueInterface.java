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
public interface QueueInterface {
    public boolean isEmpty();
    public int size();
    public Object frontElement();
    public void enqueue (Object newItem);
    public Object dequeue();
    
}
