package com.caiosuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiosuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
