package com.ELearningManagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ELearningManagement.entity.Chapter;

public interface ChapterRepository extends CrudRepository<Chapter, Integer>
{
	public List<Chapter> findByCoursename(String Coursename);
	
}