/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Trees;
import java.util.*;

public class BinaryTree {
    public BTNode theRoot;

   /** Creates a new instance of BinaryTree */
    public BinaryTree()
    {
        theRoot = null;
    }

    //return the root of the tree
    public BTNode root()
    {
        return theRoot;
    }

    //check if the tree is empty
    public boolean isEmpty()
    {
        if (theRoot == null)
            return true;
        else
            return false;
    }

    public void insertNode(BTNode startNode,BTNode theNewNode)
    {
        // if the tree is empty theNewNode becames the root of the tree
        if (theRoot == null )
        {
            theRoot = theNewNode;
        }
        else 
        // find the location and insert theNewNode in the non-empty tree
        {
           if (theNewNode.getElement() > startNode.getElement() )
           {
              //insert theNewNode on the right side of the startNode
              if (startNode.getRight() == null )
              {
                 //the startNode has no right child, so theNewNode will become the right child
                 startNode.setRight(theNewNode);
              }
              else
              {
                 //the startNode has a right child / right side sub-tree, so insert theNewNode in the right side sub-tree
                  insertNode(startNode.getRight(),theNewNode );
              }
           }
           else if( theNewNode.getElement() < startNode.getElement())
           //insert theNewNode on the left side of the startNode
           {
              if (startNode.getLeft() == null )
              {
                 //the startNode has no left child, so theNewNode will become the left child
                 startNode.setLeft(theNewNode);
              }
              else
              {
                 //the startNode has a left child / left side sub-tree, so insert theNewNode in the left side sub-tree
                 insertNode(startNode.getLeft(),theNewNode );
              }
           }
           else if (theNewNode.getElement() == startNode.getElement())
               System.out.println("The node "+startNode.getElement()+ " was already inserted");
        }
    }


    //search and find the node that contains the given element. It returns the node that has that element
  public BTNode search( int searchelem, BTNode startNode )
  {
      if (startNode == null )
		return null;
      else
      {
        if(searchelem == startNode.getElement())
        {
            return startNode;
        }
        else if (searchelem < startNode.getElement())
             return search(searchelem, startNode.getLeft());
        else
            return search(searchelem, startNode.getRight());
      }
  }

//in-order traversal is used to parse and print all the nodes of the tree
  public void inOrderTraversal(BTNode theStart)
  {
      if (theStart == null )
		return;
      else
      {
        inOrderTraversal(theStart.getLeft());
        System.out.println("Node: " + theStart.getElement());
        inOrderTraversal(theStart.getRight());
      }
  }

  //pre-order traversal is used to parse and print all the nodes of the tree
  public void preOrderTraversal(BTNode theStart){
      if(theStart == null)
          return;
      else{
          System.out.println("Node:" + theStart.getElement());
          preOrderTraversal(theStart.getLeft());
          preOrderTraversal(theStart.getRight());
      }
  }

  //post-order traversal is used to parse and print all the nodes of the tree
  public void postOrderTraversal(BTNode theStart){
      if(theStart == null)
          return;
      else{
          postOrderTraversal(theStart.getLeft());
          postOrderTraversal(theStart.getRight());
          System.out.println("Node:" + theStart.getElement());
      }
  }


  //counts the number of nodes in the BinaryTree.
  public int countNodes(BTNode theStart){
     if(theStart == null)
         return 0;
     else
         return 1 + countNodes(theStart.getLeft())
                 + countNodes(theStart.getRight());
  }

  //determines the height of a tree
  public int height (BTNode theStartNode)
  {
      	if (theStartNode==null || theStartNode.isExternal() )
            return 0;
      	else
        {
     	    int leftChildH = height(theStartNode.getLeft());
            int rightChildH = height(theStartNode.getRight());
            return 1 + Math.max(leftChildH, rightChildH);
        }
  }

}

  