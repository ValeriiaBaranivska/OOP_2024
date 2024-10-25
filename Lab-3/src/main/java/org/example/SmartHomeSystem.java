package org.example;


import java.util.ArrayList;
import java.util.List;

// клас який дозволяє керувати пристроями зібраними у будинку
// перевірка статусу, додавання пристроїв
class SmartHomeSystem {
    private List<SmartDevice> devices; // Список пристроїв у системі «розумного дому»

    // Конструктор для ініціалізації списку пристроїв
    public SmartHomeSystem() {
        devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void controlAllDevices() {
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }

    public void automateAllDevices() {
        for (SmartDevice device : devices) {
            device.automate();
        }
    }
}
