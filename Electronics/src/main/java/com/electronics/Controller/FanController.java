package com.electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.Entity.Fan;
import com.electronics.Service.FanService;
import com.electronics.customException.LowPriceExcep;

@RestController
@RequestMapping("/fan")
public class FanController {
@Autowired
FanService fs;
@PostMapping("/setFan")
public String setFan(@RequestBody Fan f) throws LowPriceExcep {
	return fs.setFan(f);
}
@PostMapping("/setAllFan")
public String setAllFan(@RequestBody List<Fan> f) throws LowPriceExcep {
	return fs.setAllFan(f);
}
}
