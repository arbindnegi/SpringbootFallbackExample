/**
 * 
 */
package com.springboot.demo.collage.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springboot.demo.collage.entities.Collage;
import com.springboot.demo.collage.models.CollageResponse;
import com.springboot.demo.collage.models.Student;
import com.springboot.demo.collage.repositories.CollageRepository;

/**
 * @author Arbind Negi 20-Jul-2021
 *
 */

@RestController
@RequestMapping("/collage")
public class CollageController {

    @Autowired
    private CollageRepository collageRepository;
	
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(path ="/add")
    public ResponseEntity<Collage> addCitizen(@RequestBody Collage collage) {
		
	Collage collageAdded = collageRepository.save(collage);
	return new ResponseEntity<>(collageAdded, HttpStatus.OK);
    }
	
    @GetMapping(path = "/collageId/{id}")
    @HystrixCommand(fallbackMethod = "collageFallbackMethod")
    public ResponseEntity<CollageResponse> findStudentById(@PathVariable Integer id){
		
	Collage collage = collageRepository.findById(id).get();
		
	List<Student> students = restTemplate.getForObject("http://STUDENT-SERVICE/student/byId/"+id, List.class);
		
	CollageResponse response = new CollageResponse();
	response.setCollage(collage);
	response.setStudents(students);
	return new ResponseEntity<CollageResponse>(response, HttpStatus.OK);
    }
    
    public ResponseEntity<CollageResponse> collageFallbackMethod(@PathVariable Integer id){
	Collage collage = collageRepository.findById(id).get();
	CollageResponse response = new CollageResponse();
	response.setCollage(collage);
	
	List<Student> students = new ArrayList<>();
	Student errorStudentService = new Student();
	errorStudentService.setErrorMsg("Student Service is not availble this time, please try after sometime");
	students.add(errorStudentService);
	response.setStudents(students);
	    
	return new ResponseEntity<CollageResponse>(response, HttpStatus.OK);
    }
	
}
