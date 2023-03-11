package br.com.hermes.certification.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional << //TODO Doc erro proxy ?
public class UserService {
	
	//TODO Doc

	@Autowired
	private UserRepository userRepository;
	
	//TODO encrypt pw
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow();
	}
	
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}
	
	
	

}
