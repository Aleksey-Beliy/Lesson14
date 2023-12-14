package edu.training.it.customer;

public class Main {

	public static void main(String[] args) {

		Bank bank = new Bank();

		bank.add(new Customer(1, "Иванов А.А.", "123", 4321));
		bank.add(new Customer(2, "Петров В.В.", "456", 1234));
		bank.add(new Customer(3, "Сидоров Д.Д.", "789", 5678));
		bank.add(new Customer(4, "Пупкин Т.Т.", "100", 3333));
		bank.add(new Customer(5, "Громов А.К.", "999", 9999));
		
		bank.sortName();
		bank.print();

		System.out.println();

		Bank bank2 = new Bank();

		bank2.add(new Customer(1, "Иванов А.А.", "123", 4321));
		bank2.add(new Customer(2, "Петров В.В.", "456", 1234));
		bank2.add(new Customer(3, "Сидоров Д.Д.", "789", 5678));
		bank2.add(new Customer(4, "Пупкин Т.Т.", "100", 3333));
		bank2.add(new Customer(5, "Громов А.К.", "999", 9999));

		bank2.findByCard("1", "500");
		bank2.print();

	}

}
