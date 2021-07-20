/**
 * 
 */
package com.springboot.demo.collage.entities;

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
@NoArgsConstructor
@AllArgsConstructor
public class Collage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
    @Column
    private String collageName;
	
    @Column
    private String collageeAddress;
    
    @Column
    private String contactPerson;
}
