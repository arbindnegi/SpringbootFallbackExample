/**
 * 
 */
package com.springboot.demo.springbootFallback.models;

import java.util.List;

import com.springboot.demo.springbootFallback.entities.StudentEntity;
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
public class StudentResponse {
    private List<StudentEntity> citizens;

}
