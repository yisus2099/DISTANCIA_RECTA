
package Distancia_Recta;

public class Recta {
private int d;

    public Recta() {
    }    

    public int getD() {
        return d;
    }
    public void setD(int d) {
        this.d = d;
    }
        
    public int distanBetweenPoints(int x, int y, int x1, int y1) {
        d = (int) Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
        return d;
    }    
}
