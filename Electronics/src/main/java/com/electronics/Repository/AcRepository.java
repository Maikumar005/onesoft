package com.electronics.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.electronics.Entity.Ac;

public interface AcRepository extends JpaRepository<Ac,Integer>{
  @Query(value="select brand from electronics.ac where price<?",nativequery=true)
}
