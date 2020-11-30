package th.ac.ku.Hotel.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.Hotel.model.Employee;
import th.ac.ku.Hotel.service.EmployeeService;

@Controller
@RequestMapping("/login")
public class LoginController {
    private EmployeeService employeeService;

    public LoginController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public String getLoginPage() {
        return "login";
    }
    @PostMapping
    public String login(@ModelAttribute Employee employee, Model model) {
        Employee matchingEmployee = employeeService.checkPin(employee);

        if (matchingEmployee != null) {
            model.addAttribute("greeting",
                    "Welcome, " + matchingEmployee.getName() +" to the hotel. You can manage the website.");
        } else {
            model.addAttribute("greeting", "Can't find employee");
        }
        return "home";
    }
}

