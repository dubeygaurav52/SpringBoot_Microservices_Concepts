package in.gaurav;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.gaurav.response.Book;

public class JavaToJsonConvertor {
	//Serialization process
	public static void main(String[] args) throws JsonProcessingException {
		Book book=new Book();
		book.setBookId(101);
		book.setBookName("Spring");
		book.setBookPrice(450.00);
		
		//Convert book data into json
		ObjectMapper mapper=new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);
		System.out.println(json);
	}
}
