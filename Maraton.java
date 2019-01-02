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
