package Programmers;


public class Study1 {
	public static int solution(int n, int a, int b) {
		int answer = 0;
		while(a != b) {
			a = (a%2==0) ? a/2 : (a/2)+1;
			b = (b%2==0) ? b/2 : (b/2)+1;
			answer++;
		}
		return answer;
	}
	

	public static void main(String[] args) {
		System.out.println(solution(8,2,3));

	}

}
