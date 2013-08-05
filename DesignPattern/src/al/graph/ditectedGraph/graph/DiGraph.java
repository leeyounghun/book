package al.graph.ditectedGraph.graph;

import al.util.Bag;
import edu.princeton.cs.introcs.In;

@SuppressWarnings("unchecked")
public class DiGraph {
	private final int V;
	private int E;
	private Bag<Integer>[] adj;

	public DiGraph(int V) {
		this.V = V;
		this.E = 0;

		adj = (Bag<Integer>[]) new Bag[V];
		for (int v = 0; v < V; v++) {
			adj[v] = new Bag<Integer>();
		}
	}

	public DiGraph(In in) {
		this(in.readInt());
		this.E = in.readInt();
		for (int i = 0; i < E; i++) {
			/*System.out.println(in.readInt());*/
			int v = in.readInt();
			int w = in.readInt();

			addEdge(v, w);
		}
	}

	public int V() {
		return V;
	}

	public int E() {
		return E;
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		E++;
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

	public DiGraph reverse() {
		DiGraph R = new DiGraph(V);
		for (int v = 0; v < V; v++) {
			for (int w : adj(v)) {
				R.addEdge(w, v);
			}
		}

		return R;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges\n");

		for (int v = 0; v < V; v++) {
			sb.append(v + " : ");
			for (int w : adj(v)) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}

		return sb.toString();
	}
}
