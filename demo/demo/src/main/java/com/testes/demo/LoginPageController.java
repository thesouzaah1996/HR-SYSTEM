package com.testes.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginPageController {

    @RequestMapping("/login")
    public String showLoginPage() {
        return "login-page";
    }

    @RequestMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }
}
