package net.yidakj.eurekaclienta.controller;

import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MessageSourceResourceBundleLocator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Validation;

/**
 * @author fanmf
 */
@Configuration
public class WebMvcConfig {

	/**
	 * spring validator
	 *
	 * @return
	 */
	@Bean
	Validator springValidator() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());
		localValidatorFactoryBean.setProviderClass(HibernateValidator.class);
		localValidatorFactoryBean.afterPropertiesSet();
		return localValidatorFactoryBean;
	}

	@Bean
	MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasenames("classpath:/config/message/ValidatorMessage");
		messageSource.setDefaultEncoding("UTF-8");

		return messageSource;
	}

	/**
	 * validator
	 *
	 * @return
	 */
	@Bean
	javax.validation.Validator validator() {
		return Validation.byDefaultProvider().configure()
				.messageInterpolator(new ResourceBundleMessageInterpolator(
						new MessageSourceResourceBundleLocator(messageSource())
				))
				.buildValidatorFactory().getValidator();
	}

	@Bean
	WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public Validator getValidator() {
				return springValidator();
			}
		};
	}
}
