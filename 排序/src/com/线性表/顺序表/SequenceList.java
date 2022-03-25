package com.线性表.顺序表;

import com.线性表.双向链表.Node;

import java.util.Iterator;

/**
 * @Author baixu
 * @Date 2022/3/10 0010 15:22
 * Version 1.0
 * @Description :
 */
public class SequenceList<T> implements Iterable<T> {

    private T elements[];
    private int N;//当前线性表长度

    public SequenceList() {
        this.elements = (T[]) new Object[10];
        this.N = 0;
    }

    public SequenceList(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.N = 0;
    }

    /**
     * 清空线性表
     */
    public void clear(){
        this.N = 0;
    }

    /**
     * 判断是否为空，为空返回true
     * @return
     */
    public boolean isEmpty(){
        return N==0;
    }

    /**
     * 获取线性表长度
     * @return
     */
    public int length(){
        return N;
    }

    /**
     * 读取并获取第i个元素的值
     * @param
     * @return
     * 时间复杂度O(1)
     */
    public T get(int i){
        return elements[i];
    }
// 容器扩容
    public void resize(int size){
        T temp [] = elements;
        elements = (T[]) new Object [size];
        for (int i = 0; i < N; i++) {
            elements[i] = temp[i];
        }
    }
    /**
     * 在线性表第i个元素前插入元素t
     * @param t
     * @param i
     * 时间复杂度O(n)
     */
    public void insert(T t,int i){
//        判断是否需要扩容，当线性表存满时，将容量扩大为原来的2倍
        if(N==elements.length){
            resize(elements.length * 2);
        }
        for (int index = N; index >i; index--) {
            elements[index] = elements [index-1];
        }
        elements[i] = t;
        N++;

    }

    /**
     * 向线性表插入元素t
     * @param t
     */
    public void insert(T t){
        if(N==elements.length){
            resize(elements.length * 2);
        }
        elements[N++] = t;
    }

    /**
     * 删除并返回线性表第i个元素的值
     * @param i
     * @return
     * 时间复杂度O(n)
     */
    public T remove(int i){
        T current = elements[i] ;
        for (int index = i; index <N-1 ; index++) {
            elements[index] = elements[index+1];
        }
        N--;
        if(N<elements.length/4){
            resize(elements.length/2);
        }
        return current;
    }

    /**
     * 返回线性表中首次出现t元素的索引，没有则返回-1
     * @param t
     * @return
     */
    public int indexOf(T t){
        for (int i = 0; i < N; i++) {
            if(t.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }



    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cursor = 0;
            @Override
            public boolean hasNext() {
                return cursor < N;
            }

            @Override
            public T next() {
                return elements[cursor++];
            }
        };
    }

    private class SequenceIterator implements Iterator{
        private int cursor;

        public SequenceIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < N;
        }

        @Override
        public T next() {
            return elements[cursor++];
        }
    }

}
