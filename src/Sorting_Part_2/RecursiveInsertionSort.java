package Sorting_Part_2;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int []arr = {10,6,9,5,4,1};
        Rec r = new Rec();
        r.rec(arr,arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
class Rec{
    public void rec(int[] arr, int ptr){
        if(ptr < 1){
            return;
        }
        int j = ptr;
        while(j > 0 && arr[j] < arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        rec(arr , ptr-1);
    }
}
