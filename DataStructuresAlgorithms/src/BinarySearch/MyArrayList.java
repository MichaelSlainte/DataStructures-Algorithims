/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BinarySearch;
import java.util.*;


public class MyArrayList<ElemType> extends ArrayList<ElemType>
{



   int binarySearch_nonRecursive (ElemType key, int start, int end)
  {
    boolean found;
    int middle = 0;
    found = false;
    while ((start <= end) && ( found==false))
    {
         middle = (start+end)/2;
         if (((Comparable)get(middle)).compareTo((Comparable)key)== 0)
             found = true;
        else if (((Comparable)get(middle)).compareTo((Comparable)key)< 0)
            start = middle +1;
        else
            end=middle-1;
    }     
     if (found == true) 
        return middle;
     else
	return -1;
  }



int binarySearch_recursive (ElemType key, int start, int end)
{
    int middle = 0;
    int result;
     middle = (start+end)/2;
     
    
      if (((Comparable)get(middle)).compareTo((Comparable)key)== 0)
      {
            result = middle;
      }
      else if (start == end) 
      {
            result = -1;
      }
     else
     {        
        if (((Comparable)get(middle)).compareTo((Comparable)key)>0)
            result = binarySearch_recursive(key, start,middle-1);
        else
            result = binarySearch_recursive(key, middle+1, end);
     } 
     
    return result;
}  
}
