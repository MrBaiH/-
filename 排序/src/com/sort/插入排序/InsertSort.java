package com.sort.插入排序;

/**
 * @Author baixu
 * @Date 2022/3/8 0008 19:39
 * Version 1.0
 * @Description :
 * 分析时间复杂度：在最坏的情况下，给定一个与排列次序相反的序列，此时我们可以分析
 * 6,5,4,3,2,1
 * 比较次数：第一次需要1次，第二次需要两次，第三次需要三次，第n次需要n-1次为：1+2+...+(n-1)=(n-1)(1+n-1)/2=n^2-n/2
 * 交换次数：和比较次数一致，交换:n^2-n/2;
 * 则时间复杂度为：n^2=n=O(n^2);
 * 6,5,4,3,2,1
 * 5,6,4,3,2,1
 * 5,4,6,3,2,1
 * 4,5,6,3,2,1
 * 4,5,3,6,2,1
 * .....
 * 1,2,3,4,5,6
 */
public class InsertSort {
    public static void insertSort(Comparable src []){
        for (int i = 1; i < src.length; i++) {
            for (int j = i; j > 0; j--) {
                if(greater(src[j-1],src[j])){
                    exch(src,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    private static boolean greater(Comparable c1,Comparable c2){
        return c1.compareTo(c2)>0;
    }
    private static void exch(Comparable c [] ,int i,int j){
        Comparable temp;
        temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
