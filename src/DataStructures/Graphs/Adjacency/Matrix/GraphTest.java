package DataStructures.Graphs.Adjacency.Matrix;

public class GraphTest {
    public static void main(String[] args) {
        graphTest();
    }

    private static void graphTest() {
        Graph graph = new Graph(5);

        graph.setVertex(0,"0");
        graph.setVertex(1,"1");
        graph.setVertex(2,"2");
        graph.setVertex(3,"3");
        graph.setVertex(4,"4");

        graph.setEdge("0","1");
        graph.setEdge("0","4");
        graph.setEdge("1","0");
        graph.setEdge("1","2");
        graph.setEdge("1","3");
        graph.setEdge("1","4");
        graph.setEdge("2","1");
        graph.setEdge("2","3");
        graph.setEdge("3","1");
        graph.setEdge("3","2");
        graph.setEdge("3","4");
        graph.setEdge("4","0");
        graph.setEdge("4","3");

        System.out.println("\nVertices of Graph");
        System.out.println("[ " + graph.getVertex() + "]");

        System.out.println("\nEdges of Graph");
        System.out.println(graph.getEdge());

        System.out.println("\nAdjacency Matrix of Graph");
        graph.getMatrix();
    }
}
