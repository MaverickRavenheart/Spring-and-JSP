package com.example.rnd.testjsp.controller.customer;

import com.example.rnd.testjsp.dto.customer.CustomerDTO;
import com.example.rnd.testjsp.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/app/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("")
    public String index(Model model){
        List<CustomerDTO> allCustomer=customerService.getAllCustomer();
        model.addAttribute("customers",allCustomer);
        model.addAttribute("page","customer-table.jsp");
        return "/add-customer";
    }

    @GetMapping("/add")
    public String formAdd(Model model){
        model.addAttribute("customer",new CustomerDTO());
        model.addAttribute("addCustomerSuccess",false);
        model.addAttribute("page","customer-detail.jsp");
        return "/add-customer";
    }

    @GetMapping("/update/{id}")
    public String index(@PathVariable("id")Long id,Model model){
        CustomerDTO dto=customerService.getCustomerById(id);
        model.addAttribute("customer",dto);
        model.addAttribute("page","customer-detail.jsp");
        return "/add-customer";
    }

    @PostMapping("")
    public RedirectView redirectPage(@ModelAttribute("customer") CustomerDTO dto,Model model, RedirectAttributes redirectAttributes){
        final RedirectView redirectView = new RedirectView("/app/customer", true);
        CustomerDTO dtores=customerService.saveCustomer(dto);
        return redirectView;
    }



    @PostMapping("/update")
    public RedirectView updatePage(@ModelAttribute("customer") CustomerDTO dto,Model model, RedirectAttributes redirectAttributes){
        final RedirectView redirectView = new RedirectView("/app/customer", true);
        CustomerDTO dtores=customerService.saveCustomer(dto);
        return redirectView;
    }

    @PostMapping("/delete/{id}")
    public RedirectView updatePage(@PathVariable("id")Long id, RedirectAttributes redirectAttributes){
        final RedirectView redirectView = new RedirectView("/app/customer", true);
        Long idRes=customerService.deleteCustomer(id);
        return redirectView;
    }

}
