package al.graph.undirectedGraph;

import al.util.Bag;
import edu.princeton.cs.introcs.In;

@SuppressWarnings({ "unchecked", "unused" })
public class Graph {
	private final int V;
	private int E;
	private Bag<Integer>[] adj;

	public Graph(int V) {
		this.V = V;
		this.E = 0;
		adj = (Bag<Integer>[]) new Bag[V];
		for (int v = 0; v < V; v++)
			adj[v] = new Bag<Integer>();
	}

	public Graph(In in) {
		this(in.readInt());
		int E = in.readInt();
		for (int i = 0; i < E; i++) {
			int v = in.readInt();
			int w = in.readInt();

			addEdge(v, w);
		}
	}

	private void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

	public static int degree(Graph G, int v) {
		int degree = 0;
		for (int w : G.adj(v))
			degree++;

		return degree;
	}

	public static int maxDegree(Graph G) {
		int max = 0;
		for (int v = 0; v < G.V(); v++) {
			if (degree(G, v) > max)
				max = degree(G, v);
		}

		return max;
	}

	public static int avgDegree(Graph G) {
		return 2 * G.E() / G.V();
	}

	public static int numberOfSelfLoops(Graph G) {
		int count = 0;
		for (int v = 0; v < G.V(); v++) {
			for (int w : G.adj(v)) {
				if (v == w)
					count++;
			}
		}

		return count / 2;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges\n");
		for (int v = 0; v < V; v++) {
			sb.append(v + ":");
			for (int w : this.adj(v)) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}

		return sb.toString();
	}

}
