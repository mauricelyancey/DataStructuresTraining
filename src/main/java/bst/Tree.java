package bst;

public class Tree {
    private Node root;
    public void insert(int value){
        if(root == null) root = new Node(value);
        else root.insert(value);
    }
    public void traverseInOrder(){
        root.traverseInOrder();
    }

    public Node get(int value){
        if(root == null) return null;
        else return root.get(value);
    }

    public int min(){
        return root.min();
    }

    public int max(){
        return root.max();
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private Node delete(Node subTreeRoot, int value){
        if(subTreeRoot == null) return subTreeRoot;
        if(value < subTreeRoot.getData()) delete(subTreeRoot.getLeftChild(), value);
        if (value > subTreeRoot.getData()) delete(subTreeRoot.getRightChild(), value);
        else{
            //Case where node to delete has 0 or 1 children
            if(subTreeRoot.getLeftChild() == null) return subTreeRoot.getRightChild();
            else if (subTreeRoot.getRightChild() == null) return subTreeRoot.getLeftChild();
            //Case where node to delete has 2 children
            //Replace the value in the subTreeRoot with the smallest value
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            //Delete the node that has the smallest value in the right subtree
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }
        return subTreeRoot;
    }
}
