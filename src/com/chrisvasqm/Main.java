package com.chrisvasqm;

import com.chrisvasqm.arrays.Array;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);

        System.out.println(numbers.max());
    }
}
