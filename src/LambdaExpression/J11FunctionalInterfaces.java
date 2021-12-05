package LambdaExpression;


//Predicate, Consumer, Supplier, and Comparator

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class J11FunctionalInterfaces {
    public static void main(String args[]){
        List<String> cats = new ArrayList<>();
        cats.add("leo");
        cats.add("Olivia");

        cats.sort((c1, c2) -> -c1.compareTo(c2)); // line X
        System.out.println(cats);


        int length = 3;

        for (int i = 0; i<3; i++) {
            if (i%2 == 0) {
                Supplier<Integer> supplier = () -> length; // A
                System.out.println(supplier.get());        // B
            } else {
                int j = i;
                Supplier<Integer> supplier = () -> j;      // C
                System.out.println(supplier.get());        // D
            }
        }
    }

    public void method() {
        x((var x) -> {}, (var x, var y) -> 0);
    }
    public void x(Consumer<String> x, Comparator<Boolean> y) {
    }


    //You can find var types from consume method signature
    public void whatAmI() {
        consume((var x) -> System.out.print(x), 123);
    }
    public void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }


    /*public void variables(int a) {
        int b = 1;
        Predicate<Integer> p1 = a -> {
            int b = 0;
            int c = 0;
            return b == c;}
    }*/

    //The variable a was already used in this scope as a method parameter
    //The variable b was already used in this scope
    // The third syntax error is quite subtle


    /**
     * Calling APIs with Lambdas
     */

    //removeIf()
    void removeIfExample(){
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);     // [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies);     // [hoppy]
    }

    //Sort()
    void sortExample(){
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);     // [long ear, floppy, hoppy]
        bunnies.sort((b1, b2) -> b1.compareTo(b2));
        System.out.println(bunnies);     // [floppy, hoppy, long ear]
    }

    //forEach()
    //It takes a Consumer and calls that lambda for each elements
    //We can use forEach with a Set or Map

    void forEachExample(){
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");

        bunnies.forEach(b -> System.out.println(b));
        System.out.println(bunnies);


        Map<String, Integer> bunny = new HashMap<>();
        bunny.put("long ear", 3);
        bunny.put("floppy", 8);
        bunny.put("hoppy", 1);
        bunny.forEach((k, v) -> System.out.println(k + " " + v));

        Set<String> set = Set.of("mickey", "minnie");
        List<String> list = new ArrayList<>(set);

        set.forEach(s -> System.out.println(s));
        list.forEach(s -> System.out.println(s));
    }


}

