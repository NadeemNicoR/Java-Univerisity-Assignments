/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) 
    {
    	int[][] edge = new int[][]{{1, 1, 0, 1, 0, 0}, {0, 0, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 1}, {1, 0, 0, 0, 0, 0}, { 0, 0, 0, 0, 0, 1},{0, 0, 0, 1, 0, 0}};
		MatrixGraph mg=new MatrixGraph();
		System.out.println("Number of edges moving towards vertex 5 are "+mg.inDegree(5, edge));
		System.out.println("-------------------------------------------------------------");
		System.out.println("Number of edges moving away from vertex 5 are "+mg.outDegree(5, edge));
		System.out.println("-------------------------------------------------------------");
		System.out.println("the vertices that are directly adjecent to vertex 5 are "+mg.adjacent(5, edge));
		System.out.println("-------------------------------------------------------------");
		System.out.println("Number of edges moving towards vertex 1 are "+mg.inDegree(1, edge));
		System.out.println("-------------------------------------------------------------");
		System.out.println("Number of edges moving away from vertex 1 are "+mg.outDegree(1, edge));
		System.out.println("-------------------------------------------------------------");
		System.out.println("the vertices that are directly adjecent to vertex 1 are "+mg.adjacent(1, edge));
    }
}

