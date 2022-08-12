package sort;

public class ShellSort extends Sort{

    public ShellSort() {
    }

    public ShellSort(int[] unsortedArray) {this.unsortedArray = unsortedArray;}

    @Override
    public void sort() {
        int gap = unsortedArray.length/2;
        int j;
        if(gap == 0 || gap == 1){
            new InsertionSort(unsortedArray).sort();
            return;
        }
        while(gap>1) {
            for (int i = gap; i < unsortedArray.length; i++) {
                j = i - gap;
                if (unsortedArray[i] < unsortedArray[j]) swap(unsortedArray, i, j);
            }
            gap /= 2;
        }
        new InsertionSort(unsortedArray).sort();
    }
}
