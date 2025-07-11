package in.gaurav.service;

import in.gaurav.bindings.StockPriceResponse;

public interface StockPriceService {

	public StockPriceResponse getStockePrice(String companyName);
}
