package Programmers;

import java.util.Arrays;

public class H_Index {
	public static int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);
		for(int i = 0; i < citations.length; i++) {
			int small = Math.min(citations[i], citations.length - i);
			answer = Math.max(answer, small);
		}
        return answer;
    }

	public static void main(String[] args) {
		int[] a = {3, 0, 6, 1, 5, 7, 2, 4, 8};
		/*
		 [0, 1, 2, 3, 4, 5, 6, 7, 8] <-- a�� ������������ ����
		 [9, 8, 7, 6, 5, 4, 3, 2, 1] <-- h�� �̻� �ο�� ������ ��
		 
		 */
		
		
		
		
		System.out.println(solution(a));

	}
}