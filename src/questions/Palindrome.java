package questions;

public class Palindrome {

    static boolean checkPalin(String x){
        return x.equals(new StringBuilder(x).reverse().toString());
    }

    public static void main(String[] args){
        //System.out.print(checkPalin("amanaplanacanalpanama"));
        System.out.print(checkPalin("bakayarou"));
    }
}
