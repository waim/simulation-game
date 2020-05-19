package com.github.waim.simulationgame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ゲームプレイヤー
 * @author waim
 * @version 1.0
 */
public class Player {
	/**
	 * 名前
	 */
	private String name;
	/**
	 * 身分
	 */
	private String standing;
	/**
	 * 学年
	 */
	private String grade;
	/**
	 * 持ち物リスト(不変のListとして保持する)
	 */
	private List<Item> itemList;
	/**
	 * 性格美人度
	 */
	private int expOfPersonality;
	/**
	 * 女子力度
	 */
	private int expOfFeminine;
	/**
	 * モテ度
	 */
	private int expOfPopular;
	/**
	 * 行動力
	 */
	private int expOfAction;

	Player(String name, String standing, String grade, int expOfPersonality, int expOfFeminine, int expOfPopular, int expOfAction) {
		this.name = name;
		this.standing = standing;
		this.grade = grade;
		this.itemList = Collections.singletonList(Item.emptyItem());
		this.expOfPersonality = expOfPersonality;
		this.expOfFeminine = expOfFeminine;
		this.expOfPopular = expOfPopular;
		this.expOfAction = expOfAction;
	}

	/**
	 * 持ち物を使う
	 * @param itemId アイテムID
	 */
	public void useItem(int itemId){
	}

	/**
	 * 持ち物の一覧を見る
	 */
	public void viewItems(){
	}

	public String getName() {
		return name;
	}

	public String getStanding() {
		return standing;
	}

	public String getGrade() {
		return grade;
	}

	public ArrayList<Item> getItemList() {
		return new ArrayList<Item>(this.itemList);
	}

	public void setItem(Item item){
		ArrayList<Item> items = new ArrayList<Item>(this.itemList);
		items.add(item);

		this.itemList = Collections.unmodifiableList(items);
	}

	public int getExpOfPersonality() {
		return expOfPersonality;
	}

	public void setExpOfPersonality(int expOfPersonality) {
		this.expOfPersonality = expOfPersonality;
	}

	public int getExpOfFeminine() {
		return expOfFeminine;
	}

	public void setExpOfFeminine(int expOfFeminine) {
		this.expOfFeminine = expOfFeminine;
	}

	public int getExpOfPopular() {
		return expOfPopular;
	}

	public void setExpOfPopular(int expOfPopular) {
		this.expOfPopular = expOfPopular;
	}

	public int getExpOfAction() {
		return expOfAction;
	}

	public void setExpOfAction(int expOfAction) {
		this.expOfAction = expOfAction;
	}
}
