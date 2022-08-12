package sort;

public class InsertionSort extends Sort{
    public InsertionSort() {
    }

    public InsertionSort(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

    @Override
    public void sort() {
        int firstUnsortedIndex = 1;
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            for (int j = firstUnsortedIndex; j > 0; j--) {
                if (unsortedArray[j] >= unsortedArray[j-1]) break;
                else{
                    swap(unsortedArray, j-1, j);
                }
            }
            if (firstUnsortedIndex < unsortedArray.length - 1) firstUnsortedIndex++;
        }
        printSortedArray(unsortedArray);
    }
}
