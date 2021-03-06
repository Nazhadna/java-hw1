package ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, double direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float)(speed * Math.cos(direction));
        yDelta = (float)(-speed * Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x+=xDelta;
        y+=yDelta;
    }

    public Ball tryToMoveBall() {
        return new Ball(x+xDelta,y+yDelta,radius,0,0);
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[" +
                "(" + String.format("%.2f", x) +
                ";" + String.format("%.2f", y) +
                "), speed=(" + String.format("%.2f", xDelta) +
                ";" + String.format("%.2f", yDelta) +
                ")]";
    }
}
