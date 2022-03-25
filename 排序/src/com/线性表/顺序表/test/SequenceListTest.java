package com.线性表.顺序表.test;

import com.线性表.顺序表.SequenceList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author baixu
 * @Date 2022/3/14 0014 10:34
 * Version 1.0
 * @Description :
 */
public class SequenceListTest {
    public static void main(String[] args) {
        SequenceList<Integer> list = new SequenceList<>(4);
        for (int i = 1; i <=20 ; i++) {
            list.insert(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list.length());
    }
}
