package chapter1;

import java.util.Scanner;

public class ControllWhile {

	public static void main(String[] args) {
		
		// while 문 : 반복할 횟수가 정해져있지 않을 때 사용하는 반복문
		// 조건이 true인 동안 반복, 조건이 false가 되면 반복 종료
		// while (조건) { 조건이 true일때 반복할 코드 블록 }
		
		int count = 1;
		
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		
		// 사용자가 입력한 정수를 출력
		// 사용자가 -1을 입력하면 출력후 반복을 종료
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		
		while (inputNumber != -1) {
			System.out.print("정수 : ");
			inputNumber = scanner.nextInt();
			System.out.println(inputNumber);
		}
		
		System.out.println("종료!");
		scanner.close();

	}

}