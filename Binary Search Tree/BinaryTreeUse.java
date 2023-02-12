
import java.util.*;


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
        if(root.data<=k2 && root.data>=k1)
        System.out.println(root.data);
        if(root.data>=k1)
        {
            printBetweenk1andk2(root.left, k1, k2);
        }
        if(root.data<=k2)
        {
            printBetweenk1andk2(root.right, k1, k2);
        }
    }
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     BinaryTreeNode root = takeInput(sc);
    //  System.out.println(search(root ,5).data);
    printBetweenk1andk2(root, 20, 50);
        
    }
}
