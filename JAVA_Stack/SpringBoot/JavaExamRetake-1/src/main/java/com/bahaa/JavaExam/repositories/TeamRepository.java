package com.bahaa.JavaExam.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bahaa.JavaExam.models.Team;
import com.bahaa.JavaExam.models.User;
@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
	List<Team> findAllTeamsByUser(User user);
	Optional<Team> findById(Long id);

}
