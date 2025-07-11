package in.gaurav.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.gaurav.bindings.StockPriceResponse;
import in.gaurav.service.StockPriceService;

@RestController
public class StockPriceRestController {

	@Autowired
	private StockPriceService priceService;
	
	@GetMapping("/price/{companyName}")
	public ResponseEntity<StockPriceResponse> getStockPrice(@PathVariable String companyName){
		StockPriceResponse stockePrice = priceService.getStockePrice(companyName);
		
		return new ResponseEntity<>(stockePrice, HttpStatus.OK);
	}
}
