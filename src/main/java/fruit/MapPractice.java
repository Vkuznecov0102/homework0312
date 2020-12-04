package fruit;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Fruit> customer = new HashMap<>();
        Fruit apple = new Fruit("Яблоко", 0.8);
        Fruit apricot = new Fruit("Абрикос", 0.3);
        Fruit fig = new Fruit("Инжир", 0.05);
        Fruit orange = new Fruit("Апельсин", 0.3);
        Fruit kiwi = new Fruit("Киви", 0.075);

        customer.put("Иванов", apple);
        customer.put("Степанов", fig);
        customer.put("Притула", orange);
        customer.put("Ковалев", kiwi);
        customer.put("Терентьев", apricot);

        Map<String, Fruit> anotherCustomer = new HashMap<>(customer);

        System.out.println("anotherCustomer.get(\"Притула\") = " + anotherCustomer.get("Притула"));

        System.out.println("anotherCustomer.remove(\"Иванов\") = " + anotherCustomer.remove("Иванов"));

        System.out.println("anotherCustomer.containsKey(\"Иванов\") = " + anotherCustomer.containsKey("Иванов"));
        System.out.println("anotherCustomer.containsKey(\"Терентьев\") = " + anotherCustomer.containsKey("Терентьев"));
        System.out.println("anotherCustomer.containsValue(apricot) = " + anotherCustomer.containsValue(apricot));
        System.out.println("anotherCustomer.containsValue(apple) = " + anotherCustomer.containsValue(apple));

        System.out.println("---------------");

        for (String fruit : anotherCustomer.keySet()) {
            System.out.println(fruit);
        }

        System.out.println("---------------");

        for (Fruit fruitValues : anotherCustomer.values()) {
            System.out.println(fruitValues);
        }

        System.out.println("---------------");

        for (Map.Entry<String, Fruit> pair : anotherCustomer.entrySet()) {
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }

    }
}
