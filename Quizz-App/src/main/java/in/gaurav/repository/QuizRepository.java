package in.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.gaurav.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
