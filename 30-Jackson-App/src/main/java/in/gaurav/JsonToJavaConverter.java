package in.gaurav;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.gaurav.response.Book;

public class JsonToJavaConverter {
//De-Serialization process
	public static void main(String[] args) throws Exception {
		File file=new File("Book.json");
		ObjectMapper mapper=new ObjectMapper();
		Book value = mapper.readValue(file, Book.class);
		System.out.println(value);
	}
}
