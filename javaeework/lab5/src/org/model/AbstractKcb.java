package org.model;

/**
 * AbstractKcb entity provides the base persistence definition of the Kcb
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKcb implements java.io.Serializable {

	// Fields

	private String kcb;
	private String kcm;
	private Short kxxq;
	private Integer xs;
	private Integer xf;

	// Constructors

	/** default constructor */
	public AbstractKcb() {
	}

	/** minimal constructor */
	public AbstractKcb(String kcb) {
		this.kcb = kcb;
	}

	/** full constructor */
	public AbstractKcb(String kcb, String kcm, Short kxxq, Integer xs,
			Integer xf) {
		this.kcb = kcb;
		this.kcm = kcm;
		this.kxxq = kxxq;
		this.xs = xs;
		this.xf = xf;
	}

	// Property accessors

	public String getKcb() {
		return this.kcb;
	}

	public void setKcb(String kcb) {
		this.kcb = kcb;
	}

	public String getKcm() {
		return this.kcm;
	}

	public void setKcm(String kcm) {
		this.kcm = kcm;
	}

	public Short getKxxq() {
		return this.kxxq;
	}

	public void setKxxq(Short kxxq) {
		this.kxxq = kxxq;
	}

	public Integer getXs() {
		return this.xs;
	}

	public void setXs(Integer xs) {
		this.xs = xs;
	}

	public Integer getXf() {
		return this.xf;
	}

	public void setXf(Integer xf) {
		this.xf = xf;
	}

}