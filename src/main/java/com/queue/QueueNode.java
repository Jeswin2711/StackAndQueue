package com.queue;

public class QueueNode
{
    private Object nodeData;
    private QueueNode nodeNext;

    public QueueNode()
    {}
    /*
    Parameterized Constructor
     */
    public QueueNode(Object data)
    {
        this.nodeData = data;
        this.nodeNext = null;
    }

    /*
    Getter and Setter for Data and Nexts
     */
    public Object getNodeData() {
        return nodeData;
    }

    public void setNodeData(Object nodeData) {
        this.nodeData = nodeData;
    }

    public QueueNode getNodeNext() {
        return nodeNext;
    }

    public void setNodeNext(QueueNode nodeNext) {
        this.nodeNext = nodeNext;
    }

    /*
    toString() to print the object in String type
     */
    @Override
    public String toString() {
        return "QueueNode {" +
                "nodeData=" + nodeData +
                ", nodeNext=" + nodeNext +
                '}';
    }
}
