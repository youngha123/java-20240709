package chapter2;

// 오버로딩 : 같은 클래스 내부에서 같은 이름의 메서드를 여러개 작성할 수 있도록 하는 방법
// 오버로딩의 조건
// - 1. 메서드 이름을 중복해서 작성하고 매개변수의 조합(개수, 타입의 순서...)를 다르게 작성
// - 2. 메서드의 반환타입과 매개변수의 이름은 영향을 주지 않음
class MyMath {
	
	// 기준
	int add(int a, int b) {
		return a + b;
	}
	
	// 1. 매개변수의 타입이 다를 때
	double add(double a, double b) {
		return a + b;
	}
	
	// 2. 매개변수의 개수가 다를 때
	int add(int a) {
		return a + 5;
	}
	
	// 3. 매개변수의 타입의 조합이 다를 때
	double add(int a, double b) {
		return a + b;
	}
	double add(double a, int b) {
		return a + b;
	}
	
	// 반환 타입만 다를 땐 불가능
//	double add(int a, int b) {
//		return a + b;
//	}
	
	// 매개변수의 이름만 다를 땐 불가능
//	int add(int x, int y) {
//		return x + y;
//	}
	
}

public class Overloading {

	public static void main(String[] args) {
		
		MyMath math = new MyMath();
		System.out.println(math.add(4.5, 5));
		
		int result = math.add(4, 5);
		double result2 = math.add(3.5, 2.5);
		
	}

}



