package sort;

public class SelectionSort extends Sort {
    public SelectionSort() {
    }

    public SelectionSort(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

    @Override
    public void sort() {
        for (int lastUnsortedIndex = unsortedArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int indexOfLargest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (unsortedArray[i] > unsortedArray[indexOfLargest]) indexOfLargest = i;
            }
            swap(unsortedArray, indexOfLargest, lastUnsortedIndex);
        }
        printSortedArray(unsortedArray);
    }
}
