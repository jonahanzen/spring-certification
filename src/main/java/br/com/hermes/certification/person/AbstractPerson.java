package br.com.hermes.certification.person;

import static java.util.UUID.randomUUID;
import static javax.persistence.GenerationType.IDENTITY;
import static org.springframework.util.StringUtils.hasLength;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbstractPerson {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	
	private String uuid;
	
	@PrePersist
	private void uuid() {
		if (!hasLength(uuid)) {
			uuid = randomUUID().toString();
		}
	}

}
