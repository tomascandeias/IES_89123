package ies.tc.randomquotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

	@Autowired
	private QuoteRepository repository;

	public Quote saveQuote(Quote q) {
		return repository.save(q);
	}

	public List<Quote> saveQuotes(List<Quote> lst) {
		return repository.saveAll(lst);
	}

	public List<Quote> getQuotes() {
		return repository.findAll();
	}

	public List<Quote> getMovieById(long id) {
		return repository.findByMovieId(id);
	}

	public List<Quote> getMovieByTitle(String name) {
		return repository.findByMovie_TitleContains(name);
	}
}
