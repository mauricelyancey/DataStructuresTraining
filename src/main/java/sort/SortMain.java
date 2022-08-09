package sort;

public class SortMain {
    public static void main(String[] args) {
        int[] unsortedArray = {-23, 12, 17, -20, 99, 64, 37,-10};
        BubbleSort bubbleSort = new BubbleSort(unsortedArray);
//        bubbleSort.sort();

        SelectionSort selectionSort = new SelectionSort(unsortedArray);
        selectionSort.sort();
    }
}
