package GenericsAndCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparators implements Comparable<Comparators>{
    private String name;
    private int weight;

    public Comparators(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(){
        this.weight = weight;
    }

    @Override
    public int compareTo(Comparators o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Comparators{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args){
        Comparator<Comparators> byWeight = new Comparator<Comparators>() {
            //Comparator method name should be compare, otherwise it doesn2t compile
            @Override
            public int compare(Comparators o1, Comparators o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };

        var comparableObjects = new ArrayList<Comparators>();
        comparableObjects.add(new Comparators("Duygu", 48));
        comparableObjects.add(new Comparators("Selin", 45));
        Collections.sort(comparableObjects);
        System.out.println(comparableObjects);
        Collections.sort(comparableObjects, byWeight);
        System.out.println(comparableObjects);

        Comparator<Comparators> byWeight2 = (d1, d2) -> (d1.getWeight()-d2.getWeight());
        Comparator<Comparators> byWeight3 = Comparator.comparing(Comparators::getWeight);


    }
}
