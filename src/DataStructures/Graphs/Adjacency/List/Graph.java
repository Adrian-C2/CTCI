package DataStructures.Graphs.Adjacency.List;

import java.util.*;

public class Graph {
    private int verticesNumber;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int verticesNumber) {
        this.verticesNumber = verticesNumber;
        adjacencyList = new LinkedList[verticesNumber+1];

        for(int i = 0; i < verticesNumber ; i++) {
            adjacencyList[i] = new LinkedList<Integer>();
        }
    }

    public String getVertex() {
        String vertex = "";

        for(int i = 0; i < verticesNumber ; i++) {
            vertex += i + " ";
        }

        return vertex;
    }

    public void addEdge(int from, int to) {
        try {
            adjacencyList[to].add(from);
            adjacencyList[from].add(to);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printGraph() {
        for(int v = 0; v < verticesNumber; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");

            for(Integer pCrawl: adjacencyList[v]){
                System.out.print(" -> "+pCrawl);
            }

            System.out.println("\n");
        }
    }
}
