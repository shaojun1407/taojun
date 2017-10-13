package com.ddb.javacore.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface HelloWorld {
	public String value() default "HelloWorld!"; // 声明一个参数属性，有默认值;

}
