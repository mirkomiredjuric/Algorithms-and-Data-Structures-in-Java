package me.ramswaroop.common;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ramswaroop
 * @date: 6/18/15
 * @time: 2:42 PM
 */
public class DoubleLinkedNode<E> {

    public E item;
    public DoubleLinkedNode<E> next;
    public DoubleLinkedNode<E> prev;

    public DoubleLinkedNode(DoubleLinkedNode<E> prev, E item, DoubleLinkedNode<E> next) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public DoubleLinkedNode(DoubleLinkedNode<E> node) {
        if (node == null) return;

        this.item = node.item;
        this.next = node.next;
        this.prev = node.prev;
    }
}
