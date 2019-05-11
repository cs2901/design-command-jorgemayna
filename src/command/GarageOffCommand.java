package command;

public class GarageOffCommand implements Command {
    Garage_door garage_door;

    public GarageOffCommand(Garage_door garage_door) {
        this.garage_door= garage_door;
    }

    @Override
    public void execute() {
        garage_door.close();
    }
}
