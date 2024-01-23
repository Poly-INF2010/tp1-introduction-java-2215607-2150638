package Point;

public class Point2d extends AbstractPoint {
    private final Integer X = 0;
    private final Integer Y = 1;

    /** TODO done
     * 2D Point Constructor from coordinates
     * @param x X coordinate
     * @param y Y coordinate
     */
    public Point2d(Double x, Double y) {
        super(new double[] {x, y});
    }

    /** TODO done
     * 2D Point Constructor from vector
     * @param vector Vector containing X and Y coordinates
     */
    public Point2d(Double[] vector) {
        this(vector[0], vector[1]);
    }

    /**
     * @return X coordinate
     */
    public double X() { return vector[X];}

    /**
     * @return Y coordinate
     */
    public double Y() { return vector[Y];}

    /** TODO 
     * Translate the point by the given vector
     * @param translateVector The vector by which to translate
     * @return Translated point
     */
    @Override
    public Point2d translate(Double[] translateVector) {
        double translatedX = this.X() + translateVector[0];
        double translatedY = this.Y() + translateVector[1];
        return new Point2d(translatedX, translatedY);
    }

    /** TODO
     * Translate the point by the given 2D Point
     * @param translateVector The 2D Point by which to translate
     * @return Translated point
     */
    public Point2d translate(Point2d translateVector) {
        double translatedX = this.X() + translateVector.X();
        double translatedY = this.Y() + translateVector.Y();
        return new Point2d(translatedX, translatedY);
    }

    /** TODO
     * Rotate the point by the given rotation Matrix
     * @param rotationMatrix Matrix by which to rotate
     * @return Rotated point
     */
    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
     /*   Double x = 0.0;
        Double y = 0.0;
        for(int i = 0; i<rotationMatrix[0].lenght; i++){
            x+= rotationMatrix[0][i];
            y+= rotationMatrix[1][i];
        }
        return new Point2d(x,y);*/
        return null;
    }

    /** TODO
     * Rotate the point by the given angle
     * @param angle Angle in radians
     * @return Rotated point
     */
    public Point2d rotate(Double angle) {
        return null;
    }

    /** TODO
     * Divide the X and Y coordinates of a 2D point by a scalar
     * @param divider Scalar used to divide
     * @return Divided point
     */
    @Override
    public Point2d divide(Double divider) {
        return null;
    }

    /** TODO
     * Multiply the X and Y coordinates of a 2D point by a scalar
     * @param multiplier Scalar used to multiply
     * @return Multiplied point
     */
    @Override
    public Point2d multiply(Double multiplier) {
        return null;
    }

    /** TODO
     * Add a scalar to the X and Y coordinates of a 2D point
     * @param adder Scalar to add
     * @return Added point
     */
    @Override
    public Point2d add(Double adder) {
        return null;
    }

    /** TODO
     * @return Deep copy of the 2D point
     */
    @Override
    public Point2d clone() {
        return null;
    }
}
