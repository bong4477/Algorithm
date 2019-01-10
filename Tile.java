package Solution;

public class Tile {
	
	static long[] cache = new long[80];
	
	public static long solution(int N) {
		long answer = 0;
		//BaseCase
		if(N == 1) return 4;
		if(N == 2) return 6;
		//캐시메모리에 있는지 확인 없으면 메모리에 값을 삽입. 있으면 즉시 값 반환.
		if(cache[N] != 0) return cache[N];
			cache[N] = solution(N-1) + solution(N-2);
			answer = cache[N];
		return answer;
	}
	
	/* 다른사람 풀이... 훨씬 간단히 작성했음..
	
	 public long solution(int N) {
        long[] dp = new long[N];
        dp[0] = 4;
        dp[1] = 6;

        for (int i = 2; i < N; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[N -1];
    }
    	*/

	public static void main(String[] args) {
		System.out.println(solution(6));

	}

}
