package program.pkg27_01;

public class Program27_01 
{
    public static void main(String[] args) 
    {
        Program27_01 tester = new Program27_01();
    }
    
    public Program27_01()
    {
        Graph test = new Graph(3);
        
        test.addEdge(0,1);
        test.addEdge(0, 2);
        
        System.out.println(test.toString());
    }
}
