package in.gaurav.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.gaurav.entity.Question;
import in.gaurav.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	public ResponseEntity<List<Question>>getAllQuestions() {
		try {
			return new ResponseEntity(questionRepository.findAll(), HttpStatus.OK) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity(new ArrayList<>(), HttpStatus.BAD_REQUEST) ;
	}
	
	public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
		try {
		return new ResponseEntity(questionRepository.findByCategory(category), HttpStatus.OK) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity(new ArrayList<>(), HttpStatus.BAD_REQUEST) ;
	}
	
	public ResponseEntity<String> addQuestions(Question question) {
		 questionRepository.save(question);
		 return new ResponseEntity<String>("success", HttpStatus.CREATED);
	}
}
