public static TreeNode<Integer> takeInputLevelWise(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter root data: ");
    //     int rootData = sc.nextInt();
    //     TreeNode<Integer> root = new TreeNode<Integer>(rootData);
    //     QueueUsingLL<TreeNode> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
    //     pendingNodes.enqueue(root);

    //     while(!isEmpty(pendingNodes))
    //     {
    //         try{

    //         TreeNode<Integer> frontNode =pendingNodes.dequeue();
    //         System.out.println("Enter number of children of "+frontNode);
    //         int childCount = sc.nextInt();
    //         for(int i=0; i<childCount; i++)
    //         {
    //             System.out.println("Enter " + (i+1) +"th child of " + frontNode.data);
    //         }
    //         }
    //         catch(Exception e){
    //             return null;// will never reach here beacuse we have already checked condition in while loop
    //         }
    //     }
    // }