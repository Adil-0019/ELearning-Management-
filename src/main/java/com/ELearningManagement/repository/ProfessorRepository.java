package com.ELearningManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ELearningManagement.entity.Professor;

import jakarta.transaction.Transactional;

public interface ProfessorRepository extends CrudRepository<Professor, String>
{
    public Professor findByEmail(String email);
    
    public List<Professor> findProfessorListByEmail(String email);
	
	public Professor findByProfessorname(String professorname);
	
	public Professor findByEmailAndPassword(String email, String password);
	
	public List<Professor> findProfileByEmail(String email);
	
	@Transactional
	@Modifying
	@Query(value = "update professor set status = 'accept' where email = ?1", nativeQuery = true)
	public void updateStatus(String email);
	
	@Transactional
	@Modifying
	@Query(value = "update professor set status = 'reject' where email = ?1", nativeQuery = true)
	public void rejectStatus(String email);
	
}