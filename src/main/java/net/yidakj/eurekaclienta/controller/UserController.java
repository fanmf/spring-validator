package net.yidakj.eurekaclienta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanmf
 */
@RestController
@RequestMapping("/user")
@Validated
public class UserController {

	@Autowired
	MessageSource messageSource;

	@RequestMapping("/getUser")
	public String getUser(){
		return "eureka-client-a";
	}

	@RequestMapping("/getName")
	public String getName(@RequestParam @NotBlank(name = "名字") String name) {
		return name;
	}

	@RequestMapping("/getName2")
	public String getName2(@Validated User user) {
		return user.getName();
	}

	@RequestMapping("/getName3")
	public String getName3() {
		return messageSource.getMessage("com.ydwl.validation.NotBlank.message", new Object[]{"名字"}, null);
	}
}
