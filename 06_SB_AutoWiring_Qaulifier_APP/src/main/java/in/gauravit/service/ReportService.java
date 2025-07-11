package in.gauravit.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.gauravit.beans.IReport;

@Service
public class ReportService {

	//@Autowired
	private IReport iReport;
	
	public ReportService(@Qualifier("pdf") IReport iReport) {
		System.out.println("ReportService::Constructor");
		this.iReport=iReport;
	}

	public void generateReport() {
		iReport.generate();
		System.out.println("Report generation Completed....");
	}
}
