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
    public boolean connected(N from,N to){
        if (!this.adjacencyList.containsKey(from)){
            return false;
        }
        return this.adjacencyList.get(from).contains(to);
    }
    public boolean validPath(ArrayList<N> path){
        if (path==null || path.size()==1|| path.size()==0){
            return false;
        }
        for (int x=0;x<path.size()-1;x++){
            if (!connected(path.get(x),path.get(x+1))){
                return false;
            }
        }
        return true;
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
        System.out.println("true: " +map.validPath(path1));

        ArrayList<String> path2=new ArrayList<>(
            Arrays.asList("BUF","JFK","LAX","BUF","ATL"));
        System.out.println("false: "+map.validPath(path2));

        path1=new ArrayList<>();
        System.out.println("false: " +map.validPath(path1));

        path1=null;
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("BOB"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","JFK"));
        System.out.println("true: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","LAX"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","BUF"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","LLL"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("MJK","LAX"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("ASD","EFD"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","LAX","JFK","ATL"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("LAX","JFK","ATL","BUF"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","LAX","JFK","ATL","BUF"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(
            Arrays.asList("RRR","JFK","MIA","ATL"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(
            Arrays.asList("BUF","JFK","MIA","LLL"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(
            Arrays.asList("BUF","JFK","POI","ATL"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(
            Arrays.asList("BUF","IOP","XCVg","ATL"));
        System.out.println("false: " +map.validPath(path1));

        path1=new ArrayList<>(
            Arrays.asList("ATL","LAX","ATL"));
        System.out.println("false: " +map.validPath(path1));
    }
}