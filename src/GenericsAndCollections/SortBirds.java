package GenericsAndCollections;

import java.util.*;

public class SortBirds {
    static class Bird {int id;}
    public static void main(String[] args){
        List<Bird> birds = new ArrayList<>();
        birds.add(new Bird());
       // Collections.sort(birds);  DOES NOT COMPILE, Bird class is not comparable
        Comparator<Bird> c = (c1, c2)  -> (c1.id - c2.id);
        Collections.sort(birds, c);

        Set<Bird> birdSet = new TreeSet<>();
        birdSet.add(new Bird()); // Class cast exception, Bird class is not comparable

        Set<Bird> birdSet1 = new TreeSet<>((r1, r2) -> (r1.id-r2.id));
        birdSet1.add(new Bird());

    }
}
