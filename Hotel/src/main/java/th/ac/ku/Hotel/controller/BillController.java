package th.ac.ku.Hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.Hotel.model.Bill;
import th.ac.ku.Hotel.service.BillService;

@Controller
@RequestMapping("/bill")
public class BillController {
    private BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }
    @GetMapping
    public String getBillPage(Model model) {
        model.addAttribute("allBills", billService.getBills());
        return "bill"; }
    @PostMapping
    public String registerBill(@ModelAttribute Bill bill, Model model) {
        billService.createBill(bill);
        model.addAttribute("allBills", billService.getBills());
        return "redirect:bill";
    }
}
