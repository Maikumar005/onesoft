package com.electronics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electronics.Entity.Fan;

public interface FanRepository extends JpaRepository<Fan,Integer>{

}
