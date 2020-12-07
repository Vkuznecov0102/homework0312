package fruit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorPractice {
    public static void main(String[] args) {
        Map<String, Fruit> customer = new HashMap<>();
        Fruit apple = new Fruit("Яблоко", 0.8);
        Fruit apricot = new Fruit("Абрикос", 0.3);
        Fruit fig = new Fruit("Инжир", 0.05);
        Fruit orange = new Fruit("Апельсин", 0.3);
        Fruit kiwi = new Fruit("Киви", 0.075);
        Fruit melon = new Fruit("Дыня", 2);
        Fruit watermelon = new Fruit("Арбуз", 3);

        customer.put("Амбарцумян", watermelon);
        customer.put("Иванов", apple);
        customer.put("Алексеев", fig);
        customer.put("Филимонов", watermelon);
        customer.put("Притула", orange);
        customer.put("Андреев", kiwi);
        customer.put("Терентьев", apricot);
        customer.put("Ли", apricot);
        customer.put("Кривенков", melon);

        //6а
        Iterator<Map.Entry<String, Fruit>> iterator = customer.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Fruit> pair = iterator.next();
            if (pair.getKey().length() > 5) {
                System.out.println(pair.getKey() + ":" + pair.getValue());
            }
        }

        System.out.println("---------------");

        //6б
        while (iterator.hasNext()) {
            Map.Entry<String, Fruit> pair = iterator.next();
            if (pair.getValue().getName().equals("Дыня")) {
                System.out.println(pair.getKey() + ":" + pair.getValue());
            }
        }

        System.out.println("---------------");

        //7а
        while (iterator.hasNext()) {
            Map.Entry<String, Fruit> pair = iterator.next();
            int count = 0;
            if (pair.getValue().getName().equals("Арбуз") && count < 2) {
                count++;
            } else {
                System.out.println(pair.getKey() + ":" + pair.getValue());
            }
        }

        System.out.println("---------------");

        //7б
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, Fruit> pair = iterator.next();
            char letter = 'А';
            if (pair.getKey().charAt(0) == letter && count < 2) {
                count++;
            } else {
                System.out.println(pair.getKey() + ":" + pair.getValue());
            }
        }

        System.out.println("---------------");

        //8
        while (iterator.hasNext()) {
            Map.Entry<String, Fruit> pair = iterator.next();
            if (pair.getValue().getName().equalsIgnoreCase("АРбУз")) {
                System.out.println(pair.getKey() + ":" + pair.getValue());
            }
        }

        System.out.println("---------------");

        //9
        Map<Integer, Fruit> otherMap = new HashMap<>();
        while (iterator.hasNext()) {
            Map.Entry<String, Fruit> pair = iterator.next();
            otherMap.put(count + 1, pair.getValue());
            count++;
        }
        for (Map.Entry<Integer, Fruit> pair : otherMap.entrySet()) {
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }

        System.out.println("---------------");

        //10
        double sumWeight = 0;
        double average;
        for (Map.Entry<String, Fruit> pair : customer.entrySet()) {
            sumWeight = sumWeight + pair.getValue().getWeight();
        }
        average = sumWeight / customer.size();
        System.out.println("Средний вес фруктов " + average + " килограмм");
    }
}
