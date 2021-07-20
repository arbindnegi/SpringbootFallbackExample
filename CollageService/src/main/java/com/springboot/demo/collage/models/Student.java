/**
 * 
 */
package com.springboot.demo.collage.models;

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
public class Student {
    private int id;
    private String studentName;
    private String studentAddress;
    private String country;
    private String course;
    private String errorMsg;
	
}
