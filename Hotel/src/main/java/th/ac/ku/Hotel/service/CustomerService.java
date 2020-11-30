package th.ac.ku.Hotel.service;
import org.springframework.stereotype.Service;
import th.ac.ku.Hotel.model.Customer;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customerList;
@PostConstruct
    public void postConstruct(){
        this.customerList = new ArrayList<>();
    }
    public void createCustomer(Customer customer){
        customerList.add(customer);
    }
    public List<Customer> getCustomers() {
        return new ArrayList<>(this.customerList);
    }
}
