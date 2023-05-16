package com.gst.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.Entity.Gst;
import com.gst.Repository.GstRepository;

@Repository
public class GstDao {
@Autowired
GstRepository gr;
public String setAllGst(List<Gst> g) {
	gr.saveAll(g);
	return "saved all";
}
public List<Gst> getAllGst(){
	return gr.findAll();
}
public Gst getById(int i) {
return	gr.findById(i).get();
	
}
public int getTaxByHsn(int h) {
	return gr.getTaxByHsn(h);
}
}
