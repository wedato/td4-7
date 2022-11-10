package state_yt;

public class Phone {
    private State state;

    public Phone(State state) {
        this.state = new OffState(this);
    }
    
    public String lock() {
        return "Locking phone , turning off the screen";
    }
    public String home(){
        return "going to home-screen";
    }
    public String unlock(){
        return "unlocking the phone ";
    }
    public String turnOn(){
        return "turning screen on";
    }

    public void setState(State state) {
        this.state = state;
    }
}
