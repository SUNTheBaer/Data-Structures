package program.pkg25_01;

public class ItemSet 
{
    int size;
    private boolean[] isInSet;
    
    public ItemSet()
    {
        size = 1000;
        isInSet = new boolean[size];
    }
    
    public boolean search(int i)
    {
        return isInSet[i];
    }
    
    public void add(int ID)
    {
        isInSet[ID] = true;
    }
    
    public void remove(int ID)
    {
        isInSet[ID] = false;
    }
    
    public void union(ItemSet q) //this = this U q
    {
        for(int i = 0; i < size; i++)
            isInSet[i] = (isInSet[i] || q.isInSet[i]);
    }
    
    public void intersection(ItemSet q) //this = this intersection q
    {   
        for(int i = 0; i < size; i++)
            isInSet[i] = (isInSet[i] && q.isInSet[i]);
    }
    
    public void difference(ItemSet q) //this = this - q
    {
        for(int i = 0; i < size; i++)
            isInSet[i] = (isInSet[i] && !(q.isInSet[i]));
    }
    
    public void print()
    {
        String final;
        
    }
}
