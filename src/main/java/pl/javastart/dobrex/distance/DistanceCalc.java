package pl.javastart.dobrex.distance;

public class DistanceCalc {

    public double distanceCalculation(Point point1, Point point2){

        double earthRadius = 6371000; //meters
        double dLat = Math.toRadians(point1.getLength()-point2.getLength());
        double dLng = Math.toRadians(point1.getWidth()-point2.getWidth());
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.cos(Math.toRadians(point1.getLength())) * Math.cos(Math.toRadians(point2.getLength())) *
                        Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = (earthRadius * c)/1000.0;
        dist =  Math.round(dist*100.0)/100.0;

        return dist;
    }
}
