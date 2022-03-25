package com.sort.test;

import com.sort.希尔排序.ShellSort;
import com.sort.插入排序.InsertSort;

import java.util.Arrays;

/**
 * @Author baixu
 * @Date 2022/3/9 0009 19:45
 * Version 1.0
 * @Description :
 */
public class Test {
    public static void main(String[] args) {


    }
    public static void testInsert(Integer c[]){
        long start = System.currentTimeMillis();
        InsertSort.insertSort(c);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void testShell(Integer c[]){
        long start = System.currentTimeMillis();
        ShellSort.sort(c);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
