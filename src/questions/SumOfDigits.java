package questions;

public class SumOfDigits {

    public void sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.print(sum);
    }
}