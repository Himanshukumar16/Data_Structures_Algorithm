package Recursion;

public class IsPallindrome {
    public void isPallindrome(String str) {
        System.out.println(pallindromicFunction(str,0));
    }

    private boolean pallindromicFunction(String str, int i) {
        if (i > str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        return pallindromicFunction(str , i + 1);
    }
}
