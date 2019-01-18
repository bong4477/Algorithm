package Programmers;

import java.util.HashMap;

public class Spy {
	public static int solution(String[][] clothes) {
		/*
		int answer = clothes.length;
		HashMap<String, String> map = new HashMap<>();
		for(int i = 0; i < clothes.length; i++) 
			map.put(clothes[i][0], clothes[i][1]);
		
		for(int i = 0; i < clothes.length; i++)
			for(int j = i + 1; j < clothes.length; j++) {
				if(map.get(clothes[i][0]).equals(map.get(clothes[j][0]))) continue;
				else answer++;
			}
		�� �ڵ尡 ���� Ǭ �ڵ�... ���� ������ �� ������ �������� ��ȿ�� �ڵ���. �� ���� �̻���ʹ� ������ �ʴ� �ڵ�.
			*/
		//���ͳݿ��� ��� �ڵ�
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		//���� �������� ���� ���� ������ ��� +1�� ����. 
		//(����1 +1) , (����2 +1), ... (����n +1) �̷�������
		//�� �̷��� ���ִ��� ���� ���ظ� ������.
        for (int i = 0; i < clothes.length; i++) {
            if (hm.containsKey(clothes[i][1]))
                hm.replace(clothes[i][1], hm.get(clothes[i][1])+1);
            else
                hm.put(clothes[i][1], 1);
        }
 
        int answer = 1;
        //�׷����� �������� ���� �� �ִ� ����� ���� ������.
        for (int value : hm.values()) {
            answer*=(value+1);
        }
        //�������� �ƹ��͵� ���Դ� ��찡 �����Ƿ� �װ� ����.
        answer-=1;
 
        return answer;
	
	}

	public static void main(String[] args) {
		String[][] a = {{"crow_mask", "face"}, {"blue_sunglasses", "face"},
				{"green_turban", "face"}};
		
		System.out.println(solution(a));

	}

}
