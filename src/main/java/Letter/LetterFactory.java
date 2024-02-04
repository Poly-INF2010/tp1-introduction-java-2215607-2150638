package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;

    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        Rectangle verticalBar = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle verticalBar2 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle horizontalBar = new Rectangle(halfMaxWidth, stripeThickness); //.translate(new Point2d(0.0, -halfMaxHeight));
        verticalBar2.rotate(verticalBar2.getCoords(), Math.toRadians(345));
        horizontalBar.translate(horizontalBar.getCoords(), new Point2d(halfMaxWidth-halfStripeThickness, 0.));
        verticalBar2.translate(verticalBar2.getCoords(), new Point2d(maxWidth-stripeThickness, 0.0));
        verticalBar.rotate(verticalBar.getCoords(), Math.toRadians(15));
        BaseShape letterA = new BaseShape();
        letterA.add(verticalBar);
        letterA.add(horizontalBar);
        letterA.add(verticalBar2);
        return letterA;
    }
    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letter = new Circle(maxHeight/4);
        letter.translate(letter.getCoords(), new Point2d(0.0, maxHeight/4));
        Circle bottomCircle = new Circle(maxHeight/4);
        bottomCircle.translate(bottomCircle.getCoords(), new Point2d(0.0, -maxHeight/4));
        Rectangle verticalLine = new Rectangle(stripeThickness*1.2, maxHeight);
        verticalLine.translate(verticalLine.getCoords(), new Point2d(-maxHeight/4.5, 0.0));

        Circle topRemove = new Circle(maxHeight/6);
        topRemove.translate(topRemove.getCoords(), new Point2d(0.0, maxHeight/4));
        Circle bottomRemove = new Circle(maxHeight/6);
        bottomRemove.translate(bottomRemove.getCoords(), new Point2d(0.0, -maxHeight/4));

        letter.add(bottomCircle);
        letter.remove(topRemove);
        letter.remove(bottomRemove);
        letter.add(verticalLine);
        return letter;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse letter = new Ellipse(halfMaxWidth, halfMaxHeight);
        Ellipse middleToRemove = new Ellipse((maxWidth - stripeThickness)/2, (maxHeight - stripeThickness)/2);
        BaseShape rightToRemove = new Rectangle(stripeThickness, maxHeight/1.5);
        rightToRemove.translate(rightToRemove.getCoords(), new Point2d(halfMaxWidth-halfStripeThickness, 0.0));
        letter.remove(middleToRemove);
        letter.remove(rightToRemove);
        return letter;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle letter = new Rectangle(halfStripeThickness, maxHeight);
        letter.translate(letter.getCoords(), new Point2d(-halfMaxWidth + halfStripeThickness/2, 0.0));
        Rectangle topBar = new Rectangle(maxWidth, halfStripeThickness);
        topBar.translate(topBar.getCoords(), new Point2d(0.0, halfMaxHeight - halfStripeThickness/2));
        Rectangle middleBar = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle bottomBar = new Rectangle(maxWidth, halfStripeThickness);
        bottomBar.translate(bottomBar.getCoords(), new Point2d(0.0, -halfMaxHeight + halfStripeThickness/2));

        letter.add(topBar);
        letter.add(middleBar);
        letter.add(bottomBar);
        return letter;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle verticalBar = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle verticalBar2 = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle horizontalBar = new Rectangle(maxWidth, stripeThickness); //.translate(new Point2d(0.0, -halfMaxHeight));
        horizontalBar.translate(horizontalBar.getCoords(), new Point2d(halfMaxWidth, 0.));
        verticalBar2.translate(verticalBar2.getCoords(), new Point2d(maxWidth, 0.0));
        BaseShape letterH = new BaseShape();
        letterH.add(verticalBar);
        letterH.add(horizontalBar);
        letterH.add(verticalBar2);
        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle verticalBar = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle diagonalBar = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle verticalBar2 = new Rectangle(halfStripeThickness, maxHeight);
        diagonalBar.rotate(diagonalBar.getCoords(), Math.toRadians(-20));
        diagonalBar.translate(diagonalBar.getCoords(), new Point2d(halfMaxWidth,0.));
        //verticalBar.translate(verticalBar.getCoords(), new Point2d(0., halfMaxHeight));
        verticalBar2.translate(verticalBar2.getCoords(), new Point2d(maxWidth,0.));
        BaseShape letterN = new BaseShape();
        letterN.add(verticalBar);
        letterN.add(diagonalBar);
        letterN.add(verticalBar2);
        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse letter = new Ellipse(maxWidth, maxHeight/2);
        Ellipse innerBody = new Ellipse(maxWidth - stripeThickness, maxHeight/2 - stripeThickness);
        letter.remove(innerBody);
        return letter;
    }

}