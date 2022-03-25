package com.sort.归并排序.递归;

/**
 * @Author baixu
 * @Date 2022/3/9 0009 20:07
 * Version 1.0
 * @Description :
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(recurrence(5));
    }
    private static int recurrence(int num){
        return num == 1 ? 1: num * recurrence(num - 1);
    }
}
