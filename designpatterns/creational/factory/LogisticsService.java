package designpatterns.creational.factory;

import java.util.Objects;

// without using factory pattern
public class LogisticsService {

    // without using factory pattern
/*    public void send(String mode) {
        if(Objects.equals(mode, "Air")) {
            Logistics logistics = new Air();
            logistics.send();
        }
        else if (Objects.equals(mode,"Road")) {
            Logistics logistics = new Road();
            logistics.send();
        }
    }*/

    // with factory pattern
    public void send(String mode) {
        Logistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();
    }
}
