package al.graph.ditectedGraph;

import java.io.File;

import al.graph.ditectedGraph.graph.DiGraph;
import al.graph.ditectedGraph.search.DirectedDFS;
import al.util.Bag;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class TestDFSSearch {
	public static void main(String[] args) {
		DiGraph G = new DiGraph(new  In(new File("C:\\Users\\yhlee\\git\\book\\DesignPattern\\src\\al\\graph\\undirectedGraph\\data\\tinyGraph.txt")));
		Bag<Integer> sources = new Bag<Integer>();

		sources.add(0);
		DirectedDFS reachable = new DirectedDFS(G, sources);
		for (int v = 0; v < G.V(); v++)
			if (reachable.marked(v))
				StdOut.print(v + " ");
		StdOut.println();
	}
}
