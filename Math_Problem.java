package Solution;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Math_Problem {
	public static int[] Solution(int [] answers) {
		int[][] supoja = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5},
				{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
		
		int count[] = {0,0,0}; //맞힌 개수
		
		for(int i = 0; i < supoja.length; i++) {
			int k = 0;
			int j = 0;
			while(j != answers.length) {
				//[1, 2, 3, 4, 5]
				if(supoja[i][k++] == answers[j++]) count[i]++; 
				if(k == supoja[i].length) k = 0;
			}
		}
		//맞힌개수 배열에서 가장 많이 맞춘 사람이 누군지 answer배열에 저장해서 넣기
		//가장 많이 맞춘 사람이 여러명이면 오름차순으로 배열에 저장.
		List<Integer> ans = new ArrayList<>();
		int max = Math.max(count[0], Math.max(count[1], count[2]));
		
		if(max == count[0]) ans.add(1);
		if(max == count[1]) ans.add(2);
		if(max == count[2]) ans.add(3);
		
		int[] answer = new int[ans.size()];
		for(int i = 0 ; i < answer.length; i++) answer[i] = ans.get(i);
		
		return answer;
	}
	

	public static void main(String[] args) {
		int[] a = {2, 1, 2, 3, 2, 4, 2, 5};
		
		System.out.println(Arrays.toString(Solution(a)));
	}

}
