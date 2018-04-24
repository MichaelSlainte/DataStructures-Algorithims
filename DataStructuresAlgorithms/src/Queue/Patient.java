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
public class Patient {
    //data member   
    private String name;
    private String symptom;
    
    //constructor
    public Patient(){
    name = new String();
    symptom = new String();
    }
    
    //setters
    public void setName(String n){
        name = n;
    }
    public void setSymptom(String s){
        symptom = s;
    }
    
    //getters
    public String getName(){
        return name;
    }
    public String getSymptom(){
        return symptom;
    } 
       
}
