package in.gaurav.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.gaurav.entity.QuestionWrapper;
import in.gaurav.entity.Quiz;
import in.gaurav.entity.Responce;
import in.gaurav.feign.QuizInterface;
import in.gaurav.repository.QuizRepository;

@Service
public class QuizService {

	@Autowired
	QuizRepository quizRepository;
	
	@Autowired
     QuizInterface quizInterface;
	
	public ResponseEntity<String>createQuiz( String category, int numQ, String title){
		
		List<Integer> questionsForQuiz = quizInterface.getQuestionsForQuiz(category, numQ).getBody();
		Quiz quiz=new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionIds(questionsForQuiz);
		quizRepository.save(quiz);
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<QuestionWrapper>>getQuizQuestions(Integer id){
		Quiz quiz = quizRepository.findById(id).get();
		List<Integer> questionIds = quiz.getQuestionIds();
		System.out.println("questionIds"+questionIds);
		ResponseEntity<List<QuestionWrapper>>  questionForUser=quizInterface.getQuestionsFromId(questionIds);
System.out.println("questionForUser"+questionForUser);
		return questionForUser;
	}
	
	public ResponseEntity<Integer>calculateResult(Integer id,List<Responce> responses){
		ResponseEntity<Integer> score = quizInterface.getScore(responses);
		return score;
	}
}
