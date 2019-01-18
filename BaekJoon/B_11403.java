package BaekJoon;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class B_11403 {
	static LinkedList<Integer> node[];;
	static int[][] answer;
	static int N;
	public static void makeNode(int n, int[][] graph) {
		node = new LinkedList[n];
		answer = new int[n][n];
		N = n;
		for(int i = 0; i < n; i++) {
			node[i] = new LinkedList();
			for(int j = 0; j < n; j++) {
				if(graph[i][j] == 1) node[i].add(j);
			}
		}
	}
	
	static void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		
		Iterator<Integer> i = node[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n])
				DFSUtil(n, visited);
				
		}
		
	}
	
	static void solution(int n, int[][] graph) {
		makeNode(n, graph);
		
		for(int i = 0; i < graph.length; i++) {
			boolean[] visited = new boolean[n];
			Iterator<Integer> k = node[i].listIterator();
			while(k.hasNext()) {
				int g = k.next();
				DFSUtil(g, visited);
			}
			for(int j = 0; j < n; j++) {
				if(visited[j]) answer[i][j] = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = {{0, 0, 0, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 1},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 1, 0},
				{1, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 1},
				{0, 0, 1, 0, 0, 0, 0}};
		
		solution(7, arr);
		
		System.out.println(Arrays.deepToString(answer));
	}

}
