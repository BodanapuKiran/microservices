package com.boot_camp.openFeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.boot_camp.Dao.MovieResponse;



@FeignClient(name = "BOOT-CAMP2",path = "/movie/api")
public interface MovieFeign {

	
	@GetMapping("/getsong/{id}")
	public ResponseEntity<MovieResponse> getmovieDetails(@PathVariable("id") int id);
	
	@GetMapping("allmovies")
	public ResponseEntity<List<MovieResponse>> getAllMovies();

	
}
