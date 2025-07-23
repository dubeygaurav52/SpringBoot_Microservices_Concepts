package in.gaurav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.gaurav.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{

	public List<Question>findByCategory(String category);
	
	@Query(value = "SELECT id FROM question  WHERE category = :category ORDER BY RAND() LIMIT :numQ",nativeQuery = true)
	List<Integer> findRandomQuestionsByCategory(String category,int numQ);
}
