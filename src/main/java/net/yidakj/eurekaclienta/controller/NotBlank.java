package net.yidakj.eurekaclienta.controller;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 非空判断
 *
 * @author fanmf
 */
@Documented
@Constraint(validatedBy = NotBlankValidator.class)
@Target({ ElementType.ANNOTATION_TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {

	String name();

	String message() default "{com.ydwl.validation.NotBlank.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
