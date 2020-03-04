//5858788
package main;

public class SymbolTable 
{
    private LinkedList[] table;
    final int TABLESIZE = 13;
    final int HASHCONSTANT = 37;
    
    public SymbolTable()
    {
        table = new LinkedList[TABLESIZE];
        for (int i = 0; i < TABLESIZE; i++)
        {
            table[i] = new LinkedList();
        }
    }
    
    //Code retrieved from module 10
    public int hash(String key)
    {
        int hashVal = 0;
        
        for (int i = 0; i < key.length(); i++)
        {
            hashVal = HASHCONSTANT * hashVal + key.charAt(i);
        }
        
        hashVal %= TABLESIZE;
        if (hashVal < 0)
        {
            hashVal += TABLESIZE;
        }
        
        return hashVal;
    }
    
    public void add(ElementType e)
    {
        int hashVal = hash(e.identifier);
        table[hashVal].add(e);
    }
    
    public void remove(String key)
    {
        int hashVal = hash(key);
        table[hashVal].remove(key);
    }
    
    public boolean search(String key)
    {
        int hashVal = hash(key);
        return table[hashVal].search(key);
    }
    
    public String toString()
    {
        String str = "";
        
        for(int i=0; i<table.length; i++)
        {
            str = String.format(str + "%2d: ", i);
                        
            LinkedList bucket = table[i];
            if (!bucket.isEmpty())
                str += bucket.toString() + "\n";
            else
                str += "->\n";
        }
        
        return str;
    }
}