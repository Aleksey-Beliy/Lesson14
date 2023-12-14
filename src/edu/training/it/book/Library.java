package edu.training.it.book;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> list = new ArrayList<>();

	public Library() {
	}

	public void add(Book book) {
		list.add(book);
	}

	public List<Book> listBookByAutor(String autor) {
		List<Book> bookByAutor = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getAutor().equals(autor)) {
				bookByAutor.add(list.get(i));
			}
		}
		return bookByAutor;
	}

	public List<Book> listBookByPublishisHouse(String publishisHouse) {
		List<Book> bookByPublishisHouse = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getPublishisHouse().equals(publishisHouse)) {
				bookByPublishisHouse.add(list.get(i));
			}
		}

		return bookByPublishisHouse;
	}

	public List<Book> listBookByYear(int year) {
		List<Book> bookByYear = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getYearOfPublishis() > year) {
				bookByYear.add(list.get(i));
			}
		}

		return bookByYear;
	}

	public void print() {
		for (Book book : list) {
			System.out.println(book.toString());

		}
	}
}
