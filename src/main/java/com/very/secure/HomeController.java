package com.very.secure;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Controller
public class HomeController {

	@GetMapping("/")
	public String loginView(@RequestParam String txt, Model model) {

		model.addAttribute("text", txt);

		return "index";
	}
}
