package chapter2;

// 생성자 : 클래스의 인스턴스가 생성되는 순간에 호출되는 메서드
// 클래스와 같은 이름을 가지고 있음, 반환타입이 존재하지 않음
// 클래스명(매개변수, ...) { 인스턴스가 생성될때 수행할 작업 }
class Human1 {
	String name;
	int age;
	String gender;
	
	// final로 선언된 인스턴스 변수는 생성자에서 반드시 초기화 해야함
	// 즉, 필수 값
	final String address;
	
	// 만약 다른 생성자 (매개변수가 있는 생성자)만 존재한다면 
	// 기본 생성자는 자동으로 생성되지 않음
	Human1() {
		// 1. 인스턴스를 생성할 때 특정 작업을 수행하고 싶을 때
		System.out.println("Human1의 인스턴스가 생성되었습니다!");
		
		// 2. *인스턴스를 생성과 동시에 인스턴스 변수를 초기화하고 싶을 때
		// 의존성을 내부에서 주입하는 행위
		name = "홍길동";
		age = 20;
		gender = "남";
		address = "부산";
	}
	
	Human1(String name1) {
		name = name1;
		age = 20;
		gender = "남";
		address = "부산";
	}
	
	Human1(String name, int age, String gender) {
		// 의존성을 외부에서 주입하는 행위
		
		// this : 현재 자기 자신의 인스턴스를 지칭하는 키워드
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		this.address = "부산";
	}
	
	// 생성자를 이용한 인스턴스 복사
	Human1(Human1 human1) {
		name = human1.name;
		age = human1.age;
		gender = human1.gender;
		address = human1.address;
	}
	
	void great() {
		// name에 의존하고 있는 형태
		System.out.println(name.concat("이 인사를 합니다."));
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		Human1 human1 = new Human1();
		human1.great();
		
		Human1 human2 = new Human1();
		System.out.println(human2.name);
		
		Human1 human3 = new Human1("이영희", 30, "남");
		System.out.println(human3.name);
		
		Human1 human4 = new Human1();
		
		// 얕은 복사 : 변수에 기억된 주소를 복사하는 행위
		Human1 human5 = human3;
		// 깊은 복사 : 인스턴스의 각 속성 값을 직접 복사하는 행위
		Human1 human6 = new Human1(human3);
//		human6.name = human3.name;
//		human6.age = human3.age;
//		human6.gender = human3.gender;
//		human6.address = human3.address;
		
		human3.name = "이성계";
		
		System.out.println(human3.name);
		System.out.println(human5.name);
		System.out.println(human6.name);
		
	}

}





