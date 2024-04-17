package Graphs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int V = input.nextInt();
        int E = input.nextInt();
        ArrayList< ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<V; i++){
            ArrayList<Integer> list = new ArrayList<>();
            graph.add(list);
        }
        for(int i = 0; i<E; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            graph.get(a-1).add(b-1);
            graph.get(b-1).add(a-1);
        }
        ArrayList<Integer> ans = performDFS(graph, V, E);
        for(Integer itr: ans){
            System.out.print(itr+1 + " ");
        }
    }
    private static ArrayList<Integer> performDFS(ArrayList<ArrayList<Integer>> graph, int V, int E){
        int[] visited = new int[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        stk.push(0);
        visited[0] = 1;
        while(!stk.isEmpty()){
            int top = stk.pop();
            ans.add(top);
            for(Integer itr : graph.get(top)){
                if(visited[itr]==0){
                    stk.push(itr);
                    visited[itr] = 1;
                }
            }
        }
        return ans;
    }
}
