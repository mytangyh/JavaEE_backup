package org.model;

import java.sql.Timestamp;

/**
 * Xsb entity. @author MyEclipse Persistence Tools
 */

public class Xsb implements java.io.Serializable {

	// Fields

	private String xh;
	private String xm;
	private Boolean xb;
	private Timestamp cssj;
	private Integer zyId;
	private Integer zxf;
	private String bz;
	private String zp;
	private Zyb zyb;
	// Constructors

	/** default constructor */
	public Xsb() {
	}

	/** minimal constructor */
	public Xsb(String xm, Boolean xb, Integer zyId) {
		this.xm = xm;
		this.xb = xb;
		this.zyId = zyId;
	}

	/** full constructor */
	public Xsb(String xm, Boolean xb, Timestamp cssj, Integer zyId,
			Integer zxf, String bz, String zp) {
		this.xm = xm;
		this.xb = xb;
		this.cssj = cssj;
		this.zyId = zyId;
		this.zxf = zxf;
		this.bz = bz;
		this.zp = zp;
	}

	// Property accessors

	public String getXh() {
		return this.xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public Boolean getXb() {
		return this.xb;
	}

	public void setXb(Boolean xb) {
		this.xb = xb;
	}

	public Timestamp getCssj() {
		return this.cssj;
	}

	public void setCssj(Timestamp cssj) {
		this.cssj = cssj;
	}

	public Integer getZyId() {
		return this.zyId;
	}

	public void setZyId(Integer zyId) {
		this.zyId = zyId;
	}

	public Integer getZxf() {
		return this.zxf;
	}

	public void setZxf(Integer zxf) {
		this.zxf = zxf;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getZp() {
		return this.zp;
	}

	public void setZp(String zp) {
		this.zp = zp;
	}

	public Zyb getZyb() {
		return zyb;
	}

	public void setZyb(Zyb zyb) {
		this.zyb = zyb;
	}

}