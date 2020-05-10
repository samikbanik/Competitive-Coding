import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class HammingDistance {

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        ArrayList<Integer> xset = new ArrayList<Integer>();
        ArrayList<Integer> yset = new ArrayList<Integer>();
        int x1 = x;
        int y1 = y;
        while(x1 > 0) {
            xset.add(x1 % 2);
            x1 = (int)(x1 / 2);
        }
        while(y1 > 0) {
            yset.add(y1 % 2);
            y1 = (int)(y1 / 2);
        }
        if(xset.size() > yset.size()) {
            for(int i = yset.size(); i < xset.size(); i++) {
                yset.add(0);
            }
        } else {
            for(int i = xset.size(); i < yset.size(); i++) {
                xset.add(0);
            }
        }
        int size = xset.size();
        int counter = 0;
        for(int i = 0; i < size; i++) {
            if(xset.get(i) != yset.get(i)) {
                counter++;
            }
        }
        System.out.print(counter);
    }
}