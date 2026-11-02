package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N>{
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addNode(N a){
        if (!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a, new ArrayList<>());
        }
    }
    public void addEdge(N from, N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    public String toString(){
        return this.adjacencyList.toString();
    }
    public static void main(String[] args) {
        Graph<String> map=new Graph();
        //map.addNode("LAX");
        map.addEdge("LAX", "JFK");
        //map.addNode("BUF");
        map.addEdge("BUF", "JFK");
        map.addEdge("BUF", "ATL");
        //map.addNode("JFK");
        map.addEdge("JFK", "BUF");
        map.addEdge("JFK", "LAX");
        map.addEdge("JFK", "MIA");
        map.addEdge("ATL", "JFK");
        map.addEdge("ATL", "LAX");
        map.addEdge("ATL", "MIA");
        map.addEdge("MIA", "ATL");
        map.addEdge("MIA", "JFK");
        System.out.println(map);

        ArrayList<String> path1=new ArrayList<>(
            Arrays.asList("BUF","JFK","MIA","ATL"));
        System.out.println(map.validPath(path1));
    }
}