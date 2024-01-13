package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bye")
public class Controller {

  @GetMapping
  public String get() {
    return "Bye!!!!!!!!!!!";
  }
}
