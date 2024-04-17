package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static void main(String[] args){
        // this is a directed graph.
        Scanner input = new Scanner(System.in);
        int V = input.nextInt();
        int E = input.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<V; i++){
            ArrayList<Integer> list = new ArrayList<>();
            graph.add(list);
        }
        for(int i=0; i<E; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            graph.get(a-1).add(b-1);
            graph.get(b-1).add(a-1);// this makes it undirected.
        }
        ArrayList<Integer> bfsList = performBfs(graph, V, E);
        for (Integer i : bfsList){
            System.out.print(i+1  + " ");
        }
        //BFS code of a Directed Graph is same as the BFS of an Undirected graph.
    }
    public static ArrayList<Integer> performBfs( ArrayList<ArrayList<Integer>> graph, int V, int E){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[V];

        //starting BFS from node 0. Note: disconnected graph nodes will not be traversed.
        queue.add(0);
        visited[0]=1;
        while(!queue.isEmpty()){
            int front = queue.poll();
            ans.add(front);
            for(Integer itr : graph.get(front)){
                if(visited[itr]==0){
                    queue.add(itr);
                    visited[itr] = 1;
                }
            }
        }
        return ans;
    }
}
