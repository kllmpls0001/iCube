import java.awt.*;

public class Facet {
    private R3Vector[] vertex;

    Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4){
        vertex = new R3Vector[4];
        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
        vertex[3] = v4;
    }
    public void out(){
        vertex[0].printVector();
        System.out.println(" - ");
        vertex[1].printVector();
        System.out.println("\n");
        vertex[1].printVector();
        System.out.println(" - ");
        vertex[2].printVector();
        System.out.println("\n");
        vertex[2].printVector();
        System.out.println(" - ");
        vertex[3].printVector();
        System.out.println("\n");
        vertex[3].printVector();
        System.out.println(" - ");
        vertex[0].printVector();
        System.out.println("\n");
    }

    void rotate(){
        vertex[0].rotate();
        vertex[1].rotate();
        vertex[2].rotate();
        vertex[3].rotate();
    }

    void translate(double dx, double dy, double dz){
        vertex[0].translate(dx, dy, dz);
        vertex[1].translate(dx, dy, dz);
        vertex[2].translate(dx, dy, dz);
        vertex[3].translate(dx, dy, dz);
    }

    void mulNum(){
        vertex[0].mulNum(200.0);
        vertex[1].mulNum(200.0);
        vertex[2].mulNum(200.0);
        vertex[3].mulNum(200.0);
    }

    public R3Vector normally(){
        R3Vector a = new R3Vector(vertex[0].x - vertex[1].x, vertex[0].y - vertex[1].y, vertex[0].z - vertex[1].z);
        R3Vector b = new R3Vector(vertex[2].x - vertex[1].x, vertex[2].y - vertex[1].y, vertex[2].z - vertex[1].z);
        return R3Vector.multiplyVector(a, b);
    }

    void draw(Graphics g){
        g.drawLine((int)vertex[0].x, (int)vertex[0].y, (int)vertex[1].x, (int)vertex[1].y);
        g.drawLine((int)vertex[1].x, (int)vertex[1].y, (int)vertex[2].x, (int)vertex[2].y);
        g.drawLine((int)vertex[2].x, (int)vertex[2].y, (int)vertex[3].x, (int)vertex[3].y);
        g.drawLine((int)vertex[3].x, (int)vertex[3].y, (int)vertex[0].x, (int)vertex[0].y);
    }
}