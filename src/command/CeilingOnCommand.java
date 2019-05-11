package command;

public class CeilingOnCommand implements Command {
    Ceiling_fan ceiling_fan;

    public CeilingOnCommand(Ceiling_fan ceiling_fan) {
        this.ceiling_fan= ceiling_fan;
    }

    @Override
    public void execute() {
        ceiling_fan.high();
    }
}
