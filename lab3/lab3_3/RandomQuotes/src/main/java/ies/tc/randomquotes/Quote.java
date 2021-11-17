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
}

