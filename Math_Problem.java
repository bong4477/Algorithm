package Solution;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Math_Problem {
	public static int[] Solution(int [] answers) {
		int[][] supoja = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5},
				{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
		
		int count[] = {0,0,0}; //���� ����
		
		for(int i = 0; i < supoja.length; i++) {
			int k = 0;
			int j = 0;
			while(j != answers.length) {
				//[1, 2, 3, 4, 5]
				if(supoja[i][k++] == answers[j++]) count[i]++; 
				if(k == supoja[i].length) k = 0;
			}
		}
		//�������� �迭���� ���� ���� ���� ����� ������ answer�迭�� �����ؼ� �ֱ�
		//���� ���� ���� ����� �������̸� ������������ �迭�� ����.
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
