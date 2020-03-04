package program.pkg28_01;

public interface DigraphInterface 
{
    void addEdge(int v, int w);
    void removeEdge(int v, int w);
    int[] findAdjacencyVertices(int v);
    String toString();
}