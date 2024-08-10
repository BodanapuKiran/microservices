package com.boot_camp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot_camp.entity.Song;



@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

}
