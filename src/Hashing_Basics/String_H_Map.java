// String Hashing...
package Hashing_Basics;
import java.util.*;
public class String_H_Map {
    public static void main(String[] args) {
//        Scanner for taking input...
        Scanner sc = new Scanner(System.in);

//        create object of hashmap...
        HashMap <Character,Integer> Map = new HashMap<>();

//        Taking String as input...
        System.out.println("Enter the String.");
        String s = sc.nextLine();

//        converting the string to lowercase...
        String str = s;

//        putting values and key pair inside the hashmap...
        for (int i = 0; i < str.length(); i++){
            Map.put(str.charAt(i), Map.getOrDefault(str.charAt(i),0)+1);
        }

        System.out.println(Map);// printing map contents...

//        checking for character user wanted to check by taking input...
        System.out.println("Enter which element frequency you want to get...");
        char ch = sc.next().charAt(0);

//        if map contains key then print its value else leave...
        if (!Map.containsKey(ch)){
            System.out.println("Character is not in String");
        }
        else System.out.println(Map.get(ch));

    }
}
