package com.github.waim.simulationgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * SimulationGameApplication
 * @author waim
 *
 */
@SpringBootApplication
@Controller
public class SimulationGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulationGameApplication.class, args);
	}

	@GetMapping("/")
	public String show(Model model) {
		ViewParam viewParam = new ViewParam();
		viewParam.setName("");
//		viewParam.setIsFirstTime(true);

		model.addAttribute("viewParam", viewParam);

		// 起動するtemplatesのhtml名を返す
		return "index";
	}

	@PostMapping("/")
	public String submit(ViewParam viewParam) {
//		viewParam.setIsFirstTime(false);
		return "index";
	}

}
