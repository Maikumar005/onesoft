package com.electronics.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.Dao.FanDao;
import com.electronics.Entity.Fan;
import com.electronics.customException.LowPriceExcep;

@Service
public class FanService {
	@Autowired
	FanDao fd;

	public String setFan(Fan f) throws LowPriceExcep {
		try {
			if (f.getPrice() < 2000) {
				throw new LowPriceExcep("Low Price");

			} else {
				return fd.setFan(f);

			}
		} catch (LowPriceExcep a) {
			return "enter valid price";
		}
	}

//	public String setAllFan(List<Fan> f) throws LowPriceExcep {
//		boolean a = true;
//		try {
//
//			for (Fan x : f) {
//				if (x.getPrice() < 2000) {
//					a = false;
//					throw new LowPriceExcep("Low Price");
//
//				} else {
//					continue;
//				}
//			}
//		} catch (LowPriceExcep e) {
//			return "invalid";
//		}
//
//		if (a) {
//			return fd.setAllFan(f);
//
//		} else {
//			return "";
//		}
//
//	}
	public String setAllFan(List<Fan> f) throws LowPriceExcep {
		List<Fan>x=f.stream().filter(y->y.getPrice()<2000).toList();
	//	try {
		if(x.isEmpty()) {
			return fd.setAllFan(f);
		}
		else {
			throw new LowPriceExcep("invalid");
		}
//	}
		//catch(LowPriceExcep a) {
		//	return "enter valid data";
		//}
}
}
