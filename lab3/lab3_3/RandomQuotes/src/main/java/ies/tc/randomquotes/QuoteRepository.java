package ies.tc.randomquotes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface QuoteRepository extends JpaRepository<Quote, Long> {
	List<Quote> findByMovieId(long id);
	//List<Quote> findByMovieTitleContainsIgnoreCase(String title);

	@Query("select q from Quote q where q.title like %?1%")
	List<Quote> findByMovie_TitleContains(String title);
}
