package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        LinkedList<Animal> linkedList = new LinkedList<>();


        int age = 1;
        for (int i = 1; i <= 100; i++) {
            if (i <= 50) {
                animals.add(new Cat(i));

            } else {
                animals.add(new Dog(age));
                age++;
            }

        }
//        System.out.println(animals);

        int counter = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                counter += 1;
                if (counter == 5) {
                    animals.remove(i);
                    counter = 0;
                }
            }
        }
        counter = 0;
        int j = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Dog) {
                counter += 1;
                if (counter == 3) {
                    j++;
                    animals.add(i + 1, new Mouse(j));
                    counter = 0;
                }
            }
        }
//        System.out.println(animals);
        for (int i = 0; i <animals.size(); i++) {
            if (animals.get(i) instanceof Cat && animals.get(i + 1) instanceof Mouse
                    || animals.get(i) instanceof Mouse && animals.get(i + 1) instanceof Cat) {
                linkedList.add(animals.get(i));
                if (animals.get(i-1)instanceof Cat&&animals.get(i)instanceof Mouse){               //Во время проверки поставил, что бы и кошку и мышку, а потом следующию кошку закидывать в отдельный лист.
                    linkedList.add(animals.get(i+1));
                }
            }
        }
//        System.out.println(linkedList);

        ArrayList<Animal> arrayList = new ArrayList<>(animals);
//        System.out.println(arrayList);

        int countAgeCat = 0, countAgeDog = 0, countAgeMouse = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Cat) {
                countAgeCat += arrayList.get(i).getAge();
            } else if (arrayList.get(i) instanceof Dog) {
                countAgeDog += arrayList.get(i).getAge();
            } else if (arrayList.get(i) instanceof Mouse) {
                countAgeMouse += arrayList.get(i).getAge();
            }
        }
        System.out.println("Sum of cats age:    " + countAgeCat);
        System.out.println("Sum of dogs age:    " + countAgeDog);
        System.out.println("Sum of mouses age:  " + countAgeMouse);

        LinkedList<Animal> newLinkedList=new LinkedList<>();
        for (Animal a : animals) {
            if (a instanceof Cat)
                newLinkedList.addFirst(a);
        }
        for (Animal b : animals) {
            if (b instanceof Dog)
                newLinkedList.add(b);
        }
        for (Animal c : animals) {
            if (c instanceof Mouse)
                newLinkedList.addLast(c);
        }
        System.out.println(newLinkedList);






        ArrayList<Cat> catslist = new ArrayList<>();
        LinkedList<Cat> catslink = new LinkedList<>();
        LocalDateTime startArray=LocalDateTime.now();
        System.out.println("Start array code time:                  "+startArray);
        for (int i = 0; i < 1000000; i++) {
            catslist.add(new Cat(i + 1));
        }
        LocalDateTime finishArray=LocalDateTime.now();
        System.out.println("Finish create array list:               "+finishArray);
        for (int i = 1; i <= 100; i++)
            catslist.add(500000, new Cat(i));
        LocalDateTime MidArray=LocalDateTime.now();
        System.out.println("Added in middle array list:             "+MidArray);
        for (int i = 1; i <= 100; i++)
            catslist.add(0, new Cat(i));
        LocalDateTime beginArray=LocalDateTime.now();
        System.out.println("Added to begin of array list:           "+beginArray);
        for (int i = 1; i <= 100; i++)
            catslist.add(new Cat(i));
        LocalDateTime endArray=LocalDateTime.now();
        System.out.println("Added to end of array list:             "+endArray);
        System.out.println(catslist.get(500150));
        LocalDateTime getArray=LocalDateTime.now();
        System.out.println("Get in middle of array list:            "+getArray);
        System.out.println(catslist.remove(500150));
        LocalDateTime middleRemoveArray=LocalDateTime.now();
        System.out.println("Remove from the middle array list:      "+middleRemoveArray);
        System.out.println(catslist.remove(0));
        LocalDateTime firstArray=LocalDateTime.now();
        System.out.println("remove first index array list:          "+firstArray);

        LocalDateTime startLinked=LocalDateTime.now();
        System.out.println("Start linked code time:                 "+startLinked);
        for (int i = 0; i < 1000000; i++) {
            catslink.add(new Cat(i + 1));
        }
        LocalDateTime finishLinked=LocalDateTime.now();
        System.out.println("Finish create linked list:              "+finishLinked);
        for (int i = 1; i <= 100; i++)
            catslink.add(500000, new Cat(i));
        LocalDateTime MidLinked=LocalDateTime.now();
        System.out.println("Added in middle linked list:            "+MidLinked);
        for (int i = 1; i <= 100; i++)
            catslink.add(0, new Cat(i));
        LocalDateTime beginLinkned=LocalDateTime.now();
        System.out.println("Added to begin of linked list:          "+beginLinkned);
        for (int i = 1; i <= 100; i++)
            catslink.add(new Cat(i));
        LocalDateTime endLinked=LocalDateTime.now();
        System.out.println("Added to end of linked list:            "+endLinked);
        System.out.println(catslink.get(500150));
        LocalDateTime getLinked=LocalDateTime.now();
        System.out.println("Get in middle of linked list:           "+getLinked);
        System.out.println(catslink.remove(500150));
        LocalDateTime middleRemoveLinked=LocalDateTime.now();
        System.out.println("Remove from the middle linked list:     "+middleRemoveLinked);
        System.out.println(catslink.removeFirst());
        LocalDateTime firstRemoveLinked=LocalDateTime.now();
        System.out.println("Remove first in linked list:            "+firstRemoveLinked);
        System.out.println(catslink.remove(0));
        LocalDateTime firstLinked=LocalDateTime.now();
        System.out.println("Remove first index linked list:         "+firstLinked);
        System.out.println("Duration between array list results:    "+ Duration.between(startArray,firstArray));               // Duration between array list results:    PT0.282S
        System.out.println("Duration between linked list results:   "+Duration.between(startLinked,firstRemoveLinked));        // Duration between linked list results:   PT0.557S
        System.out.println("Duration between linked list results:   "+Duration.between(startLinked,firstLinked));              // Duration between linked list results:   PT0.557S

    }
}

abstract class Animal{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
class Mouse extends Animal{
    public Mouse(int age) {
        this.setAge(age);

    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public String toString() {
        return "\nMouse " +
                "age: " + super.getAge()+" years old" ;
    }
}
class Dog extends Animal{
    public Dog(int age) {
        this.setAge(age);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String toString() {
        return "\nDog " +
                "age: " + super.getAge()+" years old" ;
    }
}
class Cat extends Animal{
    private String name;
    private int age;

    public Cat() {
    }
    public Cat(Integer age){
        this.age=age;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        if (obj==this)return true;
        if (obj instanceof Cat){
            return ((Cat)obj).name.equals(this.name)&&((Cat)obj).age==age;
        }
        return false;

    }

    @Override
    public String toString() {
        return "\nCat " +
                "age: " + age+" years old" ;
    }
}