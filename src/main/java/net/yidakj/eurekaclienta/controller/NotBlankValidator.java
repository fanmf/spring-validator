package net.yidakj.eurekaclienta.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 非空判断
 *
 * @author fanmf
 */
public class NotBlankValidator implements ConstraintValidator<NotBlank, String> {

	@Override
	public void initialize(NotBlank constraintAnnotation) {

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}
		if (value.equals("") || value.trim().equals("") || value.replace("　", "").equals("")) {
			return false;
		} else {
			return true;
		}
	}

}
