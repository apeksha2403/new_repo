package com.spring.service;


import java.time.LocalDate;
import java.util.List;

import com.spring.entity.CandidateEntity;
import com.spring.entity.ElectionEntity;
import com.spring.entity.PartyEntity;
import com.spring.json.LoginResponse;
import com.spring.json.UserCredentials;

public interface AdminService {

	Object addElection(ElectionEntity election, String sessionId);

	Object getElectionDetails(String sessionId);

	LoginResponse adminLogin(UserCredentials userCredentials);

	LoginResponse adminLogout(String sessionId);
	
	Object addParty(PartyEntity party, String sessionId);
	
	Object getPartyDetails(String sessionId);
	
	Object getAllElectionFromElectionDate(LocalDate date,String sessionId);

	Object addCandidate(CandidateEntity candidate, String sessionId, String electionid);

	Object getCandidateDetails(String sessionId, String electionid);

	//Object getPendingDetails(String sessionId);

}
