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
		이 코드가 내가 푼 코드... 옷의 종류가 두 종류만 있을때만 유효한 코드임. 세 종류 이상부터는 먹히질 않는 코드.
			*/
		//인터넷에서 배운 코드
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		//옷의 종류마다 가진 옷의 개수를 세어서 +1를 해줌. 
		//(종류1 +1) , (종류2 +1), ... (종류n +1) 이런식으로
		//왜 이렇게 해주는지 아직 이해를 못했음.
        for (int i = 0; i < clothes.length; i++) {
            if (hm.containsKey(clothes[i][1]))
                hm.replace(clothes[i][1], hm.get(clothes[i][1])+1);
            else
                hm.put(clothes[i][1], 1);
        }
 
        int answer = 1;
        //그런다음 종류마다 나올 수 있는 경우의 수를 곱해줌.
        for (int value : hm.values()) {
            answer*=(value+1);
        }
        //마지막에 아무것도 안입는 경우가 있으므로 그걸 뺴줌.
        answer-=1;
 
        return answer;
	
	}

	public static void main(String[] args) {
		String[][] a = {{"crow_mask", "face"}, {"blue_sunglasses", "face"},
				{"green_turban", "face"}};
		
		System.out.println(solution(a));

	}

}
