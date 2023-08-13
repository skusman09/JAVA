package com.app.usingPathVariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Mobile;

@RestController
public class Path_variable {

	@GetMapping("/Welcom/{username}")
	public String name(@PathVariable(name = "username") String name) {
		return "<center><body style=background:black ><a href=https://skusman09.github.io/portfolio/> <h1 style=color:blue> Welcom "
				+ name + "</h1></a>";
	}

//	if 	"@GetMapping" Values Same With "mobileList()" parameter
//	Then Don't need to specify name in "@PathVariable"
//	if different Then We have To specify name in "@PathVariable" that match to "@GetMapping"
	@GetMapping("/product/{mobileID}/{brand}/{model}/{processor}/{mobileColor}/{price}")
	public Mobile mobileList(@PathVariable(name = "mobileID") String id, @PathVariable("mobileColor") String brand,
			@PathVariable String model, @PathVariable String processor, @PathVariable String color,
			@PathVariable long price) {

		return new Mobile(id, brand, model, processor, color, price);
	}
}
