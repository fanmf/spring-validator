package net.yidakj.eurekaclienta.controller;

/**
 * @author fanmf
 */
public class User {

	@NotBlank(name = "名字")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
