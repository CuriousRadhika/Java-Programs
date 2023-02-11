
import java.util.*;
public class BinaryTreeUse2 {
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
    public static void printTreefromPreorderandInorder(int n,int preorder[], int inorder[]) throws ArrayIndexOutOfBoundsException
    {
        printTreefromPreorderandInorder(preorder, inorder , 0 ,n-1, 0 ,n-1) ;
    }
  
    public static void printTreefromPreorderandInorder(int preorder[], int inorder[], int is , int ie, int ps, int pe)throws ArrayIndexOutOfBoundsException
    {
        int root = preorder[ps];
        System.out.print(root);

        int inorderIndex=is;
        int preorderIndex = ps+1;
        while(inorder[inorderIndex]!=root)
        {
            inorderIndex++;
            preorderIndex++;
        }
        

        printTreefromPreorderandInorder(preorder, inorder, is, inorderIndex, ps+1,preorderIndex);
       

    }
    public static void main(String[] args)
    {
        int n=7;
        int preorder[] = {1,2,4,5,3,6,7};
        int inorder[] =  {4,2,5,1,6,3,7};

        Scanner sc = new Scanner(System.in);
        printTreefromPreorderandInorder(n,preorder, inorder );
    }
}
