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
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public String getEmployeePage(Model model) {
        model.addAttribute("allEmployees", employeeService.getEmployees());
        return "employee";
    }
    @PostMapping
    public String registerEmployee(@ModelAttribute Employee employee, Model model) {
        employeeService.createEmployee(employee);
        model.addAttribute("allEmployee",employeeService.getEmployees());
        return "redirect:employee";
    }
}
