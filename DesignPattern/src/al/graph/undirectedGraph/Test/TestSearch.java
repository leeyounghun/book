package al.graph.undirectedGraph.Test;

import java.io.File;

import al.graph.undirectedGraph.Graph;
import al.graph.undirectedGraph.search.DepthFirstSearch;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class TestSearch {
	public static void main(String[] args) {
		Graph G = new Graph(new In(new File("D:\\product\\DesignPattern\\src\\al\\graph\\undirectedGraph\\data\\tinyGraph.txt")));
		int s = 0;
		DepthFirstSearch search = new DepthFirstSearch(G, s);

		for (int v = 0; v < G.V(); v++)
			if (search.marked(v))
				StdOut.print(v + " ");

		StdOut.println();
		if (search.count() != G.V())
			StdOut.print("NOT ");
		StdOut.println("connected");

	}
}
