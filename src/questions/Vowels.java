package questions;

class Vowels {

    public static void main(String[] args) {
        System.out.println("Number of vowels: " + countCharacters("Jam"));
    }

    static int countCharacters(String line) {

        char[] charArr = line.toCharArray();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (char c : charArr) {
            if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u' || c == 'A' ||
                    c == 'E' || c == 'I' || c == 'O' ||
                    c == 'U') {
                vowels++;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                consonants++;
            } else if (c >= '0' && c <= '9') {
                digits++;
            } else if (c == ' ') {
                ++spaces;
            }
        }
        return vowels;
    }

}