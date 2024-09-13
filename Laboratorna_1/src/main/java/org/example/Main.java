package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n ~ ~ ~ Лаборанторна робота №1 ~ ~ ~");
        System.out.println("\t Баранівська Валерія KM-23\n");


        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("11");
        stringList.add("22.5");
        stringList.add("46");
        stringList.add("32.98");
        stringList.add("97");
        stringList.add("100.9");
        stringList.add("312.9462");
        stringList.add("1");
        //stringList.add("2193876146278190429847634789234.43564789509084372654125364789506");

        System.out.println("\n \t Основна частина\n");
        NumberOperations.print_num(stringList);

        System.out.println("\n \t Друга частина \n");
        NumberOperations.task_num(stringList);
            }
        }
