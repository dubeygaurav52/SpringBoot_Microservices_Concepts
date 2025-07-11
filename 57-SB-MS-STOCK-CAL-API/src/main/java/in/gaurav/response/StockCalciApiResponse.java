package in.gaurav.response;

import lombok.Data;

@Data
public class StockCalciApiResponse {

	private String companyName;
	private Double totalCost;
	private Integer portNumber;
	private Integer quantity;
}
