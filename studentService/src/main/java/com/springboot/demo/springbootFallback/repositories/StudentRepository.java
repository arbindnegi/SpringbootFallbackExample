/**
 * 
 */
package com.springboot.demo.springbootFallback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.springbootFallback.entities.StudentEntity;

/**
 * @author Arbind Negi 20-Jul-2021
 *
 */
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	
	public List<StudentEntity> findByCollageId(Integer id);
	
	public StudentEntity save(StudentEntity c);
	
}
