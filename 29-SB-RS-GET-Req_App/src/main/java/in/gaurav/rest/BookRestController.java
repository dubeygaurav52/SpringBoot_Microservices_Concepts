package in.gaurav.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.gaurav.response.Book;

@RestController
public class BookRestController {

	@GetMapping("/book")
	public Book getBookData() {
		
		Book book=new Book(101, "Spring", 450.00);
		return book;
	}
}
