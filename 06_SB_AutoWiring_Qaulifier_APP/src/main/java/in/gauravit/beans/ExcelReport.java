package in.gauravit.beans;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport{

	public ExcelReport() {
		System.out.println("ExcelReport::Constructor");
	}
	
	@Override
	public void generate() {
		System.out.println("Excel report is generating....");
		
	}

}
