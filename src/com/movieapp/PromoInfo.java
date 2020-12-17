package com.movieapp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moviepromotion")
public class PromoInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="promoid")	
	private int promoid; 
	@Column(name="promoimage")	
	private String promoimage; 
	@Column(name="promotitle")	
	private String promotitle; 
	@Column(name="promodescription")	
	private String promodescription;
	
	
	public PromoInfo() {

	}

	public PromoInfo(int promoid, String promoimage, String promotitle, String promodescription) {
		super();
		this.promoid = promoid;
		this.promoimage = promoimage;
		this.promotitle = promotitle;
		this.promodescription = promodescription;
	}

	public int getPromoid() {
		return promoid;
	}

	public void setPromoid(int promoid) {
		this.promoid = promoid;
	}

	public String getPromoimage() {
		return promoimage;
	}

	public void setPromoimage(String promoimage) {
		this.promoimage = promoimage;
	}

	public String getPromotitle() {
		return promotitle;
	}

	public void setPromotitle(String promotitle) {
		this.promotitle = promotitle;
	}

	public String getPromodescription() {
		return promodescription;
	}

	public void setPromodescription(String promodescription) {
		this.promodescription = promodescription;
	}

	@Override
	public String toString() {
		return "PromoInfo [promoid=" + promoid + ", promoimage=" + promoimage + ", promotitle=" + promotitle
				+ ", promodescription=" + promodescription + "]";
	}
	
	
	

	
}
