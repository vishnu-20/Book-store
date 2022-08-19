package com.fdmgroup.bookstore.model;

import java.util.Objects;

public class Ebook extends Book {

	private Double timeLengthSeconds;

	public Ebook(Double timeLengthSeconds) {
		super();
		this.timeLengthSeconds = timeLengthSeconds;
	}

	public Ebook() {

	}

	public Double getTimeLengthSeconds() {
		return timeLengthSeconds;
	}

	public void setTimeLengthSeconds(Double timeLengthSeconds) {
		this.timeLengthSeconds = timeLengthSeconds;
	}

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
		Ebook other = (Ebook) obj;
		return Objects.equals(timeLengthSeconds, other.timeLengthSeconds);
	}
	
	

}
