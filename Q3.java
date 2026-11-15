class ReactorComponent {
    private String componentName;
    private double mass;
    private double temperature;

    public ReactorComponent(String componentName, double mass, double temperature) {
        this.componentName = componentName;
        this.mass = mass;
        this.temperature = temperature;
    }

    public void displayInfo() {
        System.out.printf("Component: %-15s Mass: %6.2f kg   Temperature: %6.2f °C%n",
                           componentName, mass, temperature);
    }
}

public class Q3 {
    public static void main(String[] args) {
        ReactorComponent r1 = new ReactorComponent("Reactor A", 150.5, 220.0);
        ReactorComponent r2 = new ReactorComponent("Reactor B", 320.0, 185.5);

        r1.displayInfo();
        r2.displayInfo();
    }
}   
