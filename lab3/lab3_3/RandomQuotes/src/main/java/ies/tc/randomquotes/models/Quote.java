package ies.tc.randomquotes.models;

public class Quote extends Movie{
	private String quote;

	public Quote(long id, String title, int year, String quote) {
		super(id, title, year);
		this.quote = quote;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
}

