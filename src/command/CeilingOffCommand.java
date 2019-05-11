package command;

public class CeilingOffCommand implements Command {
    Ceiling_fan ceiling_fan;

    public CeilingOffCommand(Ceiling_fan ceiling_fan) {
        this.ceiling_fan= ceiling_fan;
    }

    @Override
    public void execute() {
        ceiling_fan.low();
    }
}
