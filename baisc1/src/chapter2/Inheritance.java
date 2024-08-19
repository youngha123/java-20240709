package chapter2;

import java.util.Arrays;

// 상속 : 객체지향 프로그래밍 특성 중 하나
// 원래 존재하던 클래스를 '확장'하여 재사용할 수 있도록 하는 것
// 코드 중복을 제거하고 확장성을 높일 수 있음
// extends 키워드를 사용하여 확장

// class SubClass extends SuperClass { ... }

// final로 선언된 클래스는 상속하여 확장할 수 없음
/*final*/ class Human {
	String name;
	int age;
	
	Human (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Human (String name) {
		this.name = name;
		this.age = 10;
	}
	
	/*final*/ void sayHello() {
		System.out.println(name + "가 인사를 합니다.");
	}
}

class Korean1 {
	String address;
	
	void sayHello() {
		System.out.println("안녕하세요.");
	}
}

// Java에서는 단일 상속만 지원함
// 다중 상속에서 발생할 수 있는 다이아몬드 문제가 발생하지 않도록 하기 위함
// 다중 상속과 동일한 효과를 보기위해서 인터페이스 혹은 중첩 상속을 수행함
class Developer extends Human /*, Korean1*/ {
	String[] skills;
	
	Developer(String name, int age, String[] skills) {
		// super : 부모 클래스를 지칭하는 키워드
		// super()는 부모클래스의 생성자를 지칭
		super(name, age);
		this.skills = skills;
	}
	
	void develop() {
		System.out.println(name + "가 " + Arrays.toString(skills) + "로 개발을 합니다.");
	}
}

class SalesMan extends Human {
	int sales;
	
	SalesMan(String name, int age, int sales) {
		super(name);
		this.sales = sales;
		// 부모 생성자 호출은 반드시 현재 생성자의 첫번째 구문으로 작성해야 함
		// super(name);
	}
	
	// 오버라이딩 : 하위 클래스에서 상위 클래스의 메서드를 '재정의' 하는 것
	// 규칙
	// 1. 상위 클래스에서 선언된 메서드와 메서드 이름, 매개변수의 조합이 같아야함
	// 2. 상위 클래스에서 선언된 메서드가 final로 선언되면 재정의가 불가능
	
	// @Override : 컴파일러에게 현재 작업이 오버라이딩 작업임을 알려줌
	@Override
	// final로 선언된 메서드는 오버라이딩 할 수 없음
	void sayHello() {
		super.sayHello();
		System.out.println(name + "가 자신을 소개합니다.");
	}
	
	// 아래 작업은 오버라이딩이 아니라 오버로딩임
	void sayHello(String company) {
		System.out.println(name + "가 " + company + "에서 자신을 소개합니다.");
	}
	
	void sale() {
		System.out.println(name + "가 " + sales + "만큼의 매출을 했습니다.");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		Developer developer1 = new Developer("홍길동", 20, new String[] {"java", "python"} ) ;
		SalesMan salesMan1 = new SalesMan("이영희", 25, 300000);
		
		System.out.println(developer1.name);
		System.out.println(developer1.age);
		System.out.println(developer1.skills);
		developer1.sayHello();
		developer1.develop();
		
		System.out.println(salesMan1.name);
		System.out.println(salesMan1.age);
		System.out.println(salesMan1.sales);
		salesMan1.sayHello();
		salesMan1.sale();
		
		// 모든 클래스는 'Object'라고하는 클래스를 최상위 클래스로 반드시 상속받고 있음
		salesMan1.equals(""); // Object 클래스에 존재하는 메서드
		
	}

}






