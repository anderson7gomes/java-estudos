import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ClassTest {
	
	public static void main(String[] args) {

		Class<?> strClass = String.class;

		System.out.println(strClass);
		System.out.println(strClass.getName());
		System.out.println(strClass.getSimpleName());

		try {

			Class<?> objClass = Class.forName("java.lang.Object");
			System.out.println(objClass.getSimpleName());

		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}

		Annotation[] annotations = strClass.getAnnotations();

		for (Class<?> c : MyClass.class.getClasses()) {
			System.out.println(c.getName());
		}

		Constructor<?>[] constructors = strClass.getConstructors();

		for (Constructor<?> c : constructors) {
			System.out.println(c);
		}

		try {
			System.out.println(String.class.getConstructor(StringBuilder.class));
		} catch (NoSuchMethodException e) {
			System.err.println(e);
		}

		MyEnum[] constants = MyEnum.class.getEnumConstants();

		for (MyEnum c : constants) {
			System.out.println(c);
		}

		try {

			Field field = MyClass.class.getField("name");
			System.out.println(field);

		} catch (NoSuchFieldException e) {
			System.err.println(e);
		}

		try {

			Class<?> c = Class.forName("MyClass");
			Method method = c.getMethod("doStuff", String.class, int.class);

			System.out.println(method.getName());

			System.out.printf("%s is %slocal class\n", c.getSimpleName(), 
					(c.isLocalClass()) ? "" : "not ");

		} catch (ClassNotFoundException | NoSuchMethodException e) {
			System.err.println(e);
		}

		Class<?> enumClass = MyEnum.GOMES.getClass();

		System.out.printf("%s is %sa enum\n", enumClass.getSimpleName(),
				(enumClass.isEnum()) ? "" : " not");

		try {

			Method myMethod = MyClass.class.getMethod("doStuff", int.class);

			System.out.println(myMethod.getDeclaringClass().getSimpleName());

		} catch (NoSuchMethodException e) {
			System.err.println(e);
		}

	} // end main method

} // end ClassTest class

class MyClass {

	public String name = "Anderson";

	public class InnerClass {}
 
	public void doStuff(String name, int num) {}

	public void doStuff(int num) {}

} // end MyClass class

enum MyEnum {

	ANDERSON, GOMES, ANDRADE

} // end MyEnum enum