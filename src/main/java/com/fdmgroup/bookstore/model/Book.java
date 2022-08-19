package com.fdmgroup.bookstore.model;

import java.util.Objects;

public class Book {

	private Integer itemId;
	private Double price;
	private String title;
	private String author;
	private BookGenre bookGene;

	public Book() {

	}

	public Book(Integer itemId, Double price, String title, String author, BookGenre bookGene) {
		super();
		this.itemId = itemId;
		this.price = price;
		this.title = title;
		this.author = author;
		this.bookGene = bookGene;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BookGenre getBookGene() {
		return bookGene;
	}

	public void setBookGene(BookGenre bookGene) {
		this.bookGene = bookGene;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookGene, itemId, price, title);
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
		return Objects.equals(author, other.author) && bookGene == other.bookGene
				&& Objects.equals(itemId, other.itemId) && Objects.equals(price, other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [itemId=" + itemId + ", price=" + price + ", title=" + title + ", author=" + author + ", bookGene="
				+ bookGene + "]";
	}

}
