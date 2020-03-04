package program.pkg27_01;

public interface GraphInterface 
{
    void addEdge(int v, int w);
    void removeEdge(int v, int w);
    int[] findAdjacencyVertices(int v);
    String toString();
}