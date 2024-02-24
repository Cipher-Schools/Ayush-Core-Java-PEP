import java.util.Arrays;

public class largest {
    public static void main(String[] args) {
        int nums[] = {3,30,34,5,9};
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(str, (a,b)->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        System.out.println(sb.toString());
    }
}
