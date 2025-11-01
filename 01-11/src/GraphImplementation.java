import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Edge {
    int source;
    int destination;
    int weight;
    public Edge(int s , int d , int w) {
        this.source=s;
        this.destination=d;
        this.weight=w;
    }

}
public class GraphImplementation {
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i=0;i<graph.length;i++) graph[i] = new ArrayList<>();
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,3));

        graph[0].add(new Edge(1,3,4));

        graph[0].add(new Edge(2,4,2));

        graph[0].add(new Edge(3,4,7));
        graph[0].add(new Edge(3,5,1));

        graph[0].add(new Edge(4,5,5));

        graph[0].add(new Edge(5,6,9));
    }

    static void bfsTraversal(ArrayList<Edge>graph[] , int v) {
        boolean[] arr = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int current = queue.remove();
            if(arr[current]==false) {
                System.out.print(current+" ");
                arr[current]=true;

                //adding neighbour
                for(int i=0;i<graph[current].size();i++) {
                    Edge e = graph[current].get(i);
                    queue.add(e.destination);
                }
            }
        }

    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        for(int i=0;i<graph[i].size();i++) {
            Edge e = graph[i].get(i);
            System.out.println(e.destination+" "+ e.weight);
        }
        bfsTraversal(graph,v);
    }
}
