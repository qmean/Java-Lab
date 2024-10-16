package Reflection;

import java.lang.annotation.Annotation;

public class GetAnnotation {

	public static void main(String[] args) {
		Class<TestClass> testClass = TestClass.class;
		Class<TestChildClass> testChildClass = TestChildClass.class;

		/**
		 * Class 객체에서 어노테이션을 가져오는 방법
		 * 1. getAnnotation() 메소드를 사용한다. (상속된 어노테이션도 가져옴)
		 * 2. getAnnotations() 메소드를 사용한다. (상속된 어노테이션도 가져옴)
		 * 3. getDeclaredAnnotation() 메소드를 사용한다. (해당 클래스에 선언된 어노테이션만 가져옴)
		 * 4. getDeclaredAnnotations() 메소드를 사용한다. (해당 클래스에 선언된 어노테이션만 가져옴)
		 */

		// getAnnotation 메서드 사용하여 클래스에 정의된 어노테이션 획득
		System.out.println("\n\ngetAnnotation 메서드 사용하여 클래스에 정의된 어노테이션 획득");
		TestAnnotation testAnnotation = testClass.getAnnotation(TestAnnotation.class);
		System.out.println("testAnnotation: " + testAnnotation);

		// getAnnotation 메서드 사용하여 상속된 어노테이션 획득
		System.out.println("\n\ngetAnnotation 메서드 사용하여 상속된 어노테이션 획득");
		InheritedAnnotation inheritedAnnotation2 = testChildClass.getAnnotation(InheritedAnnotation.class);
		System.out.println("inheritedAnnotation: " + inheritedAnnotation2);

		// getAnnotations 메서드 사용하여 클래스에 정의된 어노테이션 획득
		System.out.println("\n\ngetAnnotations 메서드 사용하여 클래스에 정의된 어노테이션 획득");
		Annotation[] annotations = testClass.getAnnotations();
		System.out.println("Annotations in TestClass:");
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		Annotation[] annotations1 = testChildClass.getAnnotations();
		System.out.println("Annotations in TestChildClass:");
		for (Annotation annotation : annotations1) {
			System.out.println(annotation);
		}

		// getDeclaredAnnotation 메서드 사용하여 클래스에 정의된 어노테이션 획득
		System.out.println("\n\ngetDeclaredAnnotation 메서드 사용하여 클래스에 정의된 어노테이션 획득");
		TestAnnotation testDeclaredAnnotation = testClass.getDeclaredAnnotation(TestAnnotation.class);
		System.out.println("testDeclaredAnnotation: " + testDeclaredAnnotation);

		// getDeclaredAnnotations 메서드 사용하여 상속된 어노테이션 획득
		System.out.println("\n\ngetDeclaredAnnotations 메서드 사용하여 클래스에 정의된 어노테이션 획득");
		InheritedAnnotation inheritedAnnotation = testClass.getDeclaredAnnotation(InheritedAnnotation.class);
		System.out.println("inheritedAnnotation: " + inheritedAnnotation);

		// getDeclaredAnnotations 메서드 사용하여 클래스에 정의된 어노테이션 획득
		System.out.println("\n\ngetDeclaredAnnotations 메서드 사용하여 클래스에 정의된 어노테이션 획득");
		Annotation[] declaredAnnotations = testClass.getDeclaredAnnotations();
		System.out.println("Declared Annotations in TestClass:");
		for (Annotation annotation : declaredAnnotations) {
			System.out.println(annotation);
		}
		System.out.println("Declared Annotations in TestChildClass:");
		Annotation[] declaredAnnotations1 = testChildClass.getDeclaredAnnotations();
		for (Annotation annotation : declaredAnnotations1) {
			System.out.println(annotation);
		}
	}
}
