package Graphs;

import java.util.*;

public class RepresentationOfGraph {
    // there are two types of graph based on direction of connections between the nodes.
    //1. Directed   2. Undirected
    // UnDirected Graph:
    public static void main(String[] args){
        // A Graph is representation of Connections.
        // We store Connections(Edges) in a graph.
        // We take number of connections (edges) as first input (n)
        // then we take n node pairs to store the connections.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<Integer, ArrayList<Integer>>();
        for(int i  =0; i<n; i++){
            int a, b;
            a = input.nextInt();
            b = input.nextInt();
            //adding one connection (one direction)
            if(graph.containsKey(a)){
                graph.get(a).add(b);
            }else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(b);
                graph.put(a, arr);
            }

            //adding another connection
            if(graph.containsKey(b)){
                graph.get(b).add(a);
            }else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(a);
                graph.put(b, arr);
            }
        }
        // Hashmap is a better way to store the edges because we can do that dynamically without knowing
        // the number of connections. We don't need to create a matrix of fixed size this way.
        printGraph(graph);
        //--------------------------------Method 2---------------------
        //mostly a graph is represented as a 2d arraylist. this is because we assume there are
        //total V vertices(nodes) and E edges.
        //we create an ArrayList of size V and then we read E a,b pairs to put in the graph.
    }
    public static void printGraph(HashMap<Integer, ArrayList<Integer>> graph){
            graph.forEach((key, val)-> {
                System.out.println(key + " : ");
                for (Integer integer : val) {
                    System.out.print(integer + " ");
                }
            });
    }
}
