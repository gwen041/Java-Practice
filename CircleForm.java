public class CircleForm {
    double area, peri;
    
    public void calculateCircle (double rad) {
    
        area = Math.PI * (rad * rad);
        peri = 2 * Math.PI * rad;
    
    }
}