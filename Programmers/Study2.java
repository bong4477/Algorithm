package Programmers;

import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class Study2 {
	public static String[] solution(String[] record) {
		HashMap<String, String> map = new HashMap<>();
		for(int i = 0; i < record.length; i++) {
			String[] str = record[i].split(" ");
			if(str[0].equals("Enter")) {
				map.put(str[1], str[2]);
			}else if(str[0].equals("Change")) {
				map.put(str[1], str[2]);
			}else continue;
		}
		
		ArrayList<String> ls = new ArrayList<>();
		for(int i = 0; i < record.length; i++) {
			String[] str = record[i].split(" ");
			if(str[0].equals("Enter")) {
				ls.add(map.get(str[1]) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
			}else if(str[0].equals("Leave")) {
				ls.add(map.get(str[1]) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.");
			}else continue;
		}
		String[] answer = ls.toArray(new String[ls.size()]);
		
		return answer;
	}

	public static void main(String[] args) {
		String[] r = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		System.out.println(Arrays.toString(solution(r)));
	}

}
