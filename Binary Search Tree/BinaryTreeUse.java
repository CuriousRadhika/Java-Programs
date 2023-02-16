
import java.util.*;

import javax.lang.model.util.ElementScanner14;


public class BinaryTreeUse{
    public static BinaryTreeNode<Integer> takeInput(Scanner sc) {

        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        if(rootData == -1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);

        return root;
    }
    public static void printTree(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        String toBePrinted = root.data + " : ";
        if(root.left!=null){
            toBePrinted += "L: "+root.left.data+" , ";
        }
        if(root.right!=null)
        {
            toBePrinted += "R: "+root.right.data;
        }
        System.out.println(toBePrinted);
    }
    public static BinaryTreeNode<Integer> search(BinaryTreeNode<Integer> root, int k)
    {
        if(root==null || root.data ==k)
        return root;

       if(k>root.data)
        {
            return search(root.right, k);
        }
       
        return search(root.left, k);
     
        
    }
    public static void printBetweenk1andk2(BinaryTreeNode<Integer> root, int k1, int k2)
    {
        if(root==null)return;
        if(root.data<k1)
        {
            printBetweenk1andk2(root.right, k1, k2);
            
        }
        else if(root.data>k2)
        {
            printBetweenk1andk2(root.left, k1, k2);
        }
        else{
            System.out.println(root.data);
            printBetweenk1andk2(root.left, k1, k2);
            printBetweenk1andk2(root.right, k1, k2);
        }
    }
    public static BinaryTreeNode<Integer> BSTfromSortedArray(int a[] , int si, int ei)
    {
        if(si>ei)
        return null;

        int mi = (si+ei)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(a[mi]);
        root.left = BSTfromSortedArray(a, si, mi-1);
        root.right = BSTfromSortedArray(a, mi+1 , ei);
        return root;

    }
    public static void preorder(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node<Integer> `
       Pair<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> list = new Pair<>();
       left.head = BSTtoSortedLL(root.left);

       Node<Integer> head 

       left.tail = BSTtoSortedLL(root.right);
    }
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
    //  BinaryTreeNode root = takeInput(sc);
    //  System.out.println(search(root ,5).data);
    // printBetweenk1andk2(root, 20, 50);
    
    int a[] = {1,2,3,4,5,6,7};
    preorder(BSTfromSortedArray(a, 0, 6));
        
    }
}
