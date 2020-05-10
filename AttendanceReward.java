import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class AttendanceReward {

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long count = s.chars().filter(ch -> ch == 'A').count();
        if(count > 1) {
            System.out.println("False");
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') {
                if(i != s.length() - 1 && s.charAt(i + 1) == 'L') {
                    System.out.println("False");
                    break;
                }
            }
        }
        System.out.println("True");
    }
}