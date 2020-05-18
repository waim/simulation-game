package com.github.waim.simulationgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.github.waim.simulationgame.model.GameSystem;
import com.github.waim.simulationgame.model.NPC;
import com.github.waim.simulationgame.model.Player;

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

		model.addAttribute("viewParam", viewParam);

		// 起動するtemplatesのhtml名を返す
		return "index";
	}

	@PostMapping("/")
	public String submit(ViewParam viewParam) {
		GameSystem gSystem = new GameSystem();

		// プレイヤーを生成する
		Player player = gSystem.newPlayer(viewParam.getName());

		// NPCを適当に作る
		NPC npc1 = gSystem.newNpc(player);

		// NPCがしゃべる
		String message = npc1.randomSay();
		viewParam.setMessage(npc1.getName() + ":" + message);

		return "index";
	}


}
