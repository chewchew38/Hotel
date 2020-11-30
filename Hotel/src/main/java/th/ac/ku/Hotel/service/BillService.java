package th.ac.ku.Hotel.service;
import org.springframework.stereotype.Service;
import th.ac.ku.Hotel.model.Bill;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BillService {
    private List<Bill> billList;
@PostConstruct
    public void postConstruct(){
    this.billList = new ArrayList<>();
}
    public void createBill(Bill bill){ billList.add(bill); }
    public List<Bill> getBills() {
        return new ArrayList<>(this.billList);
    }
}

