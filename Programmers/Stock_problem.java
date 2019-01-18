package Programmers;

import java.util.Arrays;

public class Stock_problem {
	public static int[] Solution(int[] prices) {
		int[] answer = new int[prices.length];
		
		for(int i = 0; i < prices.length; i++) {
			int time = 0;
			for(int j = i; j < prices.length; j++) {
				if((j+1) == prices.length) break;
				
				else if(prices[i] > prices[j]) {
					break;
					
				}else {
					time++;
				}
			}
			answer[i] = time;
		}
		return answer;
	}
	

	public static void main(String[] args) {
		
		int[] a= {498, 470, 480, 478};
		System.out.println(Arrays.toString(Solution(a)));

	}

}
