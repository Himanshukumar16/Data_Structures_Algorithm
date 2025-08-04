// Palindrome String...
package Recursion_Basics;
public class PallindromeString {
    public static void main(String[] args) {
        PS r = new PS();
        System.out.println(r.reccur(0,"NAMAN"));
    }
}
class PS{
    public boolean reccur(int i,String str){
        if(i >= str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt((str.length()-1-i))){
            return false;
        }
        return reccur(i+1,str);
    }
}