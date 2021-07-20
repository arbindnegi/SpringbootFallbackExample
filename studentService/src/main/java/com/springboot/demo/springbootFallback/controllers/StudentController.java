/**
 * 
 */
package com.springboot.demo.springbootFallback.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.demo.springbootFallback.entities.StudentEntity;
import com.springboot.demo.springbootFallback.repositories.StudentRepository;

/**
 * @author Arbind Negi 20-Jul-2021
 *
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
  
    @PostMapping(path ="/add")
    public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity newStudent) {
		
	StudentEntity citizen = studentRepository.save(newStudent);
	return new ResponseEntity<>(citizen, HttpStatus.OK);
    }

    @RequestMapping(path = "/byId/{id}")
    public ResponseEntity<List<StudentEntity>> findById(@PathVariable Integer id) {
	List<StudentEntity> students = studentRepository.findByCollageId(id);
	return new ResponseEntity<>(students,HttpStatus.OK);
    }

}
