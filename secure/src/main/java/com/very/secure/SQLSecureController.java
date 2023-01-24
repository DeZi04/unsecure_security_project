package com.very.secure;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.very.secure.model.Entry;

@Controller()
public class SQLSecureController {

	@Autowired
	EntityManager entityManager;

	@GetMapping("/sql/secure")
	public String sqlPage() {
		return "/sql";
	}

	@Transactional
	@PostMapping("/sql/secure/input")
	public String input(@RequestParam String input, Model model) {
		var entry = new Entry();
		entry.setVal("Test123");
		entityManager.persist(entry);

		var results = entityManager.createNativeQuery("select val from entry where val = ?")
				.setParameter(1, input).getResultList();
		if (!results.isEmpty()) {
			System.out.println("sus");
			model.addAttribute("text", results.get(0));
		}
		return "/sql";
	}
}
