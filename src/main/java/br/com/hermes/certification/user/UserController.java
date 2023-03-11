package br.com.hermes.certification.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public User findUserById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void deleteUserById(@PathVariable Long id) {
		userService.deleteUserById(id);
	}

}
