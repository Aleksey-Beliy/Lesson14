package edu.training.it.customer;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<Customer> list = new ArrayList<>();

	public Bank() {
	}

	public void add(Customer customer) {
		list.add(customer);
	}

	public void sortName() {
		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;

			for (int i = 0, j = 1; i < list.size() - 1; i++, j++) {
				Customer customer1 = list.get(i);
				Customer customer2 = list.get(j);

				if (customer1.getFullName().compareTo(customer2.getFullName()) > 0) {
					isSorted = false;

					list.set(i, customer2);
					list.set(j, customer1);
				}
			}
		}
	}

	public List<Customer> findByCard(String numberFrom, String numberTo) {
		List<Customer> result = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			Customer customer = list.get(i);

			if (customer.getCardNum().compareTo(numberFrom) > 0 && customer.getCardNum().compareTo(numberTo) < 0) {
				result.add(customer);
			}
		}
		return result;

	}

	public void print() {
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}
	}
}
