package oop;

public class MarsRobot {
    String status;
    int speed;
    float temperature;

    public void checkTemperature() {
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }

    public void checkStatus() {
        System.out.println("Status: " + status);
    }

    public void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Status: " + temperature);
    }
}
