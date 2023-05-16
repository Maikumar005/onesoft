package com.gst.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.Dao.GstDao;
import com.gst.Entity.Gst;

@Service
public class GstService {
@Autowired
GstDao gd;
public String setAllGst(List<Gst> g) {
	return gd.setAllGst(g);
}
public List<Gst> getAllGst(){
	return gd.getAllGst();
}
public Gst getById(int i) {
	return gd.getById(i);
}
Gst y;

public Gst getByHsn( int hsn) {
     List<Gst> a=getAllGst();
	for (Gst x :a ) {
		if (x.getHsn() == hsn) {

			 y = x;
		}

	}
	
	return y;
}
public List<Gst> getByTax( int t) {

//	for (Gst x : gst) {
//		if (x.getTax() == t) {
//
//			y = x;
//		}
//
//	}
//	return y;
	List<Gst>a=getAllGst();
	List<Gst>list1=a.stream().filter(x->x.getTax()==t).collect(Collectors.toList());
	return list1;
}
public List<Gst> getByDiscount(int d) {

//	for (Gst x : gst) {
//		if (x.getDiscount() == d) {
//
//			y = x;
//		}
//
//	}
//	return y;
	List<Gst>a=getAllGst();
	List<Gst>list1=a.stream().filter(x->x.getTax()==d).collect(Collectors.toList());
	return list1;
}
public int getTaxByHsn(int h) {
	return gd.getTaxByHsn(h);
}
}
