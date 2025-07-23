package in.gaurav.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.gaurav.entity.Question;
import in.gaurav.entity.QuestionWrapper;
import in.gaurav.entity.Quiz;
import in.gaurav.entity.Responce;
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

	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String category, Integer numQuestions) {
		List<Integer> questionList = questionRepository.findRandomQuestionsByCategory(category,numQuestions);
		
		return new ResponseEntity<>(questionList, HttpStatus.OK);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
		List<QuestionWrapper> wrappers=new ArrayList<>();
		List<Question> questions=new ArrayList<>();
		for (Integer id : questionIds) {
			questions.add(questionRepository.findById(id).get());
		}
		for (Question question : questions) {
			QuestionWrapper wrapper=new QuestionWrapper();
			wrapper.setId(question.getId());
			wrapper.setQuestionTitle(question.getQuestionTitle());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			wrapper.setOption4(question.getOption4());
			wrappers.add(wrapper);
		}
		
		return new ResponseEntity<>(wrappers, HttpStatus.OK);
	}

	public ResponseEntity<Integer> getScore(List<Responce> responces) {
		
		int right=0;
		
		for (Responce response : responces) {
			Question question = questionRepository.findById(response.getId()).get();
			if(response.getResponce().equals(question.getRightAnswer())) {
				right++;
			}
			
		}
		System.out.println("right"+right);
		return new ResponseEntity<Integer>(right, HttpStatus.OK);
		
	}
}
