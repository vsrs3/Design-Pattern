package Strategy;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public int buildRoute(int a, int b) {
        System.out.println("Building walking route from " + a + " to " + b);
        return Math.abs(a - b) * 25; // Longest time but free
    }
}