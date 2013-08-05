package al.graph.undirectedGraph.Test;

import al.graph.undirectedGraph.Graph.Graph;
import al.graph.undirectedGraph.Graph.SymbolGraph;
import al.graph.undirectedGraph.search.BreadthFirstPaths;
import edu.princeton.cs.introcs.StdOut;

public class TestBFSSearch4Symbol {
	public static void main(String[] args) {
		String filename = "C:\\Users\\yhlee\\git\\book\\DesignPattern\\src\\al\\graph\\undirectedGraph\\data\\route.txt";
		String delim = " ";
		SymbolGraph sg = new SymbolGraph(filename, delim);
		Graph G = sg.G();

		int s = 0;
		BreadthFirstPaths search = new BreadthFirstPaths(G, s);

		StdOut.println(G);
		Iterable<Integer> paths = search.pathTo(4);
		for (Integer v : paths) {
			StdOut.print(sg.name(v) + " ");
		}
		StdOut.println();

	}
}
