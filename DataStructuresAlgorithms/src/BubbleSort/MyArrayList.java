/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;

import java.util.*;

public class MyArrayList<ElemType> extends ArrayList<ElemType>
{
     // this is a relatively efficient bubble sort ( as bubble sorts go ). It recognises that after each
    // pass of the outer loop an additional rightmost element is in the correct position and can be ignored
    public void bubbleSort()
    {
       int i,j;
       Comparable  elemAtJ,elemAtJPlus;
       for (i=0; i < size(); i++ )
       {

	  for (j=0; j < size()-1 - i ; j++ )
	  {
              elemAtJ = (Comparable)get(j);
              elemAtJPlus = (Comparable)get(j+1);
                
	      if (elemAtJ.compareTo(elemAtJPlus) > 0)
	      {
		//swap element on postion j with element on position j+1
                  swap(j, j+1);
	      }
           }
       }
     }

     public void swap(int pos1, int pos2)
     {
         ElemType objPos1 = get(pos1);
         ElemType objPos2 = get(pos2);

         remove(pos1);
         add(pos1, objPos2);
         remove(pos2);
         add(pos2, objPos1);
    }

     //TASK6: write the simplebubblesort() method
    public void simpleBubbleSort()
    {
      int numOfElements = size();

      boolean moreSwaps = true;

      while (moreSwaps == true)
      {
         int x;
         moreSwaps = false;
         for (x =0 ; x < size() -1; x++)
   	 {
            Comparable  elemAtX = (Comparable)get(x);
            Comparable  elemAtXPlus = (Comparable)get(x+1);

		    if (elemAtX.compareTo(elemAtXPlus) > 0)
		    {
			   swap(x,x+1);
                           moreSwaps = true;
                    }
         }
      }
   }

}
