package in.gaurav.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.gaurav.response.StockCalciApiResponse;
import in.gaurav.service.StockCalcService;

@RestController
public class StockCalcRestController {

	@Autowired
	private StockCalcService calcService;
	
	@GetMapping("/calc/{companyName}/{quantity}")
	public StockCalciApiResponse getStocksCost(@PathVariable String companyName,@PathVariable Integer quantity) {
		return calcService.getStocksCost(companyName, quantity);
	}
}
