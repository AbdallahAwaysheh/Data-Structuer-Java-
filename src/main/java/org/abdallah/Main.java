package org.abdallah;

import org.abdallah.datastructuer.impl.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<21;i++){
            stack.push(i);
        }
        stack.print();
        stack.clearNulls();
        System.out.println(stack.pop());
        stack.print();
    }
}