package vjezbe2020.vjezba2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    public String model;

    public void unlock(){
        System.out.println("Unlocking " + model);
    }

    public void lock(){
        System.out.println("Locking" + model);
    }

    public void openDoor(){
        System.out.println("Opening the door of " + model);
    }

    public void closeDoor(){
        System.out.println("Closing the door of" + model);
    }

    public void startEngine(){
        System.out.println("Starting the engine of" + model);
    }

    public void stopEngine(){
        System.out.println("Stopping the engine of " + model);
    }

    public void goTo(Location location){
        var sb = new StringBuilder()
                .append("Driving to ")
                .append(location)
                .append(" with ")
                .append(model);
        System.out.println(sb.toString());
    }

    @Override
    public String toString(){
        return model;
    }

}
