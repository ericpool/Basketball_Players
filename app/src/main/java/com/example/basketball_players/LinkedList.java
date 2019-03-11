package com.example.basketball_players;
public class LinkedList
{
    private Node first;

    private int count;

    public LinkedList()
    {
        this.first = null;

        this.count = 0;
    }
    public void addAtIndex(int value, int index)
    {
        if(index == 0)
        {
            this.addFront(value);
        }
        else if(this.count == index)
        {
            this.addEnd(value);
        }
        else
        {
            Node currNode = this.first;
            for(int i = 0; i < index-1; i++)
            {
                currNode = currNode.getNextNode();
            }
            Node n = new Node(value);
            n.setNextNode(currNode.getNextNode());
            currNode.setNextNode(n);
            this.count++;
        }
    }

    public int removeFront()
    {
        Node currNode = this.first;
        this.first = this.first.getNextNode();
        currNode.setNextNode(null);
        this.count--;
        return currNode.getPayload();
    }

    public int getAtIndex(int index)
    {
        Node currNode = this.first;
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.getNextNode();
        }
        return currNode.getPayload();
    }

    public void removeEnd()
    {
        Node currNode = this.first;
        while (currNode.getNextNode().getNextNode() != null) {
            currNode = currNode.getNextNode();
        }
        currNode.setNextNode(null);
        this.count--;
    }
    public void removeAtIndex(int index)
    {
        Node currNode = this.first;
        Node prevNode = currNode;
        for(int i = 0; i < index; i++)
        {
            prevNode = currNode;
            currNode = currNode.getNextNode();
        }
        Node tempNode = currNode;
        currNode = prevNode;
        currNode.setNextNode(tempNode.getNextNode());
        tempNode = null;
        count--;
    }

    public void addFront(int value)
    {
        Node n = new Node(value);
        if(this.first == null)
        {
            this.first = n;

        }
        else
        {
            n.setNextNode(first);
            first = n;
        }
        count++;
    }
    public void addEnd(int value)
    {

        if(this.first == null)
        {
            this.addFront(value);

        }
        else {
            Node currNode = this.first;
            while (currNode.getNextNode() != null) {
                currNode = currNode.getNextNode();
            }
            Node n = new Node(value);
            currNode.setNextNode(n);
            this.count++;

        }
    }

    public void display()
    {
        String answer = "******* ";
        Node currNode = first;
        for(int i = 0; i < this.count; i++)
        {
            answer = answer + currNode.getPayload() + " -> ";
            currNode = currNode.getNextNode();
        }
        System.out.println(answer);
    }
}