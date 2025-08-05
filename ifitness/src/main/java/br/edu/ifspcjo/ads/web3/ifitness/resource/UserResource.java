package br.edu.ifspcjo.ads.web3.ifitness.resource;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web3.ifitness.domain.model.Gender;
import br.edu.ifspcjo.ads.web3.ifitness.domain.model.User;


@RestController
public class UserResource {
	
		@GetMapping("/users")
		public List<User> list(){
			User user1 = new User();
			user1.setId(1L);
			user1.setName("Juliana Santos");
			user1.setEmail("julianasantos@email.com");
			user1.setPassword("1234");
			user1.setBirthDate(LocalDate.of(1995, 1, 1));
			user1.setGender(Gender.FEMININO);
			user1.setActive (true);
			
			User user2 = new User();
			user2.setId(2L);
			user2.setName("Adriana Silva");
			user2.setEmail("adrianasilva@email.com");
			user2.setPassword("5678");
			user2.setBirthDate(LocalDate.of(2000, 8, 4));
			user2.setGender(Gender.FEMININO);
			user2.setActive (true);
			
			return Arrays.asList(user1, user2);
		}

}
