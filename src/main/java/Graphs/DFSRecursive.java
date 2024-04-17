package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class DFSRecursive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int V = input.nextInt();
        int E = input.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i< V; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0; i< E; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            graph.get(a - 1).add(b - 1);
            graph.get(b - 1).add(a - 1);
        }
        int[] visited = new int[V];
        ArrayList<Integer> ans = new ArrayList<>();
        performDfs(graph, 0, visited, ans);
        for(Integer itr : ans){
            System.out.print(itr+1 + " ");
        }
    }
    private static void performDfs(ArrayList<ArrayList<Integer>> graph, int node, int []visited, ArrayList<Integer>ans){
        if(visited[node]==1){
            return;
        }
        ans.add(node);
        visited[node]=1;
        for(Integer itr: graph.get(node)){
            performDfs(graph, itr, visited, ans);
        }

    }
}
