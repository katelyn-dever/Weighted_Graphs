
public class DeverKA12 {

	public static void main(String[] args) {
		String[] vertices = {"Riverside", "Corona", "Los Angeles", "Orange"};
		
		int[][] edges = {
				{0, 1, 18}, {0, 2, 62}, {0, 3, 36},
				{1, 0, 18}, {1, 2, 46}, {1, 3, 21},
				{2, 0, 62}, {2, 1, 46}, {2, 3, 32},
				{3, 0, 36}, {3, 1, 21}, {3, 2, 32}
		};
		
		WeightedGraph<String> cityGraph = new WeightedGraph<>(vertices, edges);
		WeightedGraph<String>.MST cityMST = cityGraph.getMinimumSpanningTree();
		System.out.println("Minimum Spanning Tree: ");
		cityMST.printTree();
		
		WeightedGraph<String>.ShortestPathTree citySP = 
				cityGraph.getShortestPath(cityGraph.getIndex("Riverside"));
		System.out.println("Shortest Paths from Riverside: ");
		citySP.printAllPaths();

	}

}
