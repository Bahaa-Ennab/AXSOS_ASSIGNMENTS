package com.bahaa.JavaExam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bahaa.JavaExam.models.Team;
import com.bahaa.JavaExam.models.User;
import com.bahaa.JavaExam.repositories.TeamRepository;


@Service
public class TeamService {


	@Autowired
	TeamRepository teamRepository;
	
	public List<Team> allTeamByUser(User user) {
        return teamRepository.findAllTeamsByUser(user);
    }
	
	public Team createTeam(Team team,User user) {
		team.setUser(user);
		teamRepository.save(team);
		return team;
	}
	public List<Team> findAll(){
		return (List<Team>) teamRepository.findAll();
	}
	
	public Team findTeamById(Long id) {
	    Optional<Team> team = teamRepository.findById(id);
	    return team.orElse(null);
	}
	
	public void deleteTeam(Long id) {
		teamRepository.deleteById(id);
	}
	
	public Team updateTeam(Team team) {
		return teamRepository.save(team);
	}
	
}
