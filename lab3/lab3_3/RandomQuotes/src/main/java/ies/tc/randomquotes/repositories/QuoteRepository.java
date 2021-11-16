package ies.tc.randomquotes.repositories;

import ies.tc.randomquotes.models.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
	List<Quote> findByMovieId(long id);
	List<Quote> findByMovieTitleContainsIgnoreCase(String title);

	@Query("select q from Quote q where q.movie.title like %?1%")
	List<Quote> findByMovie_TitleContains(String title);
}
