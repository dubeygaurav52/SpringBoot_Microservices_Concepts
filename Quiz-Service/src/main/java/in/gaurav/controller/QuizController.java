package in.gaurav.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.gaurav.entity.QuestionWrapper;
import in.gaurav.entity.QuizDto;
import in.gaurav.entity.Responce;
import in.gaurav.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {

	@Autowired
	QuizService quizService;
	
	@PostMapping("/create")
	public ResponseEntity<String>createQuiz(@RequestBody QuizDto quizDto){
		return quizService.createQuiz(quizDto.getCategory(),quizDto.getNumQ(),quizDto.getTitle());
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<List<QuestionWrapper>>getQuizQuestions(@PathVariable Integer id){
		return quizService.getQuizQuestions(id);
	}
	
	@PostMapping("/submit/{id}")
	public ResponseEntity<Integer>calculateResult(@PathVariable Integer id,@RequestBody List<Responce> response){
		return quizService.calculateResult(id,response);
	}
	
}
