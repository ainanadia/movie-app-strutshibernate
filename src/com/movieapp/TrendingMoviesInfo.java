package com.movieapp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonView;

@XmlType(name="moviesinfo")
@Entity
@Table(name="trendingmovies")

public class TrendingMoviesInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  @Id
	  @GeneratedValue
	  @JsonView
	  @Column(name="movieid")	
	  public int movieid;
	  @Column(name="movietitle")
	  public String movietitle;
	  @Column(name="movieyear")
	  public int movieyear;
	  @Column(name="movieclass")
	  public String movieclass;
	  @Column(name="movieimage")
	  public String movieimage;
	  @Column(name="moviesynopsis")
	  public String moviesynopsis;
	  
	  
	public TrendingMoviesInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TrendingMoviesInfo(int movieid) {
		super();
		this.movieid = movieid;
	}


	public TrendingMoviesInfo(int movieid, String movietitle, int movieyear, String movieclass, String movieimage,
			String moviesynopsis) {
		  
		  super();
		this.movieid = movieid;
		this.movietitle = movietitle;
		this.movieyear = movieyear;
		this.movieclass = movieclass;
		this.movieimage = movieimage;
		this.moviesynopsis = moviesynopsis;
	}

	  public TrendingMoviesInfo(String movietitle, int movieyear, String movieclass, String movieimage, String moviesynopsis) {
		
		  super();
		this.movietitle = movietitle;
		this.movieyear = movieyear;
		this.movieclass = movieclass;
		this.movieimage = movieimage;
		this.moviesynopsis = moviesynopsis;
	}
	  
	
	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMovietitle() {
		return movietitle;
	}

	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}

	public int getMovieyear() {
		return movieyear;
	}

	public void setMovieyear(int movieyear) {
		this.movieyear = movieyear;
	}

	public String getMovieclass() {
		return movieclass;
	}

	public void setMovieclass(String movieclass) {
		this.movieclass = movieclass;
	}

	public String getMovieimage() {
		return movieimage;
	}

	public void setMovieimage(String movieimage) {
		this.movieimage = movieimage;
	}

	public String getMoviesynopsis() {
		return moviesynopsis;
	}

	public void setMoviesynopsis(String moviesynopsis) {
		this.moviesynopsis = moviesynopsis;
	}

	@Override
	public String toString() {
		return "MovieInfo [movieid=" + movieid + ", movietitle=" + movietitle + ", movieyear=" + movieyear
				+ ", movieclass=" + movieclass + ", movieimage=" + movieimage + ", moviesynopsis=" + moviesynopsis
				+ "]";
	}
	  
	  
	  
	  
	  
	  
}
