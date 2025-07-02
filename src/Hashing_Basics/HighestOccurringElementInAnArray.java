// Highest Occurring Element In An Array...
package Hashing_Basics;
import java.util.*;
public class HighestOccurringElementInAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the value of element in Array !! ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the maximum element you entered !");
        int maxNumber = (sc.nextInt()+1);
        int[] hash = new int[maxNumber];

        for(int i : arr){
            hash[i] += 1;
        }

        System.out.println("Maximum number which is repeated maximum times in the Array is :");
        int max = hash[0];
        int num = 0;
        for(int i = 1; i < hash.length ; i++ ){
            if(max < hash[i]){
                max = hash[i];
                num = i;
            }
        }
        System.out.println(num);
    }
}
