package in.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.gaurav.pojo.Product;

@Controller
//@RequestMapping("/prod")
public class ProductController {

	@GetMapping("/productdata")
	public ModelAndView getProductData() {
		
		ModelAndView mav=new ModelAndView();
		Product product=new Product();
		product.setProductId(101);
		product.setProductName("Mango");
		product.setProductPrice(450.00);
		
		mav.addObject("product", product);
		mav.setViewName("product-data");
		return mav;
	}
}
