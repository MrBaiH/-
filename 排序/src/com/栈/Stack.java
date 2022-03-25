package com.栈;

import com.线性表.双向链表.Node;

import java.util.Iterator;

/**
 * @Author baixu
 * @Date 2022/3/21 0021 15:35
 * Version 1.0
 * @Description :
 */
public class Stack<T> {

    private class Node {
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private int N;
    private Node head;

    public Stack() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int length(){
        return N;
    }

    public void push(T t){
        Node newFirst = new Node(t, null);
        Node oldFirst = head.next;
        head.next = newFirst;
        newFirst.next = oldFirst;
        N++;
    }

    public T pop(){
        Node first = head.next;
        if(first==null){
            return null;
        }
        head.next = first.next;
        N--;
        return first.item;
    }
    public Iterator iterator() {
        return new Iterator() {
            private Stack.Node n = head;
            @Override
            public boolean hasNext() {
                return n.next!=null;
            }

            @Override
            public Object next() {
                n = n.next;
                return n.item;
            }
        };
    }
}
