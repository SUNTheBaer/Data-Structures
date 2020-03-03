package program.pkg25_01;

public class Program25_01 
{
    public static void main(String[] args) 
    {
        
    }
    
    public Program25_01()
    {
        ItemSet a = new ItemSet();
        ItemSet b = new ItemSet();
        
        a.add(1);
        a.add(3);
        
        b.add(3);
        b.add(5);
        b.add(12);
        
        a.union(b);
        a.print();
    }
}
