import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> points;

    public Shape() {
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0.0;
        int numPoints = points.size();

        for (int i = 0; i < numPoints; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numPoints);
            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }

    public double getLongestSide() {
        double maxLength = 0.0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            double currentLength = currentPoint.distanceTo(nextPoint);
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public double getAverageSide() {
        double totalLength = 0.0;
        int numSides = points.size();

        for (int i = 0; i < numSides; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numSides);
            totalLength += currentPoint.distanceTo(nextPoint);
        }

        return totalLength / numSides;
    }
}