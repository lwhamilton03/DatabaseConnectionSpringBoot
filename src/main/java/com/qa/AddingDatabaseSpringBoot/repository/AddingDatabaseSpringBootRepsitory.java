package com.qa.AddingDatabaseSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.AddingDatabaseSpringBoot.model.*;

@Repository
public interface AddingDatabaseSpringBootRepsitory extends JpaRepository<SpringBootDataModel, Long> {

}
