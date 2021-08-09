package org.model;

/**
 * Kcb entity. @author MyEclipse Persistence Tools
 */
public class Kcb extends AbstractKcb implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Kcb() {
	}

	/** minimal constructor */
	public Kcb(String kcb) {
		super(kcb);
	}

	/** full constructor */
	public Kcb(String kcb, String kcm, Short kxxq, Integer xs, Integer xf) {
		super(kcb, kcm, kxxq, xs, xf);
	}

}
