package com.testes.demo.repository;

import com.testes.demo.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByLoginAndSenhaHash(String login, String senhaHash);
}
