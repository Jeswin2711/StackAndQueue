package com.stack;

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

}
