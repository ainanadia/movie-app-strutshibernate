package com.movieapp;

import org.hibernate.Session;
import com.movieapp.TrendingMoviesInfo;

public class GetByIDManager {

	public TrendingMoviesInfo getMovieByID(TrendingMoviesInfo movieid) {

		// loads configuration and creates a session factory
		Session session = null;
		session = HibernateUtil.getSession();

		int moviesid = movieid.getMovieid();

		TrendingMoviesInfo movierow = (TrendingMoviesInfo) session.get(TrendingMoviesInfo.class, moviesid);

		movieid.setMovieid(movierow.getMovieid());
		;
		movieid.setMovietitle(movierow.getMovietitle());
		movieid.setMovieyear(movierow.getMovieyear());
		movieid.setMovieclass(movierow.getMovieclass());
		movieid.setMovieimage(movierow.getMovieimage());
		movieid.setMoviesynopsis(movierow.getMoviesynopsis());

		session.close();

		return movierow;
	}

}
