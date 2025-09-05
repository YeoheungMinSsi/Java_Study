package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// note : 어노테이션 적용과 유지정책
@Target({ElementType.METHOD})  // 적용대상 - 메소드
@Retention(RetentionPolicy.RUNTIME)  // 유지정책 - 런타임
public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;
}

