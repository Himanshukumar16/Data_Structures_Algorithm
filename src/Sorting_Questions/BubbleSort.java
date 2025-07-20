//Bubble sort -> finding max and adding at last by adjacent swapping.
package Sorting_Questions;
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr ={10,22,5,6,2,23};

        for(int i = 0; i < arr.length - 1 ; i++) {
            for(int j = 0 ; j <= i ; j++){

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
