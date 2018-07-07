import java.lang.Math;
class DiceGame{
  public static void main(String[] args){
    int dice1,dice2;
    System.out.println("Rolling the dice...");
    dice1=(int)(1+Math.random()*6);
    dice2=(int)(1+Math.random()*6);
    System.out.println("Die 1: "+dice1);
    System.out.println("Die 2: "+dice2);
    System.out.println("Total value: "+(dice1+dice2));
  }
}
