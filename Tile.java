package Solution;

public class Tile {
	
	static long[] cache = new long[80];
	
	public static long solution(int N) {
		long answer = 0;
		//BaseCase
		if(N == 1) return 4;
		if(N == 2) return 6;
		//캐시 메모리 확인.
		if(cache[N] != 0) return cache[N];
			cache[N] = solution(N-1) + solution(N-2);
			answer = cache[N];
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(6));

	}

}
