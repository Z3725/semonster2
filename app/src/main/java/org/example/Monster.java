package org.example;

import java.util.Random;

public class Monster {
    private String name;
    private int rare; // 1:normal, 2:uncommon, 3:rare, 4:ultra rare

    public Monster() {
        Random random = new Random();
        this.name = summonMonster(random.nextInt(5));
        this.rare = random.nextInt(5) + 1; // レア度は1から5のランダムな値とする
    }

    private String summonMonster(int mnumber) {
        String[] monsters = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
        return monsters[mnumber];
    }

    public String getName() {
        return name;
    }

    public int getRare() {
        return rare;
    }

    public void evolve() {
        if (rare >= 3) {
            name = "進化した" + name;
            if (rare == 4) {
                name += "★";
            }
            System.out.println(name + " が進化しました！");
        }
    }

    @Override
    public String toString() {
        return name + ":レア度[" + rare + "]";
    }
}
