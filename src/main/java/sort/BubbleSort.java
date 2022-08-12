package sort;

public class BubbleSort extends Sort {
    public BubbleSort() {
    }

    public BubbleSort(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

    public void sort(){
        for(int lastUnsortedIndex = unsortedArray.length - 1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i = 0; i <lastUnsortedIndex; i++){
                if(unsortedArray[i] > unsortedArray[i +1]) swap(unsortedArray, i, i+1);
            }
        }
        printSortedArray(unsortedArray);
    }
}
