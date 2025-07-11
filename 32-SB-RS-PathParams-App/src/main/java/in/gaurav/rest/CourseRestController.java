package in.gaurav.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course/{a}/trainer/{b}")
	public String getCourseDetails(@PathVariable("a") String cname,@PathVariable("b") String tname) {
		String msg= cname+" By"+ tname+" starting from 15 july 2021";
		return msg;
	}
}
