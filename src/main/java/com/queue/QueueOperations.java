package com.queue;


public class QueueOperations
{
    QueueNode head = null;

    /*
    Append Function to append the data to a Queue
     */
    public void append(Object data) {
        QueueNode newNode = new QueueNode(data);
        if (head == null) {
            head = newNode;
        }else {
            QueueNode temp = head;
            while (temp != null) {
                if (temp.getNodeNext() == null) {
                    temp.setNodeNext(newNode);
                    break;
                }
                temp = temp.getNodeNext();
            }
        }
    }

    /*
    Function to Print Queue
     */
    public void printData() {
        QueueNode temp = head;
        while (temp != null) { // temp == null
            System.out.println(temp.getNodeData());
            temp = temp.getNodeNext();
        }
    }

    /* Pop method to pop the first Element of a Linked List */

    public Object popQueue() {
    Object value = head.getNodeData();
    head = head.getNodeNext();
    return value;
}
}

