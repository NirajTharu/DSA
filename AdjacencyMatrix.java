public class AdjacencyMatrix {
    // Adjacency Matrix: 2D array to store 0's/1's to represent edges
    // number of rows = number of unique nodes
    // number of columns = number of unique nodes
    
    // Runtime complexity to check an edge: O(1)
    // space Complexity: O(V^2)
    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(3, 2));
    }
}
