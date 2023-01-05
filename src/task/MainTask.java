package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainTask {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 23.");
        System.out.println();
        int lengthMap = 10;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= lengthMap; i++) {
            Random r = new Random();
            int x = r.nextInt(100);
            //map.put("str"+i,x);

            addToMap(map, "str"+i,x);
        }
        addToMap(map, "str"+11,99);
        addToMap(map, "str"+11,98);
        addToMap(map, "str"+11,98);
       // System.out.println(map);
    }

    public static void addToMap(Map<String, Integer> map, String key, Integer value) {
        System.out.println(map);
        if (map.containsKey(key) && map.containsValue(value)) {
            throw new RuntimeException(String.format("исключение - ключ %s и значение %s уже существуют", key, value));
        }
        map.put(key, value);
    }
}