package com.sort.希尔排序;

/**
 * @Author baixu
 * @Date 2022/3/8 0008 20:52
 * Version 1.0
 * @Description :
 */
public class ShellSort {
    /**
     * 9,8,7,6,5,4,3,2,1
     *
     */
    public static void sort(Comparable src []){
        int h = 1;
        while (h<src.length/2){
           h = 2 * h +1;
        }
        while (h>=1){
            for (int i = h; i < src.length; i++) {
                for (int j = i; j >=h ;j-=h) {
                    if(greater(src[j-h],src[j])){
                        exeh(src,j-h,j);
                    }else {
                        break;
                    }
                }
            }
            h = h/2;
        }
    }
    private static boolean greater(Comparable c1,Comparable c2){
        return c1.compareTo(c2)>0;
    }
    private static void exeh(Comparable c [],int i,int j){
        Comparable temp;
        temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
