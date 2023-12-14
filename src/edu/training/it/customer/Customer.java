package edu.training.it.customer;

import java.util.Objects;

public class Customer {

	public Customer(int id, String fullName, String cardNum, int bankNum) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.cardNum = cardNum;
		this.bankNum = bankNum;
	}

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public int getBankNum() {
		return bankNum;
	}

	public void setBankNum(int bankNum) {
		this.bankNum = bankNum;
	}

	@Override
	public String toString() {
		return "Customer [id = " + id + ", Ф.И.О = " + fullName + ", Номер карты = " + cardNum
				+ ", Номер банковского счета = " + bankNum + "]";
	}

	private int id;
	private String fullName;
	private String cardNum;
	private int bankNum;

	@Override
	public int hashCode() {
		return Objects.hash(bankNum, cardNum, fullName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return bankNum == other.bankNum && cardNum == other.cardNum && Objects.equals(fullName, other.fullName)
				&& id == other.id;
	}

}
