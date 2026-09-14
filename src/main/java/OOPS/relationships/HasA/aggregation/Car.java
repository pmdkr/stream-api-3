package OOPS.relationships.HasA.aggregation;


public class Car {

    Engine engine = new Engine();
    MusicPlayer musicPlayer = new MusicPlayer();


    //in has a relationship , car object directly not called engine start


    public void startEngine() {
        engine.start();
    }

    public void startMusic() {
        musicPlayer.playMusic();
    }

}
