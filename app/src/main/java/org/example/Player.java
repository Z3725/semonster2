package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
    private String name;
    private ArrayList<Monster> monsterDeck;
    private LinkedList<Integer> numbersList;

    public Player(String name) {
        this.name = name;
        this.monsterDeck = new ArrayList<>();
        this.numbersList = new LinkedList<>();
    }

    public void addMonsterToDeck(Monster monster) {
        if (monsterDeck.size() < 5) {
            monsterDeck.add(monster);
            System.out.println(name + "はモンスター「" + monster + "」をデッキに追加しました。");
        } else {
            System.out.println("モンスターデッキが満杯です！");
        }
    }

    public void addNumberToList(int number) {
        if (numbersList.size() < 10) {
            numbersList.add(number);
            System.out.println(name + "は数値「" + number + "」をリストに追加しました。");
        } else {
            System.out.println("数値リストが満杯です！");
        }
    }

    public void showMonsterDeck() {
        System.out.println(name + "のモンスターデッキ:");
        for (Monster monster : monsterDeck) {
            System.out.println(monster);
        }
    }

    public void showNumbersList() {
        System.out.println(name + "の数値リスト:");
        for (int number : numbersList) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        // テスト用のコード
        Player player1 = new Player("プレイヤー1");

        // モンスターを生成してデッキに追加
        Monster monster1 = new Monster();
        Monster monster2 = new Monster();
        player1.addMonsterToDeck(monster1);
        player1.addMonsterToDeck(monster2);

        // 数値をリストに追加
        player1.addNumberToList(10);
        player1.addNumberToList(20);
        player1.addNumberToList(30);

        // モンスターデッキと数値リストを表示
        player1.showMonsterDeck();
        player1.showNumbersList();
    }
}
