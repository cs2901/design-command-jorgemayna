package command;

public class Garage_door {
    private boolean isOn = false;
    public void  open(){
        isOn = true;
        System.out.println("Garage door is "+isOn);
    }

    public void close(){
        isOn = false;
        System.out.println("Garage door is "+isOn);
    }

}

