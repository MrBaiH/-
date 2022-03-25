package com.sort.插入排序.test;

import com.sort.插入排序.InsertSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author baixu
 * @Date 2022/3/8 0008 19:49
 * Version 1.0
 * @Description :
 */
public class InsertSortTest {
    public static void main(String[] args) {
        Random r = new Random();
        int len = r.nextInt(20)+5;
        Integer array [] = new Integer[len];
        for (int i = 0; i < len; i++) {
            array[i] = r.nextInt(100)+1;
        }
        InsertSort.insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
