package Strategy;

public class Demo {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        
        // Road strategy
        navigator.setStrategy(new RoadStrategy());
        int roadTime = navigator.executeStrategy(1, 10);
        System.out.println("Road time: " + roadTime + " minutes\n");
        
        // Public transport strategy
        navigator.setStrategy(new PublicTransportStrategy());
        int busTime = navigator.executeStrategy(1, 10);
        System.out.println("Public transport time: " + busTime + " minutes\n");
        
        // Walking strategy
        navigator.setStrategy(new WalkingStrategy());
        int walkTime = navigator.executeStrategy(1, 10);
        System.out.println("Walking time: " + walkTime + " minutes");
    }
}