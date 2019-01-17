package Solution;

public class Target_Number {
	
	 static int ANSWER = 0;
	 public static int solution(int[] numbers, int target) {
	        dfs(target,numbers,0);
	        return ANSWER;
	    }
	 public static void dfs(int target, int [] numbers, int k){
	        if(k == numbers.length){
	            int sum=0;
	            for(int i=0;i<numbers.length;i++){
	                sum += numbers[i];
	                System.out.print(numbers[i]+ " ");
	                
	            }
	            System.out.println(" sum : " +sum);
	            if(sum == target)
	                ANSWER++;
	            return;
	        }
	        else{
	            numbers[k]*=1;
	            dfs(target,numbers,k+1);

	            numbers[k]*=-1;
	            dfs(target,numbers,k+1);
	        }
	    }

	public static void main(String[] args) {
		int [] a = {1,1,1,1,1};
		System.out.println(solution(a, 3));
		
		/*
		 * 디버깅 결과들을 출력해보면 dfs(5)일 때만 sum을 함.
			1 1 1 1 1  sum : 5
			1 1 1 1 -1  sum : 3
			1 1 1 -1 -1  sum : 1
			1 1 1 -1 1  sum : 3
			1 1 -1 -1 1  sum : 1
			1 1 -1 -1 -1  sum : -1
			1 1 -1 1 -1  sum : 1
			1 1 -1 1 1  sum : 3
			1 -1 -1 1 1  sum : 1
			1 -1 -1 1 -1  sum : -1
			1 -1 -1 -1 -1  sum : -3
			1 -1 -1 -1 1  sum : -1
			1 -1 1 -1 1  sum : 1
			1 -1 1 -1 -1  sum : -1
			1 -1 1 1 -1  sum : 1
			1 -1 1 1 1  sum : 3
			-1 -1 1 1 1  sum : 1
			-1 -1 1 1 -1  sum : -1
			-1 -1 1 -1 -1  sum : -3
			-1 -1 1 -1 1  sum : -1
			-1 -1 -1 -1 1  sum : -3
			-1 -1 -1 -1 -1  sum : -5
			-1 -1 -1 1 -1  sum : -3
			-1 -1 -1 1 1  sum : -1
			-1 1 -1 1 1  sum : 1
			-1 1 -1 1 -1  sum : -1
			-1 1 -1 -1 -1  sum : -3
			-1 1 -1 -1 1  sum : -1
			-1 1 1 -1 1  sum : 1
			-1 1 1 -1 -1  sum : -1
			-1 1 1 1 -1  sum : 1
			-1 1 1 1 1  sum : 3
		 */
		

	}

}
