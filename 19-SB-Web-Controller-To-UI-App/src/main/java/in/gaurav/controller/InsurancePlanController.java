package in.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.gaurav.pojo.Plan;

@Controller
public class InsurancePlanController {

	@GetMapping("/plandata")
	@ResponseBody
	public Plan getPlanData() {
		
		Plan p=new Plan();
		p.setPlanId(101);
		p.setPlanName("Jeevan Anand");
		p.setPlanStatus("Approved");
		return p;
	}
}
