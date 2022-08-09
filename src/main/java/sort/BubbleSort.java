package sort;

public class BubbleSort {

    private int[] unsortedArray;

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
