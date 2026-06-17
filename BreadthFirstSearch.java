public class BreadthFirstSearch {
    /*
        BFS:  Is a search algorithm for traversing a tree or graph data structure.
        This is done one "level" at a time, rather than one branch at a time.
    */
    public static void main(String[] args) {

        GraphBFS graph = new GraphBFS(5);
        graph.addNode(new NodeBFS('A'));
        graph.addNode(new NodeBFS('B'));
        graph.addNode(new NodeBFS('C'));
        graph.addNode(new NodeBFS('D'));
        graph.addNode(new NodeBFS('E'));


        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();
        System.out.println("""
                ============================
                """);
        graph.breadthFirstSearch(4);
        System.out.println("""
                ============================
                """);
        System.out.println("""
                Difference between breadth first search and depth first search
                BFS
                Traverse a graph level by level
                Utilizes a queue
                Better if destination is on average close to start
                Siblings are visited before children

                DFS
                Traverse a graph branch by branch
                Utilizes a stack
                Better if destination is on average far from the start
                Children are visited befroe siblings.
                More popular for game/ puzzles
                """);
    }
}
