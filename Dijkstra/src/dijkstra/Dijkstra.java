/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dijkstra;

import java.util.HashMap;

/**
 *
 * @author wangh
 */
public class Dijkstra {

    public static class Record {

        Record(int previous, int point) {
            this.previous = previous;
            this.point = point;
        }
        int previous;
        int point;
    }

    public static HashMap<String, Record> map = new HashMap<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] graph = {{1, 2, 1}, {1, 3, 12}, {2, 3, 9}, {2, 4, 3}, {3, 5, 5}, {4, 3, 4}, {4, 5, 13}, {4, 6, 15}, {5, 6, 4}};
//        MapDijkstra(graph, 1);
//        Mapprint("6", "6");
//        System.out.println();
        Dijkstra(graph, 1, 6);
    }

    public static void Dijkstra(int[][] graph, int start, int end) {
        //溢出的空陣列捨棄即可 因最高上限節點為length
        int[][] result = new int[graph.length][3];
        //標記
        result[start][0] = 1;
        //代表他為根結點
        result[start][1] = - 1;
        //代表他的路過成本為 0
        result[start][2] = 0;
        int mark[] = {start, -1, 0};
        for (int i = start; i < graph.length + 1; i++) {
            mark[1] = -1;
            for (int j = 0; j < graph.length; j++) {
                if (graph[j][0] == mark[0]) {
                    if (result[mark[0]][2] + graph[j][2] < result[graph[j][1]][2] || result[graph[j][1]][2] == 0) {
                        result[graph[j][1]][1] = graph[j][0];
                        result[graph[j][1]][2] = graph[j][2] + result[mark[0]][2];
                    }
                }
            }
            for (int j = 1; j < graph.length; j++) {
                if ((mark[1] == -1 || result[j][2] < mark[1]) && result[j][0] == 0 && result[j][1] != 0) {
                    mark[1] = result[j][2];
                    mark[2] = j;
                }
            }
            result[mark[2]][0] = 1;
            mark[0] = mark[2];
        }
        print(result, start, end);
    }

    public static void print(int[][] result, int start, int end) {
        if (result[end][1] != start) {
            print(result, start, result[end][1]);
        } else {
            System.out.print(start);
        }

        System.out.print("→" + end);
    }

    //DFS ?
    public static void MapDijkstra(int[][] graph, int start) {
        if (!map.containsKey(String.valueOf(start))) {
            map.put(String.valueOf(start), new Record(-1, 0));
        }

        for (int i = 0; i < graph.length; i++) {
            if (graph[i][0] == start) {
                String node = String.valueOf(start);
                String nextNode = String.valueOf(graph[i][1]);
                if (!map.containsKey(nextNode)) {
                    map.put(String.valueOf(nextNode), new Record(start, map.get(node).point + graph[i][2]));
                } else if (map.get(node).point + graph[i][2] < map.get(nextNode).point) {
                    map.get(nextNode).previous = start;
                    map.get(nextNode).point = map.get(node).point + graph[i][2];
                }
                MapDijkstra(graph, graph[i][1]);
            }
        }
    }

    public static void Mapprint(String node, String end) {

        if (!map.containsKey(node)) {
            return;
        } else if (map.get(node).previous != -1) {
            Mapprint(String.valueOf(map.get(node).previous), end);
        } else {
            System.out.println("Point is " + String.valueOf(map.get(end).point));
        }

        System.out.print("→" + node);
    }
}
