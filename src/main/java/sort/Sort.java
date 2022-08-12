package sort;

public abstract class Sort{
    int[] unsortedArray;
    public abstract void sort();
    protected void swap(int[] array, int i, int j) {
        if (i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    protected void printSortedArray(int[] array){
        for (int element : array) {
            System.out.println(element);
        }
    }
}
