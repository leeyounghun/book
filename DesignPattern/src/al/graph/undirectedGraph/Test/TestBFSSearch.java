package al.graph.undirectedGraph.Test;

import java.io.File;

import javax.sql.rowset.serial.SerialArray;

import al.graph.undirectedGraph.Graph.Graph;
import al.graph.undirectedGraph.search.BreadthFirstPaths;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class TestBFSSearch {
	public static void main(String[] args) {
		Graph G = new Graph(new In(new File("C:\\Users\\yhlee\\git\\book\\DesignPattern\\src\\al\\graph\\undirectedGraph\\data\\tinyGraph.txt")));
		int s = 0;
		BreadthFirstPaths search = new BreadthFirstPaths(G, s);

		StdOut.println(G);
		Iterable<Integer> paths = search.pathTo(4);
		for (Integer v : paths) {
			StdOut.print(v + " ");
		}
		StdOut.println();

	}
}
