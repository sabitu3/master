import java.util.Arrays;
import java.util.HashMap;

public class SanasAi {
/*
* My name is Sabitu my name is Sabitu Gautam
My =2
name =2
is=2
Sabitu =2
Gautam=1
* */

    public static void main(String[] args) {
        String str  = "My name is Sabitu my name is Sabitu Gautam";

       String arr []=   str.toLowerCase().split(" ");

       System.out.println("String array "+ Arrays.toString(arr));

        HashMap<String,Integer> countMap= new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(countMap.containsKey(arr[i])){
                countMap.put(arr[i],countMap.get(arr[i])+1);
            }
            else{
                countMap.put(arr[i], 1);
            }

           // countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(countMap);

        }






}
