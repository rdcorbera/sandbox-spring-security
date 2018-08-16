package com.smartnodes.security.csrfngcookieless.rest;

import java.util.concurrent.atomic.AtomicLong;

import com.smartnodes.security.csrfngcookieless.model.Customer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/customer")
  public Customer get() {
    return new Customer(counter.incrementAndGet(), "Ricardo Corbera");
  }

  @PostMapping("/customer")
  public Customer create() {
    return new Customer(counter.incrementAndGet(), "New Customer");
  }
}