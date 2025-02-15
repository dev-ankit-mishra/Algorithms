//Problem Link-https://leetcode.com/problems/fruit-into-baskets/

import java.util.HashMap;

public class FruitsIntoBasket {
    public int totalFruit(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        int n = arr.length;
        while (j < n) {
            if (map.containsKey(arr[j])) {
                map.put(arr[j], map.get(arr[j]) + 1);
            } else {
                map.put(arr[j], 1);
            }
            while (map.size() > 2) {
                int freq = map.get(arr[i]);
                if (freq == 1) {
                    map.remove(arr[i]);
                } else {
                    map.put(arr[i], freq - 1);
                }
                i++;
            }
            int length = j - i + 1;
            max = Math.max(max, length);
            j++;
        }

        return max;
    }
}
