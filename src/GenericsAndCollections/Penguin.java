package GenericsAndCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Penguin {

    public static void main(String args[]){
        Supplier<Integer> methodRef1 = Penguin::countBabies;
        Supplier<Integer> lambda1 = () -> Penguin.countBabies();

        Function<Penguin, Integer> methodRef2 = Penguin::countBabies;
        Function<Penguin, Integer> lambda2 = (x) -> Penguin.countBabies(x);

        BiFunction<Penguin, Penguin, Integer> methodRef3 = Penguin::countBabies;
        BiFunction<Penguin, Penguin, Integer> lambda3 = (x, y) -> Penguin.countBabies(x,y);

        //Generics:
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        Map<String, List<Integer>> map1 = new HashMap<String, List<Integer>>();
    }


    public static Integer countBabies(Penguin... cuties){
        return cuties.length;
    }
}
