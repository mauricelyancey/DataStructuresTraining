package tree;

public class Node {
    private int data;
    private int leftChild, rightChild;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, int leftChild, int rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(int leftChild) {
        this.leftChild = leftChild;
    }

    public int getRightChild() {
        return rightChild;
    }

    public void setRightChild(int rightChild) {
        this.rightChild = rightChild;
    }
}
