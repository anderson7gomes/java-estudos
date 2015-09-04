import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

@Documented
@interface MyAnno {

	String value();

} // end MyAnno annotation

@Target( { ElementType.TYPE, ElementType.METHOD, ElementType.PACKAGE } )
@interface OtherAnno {

	int value();
	String id() default "1";

}

class BuiltAnnotations {

	@OtherAnno(75)
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		out.println("Ok");

		Object list = new ArrayList<String>();

		new MyClass().foo();

	} // end main method

} // end BuiltAnnotations class

class MyClass {

	@Deprecated
	void foo() {}

} // end MyClass class