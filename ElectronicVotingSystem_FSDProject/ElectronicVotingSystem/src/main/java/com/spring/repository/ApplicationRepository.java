package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.ApplicationEntity;
import com.spring.entity.ElectionEntity;


public interface ApplicationRepository extends JpaRepository<ApplicationEntity, String>{



	Iterable<ElectionEntity> findAllApprovedStatus(int i);

}
