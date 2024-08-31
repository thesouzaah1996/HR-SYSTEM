package com.testes.demo.controller;

import com.testes.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPageController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String mostrarPaginaLogin() {
        return "login-page";
    }

    @PostMapping("/logarUsuario")
    public String logarUsuario(@RequestParam String login,
                               @RequestParam String senhaHash,
                               Model model) {
        boolean podelogar = loginService.logarUsuario(login, senhaHash) != null;

        if (podelogar) {
            System.out.println("Logado com sucesso.");
            return "dashboard";
        } else {
            System.out.println("Erro ao logar.");
            return "login-page";
        }
    }
}
