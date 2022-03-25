package com.sort.希尔排序.test;

import com.sort.希尔排序.ShellSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author baixu
 * @Date 2022/3/8 0008 21:19
 * Version 1.0
 * @Description :
 */
public class ShellTest {
    public static void main(String[] args) {
        Random r = new Random();
        int len = r.nextInt(100)+5;
        Integer array [] = new Integer[len];
        for (int i = 0; i < len; i++) {
            array[i] = r.nextInt(100)+1;
        }
//        InsertSort.insertSort(array);
        ShellSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
