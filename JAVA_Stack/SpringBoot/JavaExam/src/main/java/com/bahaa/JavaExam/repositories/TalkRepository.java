package com.bahaa.JavaExam.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bahaa.JavaExam.models.Talk;
@Repository
public interface TalkRepository extends CrudRepository<Talk, Long> {
	Optional<Talk> findById(Long id);
	}
