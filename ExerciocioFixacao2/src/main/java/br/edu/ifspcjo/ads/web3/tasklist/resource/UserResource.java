package br.edu.ifspcjo.ads.web3.tasklist.resource;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifspcjo.ads.web3.tasklist.domain.model.User;
import br.edu.ifspcjo.ads.web3.tasklist.repository.UserRepository;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@GetMapping("/users")
	public List<User> listar(){
		var user1 = new User();
		user1.setId(1L);
		user1.setName("Giovanna Vitorino");
		user1.setEmail("giovanna.vitorino@aluno.ifsp.edu.br");
		user1.setPassword("cjoweb3");
		user1.setActive(true);
		
		var user2 = new User();
		user2.setId(2L);
		user2.setName("Adriana Santos");
		user2.setEmail("adrianasantos@ifsp.edu.br");
		user2.setPassword("adriana");
		user2.setActive(true);
		
		return Arrays.asList(user1, user2);	
	}

		@Autowired
		private UserRepository userRepository;
		
		@GetMapping
		public List<User> list(){
			return userRepository.findAll();
		}

		@PostMapping
		public User create(@RequestBody User user, HttpServletResponse response) {
			return userRepository.save(user);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<User> findById(@PathVariable Long id){
			Optional<User> user = userRepository.findById(id);
			if(user.isPresent()) {
				return ResponseEntity.ok(user.get());
			}
			return ResponseEntity.notFound().build();
		}

		
	}

	

