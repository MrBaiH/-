package com.线性表.双向链表;

/**
 * @Author baixu
 * @Date 2022/3/15 0015 15:10
 * Version 1.0
 * @Description :
 */
public class Node<T> {
    private Node pre;
    private T item;
    private Node next;

    public Node(Node pre, T item, Node next) {
        this.pre = pre;
        this.item = item;
        this.next = next;
    }
}
