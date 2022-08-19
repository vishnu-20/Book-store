package com.fdmgroup.bookstore.model;

import java.util.Objects;

public class AudioBook extends Book {

	private Integer timeLengthSeconds;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(timeLengthSeconds);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AudioBook other = (AudioBook) obj;
		return Objects.equals(timeLengthSeconds, other.timeLengthSeconds);
	}

	public AudioBook(Integer timeLengthSeconds) {
		super();
		this.timeLengthSeconds = timeLengthSeconds;
	}

	@Override
	public String toString() {
		return "AudioBook [timeLengthSeconds=" + timeLengthSeconds + "]";
	}

	public AudioBook() {

	}

	public AudioBook(Integer itemId, Double price, String title, String author, BookGenre bookGene) {
		super(itemId, price, title, author, bookGene);

	}

}
