package Solution;

public class PhoneBook {
	public static boolean solution(String[] phone_book) {
		int min_length = phone_book[0].length();
		String min_string = phone_book[0];
		int index = 0;
		boolean answer = true;
		//Phone_book �迭���� ���� ���� ��Ʈ���� ��Ʈ�� ���� ���� min_string�� min_length�� ����.
		//index�� ���� ���� ��Ʈ���� �߰� ������ �迭���� ���° ��ġ�� ��Ÿ�������� ����.
		for(int i = 1; i < phone_book.length; i++) {
			if(min_length > phone_book[i].length()) {
				min_string = phone_book[i];
				min_length = phone_book[i].length();
				index = i;
			}
		}
		
		for(int i = 0; i < phone_book.length; i++) {
			//i == index ��, �ڱ� �ڽ��� ������ �ǳʶ�
			if(i == index) continue;
			String str = phone_book[i];
			int str_index = phone_book[i].indexOf(min_string);  //�ش� ��Ʈ���� ��� ��ġ�ϴ��� �ľ��ϴ� ����.
			//str�� min_string�� �����ϰ� �� ��ġ�� 0, �� ó������ �����ϴ����� �ľ�.
			
			//�ٵ� ���ͳ� ã�ƺ��ϱ� �̷� �ʿ���� str.stratsWith(min_string)�� �� �� �־���.
			//stratsWith() �� ���ڿ��� �־��� ����ǥ���� ������ �����ϴ��� Ȯ���ϴ� �޼ҵ���.
			if(str.contains(min_string) && str_index == 0) answer = false;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String[] a = {"97674223", "119", "5521194421"};
		
		System.out.println(solution(a));
		
	}
}
