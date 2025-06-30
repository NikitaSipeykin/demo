package com.example.demo.service.impl;

import com.example.demo.model.CustomerDTO;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomServiceMemoryImpl implements CustomerService {
  private Map<Integer, CustomerDTO> persist = new HashMap<>();

  @Override
  public void addCustomerService(int id, String name) {
    persist.put(id, new CustomerDTO(id, name));
  }

  @Override
  public CustomerDTO getCustomer(int id) {
    return persist.get(id);
  }
}
