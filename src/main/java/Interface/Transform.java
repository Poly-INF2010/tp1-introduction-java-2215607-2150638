package Interface;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;


public class Transform implements Rotate, Translate{
    /**
     * Rotate all points of collections given in parameters
     * with the angle given
     * @param coords collections of Point2d
     * @param angle
     * @return rotated collection
     * */
    public Collection<Point2d> rotate(Collection<Point2d> coords, Double angle) {
        Collection<Point2d> rotatedCoords = new ArrayList<>();

        for (Point2d point : coords) {
            double newX = point.X() * Math.cos(angle) - point.Y() * Math.sin(angle);
            double newY = point.X() * Math.sin(angle) + point.Y() * Math.cos(angle);
            rotatedCoords.add(new Point2d(newX, newY));
        }
        return rotatedCoords;
    }

    /**
     * Translate all points of a collection by a given vector
     * @param coords Collection of Point2d
     * @param translateVector Vector of translation
     * @return translated coords
     * */
    public Collection<Point2d> translate(Collection<Point2d> coords, Point2d translateVector) {
        Collection<Point2d> translatedCoords = new ArrayList<>();

        for (Point2d point : coords) {
            double newX = point.X() + translateVector.X();
            double newY = point.Y() + translateVector.Y();
            translatedCoords.add(new Point2d(newX, newY));
        }
        return translatedCoords;
    }
}
