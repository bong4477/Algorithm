package DFS_BFS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class B_2178 {
	public static int rows;
	public static int cols;
	public static int[][] map = null;
	public static String path = "";
	
	
	public static int Observer() {
		int ret = 0;
		
		int curRow = 0;		//���� Row
		int curCol = 0;		//���� Col
		int curDist = 1;	//���� �̵��� �Ÿ�
		String curPath = ""; // ������� �̵����
		
		LinkedList<Coord> queue = new LinkedList<Coord>();
		queue.add(new Coord(curRow, curCol, curDist, curPath));
		
		while(!queue.isEmpty()) {
			Coord coord = (Coord) queue.poll();
			curRow = coord.row;
			curCol = coord.col;
			curDist = coord.dist;
			curPath = coord.path;
			path = curPath;
			ret = curDist;
			map[curRow][curCol]	= 0;
			
			if(curRow == rows - 1 && curCol == cols - 1) break;
			
			//���� Ž��(Ž���� �� �ִ� ������ ����� �ʰ� Ž���Ϸ��� ���� �� �� �ִ� ���̰� �湮���� ���� ���̸�)
			if(curRow-1 != -1 && map[curRow-1][curCol] == 1) {
				queue.add(new Coord(curRow-1, curCol, curDist+1, curPath));
			}
			//���������� Ž��
			if(curCol+1 < cols && map[curRow][curCol+1] == 1) {
				queue.add(new Coord(curRow, curCol+1, curDist+1, curPath));
			}
			//�Ʒ������� Ž��
			if(curRow+1 < rows && map[curRow+1][curCol] == 1) {
				queue.add(new Coord(curRow+1, curCol, curDist+1, curPath));
			}
			//�������� Ž��
			if(curCol-1 != -1 && map[curRow][curCol-1] == 1) {
				queue.add(new Coord(curRow, curCol-1, curDist+1, curPath));
			}
		}
		queue.clear();
		
		return ret;
	}
	
	public static class Coord{
		int row, col, dist;
		String path;
		public Coord(int row, int col, int dist, String oldPath) {
			this.row = row;
			this.col = col;
			this.dist = dist;
			if("".equals(oldPath)) {
				this.path = "(" + row + "," + col + ")";
			}else {
				this.path = oldPath + " -> " + "(" + row + ", " + col + ")";
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("B_2178.txt"));
		Scanner scanner = new Scanner(System.in);
		
		int testCnt = scanner.nextInt();
		
		for(int i = 1; i <= testCnt; i++) {
			rows = scanner.nextInt();
			cols = scanner.nextInt();
			
			map = new int[rows][cols];
			
			for(int j = 0; j < rows; j++)
				for(int k = 0; k < cols; k++)
					map[j][k] = scanner.nextInt();
			
			int dap = 0;
			path = "";
			dap = Observer();
			System.out.println("#" + i + " " + dap + " " + path);
			
			map = null;
		}
	}
}
