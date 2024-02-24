import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class candies {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobsizes){
        int aliceSum = 0;
        for (int i : aliceSizes) {
            aliceSum += i;
        }
        int bobSum = 0;
        HashSet<Integer> bobSet = new HashSet<>();
        for (int i : bobsizes) {
            bobSum += i;
            bobSet.add(i);
        }
        int targetDiff = (aliceSum - bobSum)/2;

        for (int a : aliceSizes) {
            int b = a- targetDiff;
            if(bobSet.contains(b))
                return new int[]{a,b};
        }
        return new int[0];
        
    }
}
