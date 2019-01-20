package DFS_BFS;

import java.util.Arrays;
import java.util.LinkedList;

public class B_11724 {
	static int[][] graph;
	static int answer = 0;
	
	static void makeGraph(int n, int[][] arr) {
		graph = new int[n][n];
		for(int i = 0; i < arr.length; i++) {
			int a = arr[i][0] -1;
			int b = arr[i][1] -1;
			graph[a][b] = graph[b][a] = 1;
		}
	}
	
	static void DFS(int v, boolean[] visited) {
		visited[v] = true;
		
		for(int i = 0; i < graph.length; i++)
			for(int j = i; j < graph.length; j++) {
				if(!visited[j] && graph[i][j] == 1) {
					DFS(j, visited);
				}
		}
	}
	
	static void solution(int n, int[][] arr) {
		makeGraph(n, arr);
		
		boolean[] visited = new boolean[n];
		for(int i = 0; i < n; i++) 
			if(!visited[i]) {
				answer++;
				DFS(i, visited);
			}		
	}

	public static void main(String[] args) {
		int[][] a = {{1,2}, {2,3}};
		makeGraph(3, a);
		solution(3, a);
		System.out.println(answer);

	}

}
