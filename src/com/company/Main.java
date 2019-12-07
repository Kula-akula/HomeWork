package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        ArrayList<String> arrayList= new ArrayList<>();
        ArrayList<String> arrayList1= new ArrayList<>();
        String firstLine="Ветер с моря дул";
        String secondLine="Ногонял беду";
        String thirdLine="И сказал ты мне";
        String forthLine="Больше не приду";
        arrayList.add(firstLine);
        arrayList.add(secondLine);
        arrayList.add(thirdLine);
        arrayList.add(forthLine);
        System.out.println(arrayList);
        for (int i=0;i<arrayList.size();i=i+2){
            if (i==0)arrayList.add(0,firstLine);
            else if (i==2)arrayList.add(2,secondLine);
            else if (i==4)arrayList.add(4,thirdLine);
            else if (i==6)arrayList.add(6,forthLine);
            }
        System.out.println(arrayList);
        System.out.println(arrayList.get(0).length());
        for (String str:arrayList) {
            if (str.length() > 13) {
                arrayList1.add(str);
            }
        }
        System.out.println(arrayList1);
        for (String str1:arrayList) {            //Так и не понял почему я не могу пройтись по массиву arraylist1, по этому сделал так, через первый лист.
            if (str1.equals("И сказал ты мне")){
                arrayList1.remove(str1);
            }
        }
        System.out.println(arrayList1);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        Random random=new Random();
        int min=1, max=100;
        for (int i=0;i<50;i++){
        int num=random.nextInt(max-min+1)+min;
            if (isEven(num))list.add(num);
            else list2.add(num);
        }
        System.out.println(list);
        System.out.println(list2);

    }
    private static boolean isEven(int num){
        return num % 2 == 0;
    }
}
