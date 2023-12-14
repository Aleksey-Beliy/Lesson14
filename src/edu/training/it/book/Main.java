package edu.training.it.book;

public class Main {

	public static void main(String[] args) {

		Library list = new Library();

		list.add(new Book(1, "Зелёная миля", "Стивен Кинг", "АСТ", 1996, 496, 30, "Твёрдый"));
		list.add(new Book(2, "Унесённые ветром", "Маргарет Митчелл ", "Азбука-Аттикус,", 1936, 640, 50, "Твёрдый"));
		list.add(new Book(3, "Продажное королевство", "Ли Бардуго", "АСТ", 2023, 972, 45, "Мягкий"));
		list.add(new Book(4, "Игра престолов", "Джордж Мартин", "АСТ", 1996, 768, 60, "Твёрдый"));
		list.add(new Book(5, "Крестный отец", "Марио Пьюзо", "Центрполиграф", 2002, 544, 50, "Твёрдый"));

		list.print();

		System.out.println();
		System.out.println(list.listBookByAutor("Стивен Кинг"));
		System.out.println();
		System.out.println(list.listBookByPublishisHouse("АСТ"));
		System.out.println();
		System.out.println(list.listBookByYear(2005));

	}

}
