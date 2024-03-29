package sort;

public class MergeSort extends Sort{

    public MergeSort() {
    }

    public MergeSort(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

    @Override
    public void sort() {
    int end = unsortedArray.length;
    int start = 0 ;
    mergeSort(unsortedArray, start, end);
    printSortedArray(unsortedArray);
    }

    private void mergeSort(int[] input, int start, int end){

        if(end - start <2) return;

        int mid = (start+end)/2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private void merge(int[] input, int start, int mid, int end) {
        if(input[mid -1] <= input[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex=0;

        int[] temp = new int[end - start];
        while(i< mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

}
