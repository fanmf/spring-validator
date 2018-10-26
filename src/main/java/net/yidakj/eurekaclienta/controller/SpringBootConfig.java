package net.yidakj.eurekaclienta.controller;

import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;
import org.hibernate.validator.resourceloading.PlatformResourceBundleLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MessageSourceResourceBundleLocator;

import javax.validation.Validation;
import javax.validation.Validator;

/**
 * @author fanmf
 */
@Configuration
public class SpringBootConfig {

//	@Autowired
//	MessageSource messageSource;
//
//	@Bean
//	Validator validator() {
//		return Validation.byDefaultProvider().configure()
//				.messageInterpolator(new ResourceBundleMessageInterpolator(
//						new MessageSourceResourceBundleLocator(messageSource)
//				))
//				.buildValidatorFactory().getValidator();
//	}
}
