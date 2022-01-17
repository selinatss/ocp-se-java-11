package GenericsAndCollections;

/*
List: A list is an ordered collection of elements that allows duplicate entries.
Elements in a list can be accessed by an int index.

Set: A set is a collection that does not allow duplicate entries.

Queue: A queue is a collection that orders its elements in a specific order for processing.
A typical queue processes its elements in a first‐in, first‐out order, but other orderings are possible.

Map: A map is a collection that maps keys to values, with no duplicate keys allowed.
The elements in a map are key/value pairs.
 */

import java.util.*;

public class ListSetMapQueue {
    public static void main(String[] args){
        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Selin"));
        System.out.println(list.add("Selin"));
        list.removeIf(s -> s.startsWith("S"));
        System.out.println(list.size());

        list.add("");
        System.out.println(list.removeIf(String::isEmpty));  //s -> s.isEmpty()
        System.out.println(list.size());

        Collection<String> hashSet = new HashSet<>();
        System.out.println(hashSet.add("Selin"));
        System.out.println(hashSet.add("Selin"));

        //forEach
        Collection<String> cats = Arrays.asList("AAA", "BBB");
        cats.forEach(s -> System.out.println(s));

        //asList, of, copyOf
        String[] array = new String[] {"aaa", "bbb", "ccc"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);

        array[0] = "z";

        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);

        asList.set(0, "x");
        //copy.add("y"); //exception

        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.replaceAll(x -> x*2);
        System.out.println(numbers);


        //HashSet & TreeSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(23);
        set.add(54);
        set.forEach(System.out::println);

        Set<Integer> set1 = new TreeSet<>();
        set.add(10);
        set.add(23);
        set.add(54);
        set.forEach(System.out::println);

        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.offer(10));
        System.out.println(queue.offer(4));
        System.out.println(queue.peek()); //10
        System.out.println(queue.poll()); //10
        System.out.println(queue.poll()); //4
        System.out.println(queue.peek()); //null


        Map<String, String> map = new HashMap<>();
        map.put("koala", "bbb");
        map.put("sss", "aaa");
        for(String s: map.keySet())
            System.out.println(s);


        Map<Integer, Character> map2 = new HashMap<>();
        map2.put(1, 'a');
        map2.put(2, 'b');
        map2.put(3, 'c');
        map2.forEach((k,v) -> System.out.println(v));
        map2.values().forEach(System.out::println);

        map2.entrySet().forEach(
                e -> System.out.println(e.getKey()+e.getValue())
        );

    }
}
