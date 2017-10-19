package com.andersonlfeitosa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  
  @Value("${password}")
  private String password;

  @RequestMapping("cipher")
  public String sayHello() {
    return "The password is " + password;
  }

}
