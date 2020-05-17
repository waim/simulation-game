package com.github.waim.simulationgame.model;
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

    public NPC(int npcId, String name, Object visualEffects, String standing, String grade, String text, Boolean canFall, String difficultyLevel, int favorabilityRating) {
        this.npcId = npcId;
        this.name = name;
        this.visualEffects = visualEffects;
        this.standing = standing;
        this.grade = grade;
        this.text = text;
        this.canFall = canFall;
        this.difficultyLevel = difficultyLevel;
        this.favorabilityRating = favorabilityRating;
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
}
