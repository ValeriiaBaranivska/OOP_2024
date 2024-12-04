package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n ~ ~ ~ Лаборанторна робота №1 ~ ~ ~");
        System.out.println("\t Баранівська Валерія KM-23\n");

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("50.01");
        stringList.add("22.5");
        stringList.add("219.43564789456789090843726541253647895061231435466587098997676455242");
        stringList.add("46");
        stringList.add("32.98");
        stringList.add("97");
        stringList.add("100.9");
        stringList.add("312.9462");
        stringList.add("83");
        stringList.add("21938761.4356478945678909084372654125364789506");
        stringList.add("0.435623232323678909084372654125364789506");



        System.out.println("\n\t------> Основна частина\n");
        NumberOperations.print_num(stringList);

        System.out.println("\n\t------> Друга частина \n");
        NumberOperations.task_num(stringList);

        System.out.println("\n\t------> Арифметичні дії з BigDecimal \n");
        NumberOperations.additional_task(stringList);
            }
        }
