package com.spring.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "evs_tbl_candidate")
public class CandidateEntity {

		@Column(name = "candidateid", length = 6)
		@Id
		private String candidateId;

		@Column(name = "name")
		private String name;

		@Column(name = "electionid")
		private String electionid;
		
		@Column(name = "partyid")
		private String partyid;
		
		@Column(name = "district")
		private String district;

		@Column(name = "constituency")
		private String constituency;

		@Column(name = "dateofbirth")
		private LocalDate dateOfBirth;
		
		@Column(name = "mobileNo")
		private long mobileNo;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "emailId")
		private String emailId;

		public CandidateEntity() {
			super();
		}

		public CandidateEntity(String name, String electionid, String partyid, String district, String constituency,
				LocalDate dateOfBirth, long mobileNo, String address, String emailId) {
			super();
			this.name = name;
			this.electionid = electionid;
			this.partyid = partyid;
			this.district = district;
			this.constituency = constituency;
			this.dateOfBirth = dateOfBirth;
			this.mobileNo = mobileNo;
			this.address = address;
			this.emailId = emailId;
		}

		public CandidateEntity(String candidateId, String name, String electionid, String partyid, String district,
				String constituency, LocalDate dateOfBirth, long mobileNo, String address, String emailId) {
			super();
			this.candidateId = candidateId;
			this.name = name;
			this.electionid = electionid;
			this.partyid = partyid;
			this.district = district;
			this.constituency = constituency;
			this.dateOfBirth = dateOfBirth;
			this.mobileNo = mobileNo;
			this.address = address;
			this.emailId = emailId;
		}

		public String getCandidateId() {
			return candidateId;
		}

		public void setCandidateId(String candidateId) {
			this.candidateId = candidateId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getElectionid() {
			return electionid;
		}

		public void setElectionid(String electionid) {
			this.electionid = electionid;
		}

		public String getPartyid() {
			return partyid;
		}

		public void setPartyid(String partyid) {
			this.partyid = partyid;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getConstituency() {
			return constituency;
		}

		public void setConstituency(String constituency) {
			this.constituency = constituency;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public long getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

}