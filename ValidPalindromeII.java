import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class ValidPalindrome {

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                int j = s.length() - i;
                System.out.println(isPalindrome(s.substring(i + 1, j)) ||
                        isPalindrome(s.substring(i, j - 1)));
            }
        }
        System.out.println(true);
    }

    public static boolean isPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}