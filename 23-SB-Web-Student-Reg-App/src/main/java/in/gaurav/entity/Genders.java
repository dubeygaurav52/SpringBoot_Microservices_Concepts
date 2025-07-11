package in.gaurav.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "GENDERS")
public class Genders {

	@Id
	@Column(name = "GENDER_ID")
	private Integer genderId;
	
	@Column(name = "GENDER_NAME")
	private String genderName;
}
