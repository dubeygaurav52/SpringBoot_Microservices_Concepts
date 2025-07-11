package in.gaurav.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.gaurav.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Serializable>{

}
