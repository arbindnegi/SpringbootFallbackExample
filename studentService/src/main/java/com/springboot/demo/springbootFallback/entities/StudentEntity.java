/**
 * 
 */
package com.springboot.demo.springbootFallback.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Arbind Negi 20-Jul-2021
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String studentName;

    @Column
    private String studentAddress;

    @Column
    private String country;
    
    @Column
    private String course;
    
    @Column
    private int collageId;
}
