package J04002;

public class Rectange {
    private double width ;
    private double height ;
    private String color ;

    public Rectange( double width, double height, String color ) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth( double width ) {
        this.width = width;
    }

    public void setHeight( double height ) {
        this.height = height;
    }

    public void setColor( String color ) {
        this.color = color;
    }
    public int findArea() {
        return (int) this.width * (int) this.height ;
    }

    public int findPerimeter() {
        return ( (int) this.width + (int) this.height ) * 2 ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("") ;
        sb.append(Character.toUpperCase(this.color.charAt(1))) ;
        for ( int i = 2 ; i < this.color.length() ; i++ ) {
            sb.append(Character.toLowerCase(this.color.charAt(i))) ;
        }
        return ( findPerimeter() + " " + findArea() + " " + sb.toString().trim() ) ;
    }
}
