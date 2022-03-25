package com.sort.快速排序.test;

import com.sort.快速排序.QuickSort;

import java.util.Arrays;

/**
 * @Author baixu
 * @Date 2022/3/14 0014 10:17
 * Version 1.0
 * @Description :
 */
public class QuickTest {
    public static void main(String[] args) {
        Integer nums [] = {121,324,213,54,313,35};

        QuickSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
