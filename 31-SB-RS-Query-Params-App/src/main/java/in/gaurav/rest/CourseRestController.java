package in.gaurav.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping(value = "/course")
	public String getCousreDetails(@RequestParam( "name") String name) {
		String msg="";
		if ("SBMS".equals(name)) {
			msg="New Betch For SBMS from 10 am to 12 am";
		}else if ("JRTP".equals(name)) {
			msg="New Betch For JRTP from 12 pm to 2 pm";
		}else if ("AWS".equals(name)) {
			msg="New Betch For AWS from 2 pm to 4 pm";
		}else  {
			msg="Please visit www.ashokit.in for more Details";
		}
		
		return msg;
	}
}
