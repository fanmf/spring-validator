package net.yidakj.eurekaclienta.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fanmf
 */
@ControllerAdvice
public class ExceptionController  {

	@ExceptionHandler
	@ResponseBody
	public String hundler(Exception e) throws Exception {
		throw e;
	}
}
