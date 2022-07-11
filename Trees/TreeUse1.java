import java.util.Scanner;
public class TreeUse1 {
    public static TreeNode<Integer> takeInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data of node");
        int data = sc.nextInt();
        System.out.println("Enter number of children of "+ data);
        int childCount = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(data);

        for(int i =0 ; i<childCount ; i++)
        {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int rootData = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        QueueUsingLL<TreeNode> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
        pendingNodes.enqueue(root);

        while(!isEmpty(pendingNodes))
        {
            try{

            TreeNode<Integer> frontNode =pendingNodes.dequeue();
            System.out.println("Enter number of children of "+frontNode);
            int childCount = sc.nextInt();
            for(int i=0; i<childCount; i++)
            {
                System.out.println("Enter " + (i+1)th +"child of "+ frontNode.data  );
            }
            }
            catch{
                return null;// will never reach here beacuse we have already checked condition in while loop
            }
        }
    }


    public static void print(TreeNode<Integer> root)
    {
        String s = root.data + ":";
        for(int i = 0 ; i<root.children.size() ; i++)
        {
            s=s+ root.children.get(i).data + ",";
        }
        System.out.println(s);
        for(int i = 0 ; i<root.children.size() ; i++)
        {
            print(root.children.get(i));
        }

    }
    public static void main(String[] args){
        TreeNode<Integer> root = takeInput();
        print(root);
    }
}
