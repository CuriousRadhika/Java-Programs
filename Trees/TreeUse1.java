import java.util.Scanner;

public class TreeUse1 {

    public static TreeNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data of node");
        int data = sc.nextInt();
        System.out.println("Enter number of children of " + data);
        int childCount = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(data);

        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }

    // public static void TreeNode<Integer> takeInputLevelWise(){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter root data: ");
    // int rootData = sc.nextInt();
    // TreeNode<Integer> root = new TreeNode<Integer>(rootData);
    // QueueUsingLL<TreeNode> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
    // pendingNodes.enqueue(root);

    // while(!isEmpty(pendingNodes))
    // {
    // try{

    // TreeNode<Integer> frontNode =pendingNodes.dequeue();
    // System.out.println("Enter number of children of "+frontNode);
    // int childCount = sc.nextInt();
    // for(int i=0; i<childCount; i++)
    // {
    // System.out.println("Enter " + (i+1) +"th child of " + frontNode.data);
    // }
    // }
    // catch(Exception e){
    // return null;// will never reach here beacuse we have already checked
    // condition in while loop
    // }
    // }
    // }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }

    }

    public static int numNodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    public static int largest(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int largest = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            if (root.children.get(i).data > largest) {
                int childlargest = largest(root.children.get(i));
                if (childlargest > largest) {
                    largest = childlargest;
                }
            }
        }
        return largest;

    }

    public static void printatK(TreeNode<Integer> root, int k) {
        if (k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printatK(root.children.get(i), k - 1);
        }

    }

    public static int height(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int h = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int childHeight = height(root.children.get(i));

            if (childHeight > h)
                h = childHeight;
        }
        return h + 1;
    }

    public static int countLeafNodes(TreeNode<Integer> root) {
        if (root == null)
            return -1;

        if (root.children.size() == 0) {
            return 1;
        }
        int c = 0;
        for (int i = 0; i < root.children.size(); i++) {
            c += countLeafNodes(root.children.get(i));
        }
        return c;
    }

    public static void preorder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }
    }

    public static void postorder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }
        System.out.println(root.data);
    }

    public static int nodesGreaterThanX(TreeNode<Integer> root, int x) {
        if (root == null)// edge case
            return -1;

        int c = 0;
        if (root.data > x)// base case
        {
            c++;
        }
        for (int i = 0; i < root.children.size(); i++) {
            c += nodesGreaterThanX(root.children.get(i), x);
        }
        return c;
    }

    public static int sumOfAllNodes(TreeNode<Integer> root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int s = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            s += sumOfAllNodes(root.children.get(i));
        }
        return s;

    }

    public static boolean isContains(TreeNode<Integer> root, int x) {
        if (root == null)
            return false;

        if (root.data == x)
            return true;

        for (int i = 0; i < root.children.size(); i++) {
            return isContains(root.children.get(i), x);
        }
        return false;
    }

    public static boolean isStructurallyIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null || root2 == null)//edge case
            return root1==root2;

        if (root1.data != root2.data){//base case
            return false;
        }

        for (int i = 0; i < root1.children.size(); i++) {
            return isStructurallyIdentical(root1.children.get(i), root2.children.get(i));
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root1 = takeInput();
        TreeNode<Integer> root2 = takeInput();

        print(root1);
        print(root2);
        System.out.println(isStructurallyIdentical(root1, root2));
    }
}
