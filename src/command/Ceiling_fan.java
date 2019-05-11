package command;

public class Ceiling_fan {
    private boolean isOn = false;
    public void  high(){
        isOn = true;
        System.out.println("Ceiling fan is "+isOn);
    }

    public void low(){
        isOn = false;
        System.out.println("Ceiling fan is "+isOn);
    }

}

