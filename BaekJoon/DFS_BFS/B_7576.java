package DFS_BFS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*
 	���ذ�.... ���� �丶��� ��ȯ�ϴ°� ����������
 	�ּ� �ϼ��� ����ϴ� �ڵ带 ¥�� ����.
 */

public class B_7576 {
	public static int M;
	public static int N;
	public static int[][] box;
	public static int answer = 0;
	
	public static class Food{
		int x;
		int y;
		public Food(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void Tomato(int x, int y) {
		int curX = 0;
		int curY = 0;
		
		LinkedList<Food> q = new LinkedList<Food>();
		
		q.add(new Food(x, y));
		
		while(!q.isEmpty()) {
			Food food = (Food) q.poll();
			curX = food.x;
			curY = food.y;
			
			//���� Ž��
			if(curX -1 > -1 && box[curX-1][curY] == 0) {
				box[curX-1][curY] = 1;
				q.add(new Food(curX-1, curY));
			}
			
			//�Ʒ��� Ž��
			if(curX +1 < N && box[curX+1][curY] == 0) {
				box[curX+1][curY] = 1;
				q.add(new Food(curX+1, curY));
			}
			
			//������ Ž��
			if(curY +1 < M && box[curX][curY+1] == 0) {
				box[curX][curY+1] = 1;
				q.add(new Food(curX, curY+1));
			}
			
			//���� Ž��
			if(curY -1 > -1 && box[curX][curY-1] == 0) {
				box[curX][curY-1] = 1;
				q.add(new Food(curX, curY-1));
			}
		}
		
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("B_7576.txt"));
		Scanner scanner = new Scanner(System.in);
		
		M = scanner.nextInt();
		N = scanner.nextInt();
		
		box = new int[N][M];
		
		for(int i = 0; i < N; i++)
			for(int j = 0; j < M; j++) 
				box[i][j] = scanner.nextInt();
		
		for(int i = 0; i < N; i++)
			for(int j = 0; j < M; j++) 
				if(box[i][j] == 1) 
					Tomato(i, j);
			
		System.out.println(Arrays.deepToString(box));
		System.out.println(answer);

	}

}
