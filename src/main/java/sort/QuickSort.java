package sort;

public class QuickSort extends Sort{

    public QuickSort() {
    }
    public QuickSort(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }
    @Override
    public void sort() {
        int start =0;
        int end = unsortedArray.length;
        quickSort(unsortedArray, start, end);
        printSortedArray(unsortedArray);
    }

    private void quickSort(int[] input, int start, int end) {
        if (end-start <2) return;

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);
    }

    private int partition(int[] input, int start, int end){
        //This is using the first element as the pivot every time
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i<j){


            //NOTE: empty loop body
            while(i<j && input[--j]>=pivot){
                if(i<j) input[i] = input[j];
            }
            //NOTE: empty loop body
            while(i<j && input[++i] <=pivot){
                if(i<j) input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

}
