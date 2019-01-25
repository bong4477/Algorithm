package Algorithm;

import java.util.Scanner;

public class N_Queen {
	
	static int col[];
	static int n;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			//ù���� ���� �������� ���� ���� . (i = 1) => (1, 1), (i = 2) => (1, 2), (i = 3) => (1, 3)
			col = new int[16];
			col[1] = i;
			
			//1. DFS ���� (���� ���� 2�� �̵�)
			DFS(2);
		}
		
		//�������
		System.out.println(ans);

	}
	
	static void DFS(int row) {
		//���� ���� ü������ �Ѿ� ������
		if(row > n) {
			++ans;
		}else {
			for(int i = 1; i <= n; i++) {
				//���� ��ġ�ϰ� �ִ� ����� ��ǥ�� ����(row : ��, i : ��)
				col[row] = i;
				
				//2. ������ ��� ����
				if(isPossible(row)) {
					//3. ���� Ʈ�� �̵� (�ش� ����� ���� ���)
					DFS(row + 1);
				}else {
					//4. ��Ʈ��ŷ ����, �ش� ���� ����ġ��
					col[row] = 0;
				}
			}
		}
	}
	
	static boolean isPossible(int c) {
		//���� ������ Ž���ϸ鼭 ������ ������� Ȯ��
		for(int i = 1; i < c; i++) {
			//���� ��忡�� ���� �࿡ ���� �ִ��� ����
			if(col[i] == col[c]) {
				return false;
			}
			//�밢�� �˻�, ���� ����� ���� ������ ����� ���� ���� ���� �Ÿ��� ������ �˻�
			if(Math.abs(col[i]- col[c]) == Math.abs(i - c)) {
				return false;
			}
		}
		return true;
	}

}
