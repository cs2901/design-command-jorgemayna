package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light_living = new Light("living_room");
        Light light_kitchen = new Light("kitchen");
        Ceiling_fan ceiling_fan = new Ceiling_fan();
        Garage_door garage_door= new Garage_door();
        Stereo stereo= new Stereo();

        LightOnCommand lightOnl = new LightOnCommand(light_living );
        LightOffCommand lightOffl = new LightOffCommand(light_living);
        LightOnCommand lightOnk = new LightOnCommand(light_kitchen );
        LightOffCommand lightOffk = new LightOffCommand(light_kitchen);
        CeilingOnCommand ceilingOn = new CeilingOnCommand(ceiling_fan);
        CeilingOffCommand ceilingOff = new CeilingOffCommand(ceiling_fan);
        GarageOnCommand garageOn = new GarageOnCommand(garage_door);
        GarageOffCommand garageOff = new GarageOffCommand(garage_door);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(lightOnl);
        remote.buttonWasPressed();
        remote.setCommand(lightOffl);
        remote.buttonWasPressed();
        remote.setCommand(lightOnk);
        remote.buttonWasPressed();
        remote.setCommand(lightOffk);
        remote.buttonWasPressed();

        remote.setCommand(ceilingOn);
        remote.buttonWasPressed();
        remote.setCommand(ceilingOff);
        remote.buttonWasPressed();

        remote.setCommand(garageOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOff);
        remote.buttonWasPressed();

        remote.setCommand(stereoOn);
        remote.buttonWasPressed();
        remote.setCommand(stereoOff);
        remote.buttonWasPressed();
    }
}
