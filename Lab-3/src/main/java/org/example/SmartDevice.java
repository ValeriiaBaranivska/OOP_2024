package org.example;

// Абстрактний клас для пристроїв системи

abstract class SmartDevice {
    protected String name;
    protected boolean status;  // false = вимкнено, true = увімкнено

    public SmartDevice(String name) {
        this.name = name;
        this.status = false;  // За замовчуванням вимкнено
    }

    public void turnOn() {
        status = true;
        System.out.println(name + " увімкнено");
    }

    public void turnOff() {
        status = false;
        System.out.println(name + " вимкнено");
    }

    public String getStatus() {
        return name + " " + (status ? "увімкнено" : "вимкнено");
    }

    // Абстрактний метод для автоматизації, який мають реалізувати всі підкласи
    public abstract void automate();
}
