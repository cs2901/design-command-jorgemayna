package command;

public class Light {
    public String room;
    public Light(String room_) {
        this.room = room_;
    }
    private boolean isOn = false;
    public void  on(){
        isOn = true;
        System.out.println(room+" light is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println(room+" light is "+isOn);
    }

}

