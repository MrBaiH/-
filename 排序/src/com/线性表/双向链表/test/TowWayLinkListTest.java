package com.线性表.双向链表.test;

import com.线性表.双向链表.TowWayLinkList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author baixu
 * @Date 2022/3/15 0015 15:59
 * Version 1.0
 * @Description :
 */
public class TowWayLinkListTest {
    public static void main(String[] args) {
        TowWayLinkList<Integer> list = new TowWayLinkList();
        for (int i = 1; i <= 10; i++) {
            list.insert(i);
        }
        System.out.println(list.get(6));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
