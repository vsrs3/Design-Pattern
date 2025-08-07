package Strategy;

public class RoadStrategy implements RouteStrategy {
    @Override
    public int buildRoute(int a, int b) {
        System.out.println("Building fastest road route from " + a + " to " + b);
        return Math.abs(a - b) * 10; // Simple calculation for demo
    }
}