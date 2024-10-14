package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationDefinition {
	public static void main(String[] args) {
		TestClass testClass = new TestClass();

		Class<? extends TestClass> testClassClass = testClass.getClass();

		TypeAnnotation typeAnnotation = testClassClass.getAnnotation(TypeAnnotation.class);
		System.out.println("typeAnnotation.value = " + typeAnnotation.value());

		try {
			Method testMethod = testClassClass.getMethod("testMethod");
			MethodAnnotation methodAnnotation = testMethod.getAnnotation(MethodAnnotation.class);
			System.out.println("methodAnnotation.value = " + methodAnnotation.value());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			Field field = testClassClass.getField("field");
			FieldAnnotation annotation = field.getAnnotation(FieldAnnotation.class);
			System.out.println("annotation.value = " + annotation.value());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
}

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface TypeAnnotation {
	String value() default "default";
	boolean bool() default true;
	String str() default "str";
	int num() default 1;
	Class<? extends TestClass> clazz() default TestClass.class;

	// TestClass testClass(); -> 컴파일 에러
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@interface FieldAnnotation {
	String value() default "default";
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface MethodAnnotation {
	String value() default "default";
}

@TypeAnnotation("this is class annotation")
class TestClass {

	@FieldAnnotation("this is field annotation")
	public int field;

	@MethodAnnotation("this is method annotation")
	public void testMethod() {
		System.out.println("test");
	}
}
