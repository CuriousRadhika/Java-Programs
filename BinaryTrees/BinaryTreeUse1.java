
import java.util.*;


public class BinaryTreeUse1 {

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
    // public static BinaryTreeNode<Integer> takeInputLevelWise()
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int rootData = sc.nextInt();
    //     if(rootData == -1)
    //     {
    //         return null;
    //     }
    //     BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    //     QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
    //     pendingNodes.enqueue(root);

    //     while(!isEmpty(pendingNodes))
    //     {
    //         BinaryTreeNode front = pendingNodes.dequeue();
    //         System.out.println("Enter left child of "+front.data);
    //         int leftChild = sc.nextInt();
    //         if(leftChild != -1)
    //         {
    //             BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
    //             root.left=child;
    //             pendingNodes.enqueue(child);
    //         }
    //         System.out.println("Enter right child of "+front.data);
    //         int rightChild = sc.nextInt();
    //         if(rightChild != -1)
    //         {
    //             BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
    //             root.right=child;
    //             pendingNodes.enqueue(child);
    //         }
    //     }
    //     return root;
    // }
    public static int countNodes(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int count = 1;
        count+=countNodes(root.left);
        count+=countNodes(root.right);
        return count;
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
    public static void postorder(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }
    public static void inorder(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
       
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1+Math.max(lh, rh);
    }
    public static int nodeWithLargestData(BinaryTreeNode<Integer> root)
    {
        if(root == null) //assuming our tree has all positive numbers so number is less than -1 or equal to it
        {
            return -1;
        }
        int leftLargest = nodeWithLargestData(root.left);
        int rightLargest = nodeWithLargestData(root.right);
        return Math.max(leftLargest, Math.max(rightLargest, root.data));

        // int largest = root.data;
        // return Math.max(largest,  Math.max(leftLargest, rightLargest));
    }
    public static int sumOfNodes(BinaryTreeNode<Integer> root)
    {
        if(root==null) return 0 ;
        
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
    public static int numberOfLeafNodes(BinaryTreeNode<Integer> root)
    {
        if(root==null) return 0 ;
        if(root.left==null && root.right==null) return 1 ;
        return numberOfLeafNodes(root.left) + numberOfLeafNodes(root.right);
    }
    public static void printAtDepthK(BinaryTreeNode<Integer> root , int k)
    {
        if(root==null) return ;
        if(k==0)
        {
            System.out.println(root.data);
        }
        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    }
    public static void replaceNodeWithDepthK(BinaryTreeNode<Integer> root, int pos)
    {
        if(root==null) return ;
        root.data =pos;
        replaceNodeWithDepthK(root.left , pos+1);
        replaceNodeWithDepthK(root.right, pos+1);
    }
    public static void replaceNodeWithDepthK(BinaryTreeNode<Integer> root)
    {
        replaceNodeWithDepthK(BinaryTreeNode<Integer> root , 0);
    }
    
    public static void main(String[] args)
    {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>;
        // BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>;
        // BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>;
        // root.left = node1;
        // root.right = node2;

        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        // BinaryTree<Integer> root = takeInputLevelWise();
        // printTree(root);
        // System.out.println(countNodes(root));
        // preorder(root);
    //    System.out.println(height(root));
    //System.out.println(sumOfNodes(root));
    // printAtDepthK(root , 1);
    // System.out.println(numberOfLeafNodes(root));

    replaceNodeWithDepthK(root);
    inorder(root);
      
    }
}
