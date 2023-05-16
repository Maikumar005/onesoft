package com.gst.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gst.Entity.Gst;
import com.gst.Service.GstService;

@RestController
public class GstController {
@Autowired
GstService gs;
@PostMapping("/setallgst")
public String setAllGst(@RequestBody List<Gst> g) {
	return gs.setAllGst(g);
}
@GetMapping("getallgst")
public List<Gst> getAllGst(){
	return gs.getAllGst();
}

@GetMapping("/getbyid/{i}")
public Gst getById(@PathVariable int i) {
	return gs.getById(i);
}
@GetMapping("/getbyhsn/{gst}/{hsn}")
public Gst getByHsn(@PathVariable int hsn) {
	return gs.getByHsn(hsn);
}
@GetMapping("/getbyhsn/{gst}/{t}")
public List<Gst> getByTax(@PathVariable int t) {
	return gs.getByTax(t);
}
@GetMapping("/getbyhsn/{gst}/{d}")
public List<Gst> getByDiscount(@PathVariable int d) {
	return gs.getByDiscount(d);
}
@GetMapping("/gettaxbyhsn/{h}")
public int getTaxByHsn(@PathVariable int h) {
	return gs.getTaxByHsn(h);
}
}
