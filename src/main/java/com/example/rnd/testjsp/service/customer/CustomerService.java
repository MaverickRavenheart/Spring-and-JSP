package com.example.rnd.testjsp.service.customer;

import com.example.rnd.testjsp.dto.customer.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO getCustomerById(Long id);

    CustomerDTO saveCustomer(CustomerDTO dto);

    List<CustomerDTO> getAllCustomer();

    Long deleteCustomer(Long id);
}
