package org.looseend.bikemaintr.server;

import java.util.ArrayList;
import java.util.List;

import org.looseend.bikemaintr.server.model.Bike;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bike")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost"})
public class BikeServiceController {

	@RequestMapping("/")
	public List<Bike> getBikes() {
		ArrayList<Bike> bikes = new ArrayList<Bike>();
		
		bikes.add(new Bike(1, "John"));
		bikes.add(new Bike(2, "El Mariachi"));
		return bikes;
	}

	@RequestMapping("/{bikeId}")
	public Bike getBike(@PathVariable("bikeId") int bikeId) {
		switch(bikeId) {
			case 1:
				return new Bike(1, "John");
			case 2:
				return new Bike(2, "El Mariachi");
			default:
				return null;
		}				
	}

}
