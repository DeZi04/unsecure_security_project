package com.very.secure;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class SQLSecureController {
  @GetMapping("/sql/secure")
  public String sqlPage() {
    return "/sql";
  }

  @PostMapping("/sql/secure/input")
  public String input(@RequestParam String input, Model model) {
    return "/sql";
  }
}
