package org.example;

class Thermostat extends SmartDevice {
    private int temperature;  // Температура за замовчуванням

    public Thermostat(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(name + "температура встановлена на " + this.temperature + "°C");
    }

    @Override
    public void automate() {
        System.out.println("Термостат: \"" + name + "\"");
        if (!status) { // Якщо вимкнене, увімкнути
            turnOn();
        }
        setTemperature(25);
    }
}
