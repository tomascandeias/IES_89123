package ies.tc.randommoviequotes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RESTController{
	@GetMapping(value = "/quote")
	public String getQuote(){
		String uri = "https://movie-quote-api.herokuapp.com/v1/quote/";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, String.class);
	}

	@GetMapping(value = "/shows")
	public String getShows(){
		String uri = "https://movie-quote-api.herokuapp.com/v1/shows/";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, String.class);
	}

	@GetMapping(value = "/quotes")
	public String getShowBySlug(@RequestParam(name = "show", defaultValue = "mindhunter") String show){
		String uri = String.format("https://movie-quote-api.herokuapp.com/v1/shows/%s", show);
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, String.class);
	}
}