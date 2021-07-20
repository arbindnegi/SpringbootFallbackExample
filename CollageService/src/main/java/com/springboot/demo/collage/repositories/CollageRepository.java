/**
 * 
 */
package com.springboot.demo.collage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.collage.entities.Collage;

/**
 * @author Arbind Negi 20-Jul-2021
 *
 */

@Repository
public interface CollageRepository extends JpaRepository<Collage, Integer> {

}
