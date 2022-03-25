package com.sort.冒泡排序;

import java.util.Arrays;

/**
 * @Author baixu
 * @Date 2022/3/7 0007 19:55
 * Version 1.0
 * @Description :
 * 5,4,3,2,1
 * 4,3,2,1,5一轮下来可以确定最大的数在最高位。
 * 6,5,4,3,2,1最坏情况，逆序列，有n个元素，第一次需要比较n-1次，直到一次。
 * 因此比较次数为（n-1)+(n-2)+...+1=(n-1)(n-1+1)/2=n^2-n/2
 * 因此交换次数也为n^2-n/2
 * 总执行次数为交换次数+比较次数=n^2-n
 * 因此算法的最坏时间复杂度为O(n^2)
 */
public class BubbleSort {
//    冒泡排序
    public static void bubble(Comparable src []){
        for (int i = src.length-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(greater(src[j],src[j+1])){
                    exeh(src,j,j+1);
                }
            }
        }
    }
//    比较两数大小
    private static boolean greater(Comparable c1,Comparable c2){
       return c1.compareTo(c2)>0;
    }
//    交换两数
    private static void exeh(Comparable c [],int i,int j){
        Comparable temp;
        temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
