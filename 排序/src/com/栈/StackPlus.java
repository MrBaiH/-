package com.栈;

import java.util.Iterator;

/**
 * @Author baixu
 * @Date 2022/3/21 0021 16:32
 * Version 1.0
 * @Description :
 */
public class StackPlus<T> {
    public T items[];
    public int N;

    public StackPlus(int n) {
        this.items = (T[]) new Object[n];
        N = 0;
    }

    public StackPlus() {
        this.items = (T[]) new Object[10];
        N = 0;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int length(){
        return N+1;
    }

    public void resize(int size){
        T temp [] = items;
        items = (T[]) new Object [size];
        for (int i = 0; i < N; i++) {
            items[i] = temp[i];
        }
    }

    public void push(T t){
//        if(N==items.length){
//            resize(items.length*2);
//        }
        items[N] = t;
        N+=1;
    }

    public void push(T ...t){
//        if(t.length+length()>=items.length){
//            resize(items.length*2);
//        }
        for (int i = 0; i < t.length; i++) {
            items[N] = t[i];
            N+=1;
        }
    }

    public T pop(){
        if(length()<items.length/4){
            resize(items.length/2+1);
        }
        if(isEmpty()){
            return null;
        }
        return items[--N];
    }
}
