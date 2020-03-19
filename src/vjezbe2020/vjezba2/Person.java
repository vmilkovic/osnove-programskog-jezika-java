package vjezbe2020.vjezba2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private int age;
    private double height;
    private String colorOfEyes;

    public void lock(Car car){
        printPrefix(name);
        car.lock();
    }

    public void unlock(Car car){
        printPrefix(name);
        car.unlock();
    }

    public void goInside(Car car){
        printPrefix(name);
        System.out.printf("Going inside  %s\n", car);
    }

    public void goOutside(Car car){
        printPrefix(name);
        System.out.printf("Going outside %s\n", car);
    }

    public void open(Car car){
        printPrefix(name);
        car.openDoor();
    }

    public void close(Car car){
        printPrefix(name);
        car.closeDoor();
    }

    public void goTo(Location location, Car car){
        printPrefix(name);
        car.goTo(location);
    }

    public void start(Car car){
        printPrefix(name);
        car.startEngine();
    }

    public void stop(Car car){
        printPrefix(name);
        car.startEngine();
    }

    private void printPrefix(Object obj){
        System.out.printf("%s: ", obj);
    }

}
