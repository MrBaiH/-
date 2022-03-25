package com.线性表.双向链表;


import java.util.Iterator;

/**
 * @Author baixu
 * @Date 2022/3/15 0015 15:12
 * Version 1.0
 * @Description :
 */
public class TowWayLinkList <T> implements Iterable{
    private Node head;//首结点
    private Node last;//尾结点
    private int N;//链表长度

    private class Node {
        public T item;
        public Node pre;
        public Node next;

        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }

    public TowWayLinkList() {
        this.head = new Node(null, null, null);
        this.last = null;
        this.N = 0;
    }


   //清空链表
    public void clear(){
        this.head.pre = null;
        this.head.next = null;
        this.head.item = null;
        this.last = null;
        this.N = 0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int length(){
        return N;
    }

//    查找索引i处的元素(索引从0开始)O(n)
    public T get(int i){
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }
//   O(n)
    public void insert(T t){
        if(isEmpty()){
            Node node = new Node(t,head,null);
            last = node;
            head.next = last;
        }else {
            Node oldLast = last;
            Node newNode = new Node(t,oldLast,null);
            oldLast.next = newNode;
            last = newNode;
        }
        N++;
    }
//    在索引i前，插入t元素O(n)
    public void insert(int i ,T t){
        Node pre = head.next;
        for (int index = 0; index < i-1; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node newNode = new Node(t,pre,curr);
        pre.next = newNode;
        curr.pre = newNode;
        N++;
    }
    
    public T remove(int i){
        Node preNode = head;
//        找到i-1处的结点  O(n)
        for (int index = 0; index < i; index++) {
            preNode = preNode.next;
        }
        Node curr = preNode.next;
        Node nextNode = curr.next;

        preNode.next = nextNode;
        nextNode.pre = preNode;
        N--;
        return curr.item;
    }
//    返回t元素第一次出现的索引(从0开始)，如果未找到返回-1;
    public int indexOf(T t){
        Node node = head;
        for (int i = 0; node.next!=null ; i++) {
            node = node.next;
            if(node.item.equals(t)){
                return i;
            }
        }
        return -1;
    }
//    获取首结点元素
    public T getFirst(){
       if(isEmpty()){
           return null;
       }
       return head.next.item;
    }
//    获取尾结点元素
    public T getLast(){
        if(isEmpty()){
            return null;
        }
        return last.item;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private Node n = head;
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
