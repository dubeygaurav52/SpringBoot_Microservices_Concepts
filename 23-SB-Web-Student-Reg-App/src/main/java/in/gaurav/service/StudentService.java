package in.gaurav.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.gaurav.entity.Courses;
import in.gaurav.entity.Genders;
import in.gaurav.entity.Timings;
import in.gaurav.repository.CoursesRepository;
import in.gaurav.repository.GenderRepository;
import in.gaurav.repository.TimingsRepository;

@Service
public class StudentService {

	@Autowired
	private GenderRepository genderRepository;
	
	@Autowired
	private CoursesRepository coursesRepository;
	
	@Autowired
	private TimingsRepository timingsRepository;
	
	public List<String> getGenders() {
		List<Genders> all = genderRepository.findAll();
		
		List<String> genders=new ArrayList<>();
		all.forEach(gender->{
			genders.add(gender.getGenderName());
		});
		
		return genders;
	}
	
	public List<String> getCourse() {
		List<Courses> all = coursesRepository.findAll();
		
		List<String> courses=new ArrayList<>();
		all.forEach(course->{
			courses.add(course.getCourseName());
		});
		
		return courses;
	}
	
	public List<String> getTimings() {
		List<Timings> all = timingsRepository.findAll();
		
		List<String> timings=new ArrayList<>();
		all.forEach(timing->{
			timings.add(timing.getTimingName());
		});
		
		return timings;
	}
}
