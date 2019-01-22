package Algorithm;

import java.io.*;
import java.util.*;

/** ���� ����Ʈ�� �̿��� ���⼺ �ִ� �׷��� Ŭ����*/
 class Graph_DFS {  
	 private int V; //����� ����
	 private LinkedList<Integer> adj[]; //���� ����Ʈ
	 
	 /** ������ */
	 Graph_DFS(int v){
		 V = v;
		 adj = new LinkedList[v];
		 for(int i = 0; i < v; i++) //��������Ʈ �ʱ�ȭ
			 adj[i] = new LinkedList();
	 }
	 
	 /** ��带 ���� v->w */
	 void addEdge(int v, int w) {adj[v].add(w);}
	 
	 /** DFS�� ���� ���Ǵ� �Լ�  */
	 void DFSUtil(int v, boolean visited[]) {
		 //���� ��带 �湮�� ������ ǥ���ϰ� �ش� ���� ���.
		 visited[v] = true;
		 System.out.print(v + " ");
		 
		 //�湮�� ���� ������ ��� ��带 ������.
		 Iterator<Integer> i = adj[v].listIterator();
		 while(i.hasNext()) {
			 int n = i.next();
			 //�湮���� ���� ���� �ش� ��带 ���� ���� �ؼ� �ٽ� DFSUtil�� ȣ��
			 if(!visited[n])
				 DFSUtil(n, visited); //��ȯ ȣ��
		 }
	 }
	 
	 /** �־��� ��带 ���۳��� DFS Ž�� */
	 void DFS(int v) {
		 //����� �湮 ���� �Ǵ� (Default = False)
		 boolean visited[] = new boolean[V];
		 
		 // v�� ���۳��� DFSUtil ��ȯ ȣ��
		 DFSUtil(v, visited);
	 }
	 
	 /** DFS Ž��  */
	 void DFS() {
		 //����� �湮 ���� �Ǵ� (Default = False)
		 boolean visited[] = new boolean[V];
		 
		 //�񿬰��� �׷����� ��� ��� ������ �ϳ��� �湮
		 for(int i = 0; i < V; i++) {
			 if(visited[i] == false)
				 DFSUtil(i, visited);
		 }
	 }
	 
	 public static void main(String args[]) {
		 Graph_DFS g = new Graph_DFS(5);
		 
		 g.addEdge(0, 1);
		 g.addEdge(0, 2);
		 g.addEdge(1, 2);
		 g.addEdge(2, 3);
		 g.addEdge(3, 4);
		 g.DFS();
		 System.out.println();
		 g.DFS(2);
		 
	 }
	 
}

 