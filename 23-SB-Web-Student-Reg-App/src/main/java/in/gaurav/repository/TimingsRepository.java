package in.gaurav.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.gaurav.entity.Timings;

public interface TimingsRepository extends JpaRepository<Timings, Serializable>{

}
