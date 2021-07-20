package com.springboot.demo.collage.models;

import java.util.List;

import com.springboot.demo.collage.entities.Collage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Arbind Negi 20-Jul-2021
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollageResponse {
    private Collage collage;
    private List<Student> students;
    	
}
