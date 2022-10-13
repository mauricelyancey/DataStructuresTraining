package sort;

public class SortMain {
    public static void main(String[] args) {
        int[] unsortedArray = {-23, 12, 17, -20, 99, 64, 37,-10};
        int[] countingSortArray= {1, 10, 10, 8, 8, 9, 2, 5, 7, 3, 4, 7, 1};
        Sort bubbleSort = new BubbleSort(unsortedArray);
//        bubbleSort.sort();

        Sort selectionSort = new SelectionSort(unsortedArray);
//        selectionSort.sort();

        Sort insertionSort = new InsertionSort(unsortedArray);
//        insertionSort.sort();

        ShellSort shellSort = new ShellSort(unsortedArray);
//        shellSort.sort();

        Sort mergeSort = new MergeSort(unsortedArray);
//        mergeSort.sort();

        Sort quickSort = new QuickSort(unsortedArray);
//        quickSort.sort();

        Sort countingSort = new CountingSort(countingSortArray);
        countingSort.sort();

    }
}
