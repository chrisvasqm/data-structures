package com.chrisvasqm.linkedlist;

public class LinkedList {
    private Node first;
    private Node last;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()) first = node;
        else last.next = node;

        last = node;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) last = node;
        else node.next = first;

        first = node;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
