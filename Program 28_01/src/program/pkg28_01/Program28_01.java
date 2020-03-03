package program.pkg28_01;

public class Program28_01 
{
    public static void main(String[] args) 
    {
        Program28_01 tester = new Program28_01();
    }
    
    public Program28_01()
    {
        Digraph test = new Digraph(3);
        
        test.addEdge(0,1);
        test.addEdge(1,0);
        test.addEdge(1,2);
        test.addEdge(2,1);
        test.addEdge(0, 2);
        int[] result = test.findAdjacencyVertices(0);
        System.out.println(test);
        for (int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}
