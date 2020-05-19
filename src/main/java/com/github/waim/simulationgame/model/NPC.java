package com.github.waim.simulationgame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ノンプレイヤーキャラクター
 * @author waim
 * @version 1.0
 */
public class NPC {
	private int npcId;
	private String name;
	/**
	 * キャラビジュアル
	 */
	private Object visualEffects;
	/**
	 * 身分
	 */
	private String standing;
	/**
	 * 学年
	 */
	private String grade;
	/**
	 * 紹介文
	 */
	private String text;
	/**
	 * 攻略可能か
	 */
	private Boolean canFall;
	/**
	 * 攻略難易度
	 */
	private String difficultyLevel;
	/**
	 * プレイヤーへの好感度
	 */
	private int favorabilityRating;
	/**
	 * プレイヤーに対するメッセージ一覧(不変のListとして保持する)
	 */
	private List<String> messages;

	NPC(int npcId, String name, Object visualEffects, String standing, String grade, String text, Boolean canFall, String difficultyLevel, int favorabilityRating) {
		this.npcId = npcId;
		this.name = name;
		this.visualEffects = visualEffects;
		this.standing = standing;
		this.grade = grade;
		this.text = text;
		this.canFall = canFall;
		this.difficultyLevel = difficultyLevel;
		this.favorabilityRating = favorabilityRating;

		this.messages = Collections.singletonList("");

	}

	void setMessages(List<String> messages) {
		// 不変のリストにする
		this.messages = Collections.unmodifiableList(messages);
	}

	public void setFavorabilityRating(int favorabilityRating) {
		this.favorabilityRating = favorabilityRating;
	}

	public int getNpcId() {
		return npcId;
	}

	public String getName() {
		return name;
	}

	public Object getVisualEffects() {
		return visualEffects;
	}

	public String getStanding() {
		return standing;
	}

	public String getGrade() {
		return grade;
	}

	public String getText() {
		return text;
	}

	public Boolean getCanFall() {
		return canFall;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public int getFavorabilityRating() {
		return favorabilityRating;
	}

	/**
	 * ランダムに何かをしゃべる。
	 * @param playerName
	 * @return
	 */
	public String randomSay() {
		ArrayList<String> list = new ArrayList<String>(this.messages);
		Collections.shuffle(list);
		return list.get(0);
	}
}
