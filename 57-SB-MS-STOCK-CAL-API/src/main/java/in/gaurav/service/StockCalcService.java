package in.gaurav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.gaurav.client.StockPriceClient;
import in.gaurav.response.StockCalciApiResponse;
import in.gaurav.response.StockPriceApiResponse;

@Service
public class StockCalcService {

	@Autowired
	private StockPriceClient priceClient;
	
	public StockCalciApiResponse getStocksCost(String companyName,Integer quantity) {
		StockCalciApiResponse response=new StockCalciApiResponse();
		
		//Access stock price api with company name
		StockPriceApiResponse invokeStockPriceApi = priceClient.invokeStockPriceApi(companyName);
		
		Double companyStockPrice = invokeStockPriceApi.getCompanyStockPrice();
		
		//Calculating total stock cost based on the price and quantity
		Double totalCost=companyStockPrice * quantity;
		
		response.setCompanyName(companyName);
		response.setPortNumber(invokeStockPriceApi.getPortNumber());
		response.setQuantity(quantity);
		response.setTotalCost(totalCost);
		
		return response;
	}
}
