package com.chrisvasqm.structures.stack.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBracket = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String input) {
        var stack = new Stack<Character>();
        for (var character : input.toCharArray()) {
            if (stack.empty())
                return false;

            if (isLeftBracket(character))
                stack.push(character);

            if (isRightBracket(character)) {
                var top = stack.pop();
                if (isBracketMatching(character, top)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(Character character) {
        return leftBrackets.contains(character);
    }

    private boolean isRightBracket(Character character) {
        return rightBracket.contains(character);
    }

    private boolean isBracketMatching(Character right, Character left) {
        return leftBrackets.indexOf(left) == rightBracket.indexOf(right);
    }

}
