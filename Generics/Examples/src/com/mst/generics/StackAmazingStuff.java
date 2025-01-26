package com.mst.generics;

import java.util.Stack;

public class StackAmazingStuff {
    public static <T extends Comparable<T>> Stack<T>
        reduceStack(Stack<T> stack, T element) {
        Stack<T> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            T current = stack.pop();
            if (current.compareTo(element) <= 0) {
                tempStack.push(current);
            }
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(5);
        stack.push(30);
        stack.push(15);
        System.out.println("Original Stack : " + stack);
        Stack<Integer> reducedStack = reduceStack(stack, 15);
        System.out.println("Reduced Stack : " + reducedStack);
    }
}
