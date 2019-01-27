package DFS_BFS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;


public class B_1325 {
	public static int[][] graph;
	public static int N;
	public static boolean[] visited;
	
	
	public static void DFS(int n, boolean[] visited) {
		visited[n] = true;
		
		for(int i = n; i < graph.length; i++)
			for(int j = 0; j < graph.length; j++) {
				if(!visited[j] && graph[i][j] == 1)
					DFS(j, visited);
			}
	}
	
	
	public static void main(String[] args)throws FileNotFoundException {

		System.setIn(new FileInputStream("B_1325.txt"));
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		graph = new int[N][N];
		int[] arr_cnt = new int[N];
		int caseCnt = scanner.nextInt();
		
		for(int i = 1; i <= caseCnt; i++) {
			int main = scanner.nextInt();
			int sub = scanner.nextInt();
			graph[sub-1][main-1] = 1;			
		}
		
		for(int i = 0; i < N; i++) {
			visited = new boolean[N];
			DFS(i, visited);
			int cnt = 0;
			for(int j = 0; j < N; j++)
				if(visited[j] == true) cnt++;
			arr_cnt[i] = cnt;
		}
		
		System.out.println(Arrays.toString(arr_cnt));
	}

}
