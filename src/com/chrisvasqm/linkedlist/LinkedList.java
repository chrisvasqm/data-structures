package com.chrisvasqm.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

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
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) last = node;
        else node.next = first;

        first = node;
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;

        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;

            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            last = getPrevious(last);
            last.next = null;
        }

        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;

            current = current.next;
        }

        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public LinkedList reverse() {
        var newList = new LinkedList();
        var current = first;
        while (current != null) {
            newList.addLast(current.value);
            current = current.next;
        }

        return newList;
    }
}
