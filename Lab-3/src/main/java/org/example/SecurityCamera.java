package org.example;

class SecurityCamera extends SmartDevice {
    private boolean recording;

    public SecurityCamera(String name) {
        super(name);
        this.recording = false;
    }

    public void startRecording() {
        if (!recording) {
            recording = true;
            System.out.println("Камера почала запис");
        } else {
            System.out.println("Камера вже записує");
        }
    }

    public void stopRecording() {
        if (recording) {
            recording = false;
            System.out.println("Камера припинила запис");
        } else {
            System.out.println("Камера не записує");
        }
    }

    @Override
    public void automate() {
        System.out.println("Камера: \"" + name + "\"");
        if (!status) { // Якщо камера вимкнена (status == false), увімкнути її
            turnOn();
        }
        startRecording();
    }
}
