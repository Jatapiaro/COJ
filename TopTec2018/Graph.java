import java.util.*;
 
public class Graph {
 
    // No. of vertices in graph
    private int v; 
     
    // adjacency list 
    private ArrayList<Integer>[] adjList;

    public ArrayList<List<Integer>> paths; 

    public HashMap<Pair, Integer> hm; 
     
    //Constructor
    public Graph(int vertices){

        hm = new HashMap<Pair, Integer>();
         
        //initialise vertex count
        this.v = vertices;

        this.paths = new ArrayList<List<Integer>>();
         
        // initialise adjacency list
        this.adjList = new ArrayList[100001]; 
        for(int i = 0; i <= 100001; i++)
        {
            adjList[i] = new ArrayList<>();
        }
    }
     
     
    // add edge from u to v
    public void addEdge(int u, int v, int t)
    {
        // Add v to u's list.
        adjList[u].add(v);
        Pair p = new Pair(u,v);
        if ( !hm.containsKey(p) )  {
            hm.put(p,t);
        }

    }
     
    // Prints all paths from
    // 's' to 'd'
    public void printAllPaths(int s, int d) 
    {
        boolean[] isVisited = new boolean[100001];
        ArrayList<Integer> pathList = new ArrayList<>();
         
        //add source to path[]
        pathList.add(s);
         
        //Call recursive utility
        printAllPathsUtil(s, d, isVisited, pathList);
    }

    private void copyAndAdd(List<Integer> localPathList) {
        List<Integer> local = new ArrayList<Integer>();
        for ( Integer i : localPathList ){
            local.add(i);
        }
        this.paths.add(local);
    }
 
    // A recursive function to print
    // all paths from 'u' to 'd'.
    // isVisited[] keeps track of
    // vertices in current path.
    // localPathList<> stores actual
    // vertices in the current path
    private void printAllPathsUtil(Integer u, Integer d,
                                    boolean[] isVisited,
                            List<Integer> localPathList) {
         
        // Mark the current node
        isVisited[u] = true;
         
        if (u.equals(d)) 
        {
            this.copyAndAdd(localPathList);
        }
         
        // Recur for all the vertices
        // adjacent to current vertex
        for (Integer i : adjList[u]) 
        {
            if (!isVisited[i])
            {
                // store current node 
                // in path[]
                localPathList.add(i);
                printAllPathsUtil(i, d, isVisited, localPathList);
                 
                // remove current node
                // in path[]
                localPathList.remove(i);
            }
        }
         
        // Mark the current node
        isVisited[u] = false;
        //System.out.println("Acabo con: "+localPathList);
    }
 
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);


            int cases = sc.nextInt();

            Graph g = new Graph(cases);

            List<Integer> index = new ArrayList<Integer>();

            for ( int i = 0; i<cases; i++ ){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int t = sc.nextInt();
                if ( !index.contains(a) ){
                    index.add(a);
                }
                if ( !index.contains(b) ){
                    index.add(b);
                }
                g.addEdge(a, b, t);
                
            }

            Collections.sort(index);

            /*int s = -1;
            int d = -1;
            if ( index.size() > 1) {
                s = index.get(0);
                d = index.get(index.size()-1);
            } else {
                s = d = index.get(0);
            }*/
            

            //g.printAllPaths(s, d);

            int layers = sc.nextInt();
            for ( int i = 0; i<layers; i++ ){
                sc.nextInt();
                //System.out.println("something");
            }
 
    }
}

class Pair {

    int x, y;

    public Pair( int x, int y ) {
        this.x = x; this.y = y;
    }

    public boolean equals(Pair p) {
        return ( this.x == p.x && this.y == p.y ) || ( this.x == p.y && this.y == p.x );
    } 

}