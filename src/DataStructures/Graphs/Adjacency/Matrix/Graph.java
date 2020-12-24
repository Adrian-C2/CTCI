package DataStructures.Graphs.Adjacency.Matrix;

import java.util.HashMap;

public class Graph {
    private int verticesNumber;
    private HashMap<String, Integer> vertices;
    private int[][] adjacencyMatrix;

    public Graph(int verticesNumber) {
        this.verticesNumber = verticesNumber;
        this.adjacencyMatrix = new int[verticesNumber +1][verticesNumber +1];
        vertices = new HashMap<String, Integer>();
    }

    public String getVertex() {
        String vertex = "";

        for(String i : this.vertices.keySet()) {
            vertex += i + " ";
        }

        return vertex;
    }

    public void setVertex(int id, String vertex) {
        if(0 <= id && id <= verticesNumber) {
            vertices.put(vertex, id);
        }
    }

    public String getEdge() {
        return "";
    }

    public String getEdge(String from, String to) {
        try {
            return adjacencyMatrix[vertices.get(to).intValue()][vertices.get(from).intValue()]+"";
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        return "";
    }

    public void setEdge(String from, String to) {
        try {
            adjacencyMatrix[vertices.get(to).intValue()][vertices.get(from).intValue()] = 1;
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void getMatrix() {
        System.out.println("  "+getVertex());

        for(String row : vertices.keySet()) {
            System.out.print(row);

            for(String column: vertices.keySet()) {
                System.out.print(" "+adjacencyMatrix[vertices.get(row).intValue()][vertices.get(column).intValue()]);
            }

            System.out.println();
        }
    }
}
