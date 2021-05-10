package algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class Challenges {
    public static void main(String[] args) {
        String weight = "56 65 74 100 99 68 86 180 90";

        Map<String, Integer> map = new HashMap();

        String[] arr = weight.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String el = arr[i];
            String[] smallEl = el.split("");

            Integer sum = 0;
            for (String s : smallEl) {
                int num = Integer.parseInt(s);
                sum+=num;
            }
            map.put(el, sum);
        }
        //System.out.println(map);
        Set<String> set = map.keySet();

        List<String> keyzz = set.stream().toList();
        System.out.println(keyzz);

        Collection<Integer> collect = map.values();
        List<Integer> values = collect.stream().sorted().collect(Collectors.toList());

        List<Integer> list = new ArrayList<>();
        for (Integer value : values) {
            list.add(value);
        }
        System.out.println(list);

        for (int i = 0; i < keyzz.size(); i++) {

        }


    }
}
