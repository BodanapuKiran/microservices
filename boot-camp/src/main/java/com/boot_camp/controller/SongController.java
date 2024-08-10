package com.boot_camp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot_camp.Dao.SongResponse;
import com.boot_camp.service.SongService;

@RestController
@RequestMapping("/song/api")
public class SongController {

	@Autowired
	SongService songService;
	

	@GetMapping("/get/{id}")
	public ResponseEntity<SongResponse> getSong(@PathVariable("id") int id) {
		SongResponse recieved = songService.recieve(id);
		return new ResponseEntity<SongResponse>(recieved, HttpStatus.FOUND);
	}
	
	@GetMapping("/allsongs")
	public ResponseEntity<List<SongResponse>> findAllSongs(){
		List<SongResponse> allSongs = songService.getAllSongs();
		return new ResponseEntity<List<SongResponse>>(allSongs,HttpStatus.OK);
	}
	
}
