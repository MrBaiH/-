package com.线性表;

import com.线性表.双向链表.Node;

/**
 * @Author baixu
 * @Date 2022/3/18 0018 16:07
 * Version 1.0
 * @Description :
 */
public class JosephusProblem {
    private static class Node<T>{
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node first = null;
        Node pre = null;

        for (int i = 1; i <=41 ; i++) {
            if(i==1){
                first = new Node(i,null);
                pre = first;
                continue;
            }
            Node<Integer> newNode = new Node<>(i, null);
            pre.next = newNode;
            pre = newNode;

            if(i==41){
                pre.next=first;
            }
        }
        int count = 0;
        Node<Integer> n = first;
        Node<Integer> before = null;
        while (n!=n.next){
            count++;
            if(count==3){
                before.next = n.next;
                System.out.print(n.item+",");
                count = 0;
            }else {
                before = n;
            }
            n = n.next;
        }
        System.out.println(n.item);
    }
}
