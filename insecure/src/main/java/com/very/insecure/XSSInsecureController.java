package com.very.insecure;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Controller
public class XSSInsecureController {

	@GetMapping("/xss/insecure")
	public String xssInsecureInitial(){
		return "/xss";
	}

	@PostMapping("/xss/insecure/input")
	public String xssInsecure(@RequestParam String input, Model model) {
		System.out.println(input);
		model.addAttribute("text", input);
		return "/xss";
	}
}
