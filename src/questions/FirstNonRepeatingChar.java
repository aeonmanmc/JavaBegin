package questions;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        find("HHello");
    }

    static void find(String s) {

        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            if (characters.add(s.charAt(i))) {
                System.out.print("First non repeating character: " + s.charAt(i));
                break;
            }
        }
    }
}
