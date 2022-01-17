package GenericsAndCollections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoundOfGenerics {
    public static void printList(List<?> list){
        for(Object x: list)
            System.out.println(x);
    }

    public static void main(String[] args){
        List<String> keyWords = new ArrayList<>();
        keyWords.add("java");
        printList(keyWords);

        //UPPERBOUND
        //ArrayList<Number> arrayList = new ArrayList<Integer>(); DOES NOT COMPILE
        ArrayList<? extends Number> arrayList = new ArrayList<Integer>();

        List<? extends Bird> birds = new ArrayList<Bird>();
       // birds.add(new Sparrow());  DOES NOT COMPILE
       // birds.add(new Bird());


        //LOWERBOUND
        List<? super IOException> exceptions = new ArrayList<Exception>();
        //exceptions.add(new Exception());
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());


        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();

        //List<? extends B> list4 = new ArrayList<A>(); DOES NOT COMPILE
        List<? super B> list5 = new ArrayList<A>();

    }
}

class Bird{}
class Sparrow extends Bird{}


class A {}
class B extends A {}
class C extends A {}
