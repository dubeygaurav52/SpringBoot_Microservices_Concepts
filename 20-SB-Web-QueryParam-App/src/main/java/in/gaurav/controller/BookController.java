package in.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {

	@GetMapping("/price")
	@ResponseBody
	public String getBookPrice(@RequestParam(value = "isbn",required = false,defaultValue = "ISBN009") String str) {
		String msg="The Book Price of "+str+" Is : 450.00";
		return msg;
	}
}
