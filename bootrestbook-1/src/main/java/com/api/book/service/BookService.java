package com.api.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Component
public class BookService {

	
	//private static List<Book> list=new ArrayList<>();
	
	@Autowired
	private BookRepository bookRepository;
	/*
	 * static { list.add(new Book(123,"Java complete referencer","xyz"));
	 * list.add(new Book(124,"Head first of java","ABC")); list.add(new
	 * Book(125,"Think in java","LMN"));
	 * 
	 * }
	 */
	
	public List<Book> getAllBook(){
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}
	
	public Book getBookById(int id) {
		Book book=null;
		try {
		//book=list.stream().filter(e->e.getId()==id).findFirst().get();
			book = this.bookRepository.findById(id);
		}catch(Exception e) {
			e.printStackTrace();	
		}
		return book;
	}
	
	public Book addBook(Book b) {
		
		//list.add(b);
		Book result = bookRepository.save(b);
		return result;
	}
	
	public void deleteBook(int bId) {
		//list=list.stream().filter(books->books.getId()!=bId).collect(Collectors.toList());
			bookRepository.deleteById(bId);
	}
	
	public void updateBook(Book book,int bookId) {
//		list.stream().map(b->{
//			if(b.getId()==bookId) {
//				b.setAuthor(book.getAuthor());
//				b.setTitle(book.getTitle());
//			}
//			return  b;
//		}).collect(Collectors.toList());
		book.setId(bookId);
		bookRepository.save(book);
		
	}
	
	
}
