package org.example;
import java.util.Random;
public class Monster {
    String name;
    int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare
  

    Monster() {
      Random random = new Random();
      this.name = this.summonMonster(random.nextInt(5));
      this.rare = random.nextInt(5);
    }

    String summonMonster(int mnumber) {
        String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
        return monsters[mnumber];
      }
    
    void evolve(){
      if(this.rare >= 3){
        this.name = "進化した" + this.name;
        System.out.printIn(this.name + " が進化した！");
      }
    }

    @Override
    public String toString() {
  
      return this.name + ":レア度[" + this.rare + "]";
    }

    public static void main(String[] args) {
      Monster monster = new Monster();
      System.out.println("初期のモンスター: " + monster);

      monster.evolve();
      System.out.println("進化後のモンスター: " + monster);
  }
}
