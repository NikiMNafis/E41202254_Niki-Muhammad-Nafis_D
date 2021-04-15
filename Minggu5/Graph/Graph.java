package Minggu5.Graph;

class Vertex {
    public char label;
    public boolean wasVisited;

    public Vertex(char label) {
        this.label = label;
        wasVisited = false;
    }
}

public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    //BFS
    private Queue theQueue;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }

        //DFS
//        theStack = new Stack(MAX_VERTS);
//        theStack = new Stack(MAX_VERTS);
        theQueue = new Queue(MAX_VERTS);
    }

    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void display() {
        System.out.println("Adjecency:");
        for (int row = 0; row < nVerts; row++) {
            for (int col = 0; col < row; col++) {
                if (adjMat[row][col] == 1) {
                    System.out.println(
                            vertexList[row].label + " -- " + vertexList[col].label);
                }
            }
        }
        System.out.println("");
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label + " ");
    }

    public int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }

    private void resetFlags() {
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    //BFS
    public void bfs() {
        System.out.println("visit by using" + " BFS algorithm: ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);

        int v2;

        while (!theQueue.isEmpty()) {
            int v1 = (int) theQueue.remove();
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
        System.out.println("");
        resetFlags();
    }
}

class GraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();

        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4

        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(2, 3); // AD
        theGraph.addEdge(3, 4); // DE

        theGraph.bfs();

//        theGraph.display();
    }
}

class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        queArray = new long[maxSize];
        front = 0; rear = -1; nItems = 0;
    }

    public void insert(long value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = value;
        nItems++;
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return  (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}



















