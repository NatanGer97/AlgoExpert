import java.util.*;

public class nonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);
        int currentCoin = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > currentCoin + 1)
                break;
            else {
                currentCoin += coins[i];
            }
        }
        return currentCoin + 1;
    }
}
