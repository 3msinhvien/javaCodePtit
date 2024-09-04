package J04001;

public class Point {
    private double x;
    private double y;

    public Point( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    public Point( Point p ) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance( Point secondPoint ) {
        double x = secondPoint.getX();
        double y = secondPoint.getY();
        return (double) (Math.sqrt( (double) Math.pow( this.x - x , 2 ) + (double) Math.pow(this.y - y , 2 )));
    }

    public double distance2( Point p1, Point p2 ) {
        return p1.distance(p2);
    }

//    @Override
//    public String toString() {
//        return (this.x.toString() + " " + this.y.toString()) ;
//    }
}
