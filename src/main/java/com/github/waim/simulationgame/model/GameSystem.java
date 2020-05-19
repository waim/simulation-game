package com.github.waim.simulationgame.model;

import java.util.ArrayList;
/**
 * ゲームシステム
 * @author waim
 *
 */
public class GameSystem {

	/**
	 * プレイヤーを生成する
	 * @param playerName プレイヤー名
	 * @return
	 */
	public Player newPlayer(String playerName) {
		// プレイヤーデータの生成
		Player player = new Player(
				playerName
				, "高校生"
				, "2年"
				, 0
				, 0
				, 0
				, 0
		);
		return player;
	}

	/**
	 * NPCを生成する
	 * @return
	 */
	public NPC newNpc(Player player) {
		// NPCデータの読み込み

		// NPCの生成
		NPC npc1 = new NPC(
				1
				, "女学生K"
				, "(・∀・)"
				, "高校生"
				, "3年"
				, "NPC説明テキスト"
				, true
				, "攻略難易度"
				, 0
		);

		// NPCの台詞を生成する
		ArrayList<String> messages = new ArrayList<String>();
		messages.add(player.getName() + "さん おはよう。");
		messages.add(player.getName() + "さんは" + player.getGrade() + "生なんだね。僕は" + npc1.getGrade() + "だよ。");
		messages.add(player.getName() + "さん よろしくね。");

		npc1.setMessages(messages);

		return npc1;
	}
}
