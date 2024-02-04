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
    public static BaseShape create_A()  {
        Ellipse letter = new Ellipse(halfMaxWidth, halfMaxHeight);
        Ellipse middleToRemove = new Ellipse((maxWidth - stripeThickness)/2, (maxHeight - stripeThickness)/2);
        Rectangle littleALeg = new Rectangle(halfStripeThickness, maxHeight);
        littleALeg.translate(littleALeg.getCoords(), new Point2d(halfMaxWidth-halfStripeThickness/2, 0.0));
        letter.remove(middleToRemove);
        letter.add(littleALeg);
        return letter;
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
        verticalBar2.translate(verticalBar2.getCoords(), new Point2d(maxWidth, 0.0));
        Rectangle horizontalBar = new Rectangle(maxWidth, stripeThickness); //.translate(new Point2d(0.0, -halfMaxHeight));
        BaseShape letterH = new BaseShape();
        letterH.add(verticalBar);
        letterH.add(horizontalBar);
        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Circle letter = new Circle(halfMaxWidth);
        letter.translate(letter.getCoords(), new Point2d(0.0, -0.25*maxHeight));
        Circle insideBit = new Circle(halfMaxWidth-halfStripeThickness);
        insideBit.translate(insideBit.getCoords(), new Point2d(0.0, -0.25*maxHeight));
        letter.remove(insideBit);
        Rectangle halfToRemove = new Rectangle(maxWidth, 0.75*maxHeight);
        halfToRemove.translate(halfToRemove.getCoords(), new Point2d(0.0, 0.25*maxHeight/2));
        letter.remove(halfToRemove);
        Rectangle leftLeg = new Rectangle(halfStripeThickness, maxHeight);
        leftLeg.translate(leftLeg.getCoords(), new Point2d(-halfMaxWidth+halfStripeThickness/2, 0.0));
        Rectangle rightLeg = new Rectangle(halfStripeThickness, 0.75*maxHeight);
        rightLeg.translate(rightLeg.getCoords(), new Point2d(halfMaxWidth-halfStripeThickness/2, 0.25*maxHeight/2));
        letter.add(leftLeg);
        letter.add(rightLeg);
        return letter;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse letter = new Ellipse(maxWidth, maxHeight);
        Ellipse innerBody = new Ellipse(maxWidth - stripeThickness, maxHeight - stripeThickness);
        letter.remove(innerBody);
        return letter;
    }

}