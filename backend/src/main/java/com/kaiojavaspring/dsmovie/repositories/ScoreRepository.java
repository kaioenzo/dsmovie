package com.kaiojavaspring.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiojavaspring.dsmovie.entities.Score;
import com.kaiojavaspring.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
