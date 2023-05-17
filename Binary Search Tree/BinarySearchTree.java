public class BinarySearchTree {
    private BinaryTreeNode<Integer> root;
    public BinaryTreeNode insertData(int data, BinaryTreeNode<Integer> root){
       
        if(root==null)
        {
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(data);
        return node;
        }

        if(data>root.data)
        {
            root.right =insertData(data, root.right);         
        }
        else if(data<root.left)
        { 
            root.left = insertData(data, root.left);          
        }
        return root;
        
    }
    public BinaryTreeNode insertData(int data){
       root = insertDataHelper(data, null);

    }
    public void deleteData(int data){
        root = deleteData(data, root);

    }
    private BinaryTreeNode<Integer> deleteData(int data, BinaryTreeNode<Integer> root)
    {
        if(root==null){
            return null;
        }

        if(data>root.data){
            root.right = deleteData(data, root.right);
            return root;
        }
        else if(data<root.left)
        { 
            root.left = deleteData(data, root.left); 
            return root;
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.right==null){
                root = root.left;
            }
            else if(root.left==null)
            {
                root = root.right;
            }
            else{
                BinaryTreeNode<Integer> minNode = root.right;
                while(minNode.left!=null)
                {
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                deleteData(minNode.data, root.right);
            }
        }
    }
    private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root){ // we need the helper function and thr root node because we have to check data in subsequent subtrees as well for which we need to specify root.left and root.right
        if(root==null)
        return false;

        if(root.data==data)return true{
            return true;
        }
        else if(data>root.data)
        {
            //call right
            return hasDataHelper(data, root.right);
        }
        else{
            //call left
            return hasDataHelper(data, root.left);
        }
    }
    public boolean hasData(int data){
        return hasDataHelper(data, root);
    }
}
