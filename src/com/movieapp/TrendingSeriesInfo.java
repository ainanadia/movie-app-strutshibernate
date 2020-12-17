package com.movieapp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="seriesinfo")
@Entity
@Table(name="trendingseries")

public class TrendingSeriesInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  @Id
	  @GeneratedValue
	  @Column(name="seriesid")	
	  private int seriesid;
	  @Column(name="seriestitle")
	  private String seriestitle;
	  @Column(name="seriesyear")
	  private int seriesyear;
	  @Column(name="seriesclass")
	  private String seriesclass;
	  @Column(name="seriesimage")
	  private String seriesimage;
	  @Column(name="seriessynopsis")
	  private String seriessynopsis;
	  
	  
	public TrendingSeriesInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TrendingSeriesInfo(int seriesid, String seriestitle, int seriesyear, String seriesclass, String seriesimage,
			String seriessynopsis) {
		super();
		this.seriesid = seriesid;
		this.seriestitle = seriestitle;
		this.seriesyear = seriesyear;
		this.seriesclass = seriesclass;
		this.seriesimage = seriesimage;
		this.seriessynopsis = seriessynopsis;
	}



	public int getSeriesid() {
		return seriesid;
	}


	public void setSeriesid(int seriesid) {
		this.seriesid = seriesid;
	}


	public String getSeriestitle() {
		return seriestitle;
	}


	public void setSeriestitle(String seriestitle) {
		this.seriestitle = seriestitle;
	}


	public int getSeriesyear() {
		return seriesyear;
	}


	public void setSeriesyear(int seriesyear) {
		this.seriesyear = seriesyear;
	}


	public String getSeriesclass() {
		return seriesclass;
	}


	public void setSeriesclass(String seriesclass) {
		this.seriesclass = seriesclass;
	}


	public String getSeriesimage() {
		return seriesimage;
	}


	public void setSeriesimage(String seriesimage) {
		this.seriesimage = seriesimage;
	}


	public String getSeriessynopsis() {
		return seriessynopsis;
	}


	public void setSeriessynopsis(String seriessynopsis) {
		this.seriessynopsis = seriessynopsis;
	}


	@Override
	public String toString() {
		return "TrendingSeriesInfo [seriesid=" + seriesid + ", seriestitle=" + seriestitle + ", seriesyear="
				+ seriesyear + ", seriesclass=" + seriesclass + ", seriesimage=" + seriesimage + ", seriessynopsis="
				+ seriessynopsis + "]";
	}
	  
	  

	  
	  
	  
	  
}
