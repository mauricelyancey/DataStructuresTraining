package bst;

public class Node {
    private Node leftChild;
    private Node rightChild;
    private int data;

    public Node( int value) {
        this.data = value;
    }

    public void insert(int value){
        if(value == data)return;
        if(value < data){
            if(leftChild==null)leftChild = new Node(value);
            else leftChild.insert(value);
        }
        else{
            if(rightChild==null) rightChild = new Node(value);
            else rightChild.insert(value);
        }
    }

    public void traverseInOrder(){
        if(leftChild!=null) leftChild.traverseInOrder();
        System.out.print(data+ " ,");
        if(rightChild!=null) rightChild.traverseInOrder();
    }

    public Node get(int value){
        if(value == data) return this;
        if(value < data) {
            if(leftChild != null) return leftChild.get(value);
        }
        if(value > data)
            if(rightChild != null) return rightChild.get(value);
        return null;
    }

    public int min(){
        if(leftChild == null) return data;
        else return leftChild.min();
    }

    public int max(){
        if(rightChild == null) return data;
        else return rightChild.max();
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
