import java.util.*;
public class BasicG {
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
    for (int i = 0; i < graph.length; i++) {
        graph[i] = new ArrayList<>();
    }

    // 0th vertex
    graph[0].add(new Edge(0, 1, 1)); // changed from 5 → 1 (valid)

    // 1st vertex
    graph[1].add(new Edge(1, 0, 1));
    graph[1].add(new Edge(1, 2, 1));
    graph[1].add(new Edge(1, 3, 1));

    // 2nd vertex
    graph[2].add(new Edge(2, 1, 1));
    graph[2].add(new Edge(2, 3, 1));
    graph[2].add(new Edge(2, 4, 1));

    // 3rd vertex
    graph[3].add(new Edge(3, 1, 1));
    graph[3].add(new Edge(3, 2, 1));

    // 4th vertex
    graph[4].add(new Edge(4, 2, 1));
}

    // public static void BFS(ArrayList<Edge>[] graph){  //BFS on the graph O(V+E)
    //     Queue<Integer> q = new LinkedList<>();
    //     boolean vis[] = new boolean[graph.length];
    //     q.add(0); //source = 0
        
    //     while(!q.isEmpty()){
    //         int curr = q.remove();

    //         if(!vis[curr]){
    //             System.out.println(curr+" ");
    //             vis[curr] = true;
    //             for(int i=0;i<graph[curr].size();i++){
    //                 Edge e = graph[curr].get(i);    
    //                 q.add(e.des);
    //             }
    //         }
    //     }
    // }

 // DFS in the graph

    // public static void DFS(ArrayList<Edge>[] graph, int curr, boolean visi[]){ //DFS on the graph O(V+E)
    //     System.out.print(curr +" "); 
    //     visi[curr] = true;
    //     for(int i=0;i<graph[curr].size();i++){
    //         Edge e = graph[curr].get(i);
    //         if(!visi[e.des]){
    //             DFS(graph, e.des, visi);
    //         }
    //     }

    // }

//     public static boolean hasPath (ArrayList<Edge>[] graph, int s, int d, boolean [] visited){
//         if(s==d){
//             return true;
//         }

//         visited[s] = true;

//         for(int i=0;i<graph[s].size();i++)
//         {
//             Edge e = graph[s].get(i);
//             if(!visited[e.des] && hasPath(graph, e.des, d, visited)){
//                 return true;
//             }
//         }
//         return false;   
//  }


    // topological Sort using Kahn's Algorithm (BFS)     

    static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj){
        int n = adj.size();
        int indgree[] = new int[n];
        for(int curr=0;curr<n;curr++){
            for(int conn: adj.get(curr)){
                indgree[conn]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<n;i++){
            if(indgree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){
            int curr = q.remove();
            ans.add(curr);
            for(int conn:adj.get(curr)){
                indgree[conn]--;
                if(indgree[conn]==0){
                    q.add(conn);
                }
            }
        }
        return ans;
    }


   
    public static void main(String[] args ){
         int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> [] graph = (ArrayList<Edge>[]) new ArrayList[V];
        createGraph(graph);
          for(int i = 0; i < graph.length; i++) {
             System.out.print(i + " -> ");
                for(Edge e : graph[i]) {
                     System.out.print(e.des + " ");
                }
                    System.out.println();
                }
        



    }
}
