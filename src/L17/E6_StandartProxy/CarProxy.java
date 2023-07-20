package L17.E6_StandartProxy;

import L17.Common.Car;
import common.Console;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarProxy extends Car {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
    public CarProxy(String brand, String model) {
        super(brand, model);
    }

    @Override
    public boolean start() {
        System.out.println();
        log("Attempt to start");

        boolean result = super.start();

        log("has started : " + result);

        return result;
    }

    private void log(String text){
        String message = String.format("[LOG] [%s] - Car SN:%s %s %s -> %s",
                dtf.format(LocalDateTime.now()),
                        super.getSerialNumber(),
                        super.getBrand(),
                        super.getModel(),
                        text);

        Console.println(message, Console.color.GREEN);
    }
}
