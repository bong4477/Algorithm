package Programmers;

public class Integer_Triangle {
	public static int answer = 0;
	public static int[][] arr;
	
	public static int solution(int[][] triangle) {
		/*
		  arr = triangle;
		 
		
		for(int j = 0; j < triangle[triangle.length -1].length; j++) {
			int sum = 0;
			answer = Math.max(answer, Sum(triangle.length -1, j, sum));
		}
		*/
		int[][] list = triangle;
		
		for(int i = 1; i < triangle.length; i++)
			for(int j = 0; j < triangle[i].length; j++) {
				if(j == 0) list[i][j] = list[i-1][j] + list[i][j];
				else if(i == j) list[i][j] = list[i-1][j-1] + list[i][j];
				else list[i][j] = Math.max(list[i-1][j-1], list[i-1][j]) + list[i][j];
				
				if(answer < list[i][j])
					answer = list[i][j];
					
			}
		
		return answer;
	}
	
	/*
	public static int Sum(int i, int j, int sum) {
		sum += arr[i][j];
		
		if(i-1 >= 0) {
			if(j == 0) return Sum(i-1, j, sum);
			else if(j == i) return Sum(i-1, j-1, sum);
			else {
				if(arr[i-1][j-1] >= arr[i-1][j])
					return Sum(i-1, j-1, sum);
				else 
					return Sum(i-1, j, sum);
			}
		}else
			return sum;
	}
	
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		//[[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
		solution(arr);
		System.out.println(answer);
	}
	
	/* 
	 주석 친 부분이 내 풀이...
	 밑에서 부터 비교하면서 가는 내 풀이와는 달이 참고한 풀이는 위에서부터 비교하면서 내려오는 풀이임.
	 난 시간초과로 실패가 떴지만 새로 수정한 풀이는 정답으로 인정됌. 
	 
	 */

}
