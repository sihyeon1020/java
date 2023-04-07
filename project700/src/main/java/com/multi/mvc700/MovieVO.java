package com.multi.mvc700;

public class MovieVO {
	private int id;
	private String title;
	private String genre;
	private double grade;
	private String director;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Movie0407VO [id=" + id + ", title=" + title + ", genre=" + genre + ", grade=" + grade + ", director="
				+ director + "]";
	}
	
}