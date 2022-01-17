package GenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class GenericCreate<T> {
    private T content;
    public T emptyCreate(){
        return content;
    }
    public void packCreate(T content){
        this.content=content;
    }
}

class Elephant{}
class Zebra{}

class RunGeneric{
    public static void main(String[] args){
        GenericCreate<Elephant> createElephant = new GenericCreate<>();
        GenericCreate<Zebra> createZebra = new GenericCreate<>();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(42));
        //List<Object> objects = numbers; // DOES NOT COMPILE
        //  objects.add("forty two");
        System.out.println(numbers.get(1));
    }
}

