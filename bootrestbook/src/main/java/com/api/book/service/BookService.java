package com.api.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.entities.Book;

@Component
public class BookService {

	
	private static List<Book> list=new ArrayList<>();
	
	static
	{
		list.add(new Book(123,"Java complete referencer","xyz"));
		list.add(new Book(124,"Head first of java","ABC"));
		list.add(new Book(125,"Think in java","LMN"));
		
	}
	
	public List<Book> getAllBook(){
		
		return list;
	}
	
	public Book getBookById(int id) {
		Book book=null;
		try {
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		}catch(Exception e) {
			e.printStackTrace();	
		}
		return book;
	}
	
	public Book addBook(Book b) {
		
		list.add(b);
		return b;
	}
	
	public void deleteBook(int bId) {
		list=list.stream().filter(books->books.getId()!=bId).collect(Collectors.toList());
	}
	
	public void updateBook(Book book,int bookId) {
		list.stream().map(b->{
			if(b.getId()==bookId) {
				b.setAuthor(book.getAuthor());
				b.setTitle(book.getTitle());
			}
			return  b;
		}).collect(Collectors.toList());
		
	}
	
	
}
