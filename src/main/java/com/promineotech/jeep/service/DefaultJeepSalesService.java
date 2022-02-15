package com.promineotech.jeep.service;

import java.util.List;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultJeepSalesService implements JeepSalesService {
//  private static final Logger log = LoggerFactory.getLogger(DefaultJeepSalesService.class);

	@Override
	public List<Jeep> fetchJeeps(JeepModel model, String trim) {
		log.info("The fetchjeeps method was called with model={} and trim={}",
				model, trim);
		return null;
	}

}