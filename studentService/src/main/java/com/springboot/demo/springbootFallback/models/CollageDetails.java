/**
 * 
 */
package com.springboot.demo.springbootFallback.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Arbind Negi 20-Jul-2021
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollageDetails {
    private int id;
    private String collageName;
    private String collageeAddress;
    private String contactPerson;
}
