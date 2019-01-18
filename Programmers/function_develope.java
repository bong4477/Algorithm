package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class function_develope {
	public static int[] Solution(int[] progresses, int[] speeds) {
		List<Integer> ans = new ArrayList<>();
		int[] day = new int[progresses.length];
		
		for(int i = 0; i < progresses.length; i++) {
			if((100-progresses[i]) % speeds[i] == 0) {
				day[i] = (100 - progresses[i]) / speeds[i];
			}else
				day[i] = ((100 - progresses[i]) / speeds[i]) + 1;
		}
		
		int j;
		for(int i = 0; i < day.length; i = j) {
			int num = 0;
			for(j = i; j < day.length; j++) {
				if(day[i] >= day[j]) {
					num++;
				}else break;
			}
			ans.add(num);
		}
 		
		int[] answer = new int[ans.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = ans.get(i);
		}
		
        return answer;
	}
	//[93, 30, 55] [1, 30, 5] [2, 1]
	//[7, 3, 9]
	
	public static void main(String[] args) {
		int[] a = {93, 30, 55};
		int[] b = {1, 30, 5};
		
		System.out.println(Arrays.toString(Solution(a, b)));

	}

}
