package chap06.lecture.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String vlue() default "123"; //value 엘레멘트
	int number() default 3;      //integer 엘레멘트
	String[] names() default {"a", "b"};
}
