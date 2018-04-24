/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author engmi
 */
public class PowerOfNumber {

    /**
     * @param args the command line arguments
     */
    public static int twotothepowerof(int x) {
        if (x == 0) //base/stopping case
        {
            return 1;
	
        } else //recursive case
        {
            return x * x;

        }
    }
    
    public static int power(int base, int exp) {
        if (exp == 1) //base/stopping case
        {
            return base;
	
        } else //recursive case
        {
            return base * power(base, exp- 1 ); 

        }
    }

    public static String reverseString(String word) {
        if (word.length() <= 1) // base case
        {
            return word;
        } else {
            return reverseString(word.substring(1)) + word.charAt(0);
        }
    }
    
    public static boolean palindrome(String word) {
        if (word.length() <= 1) // base case
        {
            return true;
        } else {
            if (word.charAt(0) != word.charAt(word.length() - 1)) {
                return false;
            } else {
                return palindrome(word.substring(1, word.length() - 1));
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(twotothepowerof(2));
        System.out.println(power(2,10));
        System.out.println(palindrome("abcdcba"));
        System.out.println(reverseString("michael"));
    }
    
}
