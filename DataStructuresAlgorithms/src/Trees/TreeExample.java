/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;
import java.util.*;

public class TreeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        BTNode theNode1 = new BTNode(50);
        BTNode theNode2 = new BTNode(25);
        BTNode theNode3 = new BTNode(75);
        BTNode theNode4 = new BTNode(12);
        BTNode theNode5 = new BTNode(30);
        BTNode theNode6 = new BTNode(60);
        BTNode theNode7 = new BTNode(80);
        BTNode theNode8 = new BTNode(26);
       /*
        BTNode theNode9 = new BTNode(29);
        BTNode theNode10 = new BTNode(51);
        BTNode theNode11= new BTNode(52);
        BTNode theNode12 = new BTNode(76);
        BTNode theNode13 = new BTNode(77);
        BTNode theNode14 = new BTNode(73);
        BTNode theNode15 = new BTNode(18);
        BTNode theNode16 = new BTNode(1003);
        BTNode theNode17 = new BTNode(9111);
        BTNode theNode18 = new BTNode(11);
        BTNode theNode19 = new BTNode(124);
        BTNode theNode20 = new BTNode(999);
        BTNode theNode21 = new BTNode(2100);
        BTNode theNode22 = new BTNode(12);
        BTNode theNode23 = new BTNode(55);
        BTNode theNode24 = new BTNode(861);
        BTNode theNode25= new BTNode(21);
        BTNode theNode26 = new BTNode(184);
        BTNode theNode27 = new BTNode(1299);
        BTNode theNode28 = new BTNode(1211);
*/
        //create the binary tree and insert(add) the nodes created above
        BinaryTree bst = new BinaryTree();
        bst.insertNode(bst.theRoot, theNode1);
        bst.insertNode(bst.theRoot,theNode2);
        bst.insertNode(bst.theRoot,theNode3);
        bst.insertNode(bst.theRoot,theNode4);
        bst.insertNode(bst.theRoot,theNode5);
        bst.insertNode(bst.theRoot,theNode6);
        bst.insertNode(bst.theRoot,theNode7);
        bst.insertNode(bst.theRoot,theNode8);
      /*
        bst.insertNode(bst.theRoot,theNode9);
        bst.insertNode(bst.theRoot,theNode10);
        bst.insertNode(bst.theRoot,theNode11);
        bst.insertNode(bst.theRoot,theNode12);
        bst.insertNode(bst.theRoot,theNode13);
        bst.insertNode(bst.theRoot,theNode14);
        bst.insertNode(bst.theRoot,theNode15);
        bst.insertNode(bst.theRoot,theNode16);
        bst.insertNode(bst.theRoot,theNode17);
        bst.insertNode(bst.theRoot,theNode18);
        bst.insertNode(bst.theRoot,theNode19);
        bst.insertNode(bst.theRoot,theNode20);
        bst.insertNode(bst.theRoot,theNode21);
        bst.insertNode(bst.theRoot,theNode22);
        bst.insertNode(bst.theRoot,theNode23);
        bst.insertNode(bst.theRoot,theNode24);
        bst.insertNode(bst.theRoot,theNode25);
        bst.insertNode(bst.theRoot,theNode26);
        bst.insertNode(bst.theRoot,theNode27);
        bst.insertNode(bst.theRoot,theNode28);
*/

        System.out.println("In-order Traversal-  The listing of nodes is: ");
        bst.inOrderTraversal(bst.theRoot);

        BTNode foundNode = bst.search(theNode5.getElement(), bst.root());
        if (foundNode == null)
            System.out.println("The node "+ theNode5.getElement() +" DOES NOT exist in the tree! ");
        else
            System.out.println("The node "+ theNode5.getElement() +" exists in the tree! ");


        System.out.println("Pre-order Traversal-  The listing of nodes is: ");
        bst.preOrderTraversal(bst.theRoot);

        System.out.println("Post-order Traversal-  The listing of nodes is: ");
        bst.postOrderTraversal(bst.theRoot);

        System.out.println("No. of nodes is " + bst.countNodes(bst.theRoot));

        System.out.println("The height of the tree is " + bst.height(bst.theRoot));

        //find the height of theNode2 that has value 25
        BTNode node = bst.search(theNode2.getElement(), bst.root());
        System.out.println("The height of the node with the value 25 is " + bst.height(node));


     }
}
