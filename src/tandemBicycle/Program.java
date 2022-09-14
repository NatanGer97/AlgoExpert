package tandemBicycle;

import java.util.*;

public class Program {
    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        int results = 0;
        for (int i = 0; i < redShirtSpeeds.length; i++) {
            if (fastest)
                results += Math.max(redShirtSpeeds[i], blueShirtSpeeds[redShirtSpeeds.length - i-1]);
            else
                results += Math.min(redShirtSpeeds[i], blueShirtSpeeds[i]);

        }

        return results;
    }

    public static void main(String[] args) {
        System.out.println(tandemBicycle(new int[]{5,5,3,9,2},new int[]{3,6,7,2,1},true));
    }
}
