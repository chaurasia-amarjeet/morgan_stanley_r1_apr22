package com.quiz;

import java.util.Stack;

//Reverse stack without using any other data structure (indirectly using recursion)
//https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
public class ReverseStack {

    public static void main(String[] args) {
	    Stack<String> stack = new Stack<>();
        stack.push("Input1");
        stack.push("Input2");
        stack.push("Input3");
        stack.push("Input4");

        for(String element: stack){
            System.out.println(element);
        }

        System.out.println("insertAtBottom...");
        insertAtBottom(stack, "Input5");

        for(String element: stack){
            System.out.println(element);
        }

        System.out.println("reverse modification...");
        reverse(stack);
        for(String element: stack){
            System.out.println(element);
        }
    }

    public static void reverse(Stack<String> stack){
        if(stack.size() == 0){
            return;
        }

        String element = stack.pop();
        reverse(stack);
        insertAtBottom(stack, element);
    }

    public static void insertAtBottom(Stack<String> stack, String element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }

        String temp = stack.pop();
        insertAtBottom(stack, element);
        stack.push(temp);
    }
}
