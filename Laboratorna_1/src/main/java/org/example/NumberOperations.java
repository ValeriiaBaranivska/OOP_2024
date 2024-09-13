package org.example;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class NumberOperations {
    public static void print_num(ArrayList<String> list_numbers){
        List<Integer> intNum_list = new ArrayList<>();
        List<String> double_list = new ArrayList<>();

        for(String number : list_numbers){
            //конвертація всього списку до одного типу
            try {
                int intNum = Integer.parseInt(number.split("\\.")[0]);
                intNum_list.add(intNum);
                double doubNum = Double.parseDouble(number);
                double_list.add(String.format("%.2f", doubNum));
            } catch (NumberFormatException e){
                System.out.println("Помилка форматування числа: " + number);
            }
            // збереження чисел в різних списках в залежності від типу


        }

        System.out.println("Всі числа: " + list_numbers );
        System.out.println("Всі числа у форматі цілих чисел: " + intNum_list);
        System.out.println("Всі числа у форматі дробних чисел: " + double_list);

        //System.out.println("Числа у форматі цілих чисел: " + integerNumbers);
        //System.out.println("Числа у форматі дробних чисел: " + decimalNumbers); //з 2ма знаками після коми
    }
    public static void task_num(ArrayList<String> list_numbers){
        List<BigDecimal> bigDecimalNumbers = new ArrayList<>();

        // Перетворення чисел на BigDecimal і додавання до списку
        for (String number : list_numbers) {
            BigDecimal bd = new BigDecimal(number); //конструктор
            bigDecimalNumbers.add(bd);
        }
        System.out.println("Числа у форматі BigDecimal: " + bigDecimalNumbers); //1

        int sum_all = 0;
        int product = 1;

        List<Integer> integerNumbers = new ArrayList<>();
        List<Double> decimalNumbers = new ArrayList<>();
        List<String> Num2 = new ArrayList<>();

        for ( String number : list_numbers){
            if (number.matches("^\\d*\\.\\d+$")) {
                double decimalNumber = Double.parseDouble(number);
                decimalNumbers.add(decimalNumber);
                sum_all += decimalNumber;
                product *= decimalNumber;
                double prod_num = decimalNumber * 2;
                Num2.add(String.valueOf(prod_num));
            }
            else if (number.matches("\\d+")) {
                int integerNumber = Integer.parseInt(number);
                integerNumbers.add(integerNumber);
                sum_all += integerNumber;
                product *= integerNumber;
                double prod_num = integerNumber * 2;
                Num2.add(String.valueOf(prod_num));
            }
        }

        int totalNumbers = integerNumbers.size() + decimalNumbers.size();
        double average = (totalNumbers > 0) ? (double) sum_all / totalNumbers : 0; // Запобігання діленню на нуль



        System.out.println("Сума всіх чисел в списку: " + sum_all);
        System.out.println("Добуток перших 5 чисел списку: "+ product);
        System.out.println("Середнє значення всіх чисел у списку: " + average);

        System.out.println("Новий список, який містить тільки цілі числа з початкового: " + integerNumbers);

        int sum_pow = 0;
        int sum_50 = 0;
        for(Integer num : integerNumbers) {
            int pow_num = (int) Math.pow(num, 2);
            sum_pow += pow_num;
            if (num > 50) {
                sum_50 += num;
            }
        }
        System.out.println("Сума квадратів нового списку: " + sum_pow);
        System.out.println("Сума всіх чисел, які більші 50: "+ sum_50);

        List<String> formula_num = new ArrayList<>();
        for(String number : Num2) {
            if (number.matches("^\\d*\\.\\d+$")) {
                double decimalNumber = Double.parseDouble(number);
                decimalNumbers.add(decimalNumber);
                double f_num = (decimalNumber + 10) / 2;
                formula_num.add(String.format("%.2f",f_num));
            }
            else if (number.matches("\\d+")) {
                int integerNumber = Integer.parseInt(number);
                integerNumbers.add(integerNumber);
                int f_num = (integerNumber + 10) / 2;
                formula_num.add(String.valueOf(f_num));

            }
        }
        System.out.println("Новий список, де кожне число початкового помножене на 2: " + Num2 );
        System.out.println("Формула до кожного числа:" + formula_num );
    }
}
