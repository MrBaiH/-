package com.sort.归并排序.test;

import com.sort.归并排序.归并排序.MergeSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author baixu
 * @Date 2022/3/9 0009 21:17
 * Version 1.0
 * @Description :
 */
public class MergeSortTest {
    public static void main(String[] args) {
        Random r = new Random();
        Integer array [] = new Integer[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(50);
        }
        MergeSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
