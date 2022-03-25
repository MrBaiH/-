package com.sort.冒泡排序.test;

import com.sort.冒泡排序.BubbleSort;

import java.util.Arrays;

/**
 * @Author baixu
 * @Date 2022/3/7 0007 20:40
 * Version 1.0
 * @Description :
 */
public class TestBubble {
    public static void main(String[] args) {
        Integer array [] = {7,1,2,4,6,10};
        BubbleSort.bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
