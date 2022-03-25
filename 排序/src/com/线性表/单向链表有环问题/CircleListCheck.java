package com.线性表.单向链表有环问题;

import com.线性表.中间键问题.MidKey;

/**
 * @Author baixu
 * @Date 2022/3/17 0017 22:20
 * Version 1.0
 * @Description :
 */
public class CircleListCheck {
    private static class Node<T>{
        public T item;
        public Node next;
        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node<String> one = new Node("one",null);
        Node<String> two = new Node<>("two",null);
        Node<String> three = new Node<>("three",null);
        Node<String> four = new Node<>("four",null);
        Node<String> fifth = new Node<>("fifth",null);
        Node<String> six = new Node<>("six",null);
        Node<String> seven = new Node<>("seven",null);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = fifth;
        fifth.next = six;
        six.next = seven;
        seven.next = six;
        System.out.println(isHaveCircle(one));
    }
    public static boolean isHaveCircle(Node<String> first){
        Node fast = first;
        Node slow = first;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast.equals(slow)){
                return true;
            }
        }
        return false;
    }
}
