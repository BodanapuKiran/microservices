package com.boot_camp.service;

import java.util.List;

import com.boot_camp.Dao.SongResponse;

public interface SongService {
	
	public SongResponse recieve(int id);
	
	public List<SongResponse> getAllSongs();

}
	