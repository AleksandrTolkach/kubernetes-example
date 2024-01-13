package com.example.sleep;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sleep")
public class Controller {

  @GetMapping
  public String get() {
    return "Time to sleep!!!!!!!!!!!";
  }
}
