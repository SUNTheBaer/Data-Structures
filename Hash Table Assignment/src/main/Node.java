//5858788
//Code retrieved from module 3
package main;

public class Node 
{

    private ElementType info;   
    private Node next;  

    public Node() 
    {
        info = null;
        next = null;
    }
    
    public ElementType getInfo() 
    {
        return info;
    }
    
    public Node getNext() 
    {
        return next;
    }

    public void setInfo(ElementType x) 
    {
        info = x;
    }

    public void setNext(Node l) 
    {
        next = l;
    }
}