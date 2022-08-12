package sort;

public class SortMain {
    public static void main(String[] args) {
        int[] unsortedArray = {-23, 12, 17, -20, 99, 64, 37,-10};
        Sort bubbleSort = new BubbleSort(unsortedArray);
//        bubbleSort.sort();

        Sort selectionSort = new SelectionSort(unsortedArray);
//        selectionSort.sort();

        Sort insertionSort = new InsertionSort(unsortedArray);
//        insertionSort.sort();

        ShellSort shellSort = new ShellSort(new int[] {-3,17,1});
        shellSort.sort();
    }
}
