package chapter1.practice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		// 문자열 결합
		// 사용자로부터 기준 문자열, 연결할 문자열을 두 개 입력받음
		// 입력받은 문자열을 문자 배열로 변경하고 두 문자 배열을 연결하여
		// 새로운 문자 배열에 저장 후 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("기준 문자열 : ");
		String firstString = scanner.nextLine();
		
		System.out.print("연결할 문자열 : ");
		String secondString = scanner.nextLine();
		
		char[] firstChars = new char[firstString.length()];
		for (int index = 0; index < firstChars.length; index++) {
			firstChars[index] = firstString.charAt(index);
		}
		
		// char[] secondChars = secondString.toCharArray();
		char[] secondChars = new char[secondString.length()];
		for (int index = 0; index < secondChars.length; index++) {
			secondChars[index] = secondString.charAt(index);
		}
		
		char[] resultChars = new char[firstChars.length + secondChars.length];
		for (int index = 0; index < firstChars.length; index++) {
			resultChars[index] = firstChars[index];
		}
		for (int index = 0; index < secondChars.length; index++) {
			resultChars[firstChars.length + index] = secondChars[index];
		}
		
		System.out.println(resultChars);
		
	}

}




