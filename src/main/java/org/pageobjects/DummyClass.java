package org.pageobjects;

import java.lang.reflect.Array;
import java.util.*;

public class DummyClass {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("aa",2);
        map.put("ag",5);

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println("peek element "+stack.peek());
        System.out.println("print stack "+stack);

        Queue<Integer> qu = new PriorityQueue<>();
       qu.offer(99);
       qu.offer(44);
       qu.offer(33);
       qu.add(45);

        System.out.println("priority queue is "+qu);
        System.out.println("poll is "+qu.poll());
        System.out.println("priority queue is "+qu);
        System.out.println("remove is "+qu.remove());
        System.out.println("priority queue after remove is "+qu);


    }




}
