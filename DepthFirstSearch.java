public class DepthFirstSearch {
    public static void main(String[] args) {
        // DepthFirstSearch: Pick a rout, keep going. If you reach a dead end, or an already visited node, back track to the previoius node with unvisited adjacent neighbors.

        GraphDFS graph = new GraphDFS(5);
        graph.addNode(new NodeDFS('A'));
        graph.addNode(new NodeDFS('B'));
        graph.addNode(new NodeDFS('C'));
        graph.addNode(new NodeDFS('D'));
        graph.addNode(new NodeDFS('E'));


        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        graph.depthFirstSearch(0);
    }
}
