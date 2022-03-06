package questions;

public class RotateImage {

    public void rotate90(int[][] a) {

        System.out.println("Original matrix:");
        printMatrix(a);

        int[][] b = transposeMatrix(a);
        //System.out.println("After Transpose:");
        //printMatrix(b);

        int[][] c = reverseMatrix(b);
        System.out.println("After Reverse:");
        printMatrix(c);

    }

    private int[][] transposeMatrix(int[][] a) {

        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }

    private int[][] reverseMatrix(int[][] b) {

        for (int i = 0; i < b.length; i++) {
            int j = 0;
            int k = b[i].length - 1;
            while (j < k) {
                int temp = b[i][j];
                b[i][j] = b[i][k];
                b[i][k] = temp;
                j++;
                k--;
            }
        }
        return b;
    }

    private void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}