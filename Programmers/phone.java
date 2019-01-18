package Programmers;

public class phone {
	public static String solution(String phone_number) {
		String answer = "";
		String asterisk = phone_number.substring(0, phone_number.length()-4);
		String four = phone_number.substring(phone_number.length()-4, phone_number.length());
		answer = asterisk.replaceAll("[0123456789]", "*") + four;
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
