package com.栈;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @Author baixu
 * @Date 2022/3/21 0021 15:56
 * Version 1.0
 * @Description :
 */
public class StackTest {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        Iterator iterator = stack.iterator();
//        while (iterator.hasNext()){
//            System.out.printf(iterator.next()+"|");
//        }
//        System.out.println(stack.length()+" "+stack.pop()+" "+stack.length());
        StackPlus<Integer> nums = new StackPlus<>(20);
        nums.push(1,2,3,4,5,6,7,8,9,10,11);
        while (!nums.isEmpty()){
            System.out.println(nums.pop());
            System.out.println(nums.length());
            System.out.println("--------------");
        }

    }
}
