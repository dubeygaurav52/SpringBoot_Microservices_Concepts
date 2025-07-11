package in.gaurav.response;

import lombok.Data;

@Data
public class StockPriceApiResponse {

	private String companyName;
	private Double companyStockPrice;
	private Integer portNumber;
}
