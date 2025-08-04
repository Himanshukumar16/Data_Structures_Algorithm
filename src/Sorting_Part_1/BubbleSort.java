//Bubble sort -> finding max and adding at last by adjacent swapping.
// Time complexity: O(N^2)
package Sorting_Part_1;
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {120,0,25,23,2};

        for(int i = 1; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length - 1; j++){

                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i : arr){

            System.out.print(i + " ");
        }
    }
}
