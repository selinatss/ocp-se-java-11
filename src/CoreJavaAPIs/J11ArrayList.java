package CoreJavaAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J11ArrayList {
    static void creatingArrayList(){
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();

        var strings = new ArrayList<String>();
        strings.add("a");

        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE
    }

    static void usingArrayList(){
        //add()
        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);
        System.out.println(list);  //it compiles because we didn't specify any type in arraylist

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //safer.add(Boolean.TRUE);    // DOES NOT COMPILE  //We specify string arraylist

        List<String> birds = new ArrayList<>();
        birds.add("hawk");            // [hawk]
        birds.add(1, "robin");        // [hawk, robin]
        birds.add(0, "blue jay");     // [blue jay, hawk, robin]
        birds.add(1, "cardinal");     // [blue jay, cardinal, hawk, robin]
        System.out.println(birds);    // [blue jay, cardinal, hawk, robin]

        //remove
        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk");     // [hawk]
        birds2.add("hawk");     // [hawk, hawk]
        System.out.println(birds2.remove("cardinal")); // prints false
        System.out.println(birds2.remove("hawk"));     // prints true
        System.out.println(birds2.remove(0));          // prints hawk
        System.out.println(birds2);                    // []

        //set()
        List<String> birds3 = new ArrayList<>();
        birds3.add("hawk");                    // [hawk]
        System.out.println(birds3.size());     // 1
        birds3.set(0, "robin");               // [robin]
        System.out.println(birds3.size());     // 1
        birds3.set(1, "robin");               // IndexOutOfBoundsException

        //isEmpty() & size()
        List<String> birds4 = new ArrayList<>();
        System.out.println(birds4.isEmpty());     // true
        System.out.println(birds4.size());        // 0
        birds4.add("hawk");                       // [hawk]
        birds4.add("hawk");                       // [hawk, hawk]
        System.out.println(birds4.isEmpty());     // false
        System.out.println(birds4.size());        // 2

        //clear()
        List<String> birds5 = new ArrayList<>();
        birds5.add("hawk");                    // [hawk]
        birds5.add("hawk");                    // [hawk, hawk]
        System.out.println(birds5.isEmpty());  // false
        System.out.println(birds5.size());     // 2
        birds5.clear();                        // []
        System.out.println(birds5.isEmpty());  // true
        System.out.println(birds5.size());     // 0

        //contains()
        List<String> birds6 = new ArrayList<>();
        birds6.add("hawk");                           // [hawk]
        System.out.println(birds6.contains("hawk"));  // true
        System.out.println(birds6.contains("robin")); // false

        //equals()
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two));  // true
        one.add("a");                         // [a]
        System.out.println(one.equals(two));  // false
        two.add("a");                         // [a]
        System.out.println(one.equals(two));  // true
        one.add("b");                         // [a,b]
        two.add(0, "b");                      // [b,a]
        System.out.println(one.equals(two));  // false

        int bad1 = Integer.parseInt("a");         // throws NumberFormatException
        Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException
    }

    static void convertingBetweenArrayAndArrayList(){
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);   //its size is the same with list
        list.clear();
        System.out.println(objectArray.length);     // 2
        System.out.println(stringArray.length);     // 2


        String[] array2 = { "hawk", "robin" };     // [hawk, robin]
        List<String> list2 = Arrays.asList(array2); // returns fixed size list
        System.out.println(list2.size());         // 2
        list2.set(1, "test");                     // [hawk, test]
        array2[0] = "new";                        // [new, test]
        System.out.print(Arrays.toString(array2));// [new, test]
        list2.remove(1);     // throws UnsupportedOperationException

        String[] array3 = { "hawk", "robin" };        // [hawk, robin]
        List<String> list3 = List.of(array3);      // returns immutable list
        System.out.println(list3.size());            // 2
        array3[0] = "new";
        System.out.println(Arrays.toString(array3)); // [new, robin]
        System.out.println(list3);                   // [hawk, robin]
        list3.set(1, "test");      // throws UnsupportedOperationException
    }
}
