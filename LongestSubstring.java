import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class LongestSubstring {

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Character> chars = new ArrayList<Character>();
        int i = 0, j = 0, longest = 0;
        while(i < s.length() && j < s.length()) {
            if(chars.contains(s.charAt(j))) {
                chars.removeAll(Arrays.asList(s.charAt(i++)));
            } else {
                chars.add(s.charAt(j++));
                longest = Math.max(longest, j - i);
            }
            System.out.println(longest + ", " + chars);
        }
        System.out.print(longest);
    }
}