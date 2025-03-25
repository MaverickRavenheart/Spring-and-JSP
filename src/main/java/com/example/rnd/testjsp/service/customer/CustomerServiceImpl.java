package com.example.rnd.testjsp.service.customer;

import com.example.rnd.testjsp.dto.customer.CustomerDTO;
import com.example.rnd.testjsp.entity.customer.Customer;
import com.example.rnd.testjsp.repository.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;

    @Override
    public CustomerDTO getCustomerById(Long id) {
        Optional<Customer> customer=repository.findById(id);
        if(!customer.isPresent()){
            return null;
        }
        Customer obj=customer.get();
        CustomerDTO dto=new CustomerDTO();
        dto.setIdCustomer(obj.getIdCustomer());
        dto.setEmail(obj.getEmail());
        dto.setFullName(obj.getFullName());
        return dto;
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO dto) {
        Customer model=new Customer();
        model.setIdCustomer(dto.getIdCustomer());
        model.setEmail(dto.getEmail());
        model.setFullName(dto.getFullName());
        repository.save(model);
        dto.setIdCustomer(model.getIdCustomer());
        return dto;
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer> model=repository.findAll();
        List<CustomerDTO> listDTO=model.stream().map(row->{
            CustomerDTO dto=new CustomerDTO();
            dto.setIdCustomer(row.getIdCustomer());
            dto.setFullName(row.getFullName());
            dto.setEmail(row.getEmail());
            return dto;
        }).collect(Collectors.toList());
        return listDTO;
    }

    @Override
    public Long deleteCustomer(Long id) {
        repository.deleteById(id);
        return id;
    }
}
