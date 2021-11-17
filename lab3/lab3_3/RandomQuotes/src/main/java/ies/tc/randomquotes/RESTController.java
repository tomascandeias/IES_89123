package ies.tc.randomquotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RESTController{

	@Autowired
	private MovieService service;

	@PostMapping(value = "/movies")
	public Quote addQuote(@RequestBody Quote q){
		return service.saveQuote(q);
	}

	@PostMapping(value = "/movies")
	public List<Quote> addQuotes(@RequestBody List<Quote> lst){
		return service.saveQuotes(lst);
	}

	@GetMapping(value = "/movies")
	public List<Quote> getMovieById(@RequestParam(name = "id") long id){
		return service.getMovieById(id);
	}

	@GetMapping(value = "/movies")
	public List<Quote> getMovieContainsTitle(@RequestParam(name = "title") String title){
		return service.getMovieByTitle(title);
	}

	@GetMapping(value = "/movies")
	public List<Quote> getAllMovieQuotes(){
		return service.getQuotes();
	}
}
