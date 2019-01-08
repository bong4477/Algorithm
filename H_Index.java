package Solution;

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
		 [0, 1, 2, 3, 4, 5, 6, 7, 8] <-- a를 오름차순으로 정렬 각각의 값은 각 논문의 
		 인용 횟수를 나타냄 
		 [9, 8, 7, 6, 5, 4, 3, 2, 1] <-- h번 이상 인용된 논문의 수
		 
		 인용 횟수와 h번 이상 인용된 논문의 수를 비교하여 인용횟수가 작다면 h = 인용횟수
		 크다면 h는 변화없음.
		 0, 1, 2, 3, 4 까지는 인용횟수가 더 작기 때문에 h가 0, 1, 2, 3, 4 이렇게 변화됌.
		 5, 6, 7, 8은 인용횟수가 더 크기 때문에 h가 변화가 없음.
		 따라서 최종 h는 4.
		 */
		System.out.println(solution(a));

	}
}
