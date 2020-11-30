package th.ac.ku.Hotel.service;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import th.ac.ku.Hotel.model.Employee;
import th.ac.ku.Hotel.model.EmployeeRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void createEmployee(Employee employee) {
        String hashPin = hash(employee.getPin());
        employee.setPin(hashPin);
        repository.save(employee);
    }
    public Employee findEmployee(int id) {
        try {
            return repository.findById(id).get();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    public Employee checkPin(Employee inputEmployee) {
        Employee storedEmployee = findEmployee(inputEmployee.getId());

        if (storedEmployee != null) {
            String hashPin = storedEmployee.getPin();

            if (BCrypt.checkpw(inputEmployee.getPin(), hashPin))
                return storedEmployee;
        }
        return null;
    }
    private String hash(String pin) {
        String salt = BCrypt.gensalt(12);
        return BCrypt.hashpw(pin, salt);
    }
}
