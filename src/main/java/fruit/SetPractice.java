package fruit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Яблоко", 0.8);
        Fruit apricot = new Fruit("Абрикос", 0.3);
        Fruit fig = new Fruit("Инжир", 0.05);
        Fruit orange = new Fruit("Апельсин", 0.3);
        Fruit kiwi = new Fruit("Киви", 0.075);

        Set<Fruit> fruits = new HashSet<>(Arrays.asList(apple, apricot, fig, orange, kiwi));
        System.out.println(fruits);

        fruits.add(new Fruit("Груша", 0.15));
        System.out.println(fruits);

        fruits.add(new Fruit("Киви", 0.075));
        System.out.println(fruits); //не добавилось

        fruits.remove(fig);
        System.out.println(fruits);

        System.out.println("fruits.contains(apple) = " + fruits.contains(apple));
        System.out.println("fruits.contains(fig) = " + fruits.contains(fig));
    }
}
