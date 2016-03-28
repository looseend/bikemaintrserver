package org.looseend.bikemaintr.server;

import java.util.ArrayList;
import java.util.List;

import org.looseend.bikemaintr.server.model.Bike;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bike")
public class BikeServiceController {

	@RequestMapping("/")
	public List<Bike> getBikes() {
		ArrayList<Bike> bikes = new ArrayList<Bike>();
		
		bikes.add(new Bike(1, "John"));
		
		return bikes;
	}
}
