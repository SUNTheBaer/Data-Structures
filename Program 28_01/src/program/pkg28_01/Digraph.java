package program.pkg28_01;

import java.util.Arrays;

public class Digraph implements DigraphInterface
{
    int verticesNumber;
    int[][] matrix;
    
    Digraph()
    {
        verticesNumber = 5;
        matrix = new int[verticesNumber][verticesNumber];
    }
    
    Digraph(int v)
    {
        verticesNumber = v;
        matrix = new int[verticesNumber][verticesNumber];
    }
    
    public void addEdge(int v, int w)
    {
        matrix[v][w] = 1;
    }
    
    public void removeEdge(int v, int w)
    {
        matrix[v][w] = 0;
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
    
    public void DFT(int v)
    {
        boolean visited[] = new boolean[verticesNumber];
        for (int i = 0; i < verticesNumber; i++)
        {
            
        }
        
    }
    
    public void recursiveDFT(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.println(v + " ");
        
        int[] adj = findAdjacencyVertices(v);
        
        for(int i = 0; i < verticesNumber; i++)
        {
            if (!visited[i])
            {
                recursiveDFT(i, visited);
            }
        }
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