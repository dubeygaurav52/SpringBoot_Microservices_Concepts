package in.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

	@GetMapping("/course")
	@ResponseBody
	public String getCourseDtls(String cname,String trainer) {
		
		String msg=cname+" By "+trainer+" Starting from 23-Jun-21 @6:30 AM IST";
		
		return msg;
	}
}
