package com.company;

public class Main {

    public static void main(String[] args) {
        Monkey monkey=new Monkey();
        ClimbAble babymonkey=new BabyMonkey();
        BabyMonkey babyMonkey=new BabyMonkey();
        boolean apple=true;
        boolean stone=false;
        monkey.eat(stone);
        monkey.eat(apple);
        monkey.holdOnBack(babymonkey);
        monkey.holdOnBack(babyMonkey);
    }
}

interface ClimbAble{
    default void Climb(){
        System.out.println("I can climb !");
    }
}
interface EatAble{
    default void eat(boolean food){
        if (food) System.out.println("I can eat this");
        else System.out.println("It is not eatable");
    }
}
class Monkey implements ClimbAble,EatAble{
   private String name;
   private int age;
   private double weight;
   private double height;

    Monkey() {
    }

    Monkey(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    void holdOnBack(ClimbAble climbAble){
        System.out.println("I am holding on by back another "+climbAble);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Monkey";
    }
}
class BabyMonkey extends Monkey{
    BabyMonkey() {
    }

    BabyMonkey(String name, int age, double weight, double height) {
        super(name, age, weight, height);
    }

    @Override
    public String toString() {
        return "BabyMonkey";
    }
}