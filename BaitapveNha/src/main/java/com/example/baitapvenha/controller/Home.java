package com.example.baitapvenha.controller;

import com.example.baitapvenha.model.Employee;
import com.example.baitapvenha.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("employee", EmployeeService.employees);
        return "home";
    }
    @GetMapping("/create")
    public String showCreate() {
        return "create";
    }
    @PostMapping("/create")
    public String create(int id, String name, int age, int salary, String branch){
        Employee employee = new Employee(id,name,age,salary,branch);
        EmployeeService.employees.add(employee);
        return "redirect:/home";
    }
    @GetMapping ("/delete/{id}")
    public String delete(@PathVariable int id){
        EmployeeService.delete(id);
        return "redirect:/home";
    }
    @GetMapping("/detail/{id}")
    public String details(@PathVariable int id, Model model){
        model.addAttribute("detail",EmployeeService.findbyid(id));
        return "detail";
    }
}

