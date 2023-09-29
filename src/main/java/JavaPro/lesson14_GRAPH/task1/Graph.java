package JavaPro.lesson14_GRAPH.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph {
    private List<List<Integer>> list = new ArrayList<>();
    public Graph(Set<Edge> edges){
        int max = 0;

        for (Edge edge : edges){
            int source = edge.getSource();
            if (source > max){
                max = source;
            }
        }
        for (int i=0; i <= max; i++) {
            list.add(new LinkedList<>());
        }
        for (Edge edge : edges) {
            list.get(edge.getSource()).add(edge.getDestination());
        }

    }

    public List<List<Integer>> getList() {
        return list;
    }
}
