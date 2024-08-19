package chapter1.practice;

import java.util.Scanner;

public class Practice4 {

//	안녕하세요 John 입니다.
//	안녕하세요 JOHN 입니다.

	public static void main(String[] args) {
		// 모두 대문자로 만들기
		// 사용자로부터 문자열 statement를 입력받고
		// 입력 받은 문자열을 영어라면 모두 대문자로 변경하여
		// 문자배열에 저장한 후 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 : ");
		String statement = scanner.nextLine();
		scanner.close();
		
		char[] statementChars = statement.toCharArray();
		for (int index = 0; index < statementChars.length; index++) {
			char charater = statementChars[index];
			boolean lowerEnglish = charater >= 97 && charater <= 122;
			if (!lowerEnglish) continue;
			
			statementChars[index] = (char)(charater - 32);
		}
		
		System.out.println(statementChars);
	}

}



