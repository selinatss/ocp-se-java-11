package GenericsAndCollections;

import java.util.Comparator;

public class MultiFieldComparator implements Comparator<Squirrel> {
    @Override
    public int compare(Squirrel o1, Squirrel o2) {
        int result = o1.getSpecies().compareTo(o2.getSpecies());
        if(result != 0) return result;
        return o1.getWeight()-o2.getWeight();
    }

    Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies)
            .thenComparingInt(Squirrel::getWeight);

}

 class Squirrel{
    private String species;
    private int weight;

    public  Squirrel(String species, int weight){
        this.species = species;
        this.weight = weight;
    }

    public String getSpecies(){
        return species;
    }

    public int getWeight(){
        return weight;
    }


}
