package in.gaurav.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import in.gaurav.entity.Question;
import in.gaurav.entity.QuestionWrapper;
import in.gaurav.entity.Quiz;
import in.gaurav.entity.Responce;
import in.gaurav.repository.QuestionRepository;
import in.gaurav.repository.QuizRepository;

@Service
public class QuizService {

	@Autowired
	QuizRepository quizRepository;
	
	@Autowired
	QuestionRepository questionRepository;
	
	public ResponseEntity<String>createQuiz( String category, int numQ, String title){
		
		List<Question> questionList = questionRepository.findRandomQuestionsByCategory(category,numQ);
		System.out.println("questionList"+questionList);
		Quiz quiz=new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questionList);
		quizRepository.save(quiz);
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<QuestionWrapper>>getQuizQuestions(Integer id){
		Optional<Quiz> quiz = quizRepository.findById(id);
		List<Question> questionsFromDB = quiz.get().getQuestions();
		List<QuestionWrapper> questionForUser=new ArrayList<>();
		for (Question q : questionsFromDB) {
			QuestionWrapper qW=new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
			System.out.println("qW"+qW);
			questionForUser.add(qW);
		}
		return new ResponseEntity<>(questionForUser, HttpStatus.OK);
	}
	
	public ResponseEntity<Integer>calculateResult(Integer id,List<Responce> responses){
		Quiz quiz = quizRepository.findById(id).get();
		List<Question> questions = quiz.getQuestions();
		int right=0;
		int i=0;
		
		for (Responce response : responses) {
			System.out.println("response"+response);
			if(response.getResponce().equals(questions.get(i).getRightAnswer())) {
				right++;
				System.out.println("right++"+response.getResponce().equals(questions.get(i).getRightAnswer()));
			}
			i++;
		}
		System.out.println("right"+right);
		return new ResponseEntity<Integer>(right, HttpStatus.OK);
	}
}
