import java.util.*;

public class Dijkstra {
    public static void ejecutarEjemplo() {
        int[][] grafo = {
            {0, 7, 9, 0, 0, 14},
            {7, 0, 10, 15, 0, 0},
            {9, 10, 0, 11, 0, 2},
            {0, 15, 11, 0, 6, 0},
            {0, 0, 0, 6, 0, 9},
            {14, 0, 2, 0, 9, 0}
        };
        dijkstra(grafo, 0);
    }

    public static void dijkstra(int[][] grafo, int src) {
        int n = grafo.length;
        int[] dist = new int[n];
        boolean[] visitado = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = minDist(dist, visitado);
            visitado[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visitado[v] && grafo[u][v] != 0 &&
                        dist[u] + grafo[u][v] < dist[v]) {
                    dist[v] = dist[u] + grafo[u][v];
                }
            }
        }

        System.out.println("Distancias minima desde el nodo 0:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nodo " + i + " -> " + dist[i]);
        }
    }

    private static int minDist(int[] dist, boolean[] visitado) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visitado[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}