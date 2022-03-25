package com.sort.归并排序.归并排序;

/**
 * @Author baixu
 * @Date 2022/3/9 0009 20:21
 * Version 1.0
 * @Description :
 */
public class MergeSort {
    private static Comparable [] assist;
    public static void sort(Comparable c []){
        //对临时数组初始化
        assist = new Comparable[c.length];

        int low = 0;
        int high = c.length - 1;

        sort(c,low,high);

    }
    private static void sort(Comparable c [],int low,int high){
//        安全性检验
        if(low>=high){
            return;
        }

        int mid = low + (high - low)/2;

        sort(c,low,mid);
        sort(c,mid+1,high);

        merge(c,low,mid,high);
    }

    /**
     *
     * @param c
     * @param low
     * @param middle
     * @param high
     * 将数组中从low到mid与从mid+1到high归并为一个数组
     */
    private static void merge(Comparable c [],int low,int middle,int high){
        int i = low;
        int p1 = low;
        int p2 = middle+1;
        while (p1<=middle && p2 <=high){
            if(less(c[p1],c[p2])){
                assist[i++] = c[p2++];
            }else {
                assist[i++] = c[p1++];
            }
        }

        while (p1<=middle){
            assist[i++] = c[p1++];
        }
        while (p2<=high){
            assist[i++] = c[p2++];
        }

        for (int index = low; index <= high; index++) {
            c[index] = assist[index];
        }
    }
//    比较个数大小
    private static boolean less(Comparable c1,Comparable c2){
        return c1.compareTo(c2)>0;
    }
//    交换数组中索引i和j处的值
    private static void exch(Comparable c [], int i ,int j){
        Comparable temp;
        temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
