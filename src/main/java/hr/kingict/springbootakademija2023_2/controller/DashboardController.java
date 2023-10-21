package hr.kingict.springbootakademija2023_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping(value = "/dashboard")
    public String getDashboard(){
        return "dashboard.html";
    }
}
