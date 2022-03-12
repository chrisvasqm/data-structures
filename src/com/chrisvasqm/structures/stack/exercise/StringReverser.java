package com.chrisvasqm.structures.stack.exercise;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input) {
        if (input == null || input.isEmpty())
            throw new IllegalArgumentException();

        var stack = new Stack<Character>();
        for (var c : input.toCharArray())
            stack.push(c);

        var reversed = new StringBuffer();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
