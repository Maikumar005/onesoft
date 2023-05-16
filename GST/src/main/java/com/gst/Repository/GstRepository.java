package com.gst.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.Entity.Gst;

public interface GstRepository extends JpaRepository<Gst,Integer> {

	
  @Query(value="select tax from gst.gst where hsn like ?",nativeQuery=true)
   int getTaxByHsn(int h);
}
