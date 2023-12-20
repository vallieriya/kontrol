package z1;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRed() {
        return color.equals("Red");
    }

    public boolean isGreen() {
        return color.equals("Green");
    }
}
