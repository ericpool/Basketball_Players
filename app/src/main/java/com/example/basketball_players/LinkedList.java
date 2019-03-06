package com.example.basketball_players;
public class LinkedList
{
    private Node first;
    private Node last;
    private int count;

    public LinkedList()
    {
        this.first = null;
        this.last = null;
        this.count = 0;

    }

    public void addFront(int value)
    {
        Node n = new Node(value);
        if(this.first == null)
        {
            this.first = n;
            this.last = n;
        }
        else
        {
            n.setNextNode(first);
            last = first;
            first = n;
        }
        count++;
    }
    public void addEnd(int value)
    {
        Node n = new Node(value);
        if(this.first == null)
        {
            this.first = n;
        }
        else
        {
            last = last.getNextNode();
            last.setNextNode(n);
        }
        count++;
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