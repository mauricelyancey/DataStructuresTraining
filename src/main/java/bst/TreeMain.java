package bst;

public class TreeMain {
    public static void main(String[] args) {
        Tree testTree = new Tree();
        testTree.insert(10);
        testTree.insert(17);
        testTree.insert(77);
        testTree.insert(97);
        testTree.insert(1);
        testTree.insert(27);
        testTree.insert(32);
        testTree.insert(9);
        testTree.traverseInOrder();
        System.out.println();

//        System.out.println(testTree.get(17));
//        System.out.println(testTree.get(100));
//        System.out.println(testTree.get(897));
//
//        System.out.println(testTree.min());
//        System.out.println(testTree.max());

        testTree.delete(10);
        testTree.traverseInOrder();
        System.out.println();
        testTree.delete(27);
        testTree.traverseInOrder();
        System.out.println();


    }
}
