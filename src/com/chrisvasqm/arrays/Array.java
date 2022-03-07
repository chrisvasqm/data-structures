package com.chrisvasqm.arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int size) {
        items = new int[size];
    }

    public void print() {
        for (var i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void insert(int item) {
        if (items.length == count) {
            var newItems = new int[count * 2];

            for (var i = 0; i < items.length; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (var i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        for (var i = 0; i < count; i++)
            if (item == items[i]) return i;

        return -1;
    }
}
