package state_yt;

public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return null;
    }

    @Override
    public String onOffOn() {
        return null;
    }
}
