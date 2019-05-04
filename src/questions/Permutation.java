import java.util.*;

class Permutation {
    
    public static void main(String[] args) {

        String str = "DOG";
        permutations("", str); 
    }
    
    private static void permutations(String prefix, String word) {
        
        if (word.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String letter = word.substring(i, i + 1);
                String otherLetters = word.substring(0, i) + word.substring(i + 1);
                permutations(prefix + letter, otherLetters);
            }
        }
    }
        

}