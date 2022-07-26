package com.stack;

import jdk.jshell.EvalException;

class StackOperations
{
    StackNode head = null;

    /*
    Function to push data to stack
     */
    public void push(Object data) {
        StackNode newNode = new StackNode(data);
        if (head == null){
            head = newNode;
        }
        else
        {
            newNode.setNodeNext(head);
            head = newNode;
        }
    }

    /*
    Function to Print Stack
     */
    public void printData() {
        StackNode temp = head;
        while (temp != null) { // temp == null
            System.out.println(temp.getNodeData());
            temp = temp.getNodeNext();
        }
    }

    /*
    pop  method to pop  the Elements in a Stack
     */
    public Object pop() {
        Object value = head.getNodeData();
        head = head.getNodeNext();
        return value;
    }

    /*
    pop All method to pop All the Elements in a Stack
     */
    public void popAll()
    {
        while (head.getNodeNext() != null)
        {
            head = head.getNodeNext();
        }
        if (head.getNodeNext() == null)
        {
            pop();
        }
    }
}
