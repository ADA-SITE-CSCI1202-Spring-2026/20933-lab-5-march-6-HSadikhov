public class Point implements Movable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

   
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        System.out.println("Start -> X: " + p.getX() + ", Y: " + p.getY());

        p.moveUp();
        p.moveRight();
        System.out.println("After moveUp & moveRight -> X: " + p.getX() + ", Y: " + p.getY());

        p.moveDown();
        p.moveLeft();
        p.moveLeft();
        System.out.println("After moveDown & 2x moveLeft -> X: " + p.getX() + ", Y: " + p.getY());
    }
}