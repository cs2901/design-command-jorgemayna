package command;

public class GarageOnCommand implements Command {
    Garage_door garage_door;

    public GarageOnCommand(Garage_door garage_door) {
        this.garage_door= garage_door;
    }

    @Override
    public void execute() {
        garage_door.open();
    }
}
