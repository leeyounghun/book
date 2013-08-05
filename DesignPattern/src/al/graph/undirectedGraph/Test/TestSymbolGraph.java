package al.graph.undirectedGraph.Test;

import al.graph.undirectedGraph.Graph.Graph;
import al.graph.undirectedGraph.Graph.SymbolGraph;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class TestSymbolGraph {
	public static void main(String[] args) {
		String filename = "C:\\Users\\yhlee\\git\\book\\DesignPattern\\src\\al\\graph\\undirectedGraph\\data\\route.txt";
		String delim = " ";
		SymbolGraph sg = new SymbolGraph(filename, delim);
		Graph G = sg.G();
		while (StdIn.hasNextLine()) {
			String source = StdIn.readLine();
			for (int w : G.adj(sg.index(source)))
				StdOut.println(" " + sg.name(w));
		}
	}
}
