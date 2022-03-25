package com.线性表.寻找环入口;

import com.线性表.双向链表.Node;

/**
 * @Author baixu
 * @Date 2022/3/18 0018 15:34
 * Version 1.0
 * @Description :
 */
public class CircleListTest {
    private static class Node<T>{
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public static Object getEnter(Node first){
        Node fast = first;
        Node slow = first;
        Node temp = null;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast.equals(slow)){
                temp = first;
                continue;
            }
            if(temp!=null){
                temp = temp.next;
                if(temp.equals(slow)){
                   break;
                }
            }

        }
        return temp.item;
    }
    public static void main(String[] args) {
        Node<String> aa = new Node("aa",null);
        Node<String> bb = new Node<>("bb",null);
        Node<String> cc = new Node<>("cc",null);
        Node<String> dd = new Node<>("dd",null);
        Node<String> ee = new Node<>("ee",null);
        Node<String> ff = new Node<>("ff",null);
        aa.next=bb;
        bb.next=cc;
        cc.next=dd;
        dd.next=ee;
        ee.next=ff;
        ff.next=ee;
        System.out.println(getEnter(aa));
    }
}
