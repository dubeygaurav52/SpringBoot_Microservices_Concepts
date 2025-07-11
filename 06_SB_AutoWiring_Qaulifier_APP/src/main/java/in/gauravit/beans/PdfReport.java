package in.gauravit.beans;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport{

	public PdfReport() {
		System.out.println("PdfReport::Constructor");
	}

	@Override
	public void generate() {
		System.out.println("PdfReport is generating....");
		
	}

}
