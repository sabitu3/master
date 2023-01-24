package practice;

import javax.xml.stream.events.Characters;
import java.util.*;

public class TestMain {

    public static void main(String[] args) {

        String a="abchchchcopkljgfd2yh89okl";

        char [] ch = a.toCharArray();

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for(int i=0; i<ch.length; i++){

            if(charCountMap.containsKey(ch[i])){

                charCountMap.put(ch[i], charCountMap.get(ch[i])+1);

            }

            else{

                charCountMap.put(ch[i],1);

            }

        }

        System.out.println(charCountMap);

    }
}


