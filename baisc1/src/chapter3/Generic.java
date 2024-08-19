package chapter3;

import java.util.ArrayList;
import java.util.List;

// 제너릭 : 클래스나 메서드에서 사용할 데이터 타입을 외부에서 받아오는 기법

// Test1, Test2, Test3 형태로 클래스를 작성하면 코드 중복 발생
class Test1 {
	String subject;
	int score;
}

class Test2 {
	String subject;
	double score;
}

class Test3 {
	String subject;
	char score;
}

// Test4 형태의 클래스로 작성하면 코드의 중복은 해결할 수 있지만
// 사용시 타입의 안전성이 떨어짐
class Test4 {
	String subject;
	Object score;
}

// 제너릭 클래스 : 클래스 내부에 있는 데이터 타입을 컴파일 시에 결정하게 함
// class 클래스명<매개타입> { 매개타입 변수명; ... }
class Test5<T> {
	String subject;
	T score;
}

class SuperClass {}

class MyClass extends SuperClass {}

class SubClass extends MyClass {}

// T extends 클래스명 : 특정 클래스 혹은 특정 클래스를 상속한 클래스만 제너릭 타입으로 받을 수 있도록 제한
class ExtendsClass<T extends MyClass> {
	T variable;
}

public class Generic {
	
	// 제너릭 메서드 : 해당 메서드의 매개변수의 타입이나 반환 타입을 컴파일시에 결정하고자 할 때 사용
	// <매개타입> 반환타입 메서드명 (매개변수) { ... }
	static <T> void method (List<T> arg) {
		System.out.println(arg);
	}
	
	// ? : 제너릭의 와일드 카드로 모든 타입을 받을 수 있도록 함
	// 와일드 카드가 사용되는 제너릭은 메서드의 매개변수 타입이나, 반환타입에 사용됨
	static void wildMethod(List<?> arg) {
		System.out.println(arg);
	}
	
	// ? extends 클래스명 : 특정 클래스 혹은 특정 클래스를 상속받은 클래스만 타입으로 받을 수 있도록 제한
	static void extendsMethod(List<? extends MyClass> arg) {
		System.out.println(arg);
	}
	
	// ? super 클래스명 : 특정 클래스 혹은 특정 클래스의 상위 클래스만 타입으로 받을 수 있도록 제한
	static void superMethod(List<? super MyClass> arg) {
		System.out.println(arg);
	}
	
	public static void main(String[] args) {
		
		Test4 instance1 = new Test4();
		instance1.score = 'A';
		
		int score = (int) instance1.score;
		System.out.println(score);
		
		Test5<Integer> instance2 = new Test5<>();
		instance2.score = 90;
		score = instance2.score;
		
		List<SuperClass> list1 = new ArrayList<>();
		list1.add(new MyClass());
		list1.add(new SubClass());
		list1.add(new SuperClass());
		
		// ExtendsClass<SuperClass> instance3 = new ExtendsClass<>();
		
		List<String> list2 = new ArrayList<>();
		wildMethod(list2);
		
		List<SuperClass> list3 = new ArrayList<>();
		wildMethod(list3);
		
		List<MyClass> list4 = new ArrayList<>();
		List<SubClass> list5 = new ArrayList<>();
		
		// ? extends MyClass 로 제한이 걸렸기 때문에
		// MyClass 혹은 MyClass를 상속한 클래스만 매개변수로 전달이 가능
		extendsMethod(list4);
		extendsMethod(list5);
		// extendsMethod(list3);
		// extendsMethod(list2);
		
		// ? super MyClass 로 제한이 걸렸기 때문에
		// MyClass 혹은 MyClass의 부모 클래스만 매개변수로 전달할 수 있음
		superMethod(list4);
		superMethod(list3);
		// superMethod(list5);
		// superMethod(list2);
		
	}

}






