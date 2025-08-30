package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
    int[][] adjMatrix;
    List<List<Integer>> adjList;
    List<List<Pair>> adjListWithWeight;

    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "(" + node + ", " + weight + ")";
        }
    }

    Graph(int nodes) {
        adjMatrix = new int[nodes][nodes];
        adjList = new ArrayList<>();
        adjListWithWeight = new ArrayList<>();

        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
            adjListWithWeight.add((new ArrayList<>()));
        }
    }

    public void addEdgesInMatrix(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjMatrix[u][v] = 1;
            if (!isDirected) adjMatrix[v][u] = 1;
        }
        printMatrix();
    }

    public void printMatrix() {
        System.out.println("[");
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < adjMatrix[i].length; j++) {
                if (j == adjMatrix[i].length - 1) {
                    System.out.print(adjMatrix[i][j]);
                } else {
                    System.out.print(adjMatrix[i][j] + ", ");
                }
            }
            System.out.print("]");
            if (i != adjMatrix.length - 1) System.out.print(",");
            System.out.println();
        }
        System.out.println("]");
    }

    public void printList() {
        System.out.println("[");
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                if (j == adjList.get(i).size() - 1) {
                    System.out.print(adjList.get(i).get(j));
                } else {
                    System.out.print(adjList.get(i).get(j) + ", ");
                }
            }
            System.out.print("]");
            if (i != adjList.size() - 1) System.out.print(",");
            System.out.println();
        }
        System.out.println("]");
    }

    public void addEdgesWithWeightInMatrix(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adjMatrix[u][v] = w;
            if (!isDirected) adjMatrix[v][u] = w;
        }
        printMatrix();
    }

    public void addEdgesInList(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            if (!isDirected) adjList.get(v).add(u);
        }
        printList();
    }

    public void addEdgesWithWeightsInList(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            Pair pair = new Pair(v, w);
            adjListWithWeight.get(u).add(pair);
            if (!isDirected) {
                Pair newPair = new Pair(u, w);
                adjListWithWeight.get(v).add(newPair);
            }
        }
        printList();
    }

    public void findDegree(int[][] edges, boolean isDirected, int nodes) {
        if (isDirected) {
            int[] inDegree = new int[nodes];
            int[] outDegree = new int[nodes];
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                inDegree[v]++;
                outDegree[u]++;
            }
            System.out.println("Directed Graph");
            for (int i = 0; i < nodes; i++) {
                System.out.println("node -> " + i + ", inDegree -> " + inDegree[i] + ", outDegree -> " + outDegree[i]);
            }
        } else {
            int[] degree = new int[nodes];
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                degree[u]++;
                degree[v]++;
            }
            System.out.println("Un-directed Graph");
            for (int i = 0; i < nodes; i++) {
                System.out.println("node -> " + i + ", degree -> " + degree[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {2, 3}};
        int nodes = 4;
        Graph graph = new Graph(nodes);
        graph.addEdgesInMatrix(edges, false);
        int[][] weightEdges = {{0, 1, 10}, {0, 2, 23}, {2, 3, 53}};
        graph.addEdgesWithWeightInMatrix(weightEdges, false);
        graph.findDegree(weightEdges, true, nodes);
        graph.addEdgesInList(edges, false);
        graph.addEdgesWithWeightsInList(weightEdges, false);
        graph.findDegree(edges, false, nodes);
    }
}
