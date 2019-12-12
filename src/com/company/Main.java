package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            System.out.print(array[i]+"  ");
        }
        System.out.println("\n"+Arrays.toString(sort(array)));
        System.out.println();
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i=0;i<10;i++){
            linkedList.add(random.nextInt(2));
        }
        System.out.println(linkedList);
        System.out.println(sort(linkedList));
        System.out.println();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<10;i++){
            arrayList.add(random.nextInt(2));
        }
        System.out.println(arrayList);
        System.out.println(sort(arrayList));

    }
    public static ArrayList sort(ArrayList<Integer> a){
        int temp;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(1)) {
                temp = a.get(i);
                for (int j=a.size()-1;j>i;j--){
                    if (a.get(j).equals(0)){
                        a.set(i,a.get(j));
                        a.set(j, temp);
                        break;
                    }
                }
            }
        }
        return a;
    }

    public static LinkedList sort(LinkedList<Integer> a){
        int temp;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(1)) {
                temp = a.get(i);
                for (int j=a.size()-1;j>i;j--){
                    if (a.get(j).equals(0)){
                        a.set(i,a.get(j));
                        a.set(j, temp);
                        break;
                    }
                }
            }
        }
        return a;
    }


    public static int[] sort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                temp = a[i];
                for (int j=a.length-1;j>i;j--){
                    if (a[j]==0){
                        a[i]=a[j];
                        a[j]=temp;
                    break;
                    }
                }
            }
        }
        return a;
    }
}
