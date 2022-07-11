import java.util.ArrayList;
class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }
}