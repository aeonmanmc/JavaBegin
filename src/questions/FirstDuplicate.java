package questions;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 1};
        firstDupe(arr);
    }

    static void firstDupe(int[] arr) {

        Set<Integer> numSet = new HashSet<>();
        for (int j : arr) {
            if (!numSet.add(j)) {
                System.out.print(j);
                break;
            }
        }
    }
}