package al.graph.undirectedGraph.Test;

import java.io.File;

import al.graph.undirectedGraph.Graph.Graph;
import al.graph.undirectedGraph.search.DepthFirstSearch;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class TestFindPath {

	public static void main(String[] args) {
		Graph G = new Graph(new In(new File("C:\\Users\\yhlee\\git\\book\\DesignPattern\\src\\al\\graph\\undirectedGraph\\data\\tinyGraph.txt")));
		int s = 0;
		DepthFirstSearch search = new DepthFirstSearch(G, s);

		for (int v = 0; v < G.V(); v++) {
			StdOut.print(s + " to " + v + ": ");
			if (search.hasPathTo(v)) {
				for (int x : search.pathTo(v)) {
					if (x == s) {
						StdOut.print(x);
					} else {
						StdOut.print("-" + x);
					}
				}
			}
			StdOut.println();
		}
	}
}
