package com.automobiles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automobiles.Entity.Bike;

public interface BikeRepository extends JpaRepository <Bike,Integer>{

	

}
