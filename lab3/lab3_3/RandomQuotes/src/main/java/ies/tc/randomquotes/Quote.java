package ies.tc.randomquotes;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Quote")
public class Quote extends Movie{
	@Getter @Setter
	private String quote;
	@Getter @Setter
	private long movieId;
	@Getter @Setter
	private String title;
	@Getter @Setter
	private int year;
}