package com.testes.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
    @RequestMapping("/dashboard")
    public String mostrarDashboard() {
        return "dashboard";
    }
}
