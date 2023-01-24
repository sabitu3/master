package practice;

import java.util.HashMap;
import java.util.Map;

public class MapWorking {

    public static void main(String[] args) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('a',2);
        map.put('b',4);
        map.put('c',6);


        for(Map.Entry<Character,Integer> e: map.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());


        }


    }



    }


