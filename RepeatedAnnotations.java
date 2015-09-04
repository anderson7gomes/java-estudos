import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static java.lang.System.out;

class RepeatedAnnotations {

	@MyAnno2("Gomes Anderson")
	@MyAnno2("Anderson Gomes")
	public int number;

	public static void main(String[] args) {

		Class<?> c = RepeatedAnnotations.class;

		try {

			Method m = c.getMethod("foo", String.class);

			Annotation a = m.getAnnotation(RepeatedAnnos.class);

			out.println(a);

			MyAnno[] annos = m.getAnnotationsByType(MyAnno.class);

			for (int i = 0; i < annos.length; i++) {
				out.println(annos[i]);
			}

			Field f = c.getField("number");

			out.println(f.getName());

			MyAnno2[] annos2 = f.getAnnotationsByType(MyAnno2.class);

			for (MyAnno2 ann : annos2) {
				out.println(ann);
			}

		} catch (NoSuchMethodException | NoSuchFieldException e) {
			System.err.println(e);
		}

	} // end main method

	@MyAnno(character = 'a', name = "A")
	@MyAnno(character = 'b', name = "B")
	public static void foo(String message) {

		out.println(message);

	} // end foo method

} // end RepeatedAnnotations class

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatedAnnos.class)
@interface MyAnno {

	char character();
	String name();

} // end MyAnno annotation

@Retention(RetentionPolicy.RUNTIME)
@interface RepeatedAnnos {

	MyAnno[] value();

} // end RepeatedAnnos annotation

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatedAnnos2.class)
@interface MyAnno2 {

	String value();

} // end MyAnno2 annotation

@Retention(RetentionPolicy.RUNTIME)
@interface RepeatedAnnos2 {

	MyAnno2[] value();

} // end RepeatedAnnos2 annotation