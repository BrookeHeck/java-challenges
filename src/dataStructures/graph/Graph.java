package dataStructures.graph;

import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

public class Graph {
    HashMap<Vertex, ArrayList<Edge>> adjacencies;

    public Graph() {
        adjacencies = new HashMap<>();
    }

    public Vertex addVertex(String value) {
        Vertex vertex = new Vertex(value);
        this.adjacencies.put(vertex, new ArrayList<Edge>());
        return vertex;
    }

    public void addEdge(Vertex startVertex, Vertex endVertex) {
        try {
            if(this.adjacencies.containsKey(startVertex) && this.adjacencies.containsKey(endVertex)) {
                // get the arraylist of edges from hashap and add the end vertex to the array list
                this.adjacencies.get(startVertex).add(new Edge(endVertex, 1));
            }
        } catch (Exception e) {
            System.out.println("Could not add edge");
        }
    }

    public void addEdge(Vertex startVertex, Vertex endVertex, int weight) {
        try {
            if(this.adjacencies.containsKey(startVertex) && this.adjacencies.containsKey(endVertex)) {
                // get the arraylist of edges from hashap and add the end vertex to the array list
                this.adjacencies.get(startVertex).add(new Edge(endVertex, weight));
            }
        } catch (Exception e) {
            System.out.println("Could not add edge");
        }
    }

    public ArrayList<Edge> getNeighbors(Vertex vertex) {
        return this.adjacencies.get(vertex);
    }

    public int getDegree(Vertex vertex) {
        return this.adjacencies.get(vertex).size();
    }

    public Set<Vertex> getVertices() {
        return this.adjacencies.keySet();
    }

    public int getSize() {
        return this.adjacencies.size();
    }

}