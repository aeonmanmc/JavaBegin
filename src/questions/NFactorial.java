package questions;

public class NFactorial {

    public void findFactorial(int n) {
        System.out.print(nfac(n));
    }

    private int nfac(int n) {

        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return n * nfac(n - 1);
    }
}