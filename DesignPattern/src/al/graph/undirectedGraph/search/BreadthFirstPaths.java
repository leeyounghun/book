package al.graph.undirectedGraph.search;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import al.graph.undirectedGraph.Graph.Graph;
import al.util.Stack;

public class BreadthFirstPaths {
	private boolean[] marked;
	private int[] edgeTo;
	private final int s;

	public BreadthFirstPaths(Graph G, int s) {
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		this.s = s;
		bfs(G, s);
	}

	private void bfs(Graph G, int s) {
		Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
		marked[s] = true;
		queue.add(s);

		while (!queue.isEmpty()) {
			int v = queue.poll();
			for (int w : G.adj(v)) {
				if (!marked[w]) {
					edgeTo[w] = v;
					marked[w] = true;
					queue.add(w);
				}
			}
		}
	}

	public boolean marked(int w) {
		return marked[w];
	}

	public boolean hasPathTo(int v) {
		return marked[v];
	}

	public Iterable<Integer> pathTo(int v) {
		if (marked[v] == false)
			return null;

		Stack<Integer> path = new Stack<Integer>();
		for (int x = v; x != s; x = edgeTo[x]) {
			path.push(x);
		}

		path.push(s);

		return path;
	}
}
