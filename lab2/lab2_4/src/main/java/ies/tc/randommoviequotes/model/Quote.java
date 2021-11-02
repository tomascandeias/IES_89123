package ies.tc.randommoviequotes.model;

public class Quote {
	private String quote;
	private String show;
	private String role;
	private boolean adultLang;

	public Quote(String quote, String show, String role, boolean adultLang) {
		this.quote = quote;
		this.show = show;
		this.role = role;
		this.adultLang = adultLang;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isAdultLang() {
		return adultLang;
	}

	public void setAdultLang(boolean adultLang) {
		this.adultLang = adultLang;
	}
}
