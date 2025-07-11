package in.gaurav.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "STOCK_PRICE_DTLS")
@Data
public class StockPrice {

	@Id
	@Column(name = "STOCK_PRICE_ID")
	private Integer stockPriceId;
	
	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	@Column(name = "COMPANY_STOCK_PRICE")
	private Double companyStockPrice;
	
}
