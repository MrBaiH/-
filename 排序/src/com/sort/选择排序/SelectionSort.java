package com.sort.选择排序;

/**
 * @Author baixu
 * @Date 2022/3/8 0008 15:02
 * Version 1.0
 * @Description :选择一个，我们选择第一个假设为最小数，与其他的数进行比较，如果后者中的数比我们假定的最小的还小，则交换，这样一轮下来我们可以得到
 *                  一个最小的数放在第一位，随之第二轮从第二个数假定最小，第二轮下来可以得到这一轮最小的数。
 * 5,4,3,2,1
 * 第一轮：1,5,4,3,2
 * 第二轮：1,2,5,4,3
 * 第三轮：1,2,3,5,4
 * 第四轮：1,2,3,4,5
 */
public class SelectionSort {
//    排序算法
    public static void selectSort(Comparable src[]){
        for (int i = 0; i <src.length-1 ; i++) {
            int minIndex = i;
            for (int j = i+1; j < src.length; j++) {
                if(greater(src[minIndex],src[j])){
                    minIndex = j;
                }
            }
            exch(src,minIndex,i);
        }
    }
//    比较两元素大小
    private static boolean greater(Comparable c1,Comparable c2){
        return c1.compareTo(c2)>0;
    }
//    交换元素
    private static void exch(Comparable c[],int i,int j){
        Comparable temp;
        temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
