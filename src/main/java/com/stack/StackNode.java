package com.stack;

/*
StackNode is Encapsulate Class or acts as a Model Class
 */
class StackNode
{
    private Object nodeData;
    private StackNode nodeNext;

    public StackNode()
    {}
    /*
    Parameterized Constructor
     */
    public StackNode(Object data)
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

    public StackNode getNodeNext() {
        return nodeNext;
    }

    public void setNodeNext(StackNode nodeNext) {
        this.nodeNext = nodeNext;
    }

    /*
    toString() to print the object in String type
     */
    @Override
    public String toString() {
        return "StackNode {" +
                "nodeData=" + nodeData +
                ", nodeNext=" + nodeNext +
                '}';
    }
}
