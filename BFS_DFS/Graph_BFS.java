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
		//����� �湮���� �Ǵ� (default = False)
		boolean visited[] = new boolean[V];
		//BFS������ ���� ť ����
		LinkedList<Integer> queue = new LinkedList<>();
		
		//���� ��带 �湮�ϸ� �湮�� ������ ǥ���ϰ� ť�� ����.
		visited[s] = true;
		queue.add(s);
		
		//ť�� �� ������ �ݺ�
		while(queue.size() != 0) {
			//�湮�� ��带 ť���� �����ϰ� ���� ���.
			s = queue.poll();
			System.out.println(s + " ");
			
			//ť���� ���� ���� ������ ��� ������ ������.
			Iterator<Integer> i = adj[s].listIterator();
			int n = i.next();
			//���� ���� ������ ������ ��� ���ʷ� �湮.
			if(!visited[n]) {
				visited[n] = true;
				queue.add(n);
			}
		}	
	}
	
}
