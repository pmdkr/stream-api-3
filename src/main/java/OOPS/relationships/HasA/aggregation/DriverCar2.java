package OOPS.relationships.HasA.aggregation;

public class DriverCar2 {


    public static void main(String[] args) {


        //create object of car - will contains two nested object -> engine and musicPlayer

        // here Car is container class and engine and music player is content class

        Car car = new Car();


        //called start() method of engine
        car.startEngine();


        //called playtMusic() method of musicPlayer
        car.startMusic();
    }
}
