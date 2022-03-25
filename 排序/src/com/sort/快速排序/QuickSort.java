package com.sort.快速排序;

/**
 * @Author baixu
 * @Date 2022/3/13 0013 22:13
 * Version 1.0
 * @Description :
 */
public class QuickSort {
    public static void sort(Comparable c []){
        int low = 0;
        int high = c.length -1;
        sort(c,low,high);
    }
//    对数组从low到high出进行排序
    private static void sort(Comparable c [],int low,int high){
        if(high <= low){
            return;
        }
//        对数组分组(左子祖，右子组)
        int partition = partition(c, low, high);
//      对左子祖排序
        sort(c,low,partition-1);
//        对右子组排序
        sort(c,partition+1,high);
    }

//    对数组c中从索引low到high进行分组，并返回分组限界对应的索引
    private static int partition(Comparable c [],int low,int high){
//        确定分解值
        Comparable  key= c[low];
        int left = low;//定义左指正
        int right = high + 1;
        while (true){
//           从右往左扫描，移动right指针，直到一个比分界值小的元素停止
            while (less(c[--right],key)){
                if(right==low){
                    break;
                }
            }
//           从左向右扫描，移动left指正，直到一个比分界值大的元素停止
            while (less(key,c[++left])) {
                if(left==high){
                    break;
                }
            }
//            如果left>right，则扫描结束，如果不是，则交换元素
            if(left>=right){
                break;
            }else {
                exch(c,left,right);
            }
        }
        //           交换分界值
        exch(c,low,right);
        return right;
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
