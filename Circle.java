public class Circle {
    double area, peri, rad;

    public Circle(double rad) {
        this.rad = rad;
    }
    
    public void calculateCircle () {
        area = Math.PI * (rad * rad);
        peri = 2 * Math.PI * rad;
    }

}