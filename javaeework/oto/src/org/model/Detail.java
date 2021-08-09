package org.model;

/**
 * Detail entity. @author MyEclipse Persistence Tools
 */

public class Detail implements java.io.Serializable {

	// Fields

	private Integer id;
	private String truename;
	private String email;
	private Login login;
	// Constructors

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	/** default constructor */
	public Detail() {
	}

	/** full constructor */
	public Detail(String truename, String email) {
		this.truename = truename;
		this.email = email;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTruename() {
		return this.truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}