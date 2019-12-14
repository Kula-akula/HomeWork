package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        Set<Dog> dogs=new HashSet<>();
        for (int i=1; i<=40;i++){
            String name="Dog # ";
            name+=i;
            dogs.add(new Dog(name,i));

        }
        dogs.add(new Dog("Dog # 1", 1));
        System.out.println(dogs);
        System.out.println(dogs.size());


        FileWriter fileWriter=new FileWriter("FAQ#37_HW.txt");
        fileWriter.write("1. Как вы понимаете hashCode?\n" +
                "Это адрес ячейки в которой хранится определенный элемент или несколько одинаковых элементов.\n" +
                "2. Для чего мы можем переписать метод генерирования hashCode?\n" +
                "Для того что определять самим при каких схожих параметров считать элементы идентичными и выдавать им одинаковый хешкод.\n" +
                "3. Как работает HashSet?\n" +
                "Это тоже один из видов списка, только он сначала проверяет на уникальность элемента, если такого элемента еще нету, тогда он добавит в свой список.\n" +
                "4. Какие отличия есть у HashSet & ArrayList?\n" +
                "Ну как описывалось в п.3, у него автоматически идет проверка на дубликаты. А ArrayList не проверяя добавляет в свой список.\n" +
                "5. Как вы думаете, как мы можем избавиться от дубликатов в ArrayList при помощи HashSet?\n" +
                "Перезапишем Array List при помощи Hash Set.");
        fileWriter.close();
    }
}
class Dog{
private String name;
private int weight;

    public Dog() {
    }

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public void printInfo(){
        System.out.println("\nI am a Dalmatian, my " +
                "name is '" + name +
                "', my weight is " + weight +
                " kilograms !");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return weight == dog.weight &&
                name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "\nI am a Dalmatian, my " +
                "name is '" + name +
                "', my weight is " + weight +
                " kilograms !";
    }
}

