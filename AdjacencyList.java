public class AdjacencyList {
    public static void main(String[] args) {
        /*
            Adjacency List: An array/ ArrayList of LinkedList.
            Each LinkedList has a unique node at the head.
            All adjacent neighbours to that node are added to that node's linkedlist.


            Runtime complexity to check an edge: O(v)
            space complexity: O(v + e) 
        */ 
        GraphOne graph = new GraphOne();
        graph.addNode(new NodeOne('A'));
        graph.addNode(new NodeOne('B'));
        graph.addNode(new NodeOne('C'));
        graph.addNode(new NodeOne('D'));
        graph.addNode(new NodeOne('E'));


        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();
    }
}
