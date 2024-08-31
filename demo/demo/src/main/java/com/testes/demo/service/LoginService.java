package com.testes.demo.service;

import com.testes.demo.entity.Login;
import com.testes.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Login logarUsuario(String login, String senhaHash) {
        return loginRepository.findByLoginAndSenhaHash(login, senhaHash);
    }
}
