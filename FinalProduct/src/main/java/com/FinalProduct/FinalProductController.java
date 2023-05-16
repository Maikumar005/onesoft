package com.FinalProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FinalProductController {
@Autowired
RestTemplate rt;
FinalProductService fs;
@GetMapping("/getfinalproduct")
public List<FinalProduct> getFinalProduct() {
	String url1="http://localhost:8081/getallprod";
	String url2="http://localhost:8082/gettaxbyhsn/";
ResponseEntity<List<FinalProduct>>r=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<FinalProduct>>() {});
List<FinalProduct>f=r.getBody();
f.forEach(x->{
	int h=x.getHsn();
ResponseEntity<Integer>g=rt.exchange(url2+h,HttpMethod.GET,null,Integer.class);
int tax=g.getBody();
x.setPrice(x.getPrice()+x.getPrice()*tax/100);
});
return f;
}
//@PostMapping("/setallfinalprod")
//public  String setAllFinalProd( List<FinalProduct> f) {
//	//String u="http://localhost:8081/getallprod";
//	String u="http://localhost:8081/getfinalproduct";
//	ResponseEntity<List<FinalProduct>>r=rt.exchange(u,HttpMethod.GET,null,new ParameterizedTypeReference<List<FinalProduct>>() {});
//	List<FinalProduct>f1=r.getBody();
//	return fs.setAllFinalProd(f1);
}
}
//@GetMapping("/getfp")
//public FinalProduct getIdObj() {
//	String url1="http://localhost:8081/getallprod";
//	String url3="http://localhost:8082//getbyid/2";
//	ResponseEntity <List<FinalProduct>>r=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<FinalProduct>>() {});
//	List<FinalProduct> f=r.getBody();
//	 f.forEach(x->{
//		ResponseEntity<FinalProduct> b=rt.exchange(url3,HttpMethod.GET, null,new ParameterizedTypeReference<FinalProduct>() {});	 
//	 });
//	 
//}






