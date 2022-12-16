package dataStructures.graph;

import java.util.HashMap;
import java.util.ArrayList;

public class Graph {
    HashMap<Vertex, ArrayList<Vertex>> adjacencies;

    public Graph() {
        adjacencies = new HashMap<>();
    }

    public Vertex addVertex(String value) {
        Vertex vertex = new Vertex(value);
        this.adjacencies.put(vertex, new ArrayList<>());
        return vertex;
    }

    public void addEdge(Vertex startVertex, Vertex endVertex) {
        try {
            if(this.adjacencies.containsKey(startVertex) && this.adjacencies.containsKey(endVertex)) {
                // get the arraylist of edges from hashap and add the end vertex to the array list
                this.adjacencies.get(startVertex).add(endVertex);
            }
        } catch (Exception e) {
            System.out.println("Could not add edge");
        }
    }

    public void addEdge(Vertex starVertex, Vertex endVertex, int weight) {

    }

    public ArrayList<Vertex> getNeighbors(Vertex vertex) {

    }

    public int getDegree(Vertex vertex) {

    }

    public ArrayList<Vertex> getVertices() {

    }

    public int getSize() {

    }

}