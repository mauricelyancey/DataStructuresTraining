package sort;

public class SelectionSort {
    private int[] unsortedArray;

    public SelectionSort() {
    }

    public SelectionSort(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

    public void sort(){
        for(int lastUnsortedIndex = unsortedArray.length - 1; lastUnsortedIndex>0; lastUnsortedIndex--){
            int indexOfLargest = 0;
            for(int i = 0; i <lastUnsortedIndex; i++){
                if(unsortedArray[i] > unsortedArray[indexOfLargest]) indexOfLargest = i;
            }
            swap(unsortedArray, indexOfLargest, lastUnsortedIndex);
        }
        for (int i : unsortedArray) {
            System.out.println(i);
        }
    }

    private void swap(int[] array, int i, int j){
        if(i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
