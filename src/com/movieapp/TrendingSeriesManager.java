package com.movieapp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

public class TrendingSeriesManager {

	@SuppressWarnings("unchecked")
	public List<TrendingSeriesInfo> getAllMovies() {

		Session session = null;
		session = HibernateUtil.getSession();

		List<TrendingSeriesInfo> movies = new ArrayList<TrendingSeriesInfo>();

		try {
			movies = session.createQuery("from TrendingSeriesInfo").list();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return movies;
	}

	public void getMovieImage() {

		Session session = null;
		session = HibernateUtil.getSession();

		Criteria criteria = session.createCriteria(TrendingSeriesInfo.class);
		criteria.setProjection(Projections.property("seriesimage")); // Projections.property is used to retrieve
																		// specific columns

		@SuppressWarnings("rawtypes")
		List students = criteria.list();
		System.out.println(students); // Iterate list to show name

	}

	public void addNewMovie(TrendingSeriesInfo movie) {

		TrendingSeriesInfo newmovie = new TrendingSeriesInfo();
		newmovie.setSeriesid(movie.getSeriesid());
		newmovie.setSeriestitle(movie.getSeriestitle());
		newmovie.setSeriesyear(movie.getSeriesyear());
		newmovie.setSeriesclass(movie.getSeriesclass());
		newmovie.setSeriesimage(movie.getSeriesimage());
		newmovie.setSeriessynopsis(movie.getSeriessynopsis());

		Session session = null;
		session = HibernateUtil.getSession();

		session.save(newmovie);
		System.out.println("Inserted Successfully");
		session.getTransaction().commit();
		session.close();
	}

	public TrendingSeriesInfo deleteMovie(TrendingSeriesInfo removemovie) {

		TrendingSeriesInfo deletemovie = new TrendingSeriesInfo();
		deletemovie.setSeriesid(removemovie.getSeriesid());

		Session session = null;
		session = HibernateUtil.getSession();

		session.delete(deletemovie);
		System.out.println("Deleted Successfully");
		session.getTransaction().commit();
		session.close();

		return deletemovie;

	}

	public TrendingSeriesInfo updateMovie(TrendingSeriesInfo Series) {

		Session session = null;
		session = HibernateUtil.getSession();

		TrendingSeriesInfo updateMovie = (TrendingSeriesInfo) session.get(TrendingSeriesInfo.class, 2);
		updateMovie.setSeriestitle(Series.getSeriestitle());
		updateMovie.setSeriesyear(Series.getSeriesyear());
		updateMovie.setSeriesclass(Series.getSeriesclass());
		updateMovie.setSeriesimage(Series.getSeriesimage());
		updateMovie.setSeriessynopsis(Series.getSeriessynopsis());

		session.update(updateMovie);
		System.out.println("Updated Successfully");
		session.getTransaction().commit();
		session.close();
		return updateMovie;

	}

}