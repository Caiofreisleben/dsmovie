package com.caiosuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiosuperior.dsmovie.entities.Score;
import com.caiosuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
