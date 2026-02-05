package implementation;

import java.util.ArrayList;
import java.util.Objects;

public class Graph {

    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected; // true -> Uni, false -> Both


    public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
    }

    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);

        return newVertex;
    }

    public void addEdge(Vertex vertexStart, Vertex vertexEnd, Integer weight) {
        if (!this.isWeighted) {
            weight = null;
        }

        vertexStart.addEdge(vertexEnd, weight);

        if (!this.isDirected) {
            vertexEnd.addEdge(vertexStart, weight);
        }
    }

    public void removeEdge(Vertex vertexStart, Vertex vertexEnd) {
        vertexStart.removeEdge(vertexEnd);

        if (!this.isDirected) {
            vertexEnd.removeEdge(vertexStart);
        }
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public Vertex getVertexByValue(String value) {
        for (Vertex vertex : vertices) {
            if (Objects.equals(vertex.getData(), value)) {
                return vertex;
            }
        }
        return null;
    }

    public void print() {
        for (Vertex vertex : vertices) {
            vertex.print(isWeighted);
        }
    }

    public static void main(String[] args) {
        Graph busNetwork = new Graph(true, true);

        Vertex bengaluruBusStop = busNetwork.addVertex("Bengaluru");
        Vertex hyderabadBusStop = busNetwork.addVertex("Hyderabad");

        busNetwork.addEdge(bengaluruBusStop, hyderabadBusStop, 600);

        busNetwork.print();
    }
}
