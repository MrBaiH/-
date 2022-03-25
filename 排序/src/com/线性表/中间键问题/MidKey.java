package com.线性表.中间键问题;

/**
 * @Author baixu
 * @Date 2022/3/17 0017 22:06
 * Version 1.0
 * @Description :
 */
public class MidKey {
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
        System.out.println(getMid(one));
    }
//    快指针的移动速度是慢指针的二倍，当快指针移动到链尾时候，满指针指向链表的中间结点
    public static Object getMid(Node<String> first){
        Node<String> fast = first;
        Node<String> slow = first;

        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.item;
    }
}
