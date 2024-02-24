import java.util.*;

public class slidingWindow {
    public static void main(String[] args) {
        String str = "abcababbad";
        System.out.println(LongestSubstring(str));
    }

    static int LongestSubstring(String str){
        int n = str.length();
        int res = 0;
        int [] lastIdx = new int [256];
        Arrays.fill(lastIdx, -1);

        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(i, lastIdx[str.charAt(j)]+1);
            res = Math.max(res, j-i+1);
            lastIdx[str.charAt(j)] = j;
        }
        return res;
    }
}
