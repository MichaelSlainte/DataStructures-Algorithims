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
import java.util.*;
public class MyStack implements StackInter {
    //My arraylist
    private ArrayList<String> theStack;
    
    //Constructor - Creates a new instance of Stack
    
    public MyStack(){
    theStack = new ArrayList<String>(); 
    }
    
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    
    public boolean isFull(){
        return false;
    }
    
    public void push(Object newItem){
        theStack.add(0, (String)newItem);
    }
    
    public Object pop(){
        if (!(theStack.isEmpty())){
            return theStack.remove(0);
        }else
            return null;
    }
    
    public int size(){
        return theStack.size();
    }
    
    //Extra methods for stack
    public void emptyStack(){
        theStack.clear();
    }
    
    public String displayStack(){
        Iterator it;
        String str = new String();
        it = theStack.iterator();{
        if(theStack.isEmpty()){
            str = str.concat("STACK IS EMPTY"+"\n");
        }else
            while (it.hasNext()){
                str = str.concat((String)it.next());
                str = str.concat(";" + "\n");
        }
    }
    return str;    
   }
}
