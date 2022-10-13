package sort;

import java.util.ArrayList;

public class CountingSort extends Sort {
    public CountingSort(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }


    @Override
    public void sort() {
        //counting sort implementation only does values from 1-10
        int[] countingArray = new int[10];
        int[] sortedArray = new int[unsortedArray.length];
        int i =0;
        int j =1;
        for (int element:unsortedArray) {
            countingArray[element-1]++ ;
        }
        //TODO need to fix this implementation
        for (int element:countingArray) {
            if(countingArray[element] ==0) break;
            while(countingArray[element] > 0){
                sortedArray[i++] = j;
                countingArray[element]--;
            }
            j++;
        }
        printSortedArray(sortedArray);
    }
}
