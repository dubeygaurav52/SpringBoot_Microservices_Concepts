package in.gaurav.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TIMINGS")
public class Timings {

	@Id
	@Column(name = "TIMING_ID")
	private Integer timingId;
	
	@Column(name = "TIMING_NAME")
	private String timingName;
}
