package org.example;

import java.math.RoundingMode;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class NumberOperations {
    public static void print_num(ArrayList<String> list_numbers) {
        List<Integer> intNum_list = new ArrayList<>();
        List<String> double_list = new ArrayList<>();

        for (int i = 0; i <list_numbers.size(); ++i ) {

            try {
                // Перевірка, чи рядок є цілим числом
                int intNum = Integer.parseInt(list_numbers.get(i));
                intNum_list.add(Integer.valueOf(intNum));
            } catch (NumberFormatException e) {
                // Якщо не вдалося конвертувати в int, спробуємо конвертувати в double
                try {
                    double doubNum = Double.parseDouble(list_numbers.get(i));
                    double_list.add(String.format("%.2f", doubNum).replace(",", "."));
                } catch (NumberFormatException ex) {
                    // Якщо не вдалося конвертувати в double, виведемо помилку
                    System.out.println("Помилка форматування числа: " + list_numbers.get(i));
                }
            }
        }
            System.out.println("Всі числа: " + list_numbers);
            System.out.println("Всі числа у форматі цілих чисел: " + intNum_list);
            System.out.println("Всі числа у форматі дробових чисел: " + double_list);
        }

    public static void task_num(ArrayList<String> list_numbers) {
        List<BigDecimal> bigDecimalNumbers = new ArrayList<>();

        // Перетворення чисел на BigDecimal і додавання до списку
        for (String number : list_numbers) {
            try {
                BigDecimal num = new BigDecimal(number);
                bigDecimalNumbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Некоректний формат числа: " + e.getMessage());
            }
        }
        System.out.println("Числа у форматі BigDecimal: " + bigDecimalNumbers);

        BigDecimal sum_all = BigDecimal.ZERO;
        BigDecimal product = BigDecimal.ONE;
        int count = 0;

        List<Integer> integerNumbers = new ArrayList<>();
        List<Double> decimalNumbers = new ArrayList<>();
        List<String> Num2 = new ArrayList<>();

        for (BigDecimal number : bigDecimalNumbers) {
            // Перевіряємо, чи число є дробовим або цілим
            if (number.scale() > 0) { // Число є дробовим
                double decimalNumber = number.doubleValue();
                decimalNumbers.add(decimalNumber);
                sum_all = sum_all.add(number);
                if (count < 5) {
                    product = product.multiply(number);
                    count++;
                }

            } else { // Число є цілим
                int integerNumber = number.intValue();
                integerNumbers.add(integerNumber);
                sum_all = sum_all.add(number);
                if (count < 5) {
                    product = product.multiply(number);
                    count++;
                }
            }
            BigDecimal prod_num = number.multiply(BigDecimal.valueOf(2));
            Num2.add(String.valueOf(prod_num));
        }
        int totalNumbers = integerNumbers.size() + decimalNumbers.size();
        BigDecimal totalNumbersBD = BigDecimal.valueOf(totalNumbers);
        BigDecimal average = (totalNumbers > 0) ? sum_all.divide(totalNumbersBD, RoundingMode.HALF_UP) : BigDecimal.ZERO;

        System.out.println("Сума всіх чисел в списку: " + sum_all);
        System.out.println("Добуток перших 5 чисел списку: " + product);
        System.out.println("Середнє значення всіх чисел у списку: " + average);
        System.out.println("Новий список, який містить тільки цілі числа з початкового: " + integerNumbers);

        int sum_pow = 0;
        int sum_50 = 0;
        for (Integer num : integerNumbers) {
            int pow_num = (int) Math.pow(num, 2);
            sum_pow += pow_num;
            if (num > 50) {
                sum_50 += num;
            }
        }
        System.out.println("Сума квадратів нового списку: " + sum_pow);
        System.out.println("Сума всіх чисел, які більші 50: " + sum_50);

        List<String> formula_num = new ArrayList<>();
        for (String numberStr : Num2) {
            BigDecimal number = new BigDecimal(numberStr);

            if (number.scale() > 0) { // Число є дробовим
                double decimalNumber = number.doubleValue();
                decimalNumbers.add(decimalNumber);

                // Формула: (decimalNumber + 10) / 2
                BigDecimal f_num = number.add(BigDecimal.TEN).divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP);
                formula_num.add(f_num.toString());

            } else { // Число є цілим
                int integerNumber = number.intValue();

                // Формула: (decimalNumber + 10) / 2
                int f_num = (10 + integerNumber) / 2;
                formula_num.add(String.valueOf(f_num));
            }
        }
        System.out.println("Новий список, де кожне число початкового помножене на 2: " + Num2);
        System.out.println("Формула до кожного числа:" + formula_num);
    }
    public static void additional_task(ArrayList<String> list_numbers) {
        List<BigDecimal> bigDecimalNumbers = new ArrayList<>();

        // Перетворення чисел на BigDecimal і додавання до списку
        for (String number : list_numbers) {
            try {
                BigDecimal num = new BigDecimal(number);
                bigDecimalNumbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Некоректний формат числа: " + e.getMessage());
            }
        }

        System.out.println("Числа у форматі BigDecimal: " + bigDecimalNumbers);

        BigDecimal add_num = bigDecimalNumbers.get(1).add(bigDecimalNumbers.get(9));
        System.out.println("BigDecimalAdd(2 і 10 елементи) : " + add_num);
        BigDecimal mult_num = bigDecimalNumbers.get(0).multiply(bigDecimalNumbers.get(5));
        System.out.println("BigDecimalMultiply ( 1 і 6 елементи) : " + mult_num);
    }
}
