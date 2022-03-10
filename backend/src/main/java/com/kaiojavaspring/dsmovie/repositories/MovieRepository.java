package com.kaiojavaspring.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiojavaspring.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
