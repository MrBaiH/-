package com.sort.选择排序.test;

import com.sort.选择排序.SelectionSort;

import java.util.Arrays;

/**
 * @Author baixu
 * @Date 2022/3/8 0008 15:23
 * Version 1.0
 * @Description :
 */
public class SelectionTest {
    public static void main(String[] args) {
        Integer array [] = {1,56,22,77,12};
        SelectionSort.selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
