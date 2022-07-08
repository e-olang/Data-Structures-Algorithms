class Graphs {

    // inner class
    // to keep track of edges
    class Edge {
        char src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    public Graphs(char vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for(int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 5;
        int noEdges = 8;
        Graphs g = new Graphs((char) noVertices, noEdges);

        // create graph
        g.edge[0].src = 'A';   // edge 1---2
        g.edge[0].dest = 'B';

        g.edge[1].src = 'A';   // edge 1---3
        g.edge[1].dest = 'C';

        g.edge[2].src = 'A';   // edge 1---4
        g.edge[2].dest = 'D';

        g.edge[3].src = 'B';   // edge 2---4
        g.edge[3].dest = 'D';

        g.edge[4].src = 'B';   // edge 2---5
        g.edge[4].dest = 'E';

        g.edge[5].src = 'C';   // edge 3---4
        g.edge[5].dest = 'D';

        g.edge[6].src = 'C';   // edge 3---5
        g.edge[6].dest = 'E';

        g.edge[7].src = 'D';   // edge 4---5
        g.edge[7].dest = 'E';

        // print graph
        for(int i = 0; i < noEdges; i++) {
            System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
        }

    }
}