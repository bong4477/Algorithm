package Solution;

public class PhoneBook {
	public static boolean solution(String[] phone_book) {
		int min_length = phone_book[0].length();
		String min_string = phone_book[0];
		int index = 0;
		boolean answer = true;
		//Phone_book 배열에서 가장 적은 스트링과 스트링 수를 각각 min_string과 min_length에 저장.
		//index는 가장 적은 스트링을 발견 했을때 배열에서 몇번째 위치를 나타내는지를 저장.
		for(int i = 1; i < phone_book.length; i++) {
			if(min_length > phone_book[i].length()) {
				min_string = phone_book[i];
				min_length = phone_book[i].length();
				index = i;
			}
		}
		
		for(int i = 0; i < phone_book.length; i++) {
			//i == index 즉, 자기 자신이 나오면 건너띔
			if(i == index) continue;
			String str = phone_book[i];
			int str_index = phone_book[i].indexOf(min_string);  //해당 스트링이 어디에 위치하는지 파악하는 변수.
			//str이 min_string을 포함하고 그 위치가 0, 즉 처음부터 시작하는지를 파악.
			
			//근데 인터넷 찾아보니까 이럴 필요없이 str.stratsWith(min_string)를 쓸 수 있었음.
			//stratsWith() 가 문자열이 주어진 접두표현을 가지고 시작하는지 확인하는 메소드임.
			if(str.contains(min_string) && str_index == 0) answer = false;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String[] a = {"97674223", "119", "5521194421"};
		
		System.out.println(solution(a));
		
	}
}
