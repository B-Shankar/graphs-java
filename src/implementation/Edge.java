package implementation;

public class Edge {

    private Vertex start;
    private Vertex end;
    private Integer weight;

    // constructor
    public Edge(Vertex startV, Vertex endV, Integer inputData) {
        this.start = startV;
        this.end = endV;
        this.weight = inputData;
    }

    public Vertex getStart() {
        return this.start;
    }

    public Vertex getEnd() {
        return this.end;
    }

    public Integer getWeight() {
        return this.weight;
    }

}
