package Solution;

import java.util.HashMap;

public class Maraton {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < completion.length; i++) 
			map.put(completion[i], map.getOrDefault(completion[i], 0)+1);
		
		for(int i = 0; i < participant.length; i++) 
			map.put(participant[i], map.get(participant[i])-1);
			
		for(String key : map.keySet()) {
			if(map.get(key) != 0)
				answer += key;
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		String[] a = {"leo", "kiki", "eden", "leo"};
		String[] b = {"kiki" , "leo", "eden"};
		
		System.out.println(solution(a, b));
	}

}

/* 
처음부터 해시를 이용하여 문제를 푸려고 함. 근데 문제는 해시 특성상 중복된 키가 있으면 키를 덮어쓰기 때문에 
그 부분에서 문제가 생김. 그래서 완주자 배열을 기준으로 키를 완주자들의 이름으로 설정. Value를 1로 초기화 한 후.
참가자 배열을 기준으로 해서 참가자의 이름과 완주자의 이름과 일치하면 해당하는 Value값을 1 감소시킴.
그렇게 해서 0이 아닌 Value를 가지는 key 값을 반환하게 만듬
다른 사람의 풀이를 보니 해시를 안쓰고 sort해서 푸는 사람도 상당히 많았음.
*/
