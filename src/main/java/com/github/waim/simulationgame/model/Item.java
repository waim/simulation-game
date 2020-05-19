package com.github.waim.simulationgame.model;

import java.util.Objects;

/**
 *  持ち物
 * @author waim
 * @version 1.0
 */
public class Item {
	/**
	 * アイテムID
	 */
	private int itemId;
	private String name;
	/**
	 * 説明文
	 */
	private String text;

	public Item(int itemId, String name, String text) {
		this.itemId = itemId;
		this.name = name;
		this.text = text;
	}

	/**
	 * 空のItemを返す(itemId = 0)
	 * @return
	 */
	static Item emptyItem() {
		Item item = new Item(0, "", "");
		return item;
	}

	public int getItemId() {
		return itemId;
	}

	public String getName() {
		return name;
	}

	public String getText() {
		return text;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return itemId == item.itemId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemId);
	}
}
