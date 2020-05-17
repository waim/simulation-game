package com.github.waim.simulationgame.model;
/**
 * 動作確認用 Main
 * @author waim
 * @version 1.0
 */
public class Main {
    // https://cloud.google.com/appengine/docs/standard/java/quickstart?hl=ja
    public static void main(String[] args){
        System.out.println("動作テスト");
        System.out.println();

        // プレイヤーの生成
        Player player = new Player(
                "プレイヤー名"
                , "高校生"
                , "2年"
                , 0
                , 0
                , 0
                , 0
        );

        NPC npc1 = new NPC(
                1
                , "樺練"
                , "(・∀・)"
                , "高校生"
                , "3年"
                , "学校一の変人と悪名高く、何をしでかすかわからない。\n" +
                "なぜか一部の人間による妙な人望が厚いが、本人はおひとり様が一番気楽なタイプ。\n" +
                "主人公と他の攻略キャラ達の間に割って入って邪魔ばかりしてくるが、選択肢次第では実は奥手な主人公の恋愛が成就するようわざとやっていたことが判明する。\n" +
                "本来の性格は真面目だが、生真面目すぎて疲れてしまったゆえに今の性格に至る。\n" +
                "相当ひねくれた性格ゆえに、攻略ルートに入るまでにありとあらゆるトラップをしかけてくるため、攻略難易度最高レベル。"
                , true
                , "攻略難易度最高レベル"
                , 0
        );

        System.out.printf("%s:やあ、ようこそ白百合高校へ！\n", npc1.getName());
        System.out.printf("%s:%sさんだね。よろしくね！\n", npc1.getName(), player.getName());
    }
}
