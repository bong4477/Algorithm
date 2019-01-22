package Algorithm;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_BFS {
	private int V;
	private LinkedList<Integer> adj[];
	
	Graph_BFS(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {adj[v].add(w);}
	
	void BFS(int s) {
		//노드의 방문여부 판단 (default = False)
		boolean visited[] = new boolean[V];
		//BFS구현을 위한 큐 생성
		LinkedList<Integer> queue = new LinkedList<>();
		
		//현재 노드를 방문하면 방문한 것으로 표시하고 큐에 삽입.
		visited[s] = true;
		queue.add(s);
		
		//큐가 빌 때까지 반복
		while(queue.size() != 0) {
			//방문한 노드를 큐에서 추출하고 값을 출력.
			s = queue.poll();
			System.out.println(s + " ");
			
			//큐에서 꺼낸 노드와 인접한 모든 노드들을 가져옴.
			Iterator<Integer> i = adj[s].listIterator();
			int n = i.next();
			//꺼낸 노드와 인접한 노드들을 모두 차례로 방문.
			if(!visited[n]) {
				visited[n] = true;
				queue.add(n);
			}
		}	
	}
	
}
