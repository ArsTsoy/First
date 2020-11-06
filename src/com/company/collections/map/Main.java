package com.company.collections.map;

import com.company.Animal;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");
        map.replace("key1", "value2", "value6");
        map.remove("key1");
        map.remove("key1", "value2");
//        System.out.println(map);

        // 1-ый способ
//        Set<String> setOfKeys = map.keySet();
//        Iterator<String> iterator = setOfKeys.iterator();
//        while (iterator.hasNext()) {
//            String currentKey = iterator.next();
//            System.out.println(currentKey + " = " + map.get(currentKey));
//        }

        // 2-ой способ
//        Set<Map.Entry<String, String>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
//        while (entryIterator.hasNext()) {
//            Map.Entry<String, String> entry = entryIterator.next();
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

//        // 3-ий способ
//        for(Map.Entry<String, String> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//        // 4-ый способ
        for(String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }


    }
}
