package in.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.gaurav.bindings.Product;

@Controller
public class ProductController {

	@GetMapping("/loadForm")
	public String loadForm(Model model) {
		Product prod=new Product();
		prod.setProductId(101);
		prod.setProductName("Mouse");
		prod.setProductPrice(800.00);
		
		
		model.addAttribute("product", prod);
		
		return "index";
	}
	
	@PostMapping("/saveProduct")
	public String handleSaveBtnClick(Product product,Model model) {
		System.out.println(product);
		
		model.addAttribute("msg", "Product Saved Successfully");
		
		return "dashboard";
		
	}
}
