package in.gaurav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import in.gaurav.bindings.StockPriceResponse;
import in.gaurav.repository.StockPriceRepository;
@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepository priceRepository;
	
	@Autowired
	private Environment environment;
	
	@Override
	public StockPriceResponse getStockePrice(String companyName) {
		Double stockPriceByCompanyName = priceRepository.findStockPriceByCompanyName(companyName);
		System.out.println("stockPriceByCompanyName"+stockPriceByCompanyName);
		StockPriceResponse response=new StockPriceResponse();
		response.setCompanyName(companyName);
		response.setCompanyStockPrice(stockPriceByCompanyName);
		String port = environment.getProperty("server.port");
		response.setPostNumber(Integer.parseInt(port));
		System.out.println("response"+response);
		return response;
	}

}
