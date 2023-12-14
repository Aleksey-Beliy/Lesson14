package edu.training.it.book;

import java.util.Objects;

public class Book {

	private int id;
	private String title;
	private String autor;
	private String publishisHouse;
	private int yearOfPublishis;
	private int pages;
	private int price;
	private String binding;

	public Book(int id, String title, String autor, String publishisHouse, int yearOfPublishis, int pages, int price,
			String binding) {
		super();
		this.id = id;
		this.title = title;
		this.autor = autor;
		this.publishisHouse = publishisHouse;
		this.yearOfPublishis = yearOfPublishis;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPublishisHouse() {
		return publishisHouse;
	}

	public void setPublishisHouse(String publishisHouse) {
		this.publishisHouse = publishisHouse;
	}

	public int getYearOfPublishis() {
		return yearOfPublishis;
	}

	public void setYearOfPublishis(int yearOfPublishis) {
		this.yearOfPublishis = yearOfPublishis;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, binding, id, pages, price, publishisHouse, title, yearOfPublishis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(binding, other.binding) && id == other.id
				&& pages == other.pages && price == other.price && Objects.equals(publishisHouse, other.publishisHouse)
				&& Objects.equals(title, other.title) && yearOfPublishis == other.yearOfPublishis;
	}

	@Override
	public String toString() {
		return "Book [id = " + id + ", title = " + title + ", autor = " + autor + ", publishisHouse = " + publishisHouse
				+ ", year = " + yearOfPublishis + ", pages = " + pages + ", price = " + price + ", binding = " + binding
				+ "]";
	}

}
