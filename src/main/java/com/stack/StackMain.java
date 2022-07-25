package com.stack;

public class StackMain
{
    public static void main(String[] args)
    {
        /*
        A Stack is Created
         */
        StackOperations operations = new StackOperations();
        operations.push(70);
        operations.push(30);
        operations.push(56);
        operations.printData();
    }
}
