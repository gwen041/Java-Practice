public class Rectangle {
    //double l, w, area, peri;
    double l, w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double calcArea() {
       return l * w;
        
    }

    public double calcPeri() {
        return 2 * (l + w);
    }
    
    /*public void calcArea() {
        area = l * w; 
        System.out.printf("\nArea is = %.2f \n", area);
    }

    public void calcPeri() {
        peri = 2 * (l + w);
        System.out.printf("Perimeter is = %.2f \n\n", peri);
    }*/

    /*static double calcArea(double l, double w) {
        double area = l * w;
        return area;
    }

    static double calcPeri(double l, double w) {
        double peri = 2 * (l + w);
        return peri;

    }*/
}