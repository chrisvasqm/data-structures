package com.chrisvasqm.structures.stack;

import java.util.Arrays;

public class Stack {
    private final int[] items = new int[3];
    private int count;

    public void push(int value) {
        if (count == items.length)
            throw new StackOverflowError();

        items[count++] = value;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalArgumentException();

        return items[--count];
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty() {
        for (var n : items)
            if (n > 0) return false;

        return true;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return "Stack{" +
                "items = " + Arrays.toString(content) +
                ", size = " + count +
                '}';
    }
}
