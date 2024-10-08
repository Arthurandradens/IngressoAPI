package br.com.spring.conectaAI.repository;

import br.com.spring.conectaAI.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User,Long> {

   UserDetails findByEmail(String email);
}
