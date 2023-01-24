package com.very.secure;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
