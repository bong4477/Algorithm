package Programmers;

import java.util.Arrays;

public class Brown_Red {
	public static int[] solution(int brown, int red) {
		int[] answer = new int[2];
		for(int i = 1; i <= red; i++) {
			if(red % i == 0) {
				if(i*2+(red/i)*2+4 == brown) {
					answer[0] = (red/i) + 2;
					answer[1] = i+2;
					break;
				}
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(24, 24)));

	}

}
