package com.very.secure;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Controller
public class XSSController {

	@GetMapping("/xss/insecure")
	public String xssInsecure(@RequestParam(required = false, defaultValue = "default") String input, Model model) {
		model.addAttribute("text", input);

		return "xss/xssInsecure";
	}
}
