package com.boot_camp.ServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.boot_camp.Dao.MovieResponse;
import com.boot_camp.Dao.SongResponse;
import com.boot_camp.entity.Song;
import com.boot_camp.feignClient.StudentFeign;
import com.boot_camp.openFeign.MovieFeign;
import com.boot_camp.repository.SongRepository;
import com.boot_camp.service.SongService;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	SongRepository repo;

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	MovieFeign movieFeign;

	@Autowired
	StudentFeign studentFeign;

	public SongResponse recieve(int id) {
		Song song = repo.findById(id).get();
		SongResponse songResponse = modelMapper.map(song, SongResponse.class);
		ResponseEntity<MovieResponse> getmovieDetails = movieFeign.getmovieDetails(id);
		MovieResponse body = getmovieDetails.getBody();
		songResponse.setMovieResponse(body);
		return songResponse;
	}

	@Override
	public List<SongResponse> getAllSongs() {
		List<Song> songs = repo.findAll();
	List<SongResponse> songResponse = Arrays.asList(modelMapper.map(songs, SongResponse[].class));
	  ResponseEntity<List<MovieResponse>> allMovies = movieFeign.getAllMovies();
	  List<MovieResponse> body = allMovies.getBody();
	 for (SongResponse song : songResponse) {

		 for (MovieResponse movie : body) {
			if(song.getId()==movie.getId()) {
				song.setMovieResponse(movie);
			}
		}
	}
	
 		return songResponse;
	}

}
