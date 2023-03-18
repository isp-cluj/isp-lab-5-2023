package isp.lab4.exercise0;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CarTest {


    @Test
    public void testCarStart(){
        Engine engine = new Engine(100);
        Car car = Car.getInstance(engine, "red");
        car.startCar();
        assertTrue(car.getEngine().isStatus());
    }
}
