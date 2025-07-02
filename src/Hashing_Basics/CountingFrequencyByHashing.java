// Hashing Basics.
package Hashing_Basics;
import java.util.*;
public class CountingFrequencyByHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the value of element in Array !! ");
            arr[i] = sc.nextInt();
        }

        System.out.println("What is the Maximum value of element does Array have ?");
        int maxValue = (sc.nextInt()+1);

        int[] hash = new int [maxValue];

        for (int j : arr) {
            hash[j] += 1;
        }

        System.out.println("No of times you want to search ?");
        int n = sc.nextInt();

        while(n != 0){
            System.out.println("What is value of number you want to find frequency ?");
            int num = sc.nextInt();
            n--;
            System.out.println("The frequency of the "+ num+ " is "+hash[num]+" Times.");

        }
    }
}
