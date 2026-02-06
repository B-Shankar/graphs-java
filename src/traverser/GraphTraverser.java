package traverser;

import implementation.Edge;
import implementation.Vertex;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GraphTraverser {

    private static void depthFirstTraversal(Vertex startingVertex, ArrayList<Vertex> visitedVertices) {
        System.out.println(startingVertex.getData());

        for (Edge edge : startingVertex.getEdges()) {
            Vertex neighbor = edge.getEnd();

            if (!visitedVertices.contains(neighbor)) {
                visitedVertices.add(neighbor);
                GraphTraverser.depthFirstTraversal(neighbor, visitedVertices);
            }
        }
    }

    public static void breadthFirstSearch(Vertex startingVertex, ArrayList<Vertex> visitedVertices) {
        Queue visitedQueue = new Queue();

        visitedQueue.enqueue(startingVertex);

        while (!visitedQueue.isEmpty()) {
            Vertex current = visitedQueue.dequeue();
            System.out.println(current.getData());

            for (Edge e : current.getEdges()) {
                Vertex neighbor = e.getEnd();
                if (!visitedVertices.contains(neighbor)) {
                    visitedVertices.add(neighbor);
                    visitedQueue.enqueue(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        TestGraph testGraph = new TestGraph();

        Vertex startingVertex = testGraph.getStartingVertex();
        ArrayList<Vertex> visitedVertices1 = new ArrayList<Vertex>();
        visitedVertices1.add(startingVertex);

        System.out.println("DFS:");
        GraphTraverser.depthFirstTraversal(startingVertex, visitedVertices1);

        System.out.println();
//        ---------------------------------------------------------------------
        System.out.println();

        ArrayList<Vertex> visitedVertices2 = new ArrayList<Vertex>();
        visitedVertices2.add(startingVertex);
        System.out.println("BFS:");
        GraphTraverser.breadthFirstSearch(startingVertex, visitedVertices2);
    }
}
