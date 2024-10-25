package org.example;

//
class Lighting extends SmartDevice {
    private int brightness;  // Яскравість від 0 до 100

    public Lighting(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
            System.out.println(name + " яскравість встановлена на " + this.brightness + "%");
        } else {
            System.out.println("Неправильне значення яскравості. Введіть від 0 до 100.");
        }
    }

    @Override
    public void automate() {
        System.out.println("Автоматичне налаштування освітлення для " + name);
        if (!status) { // Якщо вимкнене, увімкнути
            turnOn();
        }
        setBrightness(60);
    }
}

