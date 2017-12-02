package questions;

import java.util.ArrayList;
import java.util.List;

public class CountMax {

    public static void printIndicesForMax(int[] testCase) {

        List<Integer> indices = new ArrayList<Integer>();
        int max = testCase[0];
        int length = testCase.length;

        for (int i = 0; i < length; i++) {
            if (testCase[i] > max) {
                max = testCase[i];
                if (!indices.isEmpty())
                    indices.clear();
                indices.add(i);
            }else if(testCase[i] == max){
                indices.add(i);
            }
        }

        for (int index : indices)
            System.out.println(index);
    }

    public static void main(String[] args) {

        int[] testCase = {1,3,43,5,5,6,7,34,99,99};
        printIndicesForMax(testCase);
    }
}
