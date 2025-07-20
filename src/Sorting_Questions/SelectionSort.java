// Selection sort -> finding smaller and adding at start.
package Sorting_Questions;
public class SelectionSort {
    public static void main(String[] args) {
// time complexity -> O(n^2);
        int[]arr = {-1,-11,-1,1,2,2,3,5};

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){

                int min = arr[i];

                if(min > arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        for (int i : arr) {

            System.out.println(i);

        }
    }
}