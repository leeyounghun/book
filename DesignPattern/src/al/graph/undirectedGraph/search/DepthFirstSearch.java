package al.graph.undirectedGraph.search;


import al.graph.undirectedGraph.Graph;
import al.util.Stack;

public class DepthFirstSearch {
	private int[] edgeTo;
	private boolean[] marked;
	private int count;
	private int s;

	public DepthFirstSearch(Graph G, int s) {
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		this.s = s;
		dfs(G, s);
	}

	private void dfs(Graph G, int v) {
		marked[v] = true;
		count++;
		for (int w : G.adj(v)){
			if (!marked[w]){
				edgeTo[w] = v;
				dfs(G, w);
			}
		}

	}

	public boolean marked(int w) {
		return marked[w];
	}

	public int count() {
		return count;
	}

	public boolean hasPathTo(int v){
		return marked[v];
	}

	public Iterable<Integer> pathTo(int v){
		if(marked[v] == false) return null;

		Stack<Integer> path = new Stack<Integer>();
		for (int x = v; x != s; x = edgeTo[x]) {
			path.push(x);
		}

		path.push(s);

		return path;
	}
}
