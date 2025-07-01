package com.bahaa.JavaExam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bahaa.JavaExam.models.Talk;
import com.bahaa.JavaExam.models.User;
import com.bahaa.JavaExam.repositories.TalkRepository;

@Service
public class TalkService {
	private final TalkRepository talkRepo;

	public TalkService(TalkRepository talkRepo) {
		this.talkRepo = talkRepo;
	}
	
	public Talk createTalk(Talk talk,User user) {
		talk.setUser(user);
		talkRepo.save(talk);
		return talk;
	}
	
	public List<Talk> findAll(){
		return (List<Talk>) talkRepo.findAll();
	}
	
	public Talk findTalkById(Long id) {
	    Optional<Talk> talk = talkRepo.findById(id);
	    return talk.orElse(null);
	}
	
	public void deletetalk(Long id) {
		talkRepo.deleteById(id);
	}
	
	public Talk updateTalk(Talk talk) {
		return talkRepo.save(talk);
	}
}
