//5858788
//Code retrieved from module 3
package main;

public class LinkedList
{
    private Node first;

    public LinkedList() 
    {
        first = new Node();
    }

    public void add(ElementType x) 
    {
        Node p = new Node();

        p.setInfo(x);
        p.setNext(first.getNext());

        first.setNext(p);
    }
    
    public void remove(String x) 
    {
        Node old = first.getNext(),
        p = first;

        boolean found = false;
        while (old != null && !found) 
        {
            if (old.getInfo().access == x) 
            {
                found = true;
            }
            else 
            {
                p = old;
                old = p.getNext();
            }
        }

        if (found) 
        {
            p.setNext(old.getNext());
        }
    }
    
    public boolean isEmpty() 
    {
        return (first.getNext() == null);
    }

    public boolean search(String x) {
        Node current = first.getNext();

        while (current != null) {
            if (current.getInfo().access == x) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }
    
    public String toString()
    {
        Node current = first.getNext();

        String str = "";
        while (current != null) {
            str += current.getInfo() + " -> ";
            current = current.getNext();
        }
        
        return str;
    }
}