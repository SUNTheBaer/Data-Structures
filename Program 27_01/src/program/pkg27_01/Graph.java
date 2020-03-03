package program.pkg27_01;

import java.util.Arrays;

public class Graph implements GraphInterface
{
    int verticesNumber;
    int[][] matrix;
    
    Graph()
    {
        verticesNumber = 5;
        matrix = new int[verticesNumber][verticesNumber];
    }
    
    Graph(int v)
    {
        verticesNumber = v;
        matrix = new int[verticesNumber][verticesNumber];
    }
    
    public void addEdge(int v, int w)
    {
        matrix[v][w] = 1;
        matrix[w][v] = 1;
    }
    
    public void removeEdge(int v, int w)
    {
        matrix[v][w] = 0;
        matrix[w][v] = 0;
    }
    
    public int[] findAdjacencyVertices(int v)
    {
        int[] adjacentVertices = new int[verticesNumber];
        int newSize = 0;
        
        for (int i = 0; i < verticesNumber; i++)
        {
            if(matrix[v][i] == 1)
            {
                adjacentVertices[i] = i;
                newSize++;
            }
        }
        
        return Arrays.copyOf(adjacentVertices, newSize);
    }
    
    public String toString()
    {
        String s = "";
        
        for (int i = 0; i < verticesNumber; i++)
        {
            for (int j = 0; j < verticesNumber; j++)
            {
                s += matrix[i][j] + " ";
            }
            s += "\n";
        }
        
        return s;
    }
}
