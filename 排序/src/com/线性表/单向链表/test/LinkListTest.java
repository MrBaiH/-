package com.线性表.单向链表.test;

import com.线性表.单向链表.LinkList;

import java.util.Iterator;

/**
 * @Author baixu
 * @Date 2022/3/14 0014 16:40
 * Version 1.0
 * @Description :
 */
public class LinkListTest {
    public static void main(String[] args) {
        LinkList<Integer> nums = new LinkList<>();
        for (int i = 1; i <=10; i++) {
            nums.insert(i);
        }
        nums.reverse();
        Iterator iterator = nums.iterator();
        while (iterator.hasNext()){
            System.out.printf(iterator.next()+" ");
        }
    }
}
