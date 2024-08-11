package com.boot_camp.Dao;

public class SongResponse {
	private int id;
	private String name;
	private String composer;
	private String film;

	
	  private MovieResponse  movieResponse;
	  
	  public MovieResponse getMovieResponse() {
		  return movieResponse;
		  }
	  
	  public void setMovieResponse(MovieResponse movieResponse) {
	  this.movieResponse = movieResponse; }
	 

	
	/*
	 * private List<StudentResponse> studentResponse;
	 * 
	 * 
	 * public List<StudentResponse> getStudentResponse() { return studentResponse; }
	 * 
	 * public void setStudentResponse(List<StudentResponse> studentResponse2) {
	 * this.studentResponse = studentResponse2; }
	 */
	 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

	public SongResponse(int id, String name, String composer, String film, MovieResponse movieResponse) {
		super();
		this.id = id;
		this.name = name;
		this.composer = composer;
		this.film = film;
		this.movieResponse = movieResponse;
	}

	public SongResponse() {
		
	}

}
