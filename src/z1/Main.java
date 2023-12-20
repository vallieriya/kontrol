package z1;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("Red", 60);

        System.out.println("Текущий цвет светофора: " + trafficLight.getClass());

        trafficLight.setColor("Green");
        System.out.println("Цвет светофора изменен на зеленый");

        if (trafficLight.isRed()) {
            System.out.println("Светофор горит красным");
        } else if (trafficLight.isGreen()) {
            System.out.println("Светофор горит зеленым");
        }
    }
}
