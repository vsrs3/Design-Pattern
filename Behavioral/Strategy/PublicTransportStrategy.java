package Strategy;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public int buildRoute(int a, int b) {
        System.out.println("Building public transport route from " + a + " to " + b);
        return Math.abs(a - b) * 15; // Takes longer but cheaper
    }
}