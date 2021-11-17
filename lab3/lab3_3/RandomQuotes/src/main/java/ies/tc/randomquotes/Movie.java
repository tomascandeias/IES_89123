package ies.tc.randomquotes;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	@Id
	@GeneratedValue
	@Getter @Setter private long id;
	@Getter @Setter private String title;
	@Getter @Setter private int year;
}

