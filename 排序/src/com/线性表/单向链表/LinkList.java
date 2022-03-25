package com.线性表.单向链表;

import java.util.Iterator;

/**
 * @Author baixu
 * @Date 2022/3/14 0014 15:54
 * Version 1.0
 * @Description :
 */
public class LinkList<T> implements Iterable {
    private Node head;
    private int N;

    private class Node {
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
        this.head = new Node(null, null);
        this.N = 0;
    }



    public void clear(){
        head.next=null;
        this.N = 0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int length(){
        return N;
    }
    public T get(int i){
       Node n = null;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }
    public void insert(T t){
        Node n = head;
        while (n.next!=null){
            n = n.next;
        }
        Node node = new Node(t,null);

        n.next = node;
        N++;
    }
    public void insert(int i ,T t){
        Node pre = head;
        for (int index = 0; index < i-1; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;

        Node node = new Node(t,curr);

        pre.next = node;
    }
    public T remove(int i){
        Node pre = head;
        for (int index = 0; index < i-1; index++) {
            pre = pre.next;
        }

        Node curr = pre.next;
        Node next = curr.next;
        pre.next = next;
//        pre.next = pre.next.next;
        N--;
       return curr.item;
//        return curr;
    }
    public int indexOf(T t){
        Node n = head;
        for (int i = 0; n.next!=null; i++) {
            n = n .next;
            if(n.item.equals(t)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private Node n = head;
            @Override
            public boolean hasNext() {
                return n.next != null;
            }

            @Override
            public Object next() {
                n = n .next;
                return n.item;
            }
        };
    }

    public void reverse(){
        if(isEmpty()){
            return;
        }
        reverse(head.next);
    }

    public Node reverse(Node curr){
        if(curr.next==null){
            head.next = curr;
            return curr;
        }
        Node pre =reverse(curr.next);
        pre.next = curr;
        curr.next = null;

        return curr;
    }

}
