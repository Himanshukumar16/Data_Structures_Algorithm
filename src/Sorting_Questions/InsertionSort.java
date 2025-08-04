// takes element and places it in its correct order !
// Time complexity : O(N^2)
package Sorting_Questions;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {120,0,25,23,2};

        for(int i = 0; i < arr.length;i++){
            int j = i;
            while(j > 0 && (arr[j - 1] > arr[j])){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
