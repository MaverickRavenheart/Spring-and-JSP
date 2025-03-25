package com.example.rnd.testjsp.dto.customer;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CustomerDTO {
    private Long idCustomer;
    private String fullName;
    private String email;

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
