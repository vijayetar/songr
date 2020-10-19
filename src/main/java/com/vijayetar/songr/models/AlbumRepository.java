package com.vijayetar.songr.models;

import com.vijayetar.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
