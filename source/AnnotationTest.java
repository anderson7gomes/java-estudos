import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.List;

@OtherAnno("Wiggin")
@MyAnno(str = "Gomes", val = 4)
class AnnotationTest {

	public static void main(String[] args) {

		Class<?> c = AnnotationTest.class;

		try {

			Method m = c.getMethod("doStuff", List.class);

			Annotation[] mAnnotations = m.getAnnotations();

			System.out.println("doStuff method annotations:\n");

			for (Annotation a : mAnnotations) {
				System.out.println(a);
			}		

			Annotation[] c1Annotations = c.getAnnotations();

			System.out.println("\nAnnotationTest class annotations:\n");

			for (Annotation a : c1Annotations) {
				System.out.println(a);
			}

			Annotation[] c2Annotations = MyClass.class.getDeclaredAnnotations();

			System.out.println("\nMyClass class declared annotations:\n");

			for (Annotation a : c2Annotations) {
				System.out.println(a);
			}

			System.out.printf("doStuff method has MyMarker annotation? %s\n", 
					m.isAnnotationPresent(MyMarker.class) ? "Yes" : "No");

		} catch (NoSuchMethodException e) {
			System.err.println("Method not found");
		}

	} // end main method

	@OtherAnno("Ender")
	@MyAnno(str = "Anderson")
	@MyMarker
	public static void doStuff(List<String> list) {

		System.out.println("Inside doStuff()");

	} // end doStuff method

} // end AnnotationTest class

@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
@interface MyAnno {

	String str() default "Default String";
	int val() default -999;

} // end MyAnno annotation

@Retention(RetentionPolicy.RUNTIME)
@interface OtherAnno {

	String value();

} // end OtherAnno annotation

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {} // end MyMarker marker annotation

class MyClass extends AnnotationTest {} // end MyClass class