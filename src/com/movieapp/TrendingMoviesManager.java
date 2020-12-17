package com.movieapp;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import com.movieapp.TrendingMoviesInfo;

public class TrendingMoviesManager {

	// Display all movies from DB
	@SuppressWarnings("unchecked")
	public List<TrendingMoviesInfo> getAllMovies() {

		Session session = null;
		@SuppressWarnings("rawtypes")
		List<TrendingMoviesInfo> movieList = new ArrayList();

		try {
			session = HibernateUtil.getSession();
			movieList = session.createQuery("from TrendingMoviesInfo").list();

		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			try {
				if (session != null)
					session.close();
			} catch (Exception ex) {
			}

		}

		return movieList;

	}

	public TrendingMoviesInfo getMovieImage(TrendingMoviesInfo movieimage) {

		Session session = null;
		TrendingMoviesInfo image = null;
		try {
			session = HibernateUtil.getSession();

			Criteria criteria = session.createCriteria(TrendingMoviesInfo.class);
			criteria.setProjection(Projections.property("movieimage"));

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				if (session != null)
					session.close();
			} catch (Exception ex) {
			}
		}
		return image;

	}

	public void addNewMovie(TrendingMoviesInfo movie) {

		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		TrendingMoviesInfo newmovie = new TrendingMoviesInfo();
		movie.setMovieid(movie.getMovieid());
		newmovie.setMovietitle(movie.getMovietitle());
		newmovie.setMovieyear(movie.getMovieyear());
		newmovie.setMovieclass(movie.getMovieclass());
		newmovie.setMovieimage(movie.getMovieimage());
		newmovie.setMoviesynopsis(movie.getMoviesynopsis());

		session.save(newmovie);
		System.out.println("Inserted Successfully");
		session.getTransaction().commit();
		session.close();
	}

	public TrendingMoviesInfo deleteMovie(TrendingMoviesInfo removemovie) {

		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		TrendingMoviesInfo deletemovie = new TrendingMoviesInfo();
		deletemovie.setMovieid(removemovie.getMovieid());

		session.delete(deletemovie);
		System.out.println("Deleted Successfully");
		session.getTransaction().commit();
		session.close();

		return deletemovie;

	}

	public TrendingMoviesInfo updateMovie(TrendingMoviesInfo updatemovie) {

		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		TrendingMoviesInfo newupdate = (TrendingMoviesInfo) session.get(TrendingMoviesInfo.class,
				updatemovie.getMovieid());
		newupdate.setMovietitle(updatemovie.getMovietitle());
		newupdate.setMovieyear(updatemovie.getMovieyear());
		newupdate.setMovieclass(updatemovie.getMovieclass());
		newupdate.setMovieimage(updatemovie.getMovieimage());
		newupdate.setMoviesynopsis(updatemovie.getMoviesynopsis());

		session.update(newupdate);

		System.out.println("Updated Successfully");

		session.getTransaction().commit();
		session.close();

		return newupdate;

	}

}