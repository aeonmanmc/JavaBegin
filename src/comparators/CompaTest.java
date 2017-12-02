package comparators;

import java.util.*;

public class CompaTest {

    public static void main(String[] args) {

        Human h3 = new Human(3, "Bruhl", "Edy");
        Human h1 = new Human(1, "Diebel", "Avan");
        Human h2 = new Human(2, "Bruhl", "Anisette");

        Human[] humans = new Human[3];
        humans[0] = h3;
        humans[1] = h1;
        humans[2] = h2;

        for (Human h : humans)
            System.out.println(h.getId() + "\t" + h.getHometown() + "\t" + h.getName());
        System.out.println();

        //Comparable interface
        Arrays.sort(humans);

        for (Human h : humans)
            System.out.println(h.getId() + "\t" + h.getHometown() + "\t" + h.getName());
        System.out.println();

        //Comparator
        Comparator<Human> mixedCompa = new Comparator<Human>() {
            @Override
            public int compare(Human human1, Human human2) {
                int result = human1.getHometown().compareTo(human2.getHometown());

                if (result == 0)
                    return human1.getName().compareTo(human2.getName());
                else
                    return result;
            }
        };

        Arrays.sort(humans, mixedCompa);

        for (Human h : humans)
            System.out.println(h.getId() + "\t" + h.getHometown() + "\t" + h.getName());
    }
}
