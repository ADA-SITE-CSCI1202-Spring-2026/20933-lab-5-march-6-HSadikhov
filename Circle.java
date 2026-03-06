public class Circle implements Movable {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public static void main(String[] args) {
        Point centerPoint = new Point(5, 5);
        Circle myCircle = new Circle(centerPoint, 10);
        
        System.out.println("Start X: " + myCircle.getCenter().getX() + ", Y: " + myCircle.getCenter().getY());
        
        myCircle.moveUp();
        myCircle.moveRight();
        
        System.out.println("End X: " + myCircle.getCenter().getX() + ", Y: " + myCircle.getCenter().getY());
    }
}