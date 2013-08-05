package al.graph.undirectedGraph.Test;

import java.io.File;

import al.graph.undirectedGraph.Graph.Graph;
import al.graph.undirectedGraph.search.CC;
import al.util.Bag;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

/**
 *
 * find connected component using DFS
 *
 * @author yhlee
 *
 */
public class TestCCDFSSearch {
	public static void main(String[] args) {
		Graph G = new Graph(new In(new File("C:\\Users\\yhlee\\git\\book\\DesignPattern\\src\\al\\graph\\undirectedGraph\\data\\tinyGraph.txt")));
		CC cc = new CC(G);

		int M = cc.count();
		StdOut.println(M + " components");

		Bag<Integer>[] componets;
		componets = (Bag<Integer>[]) new Bag[M];

		for (int i = 0; i < M; i++) {
			componets[i] = new Bag<Integer>();
		}

		for (int v = 0; v < G.V(); v++) {
			componets[cc.id(v)].add(v);
		}

		for (int i = 0; i < M; i++) {
			for (int v : componets[i]) {
				StdOut.print(v + " ");
			}
			StdOut.println();
		}
	}
}
