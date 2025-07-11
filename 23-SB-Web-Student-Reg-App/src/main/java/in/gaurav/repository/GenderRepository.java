package in.gaurav.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.gaurav.entity.Genders;

public interface GenderRepository extends JpaRepository<Genders, Serializable>{

}
