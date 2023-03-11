package br.com.hermes.certification.user;

import static java.util.UUID.randomUUID;
import static javax.persistence.GenerationType.IDENTITY;
import static org.springframework.util.StringUtils.hasLength;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	//TODO Doc
	
	@Id
	@NotNull
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	
	@NotNull
	private String uuid;
	private Boolean active;
	
	@NotNull
	private String password;
	private String email;
	
	@PrePersist
	private void uuid() {
		if(!hasLength(uuid)) {
			uuid = randomUUID().toString();
		}
	}

}
